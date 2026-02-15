package com.zequent.framework.services.remote.proto;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: remote-control.proto")
public interface RemoteControlService extends MutinyService {

    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request);
    /**
         * <pre>
         *  Asset Management
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request);
    /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request);
    
    
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> request);
    

}