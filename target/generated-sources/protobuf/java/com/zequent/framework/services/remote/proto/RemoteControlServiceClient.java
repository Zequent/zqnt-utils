package com.zequent.framework.services.remote.proto;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: remote-control.proto")
public class RemoteControlServiceClient implements RemoteControlService, MutinyClient<MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub> {

    private final MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub stub;

    public RemoteControlServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub, MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyRemoteControlServiceGrpc.newMutinyStub(channel));
    }

    private RemoteControlServiceClient(MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub stub) {
       this.stub = stub;
    }

    public RemoteControlServiceClient newInstanceWithStub(MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub stub) {
        return new RemoteControlServiceClient(stub);
    }

    @Override
    public MutinyRemoteControlServiceGrpc.MutinyRemoteControlServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
       return stub.takeOff(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
       return stub.goTo(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
       return stub.returnToHome(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
       return stub.enterManualControl(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
       return stub.exitManualControl(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
       return stub.lookAt(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
       return stub.openCover(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
       return stub.closeCover(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
       return stub.startCharging(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
       return stub.stopCharging(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
       return stub.rebootAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
       return stub.bootSubAsset(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
       return stub.enterOrCloseRemoteDebugMode(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
       return stub.changeAcMode(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> request) {
       return stub.manualControlInput(request);
    }

}