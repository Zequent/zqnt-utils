package com.zequent.framework.services.livedata.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: live-data.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LiveDataServiceGrpc {

  private LiveDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "LiveDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest,
      com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> getStreamTelemetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamTelemetry",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest,
      com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> getStreamTelemetryMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest, com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> getStreamTelemetryMethod;
    if ((getStreamTelemetryMethod = LiveDataServiceGrpc.getStreamTelemetryMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getStreamTelemetryMethod = LiveDataServiceGrpc.getStreamTelemetryMethod) == null) {
          LiveDataServiceGrpc.getStreamTelemetryMethod = getStreamTelemetryMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest, com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamTelemetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("StreamTelemetry"))
              .build();
        }
      }
    }
    return getStreamTelemetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getProduceTelemetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProduceTelemetry",
      requestType = com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getProduceTelemetryMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getProduceTelemetryMethod;
    if ((getProduceTelemetryMethod = LiveDataServiceGrpc.getProduceTelemetryMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getProduceTelemetryMethod = LiveDataServiceGrpc.getProduceTelemetryMethod) == null) {
          LiveDataServiceGrpc.getProduceTelemetryMethod = getProduceTelemetryMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProduceTelemetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("ProduceTelemetry"))
              .build();
        }
      }
    }
    return getProduceTelemetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartLiveStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartLiveStream",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartLiveStreamMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartLiveStreamMethod;
    if ((getStartLiveStreamMethod = LiveDataServiceGrpc.getStartLiveStreamMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getStartLiveStreamMethod = LiveDataServiceGrpc.getStartLiveStreamMethod) == null) {
          LiveDataServiceGrpc.getStartLiveStreamMethod = getStartLiveStreamMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartLiveStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("StartLiveStream"))
              .build();
        }
      }
    }
    return getStartLiveStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopLiveStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopLiveStream",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopLiveStreamMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopLiveStreamMethod;
    if ((getStopLiveStreamMethod = LiveDataServiceGrpc.getStopLiveStreamMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getStopLiveStreamMethod = LiveDataServiceGrpc.getStopLiveStreamMethod) == null) {
          LiveDataServiceGrpc.getStopLiveStreamMethod = getStopLiveStreamMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopLiveStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("StopLiveStream"))
              .build();
        }
      }
    }
    return getStopLiveStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeLensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeLens",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeLensMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeLensMethod;
    if ((getChangeLensMethod = LiveDataServiceGrpc.getChangeLensMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getChangeLensMethod = LiveDataServiceGrpc.getChangeLensMethod) == null) {
          LiveDataServiceGrpc.getChangeLensMethod = getChangeLensMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeLens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("ChangeLens"))
              .build();
        }
      }
    }
    return getChangeLensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeZoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeZoom",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeZoomMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getChangeZoomMethod;
    if ((getChangeZoomMethod = LiveDataServiceGrpc.getChangeZoomMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getChangeZoomMethod = LiveDataServiceGrpc.getChangeZoomMethod) == null) {
          LiveDataServiceGrpc.getChangeZoomMethod = getChangeZoomMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeZoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("ChangeZoom"))
              .build();
        }
      }
    }
    return getChangeZoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRecording",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartRecordingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getStartRecordingMethod;
    if ((getStartRecordingMethod = LiveDataServiceGrpc.getStartRecordingMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getStartRecordingMethod = LiveDataServiceGrpc.getStartRecordingMethod) == null) {
          LiveDataServiceGrpc.getStartRecordingMethod = getStartRecordingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("StartRecording"))
              .build();
        }
      }
    }
    return getStartRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopRecording",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopRecordingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getStopRecordingMethod;
    if ((getStopRecordingMethod = LiveDataServiceGrpc.getStopRecordingMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getStopRecordingMethod = LiveDataServiceGrpc.getStopRecordingMethod) == null) {
          LiveDataServiceGrpc.getStopRecordingMethod = getStopRecordingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("StopRecording"))
              .build();
        }
      }
    }
    return getStopRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getCapturePhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CapturePhoto",
      requestType = com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest.class,
      responseType = com.zequent.framework.services.livedata.proto.LiveDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest,
      com.zequent.framework.services.livedata.proto.LiveDataResponse> getCapturePhotoMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse> getCapturePhotoMethod;
    if ((getCapturePhotoMethod = LiveDataServiceGrpc.getCapturePhotoMethod) == null) {
      synchronized (LiveDataServiceGrpc.class) {
        if ((getCapturePhotoMethod = LiveDataServiceGrpc.getCapturePhotoMethod) == null) {
          LiveDataServiceGrpc.getCapturePhotoMethod = getCapturePhotoMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest, com.zequent.framework.services.livedata.proto.LiveDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CapturePhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.livedata.proto.LiveDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveDataServiceMethodDescriptorSupplier("CapturePhoto"))
              .build();
        }
      }
    }
    return getCapturePhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LiveDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceStub>() {
        @java.lang.Override
        public LiveDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveDataServiceStub(channel, callOptions);
        }
      };
    return LiveDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LiveDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceBlockingStub>() {
        @java.lang.Override
        public LiveDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveDataServiceBlockingStub(channel, callOptions);
        }
      };
    return LiveDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LiveDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveDataServiceFutureStub>() {
        @java.lang.Override
        public LiveDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveDataServiceFutureStub(channel, callOptions);
        }
      };
    return LiveDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Telemetry Streaming - Server sends telemetry to clients
     * </pre>
     */
    default void streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamTelemetryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Telemetry Production - Clients (Edge adapters) send telemetry to server
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> produceTelemetry(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getProduceTelemetryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Live Stream Management
     * </pre>
     */
    default void startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartLiveStreamMethod(), responseObserver);
    }

    /**
     */
    default void stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopLiveStreamMethod(), responseObserver);
    }

    /**
     */
    default void changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeLensMethod(), responseObserver);
    }

    /**
     */
    default void changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeZoomMethod(), responseObserver);
    }

    /**
     */
    default void startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRecordingMethod(), responseObserver);
    }

    /**
     */
    default void stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopRecordingMethod(), responseObserver);
    }

    /**
     */
    default void capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCapturePhotoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LiveDataService.
   */
  public static abstract class LiveDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LiveDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LiveDataService.
   */
  public static final class LiveDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LiveDataServiceStub> {
    private LiveDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Telemetry Streaming - Server sends telemetry to clients
     * </pre>
     */
    public void streamTelemetry(com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamTelemetryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Telemetry Production - Clients (Edge adapters) send telemetry to server
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest> produceTelemetry(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getProduceTelemetryMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Live Stream Management
     * </pre>
     */
    public void startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartLiveStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopLiveStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeLensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeZoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCapturePhotoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LiveDataService.
   */
  public static final class LiveDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LiveDataServiceBlockingStub> {
    private LiveDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Telemetry Streaming - Server sends telemetry to clients
     * </pre>
     */
    public java.util.Iterator<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse> streamTelemetry(
        com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamTelemetryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Live Stream Management
     * </pre>
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse startLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartLiveStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse stopLiveStream(com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopLiveStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse changeLens(com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeLensMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse changeZoom(com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeZoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse startRecording(com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse stopRecording(com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.livedata.proto.LiveDataResponse capturePhoto(com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCapturePhotoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LiveDataService.
   */
  public static final class LiveDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LiveDataServiceFutureStub> {
    private LiveDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Live Stream Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> startLiveStream(
        com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartLiveStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopLiveStream(
        com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopLiveStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeLens(
        com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeLensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> changeZoom(
        com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeZoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> startRecording(
        com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> stopRecording(
        com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.livedata.proto.LiveDataResponse> capturePhoto(
        com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCapturePhotoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STREAM_TELEMETRY = 0;
  private static final int METHODID_START_LIVE_STREAM = 1;
  private static final int METHODID_STOP_LIVE_STREAM = 2;
  private static final int METHODID_CHANGE_LENS = 3;
  private static final int METHODID_CHANGE_ZOOM = 4;
  private static final int METHODID_START_RECORDING = 5;
  private static final int METHODID_STOP_RECORDING = 6;
  private static final int METHODID_CAPTURE_PHOTO = 7;
  private static final int METHODID_PRODUCE_TELEMETRY = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_TELEMETRY:
          serviceImpl.streamTelemetry((com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse>) responseObserver);
          break;
        case METHODID_START_LIVE_STREAM:
          serviceImpl.startLiveStream((com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_STOP_LIVE_STREAM:
          serviceImpl.stopLiveStream((com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LENS:
          serviceImpl.changeLens((com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ZOOM:
          serviceImpl.changeZoom((com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_START_RECORDING:
          serviceImpl.startRecording((com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_STOP_RECORDING:
          serviceImpl.stopRecording((com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        case METHODID_CAPTURE_PHOTO:
          serviceImpl.capturePhoto((com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCE_TELEMETRY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.produceTelemetry(
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.livedata.proto.LiveDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStreamTelemetryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataStreamTelemetryRequest,
              com.zequent.framework.services.livedata.proto.LiveDataTelemetryResponse>(
                service, METHODID_STREAM_TELEMETRY)))
        .addMethod(
          getProduceTelemetryMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.ProduceTelemetryRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_PRODUCE_TELEMETRY)))
        .addMethod(
          getStartLiveStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataStartLiveStreamRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_START_LIVE_STREAM)))
        .addMethod(
          getStopLiveStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataStopLiveStreamRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_STOP_LIVE_STREAM)))
        .addMethod(
          getChangeLensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataChangeLensRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_CHANGE_LENS)))
        .addMethod(
          getChangeZoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataChangeZoomRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_CHANGE_ZOOM)))
        .addMethod(
          getStartRecordingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataStartRecordingRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_START_RECORDING)))
        .addMethod(
          getStopRecordingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataStopRecordingRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_STOP_RECORDING)))
        .addMethod(
          getCapturePhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.livedata.proto.LiveDataCapturePhotoRequest,
              com.zequent.framework.services.livedata.proto.LiveDataResponse>(
                service, METHODID_CAPTURE_PHOTO)))
        .build();
  }

  private static abstract class LiveDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LiveDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zequent.framework.services.livedata.proto.LiveDataProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LiveDataService");
    }
  }

  private static final class LiveDataServiceFileDescriptorSupplier
      extends LiveDataServiceBaseDescriptorSupplier {
    LiveDataServiceFileDescriptorSupplier() {}
  }

  private static final class LiveDataServiceMethodDescriptorSupplier
      extends LiveDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LiveDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LiveDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LiveDataServiceFileDescriptorSupplier())
              .addMethod(getStreamTelemetryMethod())
              .addMethod(getProduceTelemetryMethod())
              .addMethod(getStartLiveStreamMethod())
              .addMethod(getStopLiveStreamMethod())
              .addMethod(getChangeLensMethod())
              .addMethod(getChangeZoomMethod())
              .addMethod(getStartRecordingMethod())
              .addMethod(getStopRecordingMethod())
              .addMethod(getCapturePhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
