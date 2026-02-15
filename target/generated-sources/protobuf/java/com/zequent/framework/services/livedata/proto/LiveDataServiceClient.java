package com.zequent.framework.services.livedata.proto;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: live-data.proto")
public class LiveDataServiceClient implements LiveDataService, MutinyClient<MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub> {

    private final MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub stub;

    public LiveDataServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub, MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyLiveDataServiceGrpc.newMutinyStub(channel));
    }

    private LiveDataServiceClient(MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub stub) {
       this.stub = stub;
    }

    public LiveDataServiceClient newInstanceWithStub(MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub stub) {
        return new LiveDataServiceClient(stub);
    }

    @Override
    public MutinyLiveDataServiceGrpc.MutinyLiveDataServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
       return stub.startLiveStream(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
       return stub.stopLiveStream(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
       return stub.changeLens(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
       return stub.changeZoom(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
       return stub.startRecording(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
       return stub.stopRecording(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
       return stub.capturePhoto(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request) {
       return stub.streamTelemetry(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> produceTelemetry(io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> request) {
       return stub.produceTelemetry(request);
    }

}