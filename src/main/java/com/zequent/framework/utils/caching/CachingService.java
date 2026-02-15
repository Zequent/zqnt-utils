package com.zequent.framework.utils.caching;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.zequent.framework.common.proto.AssetTypeEnum;
import com.zequent.framework.common.proto.LiveStreamState;
import com.zequent.framework.common.proto.ManualControlRequest;
import com.zequent.framework.common.proto.ManualControlState;
import com.zequent.framework.common.proto.SubAssetProtoDTO;
import com.zequent.framework.common.proto.AssetModes;
import com.zequent.framework.common.proto.AssetProtoDTO;
import com.zequent.framework.services.livedata.proto.AssetPropertiesProto;
import com.zequent.framework.services.livedata.proto.AssetTelemetry;
import com.zequent.framework.services.livedata.proto.SubAssetTelemetry;
import com.zequent.framework.common.proto.TaskProtoDTO;
import com.zequent.framework.utils.core.EdgeEndpointDTO;
import com.zequent.framework.utils.core.ProtoJsonUtils;
import com.zequent.framework.utils.core.ProtobufHelpers;
import io.quarkus.redis.datasource.ReactiveRedisDataSource;
import io.quarkus.redis.datasource.keys.ReactiveKeyCommands;
import io.quarkus.redis.datasource.value.ReactiveValueCommands;
import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.Objects;

@Slf4j
public class CachingService {

	private final ReactiveKeyCommands<String> keyCommands;
	private final ReactiveValueCommands<String, String> valueCommands;
	private final ObjectMapper objectMapper = new ObjectMapper();

	public CachingService(ReactiveRedisDataSource reactive) {
		this.keyCommands = reactive.key();
		this.valueCommands = reactive.value(String.class, String.class);
		this.objectMapper.registerModule(new JavaTimeModule());
	}

	// === Helper commands for error handling ===

	private <T> Uni<T> handleRedisFailure(Uni<T> operation, String operationName, T fallbackValue) {
		return operation.onFailure().invoke(throwable -> log.error("Redis operation '{}' failed: {}", operationName,
				throwable.getMessage(), throwable)).onFailure().recoverWithItem(fallbackValue);
	}

	private Uni<Void> handleRedisVoidFailure(Uni<Void> operation, String operationName) {
		return operation.onFailure().invoke(throwable -> log.error("Redis operation '{}' failed: {}", operationName,
				throwable.getMessage(), throwable)).onFailure().recoverWithNull();
	}

	// === Existing commands with error handling ===

	/**
	 * Maps a serial number to its vendor for routing purposes.
	 * Key: edge-vendor:{sn} -> Value: vendor
	 * This allows lookup: SN -> Vendor -> EdgeEndpoint
	 */
	public Uni<Void> registerAssetVendor(String sn, String vendor) {
		return handleRedisVoidFailure(
				valueCommands.set(CacheKeys.EDGE_VENDOR.getKeyPrefix().replace("{sn}", sn), vendor),
				"registerAssetVendor[" + sn + ", " + vendor + "]");
	}

	/**
	 * Gets the vendor for a given serial number.
	 */
	public Uni<String> getAssetVendor(String sn) {
		return handleRedisFailure(
				valueCommands.get(CacheKeys.EDGE_VENDOR.getKeyPrefix().replace("{sn}", sn)),
				"getAssetVendor[" + sn + "]",
				null);
	}

	public Uni<Void> registerEdgeEndpoint(String vendor, EdgeEndpointDTO endpoint) {
		String json;
		try {
			json = objectMapper.writer().writeValueAsString(endpoint);
		} catch (JsonProcessingException e) {
			log.error("Failed to serialize EdgeEndpointDTO", e);
			return Uni.createFrom().voidItem();
		}
		return handleRedisVoidFailure(
				valueCommands.set(CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", vendor), json),
				"registerEdgeEndpoint[" + vendor + "]");
	}

	public Uni<EdgeEndpointDTO> getEdgeEndpoint(String vendor) {
		return handleRedisFailure(
				valueCommands.get(CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", vendor)).flatMap(json -> {
					if (json == null) {
						return Uni.createFrom().nullItem();
					}
					try {
						return Uni.createFrom().item(objectMapper.readValue(json, EdgeEndpointDTO.class));
					} catch (IOException e) {
						log.error("Failed to parse EdgeEndpointDTO from redis with key: {}", vendor, e);
						return Uni.createFrom().nullItem();
					}
				}), "getEdgeEndpoint[" + vendor + "]", null);
	}

	/**
	 * Marks edge endpoint as offline (soft delete - keeps data for monitoring).
	 * Use deleteEdgeEndpoint() for complete removal.
	 */
	public Uni<Void> deregisterEdgeEndpoint(String vendor) {
		return handleRedisVoidFailure(
				valueCommands.get(CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", vendor))
						.flatMap(json -> {
							if (json == null) {
								log.warn("Cannot deregister non-existent endpoint for vendor: {}", vendor);
								return Uni.createFrom().voidItem();
							}
							try {
								EdgeEndpointDTO dto = objectMapper.readValue(json, EdgeEndpointDTO.class);
								dto.setOnline(false);
								return valueCommands.set(
										CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", vendor),
										objectMapper.writeValueAsString(dto));
							} catch (JsonProcessingException e) {
								log.error("Failed to serialize EdgeEndpointDTO", e);
								return Uni.createFrom().voidItem();
							}
						}),
				"deregisterEdgeEndpoint[" + vendor + "]");
	}

	/**
	 * Completely removes edge endpoint from cache (hard delete).
	 * This will cause routing failures for this vendor until re-registered.
	 */
	public Uni<Void> deleteEdgeEndpoint(String vendor) {
		String key = CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", vendor);
		return handleRedisVoidFailure(
				keyCommands.del(key).replaceWithVoid(),
				"deleteEdgeEndpoint[" + vendor + "]");
	}

	/**
	 * Gets all offline edge endpoints (online=false) for cleanup.
	 * Uses SCAN for performance - safe for large datasets.
	 *
	 * @return Multi stream of offline edge endpoints
	 */
	public io.smallrye.mutiny.Multi<EdgeEndpointDTO> getAllOfflineEndpoints() {
		String pattern = CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{sn}", "*");

		// Use SCAN instead of KEYS for production performance
		return keyCommands.scan()
				.toMulti()
				.filter(key -> key.startsWith(pattern.replace("*", "")))
				.onItem().transformToUniAndMerge(key -> valueCommands.get(key)
						.onItem().ifNotNull().transform(json -> {
							try {
								EdgeEndpointDTO dto = objectMapper.readValue(json, EdgeEndpointDTO.class);
								// Filter only offline endpoints
								return Boolean.TRUE.equals(dto.getOnline()) ? null : dto;
							} catch (IOException e) {
								log.error("Failed to parse EdgeEndpointDTO from key: {}", key, e);
								return null;
							}
						}))
				.filter(Objects::nonNull)
				.invoke(dto -> log.debug("Found offline endpoint: {}", dto.getEndpoint()));
	}

	/**
	 * Gets all edge endpoints (both online and offline).
	 * Performance-optimized with SCAN + pipeline.
	 *
	 * @param onlineOnly If true, returns only online endpoints
	 * @return Multi stream of edge endpoints
	 */
	public io.smallrye.mutiny.Multi<EdgeEndpointDTO> getAllEndpoints(boolean onlineOnly) {
		String pattern = CacheKeys.EDGE_ENDPOINTS.getKeyPrefix().replace("{vendor}", "*");

		return keyCommands.scan()
				.toMulti()
				.filter(key -> key.startsWith(pattern.replace("*", "")))
				.onItem().transformToUniAndMerge(key -> valueCommands.get(key)
						.onItem().ifNotNull().transform(json -> {
							try {
								EdgeEndpointDTO dto = objectMapper.readValue(json, EdgeEndpointDTO.class);
								return (!onlineOnly || dto.getOnline()) ? dto : null;
							} catch (IOException e) {
								log.error("Failed to parse EdgeEndpointDTO from key: {}", key, e);
								return null;
							}
						}))
				.filter(Objects::nonNull);
	}

	/**
	 * Counts online vs offline endpoints - lightweight operation.
	 *
	 * @return Uni with counts [onlineCount, offlineCount]
	 */
	public Uni<EndpointStats> getEndpointStats() {
		return getAllEndpoints(false)
				.collect().asList()
				.map(endpoints -> {
					long online = endpoints.stream().filter(EdgeEndpointDTO::getOnline).count();
					long offline = endpoints.size() - online;
					return new EndpointStats(online, offline, endpoints.size());
				});
	}

	public record EndpointStats(long onlineCount, long offlineCount, long totalCount) {
	}

	public Uni<Void> setAssetOnline(String deviceSn) {
		return handleRedisVoidFailure(valueCommands.set(CacheKeys.ASSET_ONLINE.getKeyPrefix() + deviceSn, "true"),
				"setAssetOnline[" + deviceSn + "]");
	}

	public Uni<Void> addActiveTaskToAsset(String sn, String taskId, TaskProtoDTO taskProtoDTO) {
		try {
			String key = CacheKeys.ASSET_ACTIVE_TASKS.getKeyPrefix().replace("{sn}", sn).replace("{taskId}", taskId);
			String json = ProtoJsonUtils.toJson(taskProtoDTO);
			return handleRedisVoidFailure(valueCommands.set(key, json),
					"addActiveTaskToAsset[" + sn + "," + taskId + "]");
		} catch (Exception e) {
			log.error("Failed to serialize TaskProtoDTO", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<TaskProtoDTO> hasAnyAssetActiveTask(String sn) {
		String pattern = CacheKeys.ASSET_ACTIVE_TASKS.getKeyPrefix().replace("{sn}", sn).replace("{taskId}", "*");
		return handleRedisFailure(keyCommands.keys(pattern).flatMap(keys -> {
			if (keys.isEmpty()) {
				return Uni.createFrom().nullItem();
			}
			String key = keys.getFirst();
			return valueCommands.get(key).map(json -> {
				if (json == null || json.isEmpty()) {
					return null;
				}
				try {
					return (TaskProtoDTO) ProtoJsonUtils.fromJson(json, TaskProtoDTO.newBuilder());
				} catch (RuntimeException e) {
					log.error("Failed to parse TaskProtoDTO from redis with key: {}", key, e);
					return null;
				}
			});
		}).onItem().ifNull().continueWith(() -> null), "hasAnyAssetActiveTask[" + sn + "]", null);
	}

	public Uni<Void> assignedTaskIsCompleted(String sn, String taskId) {
		String sourceKey = CacheKeys.ASSET_ACTIVE_TASKS.getKeyPrefix().replace("{sn}", sn).replace("{taskId}", taskId);

		return handleRedisVoidFailure(keyCommands.del(sourceKey).replaceWithVoid(),
				"assignedTaskIsCompleted[" + sn + "," + taskId + "]");
	}

	public Uni<Void> setAssetTaskExternalIdReference(String externalId, String sn, TaskProtoDTO taskProtoDTO) {
		String key = CacheKeys.ASSET_TASK_EXTERNAL_ID_REFERENCE.getKeyPrefix().replace("{externalId}", externalId)
				.replace("{sn}", sn);
		String json = ProtoJsonUtils.toJson(taskProtoDTO);
		return handleRedisVoidFailure(valueCommands.set(key, json),
				"setAssetTaskExternalIdReference[" + externalId + "," + sn + "]");
	}

	public Uni<TaskProtoDTO> getAssetTaskWithExternalIdReference(String externalId, String sn) {
		String key = CacheKeys.ASSET_TASK_EXTERNAL_ID_REFERENCE.getKeyPrefix().replace("{externalId}", externalId)
				.replace("{sn}", sn);

		return handleRedisFailure(valueCommands.get(key).map(json -> {
			if (json == null) {
				return null;
			}
			return (TaskProtoDTO) ProtoJsonUtils.fromJson(json, TaskProtoDTO.newBuilder());
		}), "getAssetTaskWithExternalIdReference[" + externalId + "," + sn + "]", null);
	}

	public Uni<AssetModes> getAssetMode(String deviceSn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_TELEMETRY.getKeyPrefix() + deviceSn).map(item -> {
			try {
				var assetTelemetry = (AssetTelemetry) ProtoJsonUtils.fromJson(item, AssetTelemetry.newBuilder());
				return assetTelemetry.getMode();
			} catch (Exception e) {
				log.error("Error on parsing string to object from OsdDock", e);
				return null;
			}
		}), "getAssetMode[" + deviceSn + "]", null);
	}

	public Uni<Void> setSubAssetAtHome(String sn, Boolean isAtHome) {
		return handleRedisVoidFailure(
				valueCommands.set(CacheKeys.SUBASSET_AT_HOME.getKeyPrefix() + sn, isAtHome.toString()),
				"setSubAssetAtHome[" + sn + "]");
	}

	public Uni<Void> setCurrentAssetTelemetry(String deviceSn, AssetTelemetry assetTelemetry) {
		try {
			String json = ProtoJsonUtils.toJson(assetTelemetry);
			return handleRedisVoidFailure(
					valueCommands.set(CacheKeys.ASSET_TELEMETRY.getKeyPrefix() + deviceSn, json),
					"setCurrentAssetTelemetry[" + deviceSn + "]");
		} catch (Exception e) {
			log.error("Error on parsing object to string", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<Void> setAssetSubAssetReferenceToAsset(String subAssetSn, String assetSn) {
		return handleRedisVoidFailure(
				valueCommands.set(CacheKeys.ASSET_SUBASSET_REFERENCE.getKeyPrefix() + subAssetSn, assetSn),
				"setAssetSubAssetReferenceToAsset[" + subAssetSn + "]");
	}

	public Uni<String> getSubAssetReferenceToAsset(String subAssetSn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_SUBASSET_REFERENCE.getKeyPrefix() + subAssetSn),
				"getSubAssetReferenceToAsset[" + subAssetSn + "]", null);
	}

	public Uni<AssetTelemetry> getCurrentAssetTelemetry(String deviceSn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_TELEMETRY.getKeyPrefix() + deviceSn).map(item -> {
			if (item == null) {
				return null;
			}
			try {
				return (AssetTelemetry) ProtoJsonUtils.fromJson(item, AssetTelemetry.newBuilder());
			} catch (Exception e) {
				log.error("Error on parsing string to object from OsdDock", e);
				return null;
			}
		}), "getCurrentAssetTelemetry[" + deviceSn + "]", null);
	}

	public Uni<Void> setSubAssetCurrentTelemetry(String deviceSn, SubAssetTelemetry subAssetTelemetry) {
		try {
			String json = ProtoJsonUtils.toJson(subAssetTelemetry);
			return handleRedisVoidFailure(
					valueCommands.set(CacheKeys.SUBASSET_TELEMETRY.getKeyPrefix() + deviceSn, json),
					"setSubAssetCurrentTelemetry[" + deviceSn + "]");
		} catch (Exception e) {
			log.error("Error on parsing object to string", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<SubAssetTelemetry> getSubAssetCurrentTelemetry(String deviceSn) {
		return handleRedisFailure(
				valueCommands.get(CacheKeys.SUBASSET_TELEMETRY.getKeyPrefix() + deviceSn).map(item -> {
					if (item == null) {
						return null;
					}
					try {
						return (SubAssetTelemetry) ProtoJsonUtils.fromJson(item, SubAssetTelemetry.newBuilder());
					} catch (Exception e) {
						log.error("Error on parsing string to object from SubAsset Telemetry", e);
						return null;
					}
				}), "getSubAssetCurrentTelemetry[" + deviceSn + "]", null);
	}

	public Uni<Void> setWaitingForServicesReply(String tid, String command, Object data) {
		try {
			String key = CacheKeys.ASSET_SERVICES_REPLY_WAIT.getKeyPrefix().replace("{tid}", tid).replace("{method}",
					command);
			String json = objectMapper.writeValueAsString(data);

			return handleRedisVoidFailure(valueCommands.setex(key, 30, json),
					"setWaitingForServicesReply[" + tid + "," + command + "]");
		} catch (Exception e) {
			log.error("Error on serializing data", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<Boolean> isWaitingReplyExisting(String tid, String command) {
		String key = CacheKeys.ASSET_SERVICES_REPLY_WAIT.getKeyPrefix().replace("{tid}", tid).replace("{method}",
				command);

		return handleRedisFailure(valueCommands.get(key).map(item -> {
			if (item == null) {
				return false;
			} else {
				return true;
			}
		}), "getTransactionWaitingForServicesReply[" + tid + "," + command + "]", null);
	}

	public Uni<Void> setManualControlRequest(String sn, ManualControlRequest manualControlRequest) {
		try {
			String json = ProtoJsonUtils.toJson(manualControlRequest);
			return handleRedisVoidFailure(
					valueCommands.set(CacheKeys.ASSET_MANUAL_CONTROL_REQUEST.getKeyPrefix() + sn, json),
					"setDrcRequest[" + sn + "]");
		} catch (Exception e) {
			log.error("Error on serializing DrcRequestDTO", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<Void> setManualControlState(String sn, ManualControlState manualControlState) {
		try {
			String json = ProtoJsonUtils.toJson(manualControlState);
			return handleRedisVoidFailure(
					valueCommands.set(CacheKeys.ASSET_MANUAL_CONTROL_STATE.getKeyPrefix() + sn, json),
					"setManualControlState[" + sn + "]");
		} catch (Exception e) {
			log.error("Error on serializing DrcStateDTO", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<ManualControlState> getManualControlState(String sn) {
		return handleRedisFailure(
				valueCommands.get(CacheKeys.ASSET_MANUAL_CONTROL_STATE.getKeyPrefix() + sn).map(item -> {
					if (item == null) {
						return null;
					}
					try {
						return (ManualControlState) ProtoJsonUtils.fromJson(item, ManualControlState.newBuilder());
					} catch (Exception e) {
						log.error("Error on parsing string to object from DrcStateDTO", e);
						return null;
					}
				}), "getManualControlState[" + sn + "]", null);
	}

	public Uni<ManualControlRequest> getManualControlRequest(String sn) {
		return handleRedisFailure(
				valueCommands.get(CacheKeys.ASSET_MANUAL_CONTROL_REQUEST.getKeyPrefix() + sn).map(item -> {
					if (item == null) {
						return null;
					}
					try {
						return (ManualControlRequest) ProtoJsonUtils.fromJson(item, ManualControlRequest.newBuilder());
					} catch (Exception e) {
						log.error("Error on parsing string to object from DrcRequestDTO", e);
						return null;
					}
				}), "getManualControlRequest[" + sn + "]", null);
	}

	public Uni<Integer> setManualControlRequestReplyReceived(String sn) {
		return handleRedisFailure(keyCommands.del(CacheKeys.ASSET_MANUAL_CONTROL_REQUEST.getKeyPrefix() + sn),
				"setManualControlRequestReplyReceived[" + sn + "]", 0);
	}

	public Uni<Integer> setTransactionReplyReceived(String tid, String command) {
		if (tid == null || tid.isEmpty()) {
			log.warn("Invalid transaction ID provided: {}", tid);
			return Uni.createFrom().item(0);
		}

		String cacheKey = CacheKeys.ASSET_SERVICES_REPLY_WAIT.getKeyPrefix().replace("{tid}", tid).replace("{command}",
				command);

		return handleRedisFailure(
				valueCommands.get(cacheKey).onItem().ifNotNull().transformToUni(item -> keyCommands.del(cacheKey))
						.onItem().ifNull().continueWith(0),
				"setTransactionReplyReceived[" + tid + "," + command + "]", 0);
	}

	public Uni<Void> setAssetLiveStreamState(String sn, String videoId, AssetTypeEnum assetType, Boolean isLive,
			Boolean hasStarted, String liveStreamUrl) {
		try {
			String streamUrl = liveStreamUrl.replace("{videoId}", convertVideoIdToUrlSuffix(videoId))
					.replace("{assetType}", assetType.name());
			String json = ProtoJsonUtils.toJson(LiveStreamState.newBuilder()
					.setVideoId(videoId)
					.setStreamUrl(streamUrl)
					.setIsLive(isLive)
					.setStartedAt(Boolean.TRUE.equals(hasStarted) ? ProtobufHelpers.now() : null)
					.setAssetType(assetType)
					.build());

			return handleRedisVoidFailure(
					valueCommands.set(CacheKeys.ASSET_LIVE_STREAM_STATE.getKeyPrefix() + sn, json),
					"setAssetLiveStreamState[" + sn + "]");
		} catch (Exception e) {
			log.error("Error on serializing LiveStreamState", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<Boolean> isSnSubAsset(String sn) {
		return handleRedisFailure(getSubAssetReferenceToAsset(sn).map(Objects::nonNull),
				"isSnSubAsset[" + sn + "]", false);
	}

	public Uni<Void> setAssetLiveStreamOffline(String sn) {
		return handleRedisVoidFailure(valueCommands.get(CacheKeys.ASSET_LIVE_STREAM_STATE.getKeyPrefix() + sn).onItem()
				.ifNotNull().transformToUni(item -> {
					try {
						var liveStreamState = (LiveStreamState.Builder) ProtoJsonUtils
								.fromJson(item, LiveStreamState.newBuilder()).toBuilder();
						liveStreamState.setIsLive(false);
						String json = ProtoJsonUtils.toJson(liveStreamState.build());
						return valueCommands.set(CacheKeys.ASSET_LIVE_STREAM_STATE.getKeyPrefix() + sn, json);
					} catch (Exception e) {
						log.error("Error on parsing object", e);
						return Uni.createFrom().voidItem();
					}
				}).onFailure().recoverWithNull(), "setAssetLiveStreamOffline[" + sn + "]");
	}

	public Uni<LiveStreamState> getAssetLiveStreamState(String sn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_LIVE_STREAM_STATE.getKeyPrefix() + sn).map(item -> {
			if (item == null) {
				return null;
			}
			try {
				return (LiveStreamState) ProtoJsonUtils.fromJson(item, LiveStreamState.newBuilder());
			} catch (Exception e) {
				log.error("Error on parsing string to object from LiveStreamState", e);
				return null;
			}
		}), "getAssetLiveStreamState[" + sn + "]", null);
	}

	public Uni<Void> setAssetProperties(AssetPropertiesProto propertiesDTO, String assetId) {
		try {
			String json = ProtoJsonUtils.toJson(propertiesDTO);
			return handleRedisVoidFailure(valueCommands.set(CacheKeys.ASSET_PROPERTIES.getKeyPrefix() + assetId, json),
					"setAssetProperties[" + assetId + "]");
		} catch (Exception e) {
			log.error("Error on serializing PropertiesDTO", e);
			return Uni.createFrom().voidItem();
		}
	}

	public Uni<AssetProtoDTO> getAssetProtoDTO(String sn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_DTO.getKeyPrefix().replace("{sn}", sn))
				.map(item -> {
					if (item == null) {
						return null;
					}
					return (AssetProtoDTO) ProtoJsonUtils.fromJson(item, AssetProtoDTO.newBuilder());
				}), "getAssetProtoDTO[" + sn + "]", null);
	}

	public Uni<SubAssetProtoDTO> getSubAssetProtoDTO(String sn) {
		return handleRedisFailure(valueCommands.get(CacheKeys.SUBASSET_DTO.getKeyPrefix().replace("{subAssetSn}", sn))
				.map(item -> {
					if (item == null) {
						return null;
					}
					return (SubAssetProtoDTO) ProtoJsonUtils.fromJson(item, SubAssetProtoDTO.newBuilder());
				}), "getSubAssetProtoDTO[" + sn + "]", null);
	}

	public Uni<Void> setAssetProtoDTO(AssetProtoDTO assetProtoDTO, String sn) {
		String json = ProtoJsonUtils.toJson(assetProtoDTO);
		return handleRedisVoidFailure(valueCommands.set(CacheKeys.ASSET_DTO.getKeyPrefix()
				.replace("{sn}", sn), json), "setAssetProtoDTO[" + sn + "]");
	}

	public Uni<Void> setSubAssetProtoDTO(SubAssetProtoDTO subAssetProtoDTO, String sn) {
		String json = ProtoJsonUtils.toJson(subAssetProtoDTO);
		return handleRedisVoidFailure(valueCommands.set(CacheKeys.SUBASSET_DTO.getKeyPrefix()
				.replace("{subAssetSn}", sn), json), "setAssetProtoDTO[" + sn + "]");
	}

	public Uni<AssetPropertiesProto> getAssetProperties(String assetId) {
		return handleRedisFailure(valueCommands.get(CacheKeys.ASSET_PROPERTIES.getKeyPrefix() + assetId).map(item -> {
			if (item == null) {
				return null;
			}
			try {
				return (AssetPropertiesProto) ProtoJsonUtils.fromJson(item, AssetPropertiesProto.newBuilder());
			} catch (Exception e) {
				log.error("Error on parsing string to object from PropertiesDTO", e);
				return null;
			}
		}), "getAssetProperties[" + assetId + "]", null);
	}

	/**
	 * Get Asset with fallback to Connector service.
	 * Cache-first strategy: Check Redis (10 min TTL) → Fallback to Connector
	 *
	 * @param sn Serial number
	 * @param connectorFallback Function to fetch from Connector if cache miss
	 * @return AssetProtoDTO from cache or Connector
	 */
	public Uni<AssetProtoDTO> getOrFetchAsset(String sn, java.util.function.Supplier<Uni<AssetProtoDTO>> connectorFallback) {
		return getAssetProtoDTO(sn)
				.onItem().ifNull().switchTo(() -> {
					log.debug("Cache miss for asset: {}, fetching from Connector", sn);
					return connectorFallback.get()
							.onItem().ifNotNull().invoke(dto -> {
								// Cache for 10 minutes
								setAssetProtoDTOWithTTL(dto, sn, 600).subscribe().with(
										v -> log.debug("Cached asset: {} for 10 minutes", sn),
										err -> log.error("Failed to cache asset: {}", sn, err)
								);
							});
				});
	}

	public Uni<SubAssetProtoDTO> getOrFetchSubAsset(String sn, java.util.function.Supplier<Uni<SubAssetProtoDTO>> connectorFallback) {
		return getSubAssetProtoDTO(sn)
				.onItem().ifNull().switchTo(() -> {
					log.debug("Cache miss for asset: {}, fetching from Connector", sn);
					return connectorFallback.get()
							.onItem().ifNotNull().invoke(dto -> {
								// Cache for 10 minutes
								setSubAssetProtoDTOWithTTL(dto, sn, 600).subscribe().with(
										v -> log.debug("Cached asset: {} for 10 minutes", sn),
										err -> log.error("Failed to cache asset: {}", sn, err)
								);
							});
				});
	}

	/**
	 * Set Asset DTO with TTL (Time To Live).
	 *
	 * @param assetProtoDTO Asset DTO
	 * @param sn Serial number
	 * @param ttlSeconds TTL in seconds (e.g. 600 = 10 minutes)
	 */
	public Uni<Void> setAssetProtoDTOWithTTL(AssetProtoDTO assetProtoDTO, String sn, long ttlSeconds) {
		String json = ProtoJsonUtils.toJson(assetProtoDTO);
		String key = CacheKeys.ASSET_DTO.getKeyPrefix().replace("{sn}", sn);
		return handleRedisVoidFailure(
				valueCommands.setex(key, ttlSeconds, json),
				"setAssetProtoDTOWithTTL[" + sn + "," + ttlSeconds + "s]"
		);
	}

	/**
	 * Set SubAsset DTO with TTL.
	 */
	public Uni<Void> setSubAssetProtoDTOWithTTL(SubAssetProtoDTO subAssetProtoDTO, String sn, long ttlSeconds) {
		String json = ProtoJsonUtils.toJson(subAssetProtoDTO);
		String key = CacheKeys.SUBASSET_DTO.getKeyPrefix().replace("{subAssetSn}", sn);
		return handleRedisVoidFailure(
				valueCommands.setex(key, ttlSeconds, json),
				"setSubAssetProtoDTOWithTTL[" + sn + "," + ttlSeconds + "s]"
		);
	}

	private String convertVideoIdToUrlSuffix(String videoId) {
		String[] parts = videoId.split("/");
		String sn = parts[0];
		String streamId = parts[1];
		return sn + "-" + streamId;
	}
}