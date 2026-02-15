package com.zequent.framework.services.remote.proto;

import static com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: remote-control.proto")
public final class MutinyRemoteControlServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyRemoteControlServiceGrpc() {}

    public static MutinyRemoteControlServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyRemoteControlServiceStub(channel);
    }

    
    public static final class MutinyRemoteControlServiceStub extends io.grpc.stub.AbstractStub<MutinyRemoteControlServiceStub> implements io.quarkus.grpc.MutinyStub {
        private RemoteControlServiceGrpc.RemoteControlServiceStub delegateStub;

        private MutinyRemoteControlServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = RemoteControlServiceGrpc.newStub(channel);
        }

        private MutinyRemoteControlServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = RemoteControlServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyRemoteControlServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyRemoteControlServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::takeOff);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::goTo);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::returnToHome);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::enterManualControl);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::exitManualControl);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::lookAt);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::openCover);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::closeCover);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startCharging);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopCharging);
        }

        /**
         * <pre>
         *  Asset Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::rebootAsset);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::bootSubAsset);
        }

        /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::enterOrCloseRemoteDebugMode);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeAcMode);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::manualControlInput);
        }

    }

    
    public static abstract class RemoteControlServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public RemoteControlServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Asset Management
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getTakeOffMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_TAKE_OFF, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getGoToMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlGoToRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_GO_TO, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getReturnToHomeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_RETURN_TO_HOME, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getEnterManualControlMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_ENTER_MANUAL_CONTROL, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getExitManualControlMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_EXIT_MANUAL_CONTROL, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getManualControlInputMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_MANUAL_CONTROL_INPUT, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getLookAtMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_LOOK_AT, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getOpenCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_OPEN_COVER, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getCloseCoverMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_CLOSE_COVER, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getStartChargingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_START_CHARGING, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getStopChargingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_STOP_CHARGING, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getRebootAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_REBOOT_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getBootSubAssetMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_BOOT_SUB_ASSET, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getEnterOrCloseRemoteDebugModeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE, compression)))
                    .addMethod(
                            com.zequent.framework.services.remote.proto.RemoteControlServiceGrpc.getChangeAcModeMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest,
                                            com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                                            this, METHODID_CHANGE_AC_MODE, compression)))
                    .build();
        }
    }

    private static final int METHODID_TAKE_OFF = 0;
    private static final int METHODID_GO_TO = 1;
    private static final int METHODID_RETURN_TO_HOME = 2;
    private static final int METHODID_ENTER_MANUAL_CONTROL = 3;
    private static final int METHODID_EXIT_MANUAL_CONTROL = 4;
    private static final int METHODID_MANUAL_CONTROL_INPUT = 5;
    private static final int METHODID_LOOK_AT = 6;
    private static final int METHODID_OPEN_COVER = 7;
    private static final int METHODID_CLOSE_COVER = 8;
    private static final int METHODID_START_CHARGING = 9;
    private static final int METHODID_STOP_CHARGING = 10;
    private static final int METHODID_REBOOT_ASSET = 11;
    private static final int METHODID_BOOT_SUB_ASSET = 12;
    private static final int METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE = 13;
    private static final int METHODID_CHANGE_AC_MODE = 14;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final RemoteControlServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(RemoteControlServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_TAKE_OFF:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::takeOff);
                    break;
                case METHODID_GO_TO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlGoToRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::goTo);
                    break;
                case METHODID_RETURN_TO_HOME:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::returnToHome);
                    break;
                case METHODID_ENTER_MANUAL_CONTROL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::enterManualControl);
                    break;
                case METHODID_EXIT_MANUAL_CONTROL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::exitManualControl);
                    break;
                case METHODID_LOOK_AT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::lookAt);
                    break;
                case METHODID_OPEN_COVER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::openCover);
                    break;
                case METHODID_CLOSE_COVER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::closeCover);
                    break;
                case METHODID_START_CHARGING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::startCharging);
                    break;
                case METHODID_STOP_CHARGING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::stopCharging);
                    break;
                case METHODID_REBOOT_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::rebootAsset);
                    break;
                case METHODID_BOOT_SUB_ASSET:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::bootSubAsset);
                    break;
                case METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::enterOrCloseRemoteDebugMode);
                    break;
                case METHODID_CHANGE_AC_MODE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            compression,
                            serviceImpl::changeAcMode);
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
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver,
                            serviceImpl::manualControlInput);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}