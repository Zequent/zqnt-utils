package com.zequent.framework.services.connector.proto;

import static com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: connector.proto")
public final class MutinyConnectorServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyConnectorServiceGrpc() {}

    public static MutinyConnectorServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyConnectorServiceStub(channel);
    }

    
    public static final class MutinyConnectorServiceStub extends io.grpc.stub.AbstractStub<MutinyConnectorServiceStub> implements io.quarkus.grpc.MutinyStub {
        private ConnectorServiceGrpc.ConnectorServiceStub delegateStub;

        private MutinyConnectorServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ConnectorServiceGrpc.newStub(channel);
        }

        private MutinyConnectorServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ConnectorServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyConnectorServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyConnectorServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::registerAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deRegisterAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getAssetBySn);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getAssetById);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getSubAssetBySn);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getOrganization);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getTaskByFlightId);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getWaypointsByTaskId);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteScheduler);
        }

        
        public io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::assetMonitoring);
        }

        /**
         * <pre>
         *  Telemetry Storage - batch processing from live-data service
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> storeTelemetryBatch(io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::storeTelemetryBatch);
        }

    }

    
    public static abstract class ConnectorServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public ConnectorServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Telemetry Storage - batch processing from live-data service
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.connector.proto.ConnectorResponse> storeTelemetryBatch(io.smallrye.mutiny.Multi<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getRegisterAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_REGISTER_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getDeRegisterAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_DE_REGISTER_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getAssetMonitoringMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest,
                                            com.zequent.framework.services.connector.proto.AssetMonitoringResponse>(
                                            this, METHODID_ASSET_MONITORING, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getUpdateAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_UPDATE_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetAssetBySnMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_ASSET_BY_SN, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetAssetByIdMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_ASSET_BY_ID, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetSubAssetBySnMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_SUB_ASSET_BY_SN, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetOrganizationMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_ORGANIZATION, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getCreateMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_CREATE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getUpdateMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_UPDATE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getDeleteMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_DELETE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetTaskByFlightIdMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_TASK_BY_FLIGHT_ID, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetWaypointsByTaskIdMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_WAYPOINTS_BY_TASK_ID, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getCreateTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_CREATE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getUpdateTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_UPDATE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getDeleteTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_DELETE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getGetSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_GET_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getCreateSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_CREATE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getUpdateSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_UPDATE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getDeleteSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_DELETE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.connector.proto.ConnectorServiceGrpc.getStoreTelemetryBatchMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest,
                                            com.zequent.framework.services.connector.proto.ConnectorResponse>(
                                            this, METHODID_STORE_TELEMETRY_BATCH, compression)))
                    .build();
        }
    }

    private static final int METHODID_REGISTER_ASSET = 0;
    private static final int METHODID_DE_REGISTER_ASSET = 1;
    private static final int METHODID_ASSET_MONITORING = 2;
    private static final int METHODID_UPDATE_ASSET = 3;
    private static final int METHODID_GET_ASSET_BY_SN = 4;
    private static final int METHODID_GET_ASSET_BY_ID = 5;
    private static final int METHODID_GET_SUB_ASSET_BY_SN = 6;
    private static final int METHODID_GET_ORGANIZATION = 7;
    private static final int METHODID_GET_MISSION = 8;
    private static final int METHODID_CREATE_MISSION = 9;
    private static final int METHODID_UPDATE_MISSION = 10;
    private static final int METHODID_DELETE_MISSION = 11;
    private static final int METHODID_GET_TASK = 12;
    private static final int METHODID_GET_TASK_BY_FLIGHT_ID = 13;
    private static final int METHODID_GET_WAYPOINTS_BY_TASK_ID = 14;
    private static final int METHODID_CREATE_TASK = 15;
    private static final int METHODID_UPDATE_TASK = 16;
    private static final int METHODID_DELETE_TASK = 17;
    private static final int METHODID_GET_SCHEDULER = 18;
    private static final int METHODID_CREATE_SCHEDULER = 19;
    private static final int METHODID_UPDATE_SCHEDULER = 20;
    private static final int METHODID_DELETE_SCHEDULER = 21;
    private static final int METHODID_STORE_TELEMETRY_BATCH = 22;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final ConnectorServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(ConnectorServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_REGISTER_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::registerAsset);
                    break;
                case METHODID_DE_REGISTER_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::deRegisterAsset);
                    break;
                case METHODID_ASSET_MONITORING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.AssetMonitoringResponse>) responseObserver,
                            compression,
                            serviceImpl::assetMonitoring);
                    break;
                case METHODID_UPDATE_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::updateAsset);
                    break;
                case METHODID_GET_ASSET_BY_SN:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getAssetBySn);
                    break;
                case METHODID_GET_ASSET_BY_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getAssetById);
                    break;
                case METHODID_GET_SUB_ASSET_BY_SN:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getSubAssetBySn);
                    break;
                case METHODID_GET_ORGANIZATION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getOrganization);
                    break;
                case METHODID_GET_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getMission);
                    break;
                case METHODID_CREATE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::createMission);
                    break;
                case METHODID_UPDATE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::updateMission);
                    break;
                case METHODID_DELETE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteMission);
                    break;
                case METHODID_GET_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getTask);
                    break;
                case METHODID_GET_TASK_BY_FLIGHT_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getTaskByFlightId);
                    break;
                case METHODID_GET_WAYPOINTS_BY_TASK_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getWaypointsByTaskId);
                    break;
                case METHODID_CREATE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::createTask);
                    break;
                case METHODID_UPDATE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::updateTask);
                    break;
                case METHODID_DELETE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteTask);
                    break;
                case METHODID_GET_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::getScheduler);
                    break;
                case METHODID_CREATE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::createScheduler);
                    break;
                case METHODID_UPDATE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::updateScheduler);
                    break;
                case METHODID_DELETE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteScheduler);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_STORE_TELEMETRY_BATCH:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver,
                            serviceImpl::storeTelemetryBatch);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}