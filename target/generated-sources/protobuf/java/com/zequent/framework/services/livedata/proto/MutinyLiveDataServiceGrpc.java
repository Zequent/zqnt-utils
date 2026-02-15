package com.zequent.framework.services.livedata.proto;

import static com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: live-data.proto")
public final class MutinyLiveDataServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyLiveDataServiceGrpc() {}

    public static MutinyLiveDataServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyLiveDataServiceStub(channel);
    }

    
    public static final class MutinyLiveDataServiceStub extends io.grpc.stub.AbstractStub<MutinyLiveDataServiceStub> implements io.quarkus.grpc.MutinyStub {
        private LiveDataServiceGrpc.LiveDataServiceStub delegateStub;

        private MutinyLiveDataServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = LiveDataServiceGrpc.newStub(channel);
        }

        private MutinyLiveDataServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = LiveDataServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyLiveDataServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyLiveDataServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startLiveStream);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopLiveStream);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeLens);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::changeZoom);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startRecording);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopRecording);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::capturePhoto);
        }

        
        public io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToMany(request, delegateStub::streamTelemetry);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> produceTelemetry(io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> request) {
            return io.quarkus.grpc.stubs.ClientCalls.manyToOne(request, delegateStub::produceTelemetry);
        }

    }

    
    public static abstract class LiveDataServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public LiveDataServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> produceTelemetry(io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getStreamTelemetryMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse>(
                                            this, METHODID_STREAM_TELEMETRY, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getProduceTelemetryMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_PRODUCE_TELEMETRY, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getStartLiveStreamMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_START_LIVE_STREAM, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getStopLiveStreamMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_STOP_LIVE_STREAM, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getChangeLensMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_CHANGE_LENS, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getChangeZoomMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_CHANGE_ZOOM, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getStartRecordingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_START_RECORDING, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getStopRecordingMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_STOP_RECORDING, compression)))
                    .addMethod(
                            com.zequent.framework.services.livedata.proto.LiveDataServiceGrpc.getCapturePhotoMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest,
                                            com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                                            this, METHODID_CAPTURE_PHOTO, compression)))
                    .build();
        }
    }

    private static final int METHODID_STREAM_TELEMETRY = 0;
    private static final int METHODID_PRODUCE_TELEMETRY = 1;
    private static final int METHODID_START_LIVE_STREAM = 2;
    private static final int METHODID_STOP_LIVE_STREAM = 3;
    private static final int METHODID_CHANGE_LENS = 4;
    private static final int METHODID_CHANGE_ZOOM = 5;
    private static final int METHODID_START_RECORDING = 6;
    private static final int METHODID_STOP_RECORDING = 7;
    private static final int METHODID_CAPTURE_PHOTO = 8;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final LiveDataServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(LiveDataServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_STREAM_TELEMETRY:
                    io.quarkus.grpc.stubs.ServerCalls.oneToMany((com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse>) responseObserver,
                            compression,
                            serviceImpl::streamTelemetry);
                    break;
                case METHODID_START_LIVE_STREAM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::startLiveStream);
                    break;
                case METHODID_STOP_LIVE_STREAM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::stopLiveStream);
                    break;
                case METHODID_CHANGE_LENS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::changeLens);
                    break;
                case METHODID_CHANGE_ZOOM:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::changeZoom);
                    break;
                case METHODID_START_RECORDING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::startRecording);
                    break;
                case METHODID_STOP_RECORDING:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::stopRecording);
                    break;
                case METHODID_CAPTURE_PHOTO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            compression,
                            serviceImpl::capturePhoto);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_PRODUCE_TELEMETRY:
                    return (io.grpc.stub.StreamObserver<Req>) io.quarkus.grpc.stubs.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver,
                            serviceImpl::produceTelemetry);
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}