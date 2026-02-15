package com.zequent.framework.services.remote.proto;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: remote-control.proto")
public class RemoteControlServiceBean extends MutinyRemoteControlServiceGrpc.RemoteControlServiceImplBase implements BindableService, MutinyBean {

    private final RemoteControlService delegate;

    RemoteControlServiceBean(@GrpcService RemoteControlService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
       try {
         return delegate.takeOff(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
       try {
         return delegate.goTo(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
       try {
         return delegate.returnToHome(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
       try {
         return delegate.enterManualControl(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
       try {
         return delegate.exitManualControl(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
       try {
         return delegate.lookAt(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
       try {
         return delegate.openCover(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
       try {
         return delegate.closeCover(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
       try {
         return delegate.startCharging(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
       try {
         return delegate.stopCharging(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
       try {
         return delegate.rebootAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
       try {
         return delegate.bootSubAsset(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
       try {
         return delegate.enterOrCloseRemoteDebugMode(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
       try {
         return delegate.changeAcMode(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.remote.proto.RemoteControlResponse> manualControlInput(io.smallrye.mutiny.Multi<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> request) {
       try {
         return delegate.manualControlInput(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}