package com.zequent.framework.utils.edge.sdk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO for asset_telemetry_1min continuous aggregate view.
 * Contains 1-minute aggregated telemetry data for real-time dashboards.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetTelemetryMinuteAggregateDTO {

    private Instant bucket;
    private String assetId;
    private String assetType;
    private String missionId;
    private String organizationId;

    // Location averages
    private Double avgLatitude;
    private Double avgLongitude;
    private Double avgAltitude;
    private Double avgHeading;

    // Battery stats
    private Double avgBattery;
    private Double minBattery;
    private Double maxBattery;

    // Environmental averages
    private Double avgTemperature;
    private Double avgHumidity;
    private Double avgWindSpeed;

    // Connection stats
    private Double avgNetworkQuality;
    private Double avgSignalStrength;

    // Sample count
    private Long sampleCount;

    // First and last values
    private Double firstLatitude;
    private Double firstLongitude;
    private Double lastLatitude;
    private Double lastLongitude;
}
