package com.zequent.framework.sdks.edge.proto;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: edge.proto")
public class EdgeAdapterServiceBean extends MutinyEdgeAdapterServiceGrpc.EdgeAdapterServiceImplBase implements BindableService, MutinyBean {

    private final EdgeAdapterService delegate;

    EdgeAdapterServiceBean(@GrpcService EdgeAdapterService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
       try {
         return delegate.getCapabilities(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
       try {
         return delegate.takeOff(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
       try {
         return delegate.goTo(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
       try {
         return delegate.returnToHome(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
       try {
         return delegate.enterManualControl(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
       try {
         return delegate.exitManualControl(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
       try {
         return delegate.lookAt(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
       try {
         return delegate.enableGimbalTracking(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
       try {
         return delegate.openCover(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
       try {
         return delegate.closeCover(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
       try {
         return delegate.startCharging(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
       try {
         return delegate.stopCharging(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
       try {
         return delegate.rebootAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
       try {
         return delegate.bootUpSubAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
       try {
         return delegate.bootDownSubAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
       try {
         return delegate.registerAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
       try {
         return delegate.deRegisterAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
       try {
         return delegate.enterOrCloseRemoteDebugMode(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
       try {
         return delegate.changeAcMode(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
       try {
         return delegate.startLiveStream(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
       try {
         return delegate.stopLiveStream(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
       try {
         return delegate.changeLens(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
       try {
         return delegate.changeZoom(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
       try {
         return delegate.capturePhoto(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
       try {
         return delegate.startRecording(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
       try {
         return delegate.stopRecording(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
       try {
         return delegate.startTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
       try {
         return delegate.stopTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
       try {
         return delegate.prepareTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request) {
       try {
         return delegate.getDetections(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.sdks.edge.proto.EdgeResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> request) {
       try {
         return delegate.manualControlInput(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}