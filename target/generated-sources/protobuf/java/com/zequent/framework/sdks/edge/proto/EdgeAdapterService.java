package com.zequent.framework.sdks.edge.proto;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: edge.proto")
public interface EdgeAdapterService extends MutinyService {

    /**
         * <pre>
         *  Capability Management
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request);
    /**
         * <pre>
         *  Flight Control (for drone in dock)
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request);
    /**
         * <pre>
         *  Manual Control
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request);
    /**
         * <pre>
         *  Gimbal &amp; Camera Control
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request);
    /**
         * <pre>
         *  Dock Specific Operations
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request);
    /**
         * <pre>
         *  Asset Management
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request);
    /**
         * <pre>
         *  Debug &amp; Maintenance
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request);
    /**
         * <pre>
         *  Live Stream
         * </pre>
         */
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request);
    
    /**
         * <pre>
         *  Detection
         * </pre>
         */
    io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request);
    
    
    io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> request);
    

}