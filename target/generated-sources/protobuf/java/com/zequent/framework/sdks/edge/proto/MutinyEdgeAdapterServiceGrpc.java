package com.zequent.framework.sdks.edge.proto;

import static com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: edge.proto")
public final class MutinyEdgeAdapterServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyEdgeAdapterServiceGrpc() {}

    public static MutinyEdgeAdapterServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyEdgeAdapterServiceStub(channel);
    }

    
    public static final class MutinyEdgeAdapterServiceStub extends io.grpc.stub.AbstractStub<MutinyEdgeAdapterServiceStub> implements io.quarkus.grpc.MutinyStub {
        private EdgeAdapterServiceGrpc.EdgeAdapterServiceStub delegateStub;

        private MutinyEdgeAdapterServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = EdgeAdapterServiceGrpc.newStub(channel);
        }

        private MutinyEdgeAdapterServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = EdgeAdapterServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyEdgeAdapterServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyEdgeAdapterServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         *  Capability Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getCapabilities);
        }

        /**
         * <pre>
         *  Flight Control (for drone in dock)
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::takeOff);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::goTo);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::returnToHome);
        }

        /**
         * <pre>
         *  Manual Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::enterManualControl);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::exitManualControl);
        }

        /**
         * <pre>
         *  Gimbal &amp; Camera Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::lookAt);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::enableGimbalTracking);
        }

        /**
         * <pre>
         *  Dock Specific Operations
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::openCover);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::closeCover);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startCharging);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopCharging);
        }

        /**
         * <pre>
         *  Asset Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::rebootAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::bootUpSubAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::bootDownSubAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::registerAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deRegisterAsset);
        }

        /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::enterOrCloseRemoteDebugMode);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeAcMode);
        }

        /**
         * <pre>
         *  Live Stream
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startLiveStream);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopLiveStream);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeLens);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeZoom);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::capturePhoto);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startRecording);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopRecording);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::prepareTask);
        }

        /**
         * <pre>
         *  Detection
         * </pre>
         */
        public io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::getDetections);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::manualControlInput);
        }

    }

    
    public static abstract class EdgeAdapterServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public EdgeAdapterServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        /**
         * <pre>
         *  Capability Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Flight Control (for drone in dock)
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Manual Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Gimbal &amp; Camera Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Dock Specific Operations
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Asset Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Live Stream
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Detection
         * </pre>
         */
        public io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getGetCapabilitiesMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse>(
                                            this, METHODID_GET_CAPABILITIES, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getTakeOffMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_TAKE_OFF, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getGoToMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeGoToRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_GO_TO, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getReturnToHomeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_RETURN_TO_HOME, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getEnterManualControlMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_ENTER_MANUAL_CONTROL, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getExitManualControlMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_EXIT_MANUAL_CONTROL, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getManualControlInputMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_MANUAL_CONTROL_INPUT, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getLookAtMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_LOOK_AT, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getEnableGimbalTrackingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_ENABLE_GIMBAL_TRACKING, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getGetDetectionsMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse>(
                                            this, METHODID_GET_DETECTIONS, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getOpenCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_OPEN_COVER, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getCloseCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_CLOSE_COVER, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStartChargingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_START_CHARGING, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStopChargingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_STOP_CHARGING, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getRebootAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_REBOOT_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getBootUpSubAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_BOOT_UP_SUB_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getBootDownSubAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_BOOT_DOWN_SUB_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getRegisterAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_REGISTER_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getDeRegisterAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_DE_REGISTER_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getEnterOrCloseRemoteDebugModeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getChangeAcModeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_CHANGE_AC_MODE, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStartLiveStreamMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_START_LIVE_STREAM, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStopLiveStreamMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_STOP_LIVE_STREAM, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getChangeLensMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_CHANGE_LENS, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getChangeZoomMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_CHANGE_ZOOM, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getCapturePhotoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_CAPTURE_PHOTO, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStartRecordingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_START_RECORDING, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStopRecordingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_STOP_RECORDING, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStartTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_START_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getStopTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_STOP_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.sdks.edge.proto.EdgeAdapterServiceGrpc.getPrepareTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest,
                                            com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                                            this, METHODID_PREPARE_TASK, compression)))
                    .build();
        }
    }

    private static final int METHODID_GET_CAPABILITIES = 0;
    private static final int METHODID_TAKE_OFF = 1;
    private static final int METHODID_GO_TO = 2;
    private static final int METHODID_RETURN_TO_HOME = 3;
    private static final int METHODID_ENTER_MANUAL_CONTROL = 4;
    private static final int METHODID_EXIT_MANUAL_CONTROL = 5;
    private static final int METHODID_MANUAL_CONTROL_INPUT = 6;
    private static final int METHODID_LOOK_AT = 7;
    private static final int METHODID_ENABLE_GIMBAL_TRACKING = 8;
    private static final int METHODID_GET_DETECTIONS = 9;
    private static final int METHODID_OPEN_COVER = 10;
    private static final int METHODID_CLOSE_COVER = 11;
    private static final int METHODID_START_CHARGING = 12;
    private static final int METHODID_STOP_CHARGING = 13;
    private static final int METHODID_REBOOT_ASSET = 14;
    private static final int METHODID_BOOT_UP_SUB_ASSET = 15;
    private static final int METHODID_BOOT_DOWN_SUB_ASSET = 16;
    private static final int METHODID_REGISTER_ASSET = 17;
    private static final int METHODID_DE_REGISTER_ASSET = 18;
    private static final int METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE = 19;
    private static final int METHODID_CHANGE_AC_MODE = 20;
    private static final int METHODID_START_LIVE_STREAM = 21;
    private static final int METHODID_STOP_LIVE_STREAM = 22;
    private static final int METHODID_CHANGE_LENS = 23;
    private static final int METHODID_CHANGE_ZOOM = 24;
    private static final int METHODID_CAPTURE_PHOTO = 25;
    private static final int METHODID_START_RECORDING = 26;
    private static final int METHODID_STOP_RECORDING = 27;
    private static final int METHODID_START_TASK = 28;
    private static final int METHODID_STOP_TASK = 29;
    private static final int METHODID_PREPARE_TASK = 30;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final EdgeAdapterServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(EdgeAdapterServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_CAPABILITIES:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse>) responseObserver,
                            compression,
                            serviceImpl::getCapabilities);
                    break;
                case METHODID_TAKE_OFF:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::takeOff);
                    break;
                case METHODID_GO_TO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeGoToRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::goTo);
                    break;
                case METHODID_RETURN_TO_HOME:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::returnToHome);
                    break;
                case METHODID_ENTER_MANUAL_CONTROL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::enterManualControl);
                    break;
                case METHODID_EXIT_MANUAL_CONTROL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::exitManualControl);
                    break;
                case METHODID_LOOK_AT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::lookAt);
                    break;
                case METHODID_ENABLE_GIMBAL_TRACKING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::enableGimbalTracking);
                    break;
                case METHODID_GET_DETECTIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse>) responseObserver,
                            compression,
                            serviceImpl::getDetections);
                    break;
                case METHODID_OPEN_COVER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::openCover);
                    break;
                case METHODID_CLOSE_COVER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::closeCover);
                    break;
                case METHODID_START_CHARGING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::startCharging);
                    break;
                case METHODID_STOP_CHARGING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::stopCharging);
                    break;
                case METHODID_REBOOT_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::rebootAsset);
                    break;
                case METHODID_BOOT_UP_SUB_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::bootUpSubAsset);
                    break;
                case METHODID_BOOT_DOWN_SUB_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::bootDownSubAsset);
                    break;
                case METHODID_REGISTER_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::registerAsset);
                    break;
                case METHODID_DE_REGISTER_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::deRegisterAsset);
                    break;
                case METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::enterOrCloseRemoteDebugMode);
                    break;
                case METHODID_CHANGE_AC_MODE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::changeAcMode);
                    break;
                case METHODID_START_LIVE_STREAM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::startLiveStream);
                    break;
                case METHODID_STOP_LIVE_STREAM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::stopLiveStream);
                    break;
                case METHODID_CHANGE_LENS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::changeLens);
                    break;
                case METHODID_CHANGE_ZOOM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::changeZoom);
                    break;
                case METHODID_CAPTURE_PHOTO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::capturePhoto);
                    break;
                case METHODID_START_RECORDING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::startRecording);
                    break;
                case METHODID_STOP_RECORDING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::stopRecording);
                    break;
                case METHODID_START_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::startTask);
                    break;
                case METHODID_STOP_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::stopTask);
                    break;
                case METHODID_PREPARE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            compression,
                            serviceImpl::prepareTask);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_MANUAL_CONTROL_INPUT:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver,
                            serviceImpl::manualControlInput);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}