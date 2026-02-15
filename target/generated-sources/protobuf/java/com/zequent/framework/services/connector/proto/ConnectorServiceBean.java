package com.zequent.framework.services.connector.proto;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: connector.proto")
public class ConnectorServiceBean extends MutinyConnectorServiceGrpc.ConnectorServiceImplBase implements BindableService, MutinyBean {

    private final ConnectorService delegate;

    ConnectorServiceBean(@GrpcService ConnectorService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
       try {
         return delegate.registerAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
       try {
         return delegate.deRegisterAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
       try {
         return delegate.updateAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
       try {
         return delegate.getAssetBySn(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
       try {
         return delegate.getAssetById(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
       try {
         return delegate.getSubAssetBySn(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
       try {
         return delegate.getOrganization(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
       try {
         return delegate.getMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
       try {
         return delegate.createMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
       try {
         return delegate.updateMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
       try {
         return delegate.deleteMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
       try {
         return delegate.getTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
       try {
         return delegate.getTaskByFlightId(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
       try {
         return delegate.getWaypointsByTaskId(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
       try {
         return delegate.createTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
       try {
         return delegate.updateTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
       try {
         return delegate.deleteTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
       try {
         return delegate.getScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
       try {
         return delegate.createScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
       try {
         return delegate.updateScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
       try {
         return delegate.deleteScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request) {
       try {
         return delegate.assetMonitoring(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> storeTelemetryBatch(io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> request) {
       try {
         return delegate.storeTelemetryBatch(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}