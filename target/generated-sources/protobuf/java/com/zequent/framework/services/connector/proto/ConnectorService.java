package com.zequent.framework.services.connector.proto;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: connector.proto")
public interface ConnectorService extends MutinyService {

    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request);
    
    
    io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request);
    
    /**
         * <pre>
         *  Telemetry Storage - batch processing from live-data service
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> storeTelemetryBatch(io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> request);
    

}