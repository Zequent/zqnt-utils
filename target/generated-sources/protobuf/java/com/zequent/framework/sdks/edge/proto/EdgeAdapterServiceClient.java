package com.zequent.framework.sdks.edge.proto;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: edge.proto")
public class EdgeAdapterServiceClient implements EdgeAdapterService, MutinyClient<MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub> {

    private final MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub stub;

    public EdgeAdapterServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub, MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyEdgeAdapterServiceGrpc.newMutinyStub(channel));
    }

    private EdgeAdapterServiceClient(MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub stub) {
       this.stub = stub;
    }

    public EdgeAdapterServiceClient newInstanceWithStub(MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub stub) {
        return new EdgeAdapterServiceClient(stub);
    }

    @Override
    public MutinyEdgeAdapterServiceGrpc.MutinyEdgeAdapterServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
       return stub.getCapabilities(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
       return stub.takeOff(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
       return stub.goTo(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
       return stub.returnToHome(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
       return stub.enterManualControl(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
       return stub.exitManualControl(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
       return stub.lookAt(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
       return stub.enableGimbalTracking(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
       return stub.openCover(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
       return stub.closeCover(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
       return stub.startCharging(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
       return stub.stopCharging(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
       return stub.rebootAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
       return stub.bootUpSubAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
       return stub.bootDownSubAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
       return stub.registerAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
       return stub.deRegisterAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
       return stub.enterOrCloseRemoteDebugMode(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
       return stub.changeAcMode(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
       return stub.startLiveStream(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
       return stub.stopLiveStream(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
       return stub.changeLens(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
       return stub.changeZoom(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
       return stub.capturePhoto(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
       return stub.startRecording(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
       return stub.stopRecording(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
       return stub.startTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
       return stub.stopTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
       return stub.prepareTask(request);
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request) {
       return stub.getDetections(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> request) {
       return stub.manualControlInput(request);
    }

}