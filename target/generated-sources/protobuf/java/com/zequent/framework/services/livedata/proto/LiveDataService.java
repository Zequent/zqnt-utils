package com.zequent.framework.services.livedata.proto;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: live-data.proto")
public interface LiveDataService extends MutinyService {

    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request);
    
    
    io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request);
    
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.livedata.proto.LiveDataResponse> produceTelemetry(io.smallrye.mutiny.Multi<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> request);
    

}