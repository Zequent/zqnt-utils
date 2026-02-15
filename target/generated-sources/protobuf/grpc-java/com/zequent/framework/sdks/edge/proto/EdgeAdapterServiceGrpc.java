package com.zequent.framework.sdks.edge.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: edge.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EdgeAdapterServiceGrpc {

  private EdgeAdapterServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "EdgeAdapterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest,
      com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getGetCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCapabilities",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest,
      com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getGetCapabilitiesMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest, com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getGetCapabilitiesMethod;
    if ((getGetCapabilitiesMethod = EdgeAdapterServiceGrpc.getGetCapabilitiesMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getGetCapabilitiesMethod = EdgeAdapterServiceGrpc.getGetCapabilitiesMethod) == null) {
          EdgeAdapterServiceGrpc.getGetCapabilitiesMethod = getGetCapabilitiesMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest, com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("GetCapabilities"))
              .build();
        }
      }
    }
    return getGetCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getTakeOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakeOff",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getTakeOffMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getTakeOffMethod;
    if ((getTakeOffMethod = EdgeAdapterServiceGrpc.getTakeOffMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getTakeOffMethod = EdgeAdapterServiceGrpc.getTakeOffMethod) == null) {
          EdgeAdapterServiceGrpc.getTakeOffMethod = getTakeOffMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakeOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("TakeOff"))
              .build();
        }
      }
    }
    return getTakeOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGoToRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getGoToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoTo",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeGoToRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGoToRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getGoToMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGoToRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getGoToMethod;
    if ((getGoToMethod = EdgeAdapterServiceGrpc.getGoToMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getGoToMethod = EdgeAdapterServiceGrpc.getGoToMethod) == null) {
          EdgeAdapterServiceGrpc.getGoToMethod = getGoToMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeGoToRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeGoToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("GoTo"))
              .build();
        }
      }
    }
    return getGoToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getReturnToHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReturnToHome",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getReturnToHomeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getReturnToHomeMethod;
    if ((getReturnToHomeMethod = EdgeAdapterServiceGrpc.getReturnToHomeMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getReturnToHomeMethod = EdgeAdapterServiceGrpc.getReturnToHomeMethod) == null) {
          EdgeAdapterServiceGrpc.getReturnToHomeMethod = getReturnToHomeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReturnToHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ReturnToHome"))
              .build();
        }
      }
    }
    return getReturnToHomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterManualControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnterManualControl",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterManualControlMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterManualControlMethod;
    if ((getEnterManualControlMethod = EdgeAdapterServiceGrpc.getEnterManualControlMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getEnterManualControlMethod = EdgeAdapterServiceGrpc.getEnterManualControlMethod) == null) {
          EdgeAdapterServiceGrpc.getEnterManualControlMethod = getEnterManualControlMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnterManualControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("EnterManualControl"))
              .build();
        }
      }
    }
    return getEnterManualControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getExitManualControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitManualControl",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getExitManualControlMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getExitManualControlMethod;
    if ((getExitManualControlMethod = EdgeAdapterServiceGrpc.getExitManualControlMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getExitManualControlMethod = EdgeAdapterServiceGrpc.getExitManualControlMethod) == null) {
          EdgeAdapterServiceGrpc.getExitManualControlMethod = getExitManualControlMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitManualControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ExitManualControl"))
              .build();
        }
      }
    }
    return getExitManualControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getManualControlInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManualControlInput",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getManualControlInputMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getManualControlInputMethod;
    if ((getManualControlInputMethod = EdgeAdapterServiceGrpc.getManualControlInputMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getManualControlInputMethod = EdgeAdapterServiceGrpc.getManualControlInputMethod) == null) {
          EdgeAdapterServiceGrpc.getManualControlInputMethod = getManualControlInputMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManualControlInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ManualControlInput"))
              .build();
        }
      }
    }
    return getManualControlInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getLookAtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookAt",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getLookAtMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getLookAtMethod;
    if ((getLookAtMethod = EdgeAdapterServiceGrpc.getLookAtMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getLookAtMethod = EdgeAdapterServiceGrpc.getLookAtMethod) == null) {
          EdgeAdapterServiceGrpc.getLookAtMethod = getLookAtMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookAt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("LookAt"))
              .build();
        }
      }
    }
    return getLookAtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnableGimbalTrackingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableGimbalTracking",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnableGimbalTrackingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnableGimbalTrackingMethod;
    if ((getEnableGimbalTrackingMethod = EdgeAdapterServiceGrpc.getEnableGimbalTrackingMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getEnableGimbalTrackingMethod = EdgeAdapterServiceGrpc.getEnableGimbalTrackingMethod) == null) {
          EdgeAdapterServiceGrpc.getEnableGimbalTrackingMethod = getEnableGimbalTrackingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableGimbalTracking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("EnableGimbalTracking"))
              .build();
        }
      }
    }
    return getEnableGimbalTrackingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest,
      com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getGetDetectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetections",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest,
      com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getGetDetectionsMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest, com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getGetDetectionsMethod;
    if ((getGetDetectionsMethod = EdgeAdapterServiceGrpc.getGetDetectionsMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getGetDetectionsMethod = EdgeAdapterServiceGrpc.getGetDetectionsMethod) == null) {
          EdgeAdapterServiceGrpc.getGetDetectionsMethod = getGetDetectionsMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest, com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("GetDetections"))
              .build();
        }
      }
    }
    return getGetDetectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getOpenCoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenCover",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getOpenCoverMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getOpenCoverMethod;
    if ((getOpenCoverMethod = EdgeAdapterServiceGrpc.getOpenCoverMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getOpenCoverMethod = EdgeAdapterServiceGrpc.getOpenCoverMethod) == null) {
          EdgeAdapterServiceGrpc.getOpenCoverMethod = getOpenCoverMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenCover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("OpenCover"))
              .build();
        }
      }
    }
    return getOpenCoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getCloseCoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseCover",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getCloseCoverMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getCloseCoverMethod;
    if ((getCloseCoverMethod = EdgeAdapterServiceGrpc.getCloseCoverMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getCloseCoverMethod = EdgeAdapterServiceGrpc.getCloseCoverMethod) == null) {
          EdgeAdapterServiceGrpc.getCloseCoverMethod = getCloseCoverMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseCover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("CloseCover"))
              .build();
        }
      }
    }
    return getCloseCoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartChargingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartCharging",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartChargingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartChargingMethod;
    if ((getStartChargingMethod = EdgeAdapterServiceGrpc.getStartChargingMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStartChargingMethod = EdgeAdapterServiceGrpc.getStartChargingMethod) == null) {
          EdgeAdapterServiceGrpc.getStartChargingMethod = getStartChargingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartCharging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StartCharging"))
              .build();
        }
      }
    }
    return getStartChargingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopChargingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopCharging",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopChargingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopChargingMethod;
    if ((getStopChargingMethod = EdgeAdapterServiceGrpc.getStopChargingMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStopChargingMethod = EdgeAdapterServiceGrpc.getStopChargingMethod) == null) {
          EdgeAdapterServiceGrpc.getStopChargingMethod = getStopChargingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopCharging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StopCharging"))
              .build();
        }
      }
    }
    return getStopChargingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getRebootAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebootAsset",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getRebootAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getRebootAssetMethod;
    if ((getRebootAssetMethod = EdgeAdapterServiceGrpc.getRebootAssetMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getRebootAssetMethod = EdgeAdapterServiceGrpc.getRebootAssetMethod) == null) {
          EdgeAdapterServiceGrpc.getRebootAssetMethod = getRebootAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RebootAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("RebootAsset"))
              .build();
        }
      }
    }
    return getRebootAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootUpSubAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BootUpSubAsset",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootUpSubAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootUpSubAssetMethod;
    if ((getBootUpSubAssetMethod = EdgeAdapterServiceGrpc.getBootUpSubAssetMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getBootUpSubAssetMethod = EdgeAdapterServiceGrpc.getBootUpSubAssetMethod) == null) {
          EdgeAdapterServiceGrpc.getBootUpSubAssetMethod = getBootUpSubAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BootUpSubAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("BootUpSubAsset"))
              .build();
        }
      }
    }
    return getBootUpSubAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootDownSubAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BootDownSubAsset",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootDownSubAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getBootDownSubAssetMethod;
    if ((getBootDownSubAssetMethod = EdgeAdapterServiceGrpc.getBootDownSubAssetMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getBootDownSubAssetMethod = EdgeAdapterServiceGrpc.getBootDownSubAssetMethod) == null) {
          EdgeAdapterServiceGrpc.getBootDownSubAssetMethod = getBootDownSubAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BootDownSubAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("BootDownSubAsset"))
              .build();
        }
      }
    }
    return getBootDownSubAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getRegisterAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAsset",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getRegisterAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getRegisterAssetMethod;
    if ((getRegisterAssetMethod = EdgeAdapterServiceGrpc.getRegisterAssetMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getRegisterAssetMethod = EdgeAdapterServiceGrpc.getRegisterAssetMethod) == null) {
          EdgeAdapterServiceGrpc.getRegisterAssetMethod = getRegisterAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("RegisterAsset"))
              .build();
        }
      }
    }
    return getRegisterAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getDeRegisterAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeRegisterAsset",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getDeRegisterAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getDeRegisterAssetMethod;
    if ((getDeRegisterAssetMethod = EdgeAdapterServiceGrpc.getDeRegisterAssetMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getDeRegisterAssetMethod = EdgeAdapterServiceGrpc.getDeRegisterAssetMethod) == null) {
          EdgeAdapterServiceGrpc.getDeRegisterAssetMethod = getDeRegisterAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeRegisterAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("DeRegisterAsset"))
              .build();
        }
      }
    }
    return getDeRegisterAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterOrCloseRemoteDebugModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnterOrCloseRemoteDebugMode",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterOrCloseRemoteDebugModeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getEnterOrCloseRemoteDebugModeMethod;
    if ((getEnterOrCloseRemoteDebugModeMethod = EdgeAdapterServiceGrpc.getEnterOrCloseRemoteDebugModeMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getEnterOrCloseRemoteDebugModeMethod = EdgeAdapterServiceGrpc.getEnterOrCloseRemoteDebugModeMethod) == null) {
          EdgeAdapterServiceGrpc.getEnterOrCloseRemoteDebugModeMethod = getEnterOrCloseRemoteDebugModeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnterOrCloseRemoteDebugMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("EnterOrCloseRemoteDebugMode"))
              .build();
        }
      }
    }
    return getEnterOrCloseRemoteDebugModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeAcModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeAcMode",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeAcModeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeAcModeMethod;
    if ((getChangeAcModeMethod = EdgeAdapterServiceGrpc.getChangeAcModeMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getChangeAcModeMethod = EdgeAdapterServiceGrpc.getChangeAcModeMethod) == null) {
          EdgeAdapterServiceGrpc.getChangeAcModeMethod = getChangeAcModeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeAcMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ChangeAcMode"))
              .build();
        }
      }
    }
    return getChangeAcModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartLiveStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartLiveStream",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartLiveStreamMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartLiveStreamMethod;
    if ((getStartLiveStreamMethod = EdgeAdapterServiceGrpc.getStartLiveStreamMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStartLiveStreamMethod = EdgeAdapterServiceGrpc.getStartLiveStreamMethod) == null) {
          EdgeAdapterServiceGrpc.getStartLiveStreamMethod = getStartLiveStreamMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartLiveStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StartLiveStream"))
              .build();
        }
      }
    }
    return getStartLiveStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopLiveStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopLiveStream",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopLiveStreamMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopLiveStreamMethod;
    if ((getStopLiveStreamMethod = EdgeAdapterServiceGrpc.getStopLiveStreamMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStopLiveStreamMethod = EdgeAdapterServiceGrpc.getStopLiveStreamMethod) == null) {
          EdgeAdapterServiceGrpc.getStopLiveStreamMethod = getStopLiveStreamMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopLiveStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StopLiveStream"))
              .build();
        }
      }
    }
    return getStopLiveStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeLensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeLens",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeLensMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeLensMethod;
    if ((getChangeLensMethod = EdgeAdapterServiceGrpc.getChangeLensMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getChangeLensMethod = EdgeAdapterServiceGrpc.getChangeLensMethod) == null) {
          EdgeAdapterServiceGrpc.getChangeLensMethod = getChangeLensMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeLens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ChangeLens"))
              .build();
        }
      }
    }
    return getChangeLensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeZoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeZoom",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeZoomMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getChangeZoomMethod;
    if ((getChangeZoomMethod = EdgeAdapterServiceGrpc.getChangeZoomMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getChangeZoomMethod = EdgeAdapterServiceGrpc.getChangeZoomMethod) == null) {
          EdgeAdapterServiceGrpc.getChangeZoomMethod = getChangeZoomMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeZoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("ChangeZoom"))
              .build();
        }
      }
    }
    return getChangeZoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getCapturePhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CapturePhoto",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getCapturePhotoMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getCapturePhotoMethod;
    if ((getCapturePhotoMethod = EdgeAdapterServiceGrpc.getCapturePhotoMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getCapturePhotoMethod = EdgeAdapterServiceGrpc.getCapturePhotoMethod) == null) {
          EdgeAdapterServiceGrpc.getCapturePhotoMethod = getCapturePhotoMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CapturePhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("CapturePhoto"))
              .build();
        }
      }
    }
    return getCapturePhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRecording",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartRecordingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartRecordingMethod;
    if ((getStartRecordingMethod = EdgeAdapterServiceGrpc.getStartRecordingMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStartRecordingMethod = EdgeAdapterServiceGrpc.getStartRecordingMethod) == null) {
          EdgeAdapterServiceGrpc.getStartRecordingMethod = getStartRecordingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StartRecording"))
              .build();
        }
      }
    }
    return getStartRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopRecording",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopRecordingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopRecordingMethod;
    if ((getStopRecordingMethod = EdgeAdapterServiceGrpc.getStopRecordingMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStopRecordingMethod = EdgeAdapterServiceGrpc.getStopRecordingMethod) == null) {
          EdgeAdapterServiceGrpc.getStopRecordingMethod = getStopRecordingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StopRecording"))
              .build();
        }
      }
    }
    return getStopRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartTask",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStartTaskMethod;
    if ((getStartTaskMethod = EdgeAdapterServiceGrpc.getStartTaskMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStartTaskMethod = EdgeAdapterServiceGrpc.getStartTaskMethod) == null) {
          EdgeAdapterServiceGrpc.getStartTaskMethod = getStartTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StartTask"))
              .build();
        }
      }
    }
    return getStartTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopTask",
      requestType = com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getStopTaskMethod;
    if ((getStopTaskMethod = EdgeAdapterServiceGrpc.getStopTaskMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getStopTaskMethod = EdgeAdapterServiceGrpc.getStopTaskMethod) == null) {
          EdgeAdapterServiceGrpc.getStopTaskMethod = getStopTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("StopTask"))
              .build();
        }
      }
    }
    return getStopTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getPrepareTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrepareTask",
      requestType = com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest.class,
      responseType = com.zequent.framework.sdks.edge.proto.EdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest,
      com.zequent.framework.sdks.edge.proto.EdgeResponse> getPrepareTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse> getPrepareTaskMethod;
    if ((getPrepareTaskMethod = EdgeAdapterServiceGrpc.getPrepareTaskMethod) == null) {
      synchronized (EdgeAdapterServiceGrpc.class) {
        if ((getPrepareTaskMethod = EdgeAdapterServiceGrpc.getPrepareTaskMethod) == null) {
          EdgeAdapterServiceGrpc.getPrepareTaskMethod = getPrepareTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest, com.zequent.framework.sdks.edge.proto.EdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrepareTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.sdks.edge.proto.EdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EdgeAdapterServiceMethodDescriptorSupplier("PrepareTask"))
              .build();
        }
      }
    }
    return getPrepareTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EdgeAdapterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceStub>() {
        @java.lang.Override
        public EdgeAdapterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeAdapterServiceStub(channel, callOptions);
        }
      };
    return EdgeAdapterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EdgeAdapterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceBlockingStub>() {
        @java.lang.Override
        public EdgeAdapterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeAdapterServiceBlockingStub(channel, callOptions);
        }
      };
    return EdgeAdapterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EdgeAdapterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EdgeAdapterServiceFutureStub>() {
        @java.lang.Override
        public EdgeAdapterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EdgeAdapterServiceFutureStub(channel, callOptions);
        }
      };
    return EdgeAdapterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Capability Management
     * </pre>
     */
    default void getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Flight Control (for drone in dock)
     * </pre>
     */
    default void takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeOffMethod(), responseObserver);
    }

    /**
     */
    default void goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoToMethod(), responseObserver);
    }

    /**
     */
    default void returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReturnToHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    default void enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterManualControlMethod(), responseObserver);
    }

    /**
     */
    default void exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitManualControlMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> manualControlInput(
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getManualControlInputMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gimbal &amp; Camera Control
     * </pre>
     */
    default void lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookAtMethod(), responseObserver);
    }

    /**
     */
    default void enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableGimbalTrackingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detection
     * </pre>
     */
    default void getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    default void openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenCoverMethod(), responseObserver);
    }

    /**
     */
    default void closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseCoverMethod(), responseObserver);
    }

    /**
     */
    default void startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartChargingMethod(), responseObserver);
    }

    /**
     */
    default void stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopChargingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    default void rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebootAssetMethod(), responseObserver);
    }

    /**
     */
    default void bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBootUpSubAssetMethod(), responseObserver);
    }

    /**
     */
    default void bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBootDownSubAssetMethod(), responseObserver);
    }

    /**
     */
    default void registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAssetMethod(), responseObserver);
    }

    /**
     */
    default void deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeRegisterAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    default void enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterOrCloseRemoteDebugModeMethod(), responseObserver);
    }

    /**
     */
    default void changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeAcModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Live Stream
     * </pre>
     */
    default void startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartLiveStreamMethod(), responseObserver);
    }

    /**
     */
    default void stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopLiveStreamMethod(), responseObserver);
    }

    /**
     */
    default void changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeLensMethod(), responseObserver);
    }

    /**
     */
    default void changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeZoomMethod(), responseObserver);
    }

    /**
     */
    default void capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCapturePhotoMethod(), responseObserver);
    }

    /**
     */
    default void startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRecordingMethod(), responseObserver);
    }

    /**
     */
    default void stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopRecordingMethod(), responseObserver);
    }

    /**
     */
    default void startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartTaskMethod(), responseObserver);
    }

    /**
     */
    default void stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopTaskMethod(), responseObserver);
    }

    /**
     */
    default void prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EdgeAdapterService.
   */
  public static abstract class EdgeAdapterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EdgeAdapterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EdgeAdapterService.
   */
  public static final class EdgeAdapterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EdgeAdapterServiceStub> {
    private EdgeAdapterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeAdapterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeAdapterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capability Management
     * </pre>
     */
    public void getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Flight Control (for drone in dock)
     * </pre>
     */
    public void takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReturnToHomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public void enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterManualControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitManualControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest> manualControlInput(
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getManualControlInputMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Gimbal &amp; Camera Control
     * </pre>
     */
    public void lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookAtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableGimbalTrackingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detection
     * </pre>
     */
    public void getDetections(com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetDetectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public void openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenCoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseCoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartChargingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopChargingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public void rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebootAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBootUpSubAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBootDownSubAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeRegisterAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public void enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterOrCloseRemoteDebugModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeAcModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Live Stream
     * </pre>
     */
    public void startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartLiveStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopLiveStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeLensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeZoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCapturePhotoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EdgeAdapterService.
   */
  public static final class EdgeAdapterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EdgeAdapterServiceBlockingStub> {
    private EdgeAdapterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeAdapterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeAdapterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capability Management
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse getCapabilities(com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Flight Control (for drone in dock)
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse takeOff(com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse goTo(com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoToMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse returnToHome(com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReturnToHomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse enterManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterManualControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse exitManualControl(com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitManualControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gimbal &amp; Camera Control
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse lookAt(com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookAtMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse enableGimbalTracking(com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableGimbalTrackingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Detection
     * </pre>
     */
    public java.util.Iterator<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse> getDetections(
        com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetDetectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse openCover(com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenCoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse closeCover(com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseCoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse startCharging(com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartChargingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse stopCharging(com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopChargingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse rebootAsset(com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebootAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse bootUpSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBootUpSubAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse bootDownSubAsset(com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBootDownSubAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse registerAsset(com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse deRegisterAsset(com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeRegisterAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse enterOrCloseRemoteDebugMode(com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterOrCloseRemoteDebugModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse changeAcMode(com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeAcModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Live Stream
     * </pre>
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse startLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartLiveStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse stopLiveStream(com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopLiveStreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse changeLens(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeLensMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse changeZoom(com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeZoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse capturePhoto(com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCapturePhotoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse startRecording(com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse stopRecording(com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse startTask(com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse stopTask(com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.sdks.edge.proto.EdgeResponse prepareTask(com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EdgeAdapterService.
   */
  public static final class EdgeAdapterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EdgeAdapterServiceFutureStub> {
    private EdgeAdapterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EdgeAdapterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EdgeAdapterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capability Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse> getCapabilities(
        com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Flight Control (for drone in dock)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> takeOff(
        com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> goTo(
        com.zequent.framework.sdks.edge.proto.EdgeGoToRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> returnToHome(
        com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReturnToHomeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterManualControl(
        com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterManualControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> exitManualControl(
        com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitManualControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gimbal &amp; Camera Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> lookAt(
        com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookAtMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> enableGimbalTracking(
        com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableGimbalTrackingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> openCover(
        com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenCoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> closeCover(
        com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseCoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> startCharging(
        com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartChargingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopCharging(
        com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopChargingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> rebootAsset(
        com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebootAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootUpSubAsset(
        com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBootUpSubAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> bootDownSubAsset(
        com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBootDownSubAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> registerAsset(
        com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> deRegisterAsset(
        com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeRegisterAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> enterOrCloseRemoteDebugMode(
        com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterOrCloseRemoteDebugModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeAcMode(
        com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeAcModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Live Stream
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> startLiveStream(
        com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartLiveStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopLiveStream(
        com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopLiveStreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeLens(
        com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeLensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> changeZoom(
        com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeZoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> capturePhoto(
        com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCapturePhotoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> startRecording(
        com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopRecording(
        com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> startTask(
        com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> stopTask(
        com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.sdks.edge.proto.EdgeResponse> prepareTask(
        com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAPABILITIES = 0;
  private static final int METHODID_TAKE_OFF = 1;
  private static final int METHODID_GO_TO = 2;
  private static final int METHODID_RETURN_TO_HOME = 3;
  private static final int METHODID_ENTER_MANUAL_CONTROL = 4;
  private static final int METHODID_EXIT_MANUAL_CONTROL = 5;
  private static final int METHODID_LOOK_AT = 6;
  private static final int METHODID_ENABLE_GIMBAL_TRACKING = 7;
  private static final int METHODID_GET_DETECTIONS = 8;
  private static final int METHODID_OPEN_COVER = 9;
  private static final int METHODID_CLOSE_COVER = 10;
  private static final int METHODID_START_CHARGING = 11;
  private static final int METHODID_STOP_CHARGING = 12;
  private static final int METHODID_REBOOT_ASSET = 13;
  private static final int METHODID_BOOT_UP_SUB_ASSET = 14;
  private static final int METHODID_BOOT_DOWN_SUB_ASSET = 15;
  private static final int METHODID_REGISTER_ASSET = 16;
  private static final int METHODID_DE_REGISTER_ASSET = 17;
  private static final int METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE = 18;
  private static final int METHODID_CHANGE_AC_MODE = 19;
  private static final int METHODID_START_LIVE_STREAM = 20;
  private static final int METHODID_STOP_LIVE_STREAM = 21;
  private static final int METHODID_CHANGE_LENS = 22;
  private static final int METHODID_CHANGE_ZOOM = 23;
  private static final int METHODID_CAPTURE_PHOTO = 24;
  private static final int METHODID_START_RECORDING = 25;
  private static final int METHODID_STOP_RECORDING = 26;
  private static final int METHODID_START_TASK = 27;
  private static final int METHODID_STOP_TASK = 28;
  private static final int METHODID_PREPARE_TASK = 29;
  private static final int METHODID_MANUAL_CONTROL_INPUT = 30;

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
        case METHODID_GET_CAPABILITIES:
          serviceImpl.getCapabilities((com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse>) responseObserver);
          break;
        case METHODID_TAKE_OFF:
          serviceImpl.takeOff((com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_GO_TO:
          serviceImpl.goTo((com.zequent.framework.sdks.edge.proto.EdgeGoToRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_RETURN_TO_HOME:
          serviceImpl.returnToHome((com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_ENTER_MANUAL_CONTROL:
          serviceImpl.enterManualControl((com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_EXIT_MANUAL_CONTROL:
          serviceImpl.exitManualControl((com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_LOOK_AT:
          serviceImpl.lookAt((com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_ENABLE_GIMBAL_TRACKING:
          serviceImpl.enableGimbalTracking((com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_GET_DETECTIONS:
          serviceImpl.getDetections((com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse>) responseObserver);
          break;
        case METHODID_OPEN_COVER:
          serviceImpl.openCover((com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_CLOSE_COVER:
          serviceImpl.closeCover((com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_START_CHARGING:
          serviceImpl.startCharging((com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_STOP_CHARGING:
          serviceImpl.stopCharging((com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_REBOOT_ASSET:
          serviceImpl.rebootAsset((com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_BOOT_UP_SUB_ASSET:
          serviceImpl.bootUpSubAsset((com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_BOOT_DOWN_SUB_ASSET:
          serviceImpl.bootDownSubAsset((com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ASSET:
          serviceImpl.registerAsset((com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_DE_REGISTER_ASSET:
          serviceImpl.deRegisterAsset((com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE:
          serviceImpl.enterOrCloseRemoteDebugMode((com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_CHANGE_AC_MODE:
          serviceImpl.changeAcMode((com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_START_LIVE_STREAM:
          serviceImpl.startLiveStream((com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_STOP_LIVE_STREAM:
          serviceImpl.stopLiveStream((com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LENS:
          serviceImpl.changeLens((com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ZOOM:
          serviceImpl.changeZoom((com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_CAPTURE_PHOTO:
          serviceImpl.capturePhoto((com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_START_RECORDING:
          serviceImpl.startRecording((com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_STOP_RECORDING:
          serviceImpl.stopRecording((com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_START_TASK:
          serviceImpl.startTask((com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_STOP_TASK:
          serviceImpl.stopTask((com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
          break;
        case METHODID_PREPARE_TASK:
          serviceImpl.prepareTask((com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
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
        case METHODID_MANUAL_CONTROL_INPUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.manualControlInput(
              (io.grpc.stub.StreamObserver<com.zequent.framework.sdks.edge.proto.EdgeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetCapabilitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesRequest,
              com.zequent.framework.sdks.edge.proto.EdgeGetCapabilitiesResponse>(
                service, METHODID_GET_CAPABILITIES)))
        .addMethod(
          getTakeOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeTakeOffRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_TAKE_OFF)))
        .addMethod(
          getGoToMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeGoToRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_GO_TO)))
        .addMethod(
          getReturnToHomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeReturnToHomeRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_RETURN_TO_HOME)))
        .addMethod(
          getEnterManualControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_ENTER_MANUAL_CONTROL)))
        .addMethod(
          getExitManualControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeManualControlRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_EXIT_MANUAL_CONTROL)))
        .addMethod(
          getManualControlInputMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeManualControlInputRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_MANUAL_CONTROL_INPUT)))
        .addMethod(
          getLookAtMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeLookAtRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_LOOK_AT)))
        .addMethod(
          getEnableGimbalTrackingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeEnableGimbalTrackingRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_ENABLE_GIMBAL_TRACKING)))
        .addMethod(
          getGetDetectionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeGetDetectionsRequest,
              com.zequent.framework.sdks.edge.proto.EdgeDetectionResponse>(
                service, METHODID_GET_DETECTIONS)))
        .addMethod(
          getOpenCoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeOpenCoverRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_OPEN_COVER)))
        .addMethod(
          getCloseCoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeCloseCoverRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_CLOSE_COVER)))
        .addMethod(
          getStartChargingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStartChargingRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_START_CHARGING)))
        .addMethod(
          getStopChargingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStopChargingRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_STOP_CHARGING)))
        .addMethod(
          getRebootAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeRebootAssetRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_REBOOT_ASSET)))
        .addMethod(
          getBootUpSubAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_BOOT_UP_SUB_ASSET)))
        .addMethod(
          getBootDownSubAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeBootSubAssetRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_BOOT_DOWN_SUB_ASSET)))
        .addMethod(
          getRegisterAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeRegisterAssetRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_REGISTER_ASSET)))
        .addMethod(
          getDeRegisterAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeDeRegisterAssetRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_DE_REGISTER_ASSET)))
        .addMethod(
          getEnterOrCloseRemoteDebugModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeRemoteDebugModeRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE)))
        .addMethod(
          getChangeAcModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeChangeAcModeRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_CHANGE_AC_MODE)))
        .addMethod(
          getStartLiveStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStartLiveStreamRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_START_LIVE_STREAM)))
        .addMethod(
          getStopLiveStreamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStopLiveStreamRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_STOP_LIVE_STREAM)))
        .addMethod(
          getChangeLensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeChangeCameraLensRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_CHANGE_LENS)))
        .addMethod(
          getChangeZoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeChangeCameraZoomRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_CHANGE_ZOOM)))
        .addMethod(
          getCapturePhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeCapturePhotoRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_CAPTURE_PHOTO)))
        .addMethod(
          getStartRecordingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStartRecordingRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_START_RECORDING)))
        .addMethod(
          getStopRecordingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStopRecordingRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_STOP_RECORDING)))
        .addMethod(
          getStartTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStartTaskRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_START_TASK)))
        .addMethod(
          getStopTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgeStopTaskRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_STOP_TASK)))
        .addMethod(
          getPrepareTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.sdks.edge.proto.EdgePrepareTaskRequest,
              com.zequent.framework.sdks.edge.proto.EdgeResponse>(
                service, METHODID_PREPARE_TASK)))
        .build();
  }

  private static abstract class EdgeAdapterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EdgeAdapterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zequent.framework.sdks.edge.proto.EdgeSdkProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EdgeAdapterService");
    }
  }

  private static final class EdgeAdapterServiceFileDescriptorSupplier
      extends EdgeAdapterServiceBaseDescriptorSupplier {
    EdgeAdapterServiceFileDescriptorSupplier() {}
  }

  private static final class EdgeAdapterServiceMethodDescriptorSupplier
      extends EdgeAdapterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EdgeAdapterServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EdgeAdapterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EdgeAdapterServiceFileDescriptorSupplier())
              .addMethod(getGetCapabilitiesMethod())
              .addMethod(getTakeOffMethod())
              .addMethod(getGoToMethod())
              .addMethod(getReturnToHomeMethod())
              .addMethod(getEnterManualControlMethod())
              .addMethod(getExitManualControlMethod())
              .addMethod(getManualControlInputMethod())
              .addMethod(getLookAtMethod())
              .addMethod(getEnableGimbalTrackingMethod())
              .addMethod(getGetDetectionsMethod())
              .addMethod(getOpenCoverMethod())
              .addMethod(getCloseCoverMethod())
              .addMethod(getStartChargingMethod())
              .addMethod(getStopChargingMethod())
              .addMethod(getRebootAssetMethod())
              .addMethod(getBootUpSubAssetMethod())
              .addMethod(getBootDownSubAssetMethod())
              .addMethod(getRegisterAssetMethod())
              .addMethod(getDeRegisterAssetMethod())
              .addMethod(getEnterOrCloseRemoteDebugModeMethod())
              .addMethod(getChangeAcModeMethod())
              .addMethod(getStartLiveStreamMethod())
              .addMethod(getStopLiveStreamMethod())
              .addMethod(getChangeLensMethod())
              .addMethod(getChangeZoomMethod())
              .addMethod(getCapturePhotoMethod())
              .addMethod(getStartRecordingMethod())
              .addMethod(getStopRecordingMethod())
              .addMethod(getStartTaskMethod())
              .addMethod(getStopTaskMethod())
              .addMethod(getPrepareTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
