package com.zequent.framework.services.livedata.proto;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: live-data.proto")
public class LiveDataServiceBean extends MutinyLiveDataServiceGrpc.LiveDataServiceImplBase implements BindableService, MutinyBean {

    private final LiveDataService delegate;

    LiveDataServiceBean(@GrpcService LiveDataService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
       try {
         return delegate.startLiveStream(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
       try {
         return delegate.stopLiveStream(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
       try {
         return delegate.changeLens(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
       try {
         return delegate.changeZoom(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
       try {
         return delegate.startRecording(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
       try {
         return delegate.stopRecording(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
       try {
         return delegate.capturePhoto(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request) {
       try {
         return delegate.streamTelemetry(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> produceTelemetry(io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> request) {
       try {
         return delegate.produceTelemetry(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}