package com.zequent.framework.services.connector.proto;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: connector.proto")
public class ConnectorServiceClient implements ConnectorService, MutinyClient<MutinyConnectorServiceGrpc.MutinyConnectorServiceStub> {

    private final MutinyConnectorServiceGrpc.MutinyConnectorServiceStub stub;

    public ConnectorServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyConnectorServiceGrpc.MutinyConnectorServiceStub, MutinyConnectorServiceGrpc.MutinyConnectorServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyConnectorServiceGrpc.newMutinyStub(channel));
    }

    private ConnectorServiceClient(MutinyConnectorServiceGrpc.MutinyConnectorServiceStub stub) {
       this.stub = stub;
    }

    public ConnectorServiceClient newInstanceWithStub(MutinyConnectorServiceGrpc.MutinyConnectorServiceStub stub) {
        return new ConnectorServiceClient(stub);
    }

    @Override
    public MutinyConnectorServiceGrpc.MutinyConnectorServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
       return stub.registerAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
       return stub.deRegisterAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
       return stub.updateAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
       return stub.getAssetBySn(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
       return stub.getAssetById(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
       return stub.getSubAssetBySn(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
       return stub.getOrganization(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
       return stub.getMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
       return stub.createMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
       return stub.updateMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
       return stub.deleteMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
       return stub.getTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
       return stub.getTaskByFlightId(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
       return stub.getWaypointsByTaskId(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
       return stub.createTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
       return stub.updateTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
       return stub.deleteTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
       return stub.getScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
       return stub.createScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
       return stub.updateScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
       return stub.deleteScheduler(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request) {
       return stub.assetMonitoring(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> storeTelemetryBatch(io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> request) {
       return stub.storeTelemetryBatch(request);
    }

}