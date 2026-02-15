package com.zequent.framework.services.remote.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: remote-control.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RemoteControlServiceGrpc {

  private RemoteControlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RemoteControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getTakeOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakeOff",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getTakeOffMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getTakeOffMethod;
    if ((getTakeOffMethod = RemoteControlServiceGrpc.getTakeOffMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getTakeOffMethod = RemoteControlServiceGrpc.getTakeOffMethod) == null) {
          RemoteControlServiceGrpc.getTakeOffMethod = getTakeOffMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakeOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("TakeOff"))
              .build();
        }
      }
    }
    return getTakeOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlGoToRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getGoToMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GoTo",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlGoToRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlGoToRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getGoToMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlGoToRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getGoToMethod;
    if ((getGoToMethod = RemoteControlServiceGrpc.getGoToMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getGoToMethod = RemoteControlServiceGrpc.getGoToMethod) == null) {
          RemoteControlServiceGrpc.getGoToMethod = getGoToMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlGoToRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GoTo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlGoToRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("GoTo"))
              .build();
        }
      }
    }
    return getGoToMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getReturnToHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReturnToHome",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getReturnToHomeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getReturnToHomeMethod;
    if ((getReturnToHomeMethod = RemoteControlServiceGrpc.getReturnToHomeMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getReturnToHomeMethod = RemoteControlServiceGrpc.getReturnToHomeMethod) == null) {
          RemoteControlServiceGrpc.getReturnToHomeMethod = getReturnToHomeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReturnToHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("ReturnToHome"))
              .build();
        }
      }
    }
    return getReturnToHomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterManualControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnterManualControl",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterManualControlMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterManualControlMethod;
    if ((getEnterManualControlMethod = RemoteControlServiceGrpc.getEnterManualControlMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getEnterManualControlMethod = RemoteControlServiceGrpc.getEnterManualControlMethod) == null) {
          RemoteControlServiceGrpc.getEnterManualControlMethod = getEnterManualControlMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnterManualControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("EnterManualControl"))
              .build();
        }
      }
    }
    return getEnterManualControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getExitManualControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitManualControl",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getExitManualControlMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getExitManualControlMethod;
    if ((getExitManualControlMethod = RemoteControlServiceGrpc.getExitManualControlMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getExitManualControlMethod = RemoteControlServiceGrpc.getExitManualControlMethod) == null) {
          RemoteControlServiceGrpc.getExitManualControlMethod = getExitManualControlMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitManualControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("ExitManualControl"))
              .build();
        }
      }
    }
    return getExitManualControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getManualControlInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManualControlInput",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getManualControlInputMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getManualControlInputMethod;
    if ((getManualControlInputMethod = RemoteControlServiceGrpc.getManualControlInputMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getManualControlInputMethod = RemoteControlServiceGrpc.getManualControlInputMethod) == null) {
          RemoteControlServiceGrpc.getManualControlInputMethod = getManualControlInputMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManualControlInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("ManualControlInput"))
              .build();
        }
      }
    }
    return getManualControlInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getLookAtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookAt",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getLookAtMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getLookAtMethod;
    if ((getLookAtMethod = RemoteControlServiceGrpc.getLookAtMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getLookAtMethod = RemoteControlServiceGrpc.getLookAtMethod) == null) {
          RemoteControlServiceGrpc.getLookAtMethod = getLookAtMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookAt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("LookAt"))
              .build();
        }
      }
    }
    return getLookAtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getOpenCoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenCover",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getOpenCoverMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getOpenCoverMethod;
    if ((getOpenCoverMethod = RemoteControlServiceGrpc.getOpenCoverMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getOpenCoverMethod = RemoteControlServiceGrpc.getOpenCoverMethod) == null) {
          RemoteControlServiceGrpc.getOpenCoverMethod = getOpenCoverMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenCover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("OpenCover"))
              .build();
        }
      }
    }
    return getOpenCoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getCloseCoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseCover",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getCloseCoverMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getCloseCoverMethod;
    if ((getCloseCoverMethod = RemoteControlServiceGrpc.getCloseCoverMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getCloseCoverMethod = RemoteControlServiceGrpc.getCloseCoverMethod) == null) {
          RemoteControlServiceGrpc.getCloseCoverMethod = getCloseCoverMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseCover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("CloseCover"))
              .build();
        }
      }
    }
    return getCloseCoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getStartChargingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartCharging",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getStartChargingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getStartChargingMethod;
    if ((getStartChargingMethod = RemoteControlServiceGrpc.getStartChargingMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getStartChargingMethod = RemoteControlServiceGrpc.getStartChargingMethod) == null) {
          RemoteControlServiceGrpc.getStartChargingMethod = getStartChargingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartCharging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("StartCharging"))
              .build();
        }
      }
    }
    return getStartChargingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getStopChargingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopCharging",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getStopChargingMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getStopChargingMethod;
    if ((getStopChargingMethod = RemoteControlServiceGrpc.getStopChargingMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getStopChargingMethod = RemoteControlServiceGrpc.getStopChargingMethod) == null) {
          RemoteControlServiceGrpc.getStopChargingMethod = getStopChargingMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopCharging"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("StopCharging"))
              .build();
        }
      }
    }
    return getStopChargingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getRebootAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebootAsset",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getRebootAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getRebootAssetMethod;
    if ((getRebootAssetMethod = RemoteControlServiceGrpc.getRebootAssetMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getRebootAssetMethod = RemoteControlServiceGrpc.getRebootAssetMethod) == null) {
          RemoteControlServiceGrpc.getRebootAssetMethod = getRebootAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RebootAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("RebootAsset"))
              .build();
        }
      }
    }
    return getRebootAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getBootSubAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BootSubAsset",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getBootSubAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getBootSubAssetMethod;
    if ((getBootSubAssetMethod = RemoteControlServiceGrpc.getBootSubAssetMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getBootSubAssetMethod = RemoteControlServiceGrpc.getBootSubAssetMethod) == null) {
          RemoteControlServiceGrpc.getBootSubAssetMethod = getBootSubAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BootSubAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("BootSubAsset"))
              .build();
        }
      }
    }
    return getBootSubAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterOrCloseRemoteDebugModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnterOrCloseRemoteDebugMode",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterOrCloseRemoteDebugModeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getEnterOrCloseRemoteDebugModeMethod;
    if ((getEnterOrCloseRemoteDebugModeMethod = RemoteControlServiceGrpc.getEnterOrCloseRemoteDebugModeMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getEnterOrCloseRemoteDebugModeMethod = RemoteControlServiceGrpc.getEnterOrCloseRemoteDebugModeMethod) == null) {
          RemoteControlServiceGrpc.getEnterOrCloseRemoteDebugModeMethod = getEnterOrCloseRemoteDebugModeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnterOrCloseRemoteDebugMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("EnterOrCloseRemoteDebugMode"))
              .build();
        }
      }
    }
    return getEnterOrCloseRemoteDebugModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getChangeAcModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeAcMode",
      requestType = com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest.class,
      responseType = com.zequent.framework.services.remote.proto.RemoteControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest,
      com.zequent.framework.services.remote.proto.RemoteControlResponse> getChangeAcModeMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse> getChangeAcModeMethod;
    if ((getChangeAcModeMethod = RemoteControlServiceGrpc.getChangeAcModeMethod) == null) {
      synchronized (RemoteControlServiceGrpc.class) {
        if ((getChangeAcModeMethod = RemoteControlServiceGrpc.getChangeAcModeMethod) == null) {
          RemoteControlServiceGrpc.getChangeAcModeMethod = getChangeAcModeMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest, com.zequent.framework.services.remote.proto.RemoteControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeAcMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.remote.proto.RemoteControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RemoteControlServiceMethodDescriptorSupplier("ChangeAcMode"))
              .build();
        }
      }
    }
    return getChangeAcModeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceStub>() {
        @java.lang.Override
        public RemoteControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteControlServiceStub(channel, callOptions);
        }
      };
    return RemoteControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceBlockingStub>() {
        @java.lang.Override
        public RemoteControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteControlServiceBlockingStub(channel, callOptions);
        }
      };
    return RemoteControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RemoteControlServiceFutureStub>() {
        @java.lang.Override
        public RemoteControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RemoteControlServiceFutureStub(channel, callOptions);
        }
      };
    return RemoteControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Flight Control
     * </pre>
     */
    default void takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeOffMethod(), responseObserver);
    }

    /**
     */
    default void goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGoToMethod(), responseObserver);
    }

    /**
     */
    default void returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReturnToHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    default void enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterManualControlMethod(), responseObserver);
    }

    /**
     */
    default void exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitManualControlMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> manualControlInput(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getManualControlInputMethod(), responseObserver);
    }

    /**
     */
    default void lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookAtMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    default void openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenCoverMethod(), responseObserver);
    }

    /**
     */
    default void closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseCoverMethod(), responseObserver);
    }

    /**
     */
    default void startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartChargingMethod(), responseObserver);
    }

    /**
     */
    default void stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopChargingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    default void rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebootAssetMethod(), responseObserver);
    }

    /**
     */
    default void bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBootSubAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    default void enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterOrCloseRemoteDebugModeMethod(), responseObserver);
    }

    /**
     */
    default void changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeAcModeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RemoteControlService.
   */
  public static abstract class RemoteControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RemoteControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RemoteControlService.
   */
  public static final class RemoteControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RemoteControlServiceStub> {
    private RemoteControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Flight Control
     * </pre>
     */
    public void takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReturnToHomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public void enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterManualControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitManualControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest> manualControlInput(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getManualControlInputMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookAtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public void openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenCoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseCoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartChargingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopChargingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public void rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebootAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBootSubAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public void enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterOrCloseRemoteDebugModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeAcModeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RemoteControlService.
   */
  public static final class RemoteControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RemoteControlServiceBlockingStub> {
    private RemoteControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Flight Control
     * </pre>
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse takeOff(com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse goTo(com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGoToMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse returnToHome(com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReturnToHomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse enterManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterManualControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse exitManualControl(com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitManualControlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse lookAt(com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookAtMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse openCover(com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenCoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse closeCover(com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseCoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse startCharging(com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartChargingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse stopCharging(com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopChargingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse rebootAsset(com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebootAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse bootSubAsset(com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBootSubAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse enterOrCloseRemoteDebugMode(com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterOrCloseRemoteDebugModeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.remote.proto.RemoteControlResponse changeAcMode(com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeAcModeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RemoteControlService.
   */
  public static final class RemoteControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RemoteControlServiceFutureStub> {
    private RemoteControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Flight Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> takeOff(
        com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> goTo(
        com.zequent.framework.services.remote.proto.RemoteControlGoToRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGoToMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> returnToHome(
        com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReturnToHomeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Manual Control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterManualControl(
        com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterManualControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> exitManualControl(
        com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitManualControlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> lookAt(
        com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookAtMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dock Specific Operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> openCover(
        com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenCoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> closeCover(
        com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseCoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> startCharging(
        com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartChargingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> stopCharging(
        com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopChargingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Asset Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> rebootAsset(
        com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebootAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> bootSubAsset(
        com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBootSubAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Debug &amp; Maintenance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> enterOrCloseRemoteDebugMode(
        com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterOrCloseRemoteDebugModeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.remote.proto.RemoteControlResponse> changeAcMode(
        com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeAcModeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TAKE_OFF = 0;
  private static final int METHODID_GO_TO = 1;
  private static final int METHODID_RETURN_TO_HOME = 2;
  private static final int METHODID_ENTER_MANUAL_CONTROL = 3;
  private static final int METHODID_EXIT_MANUAL_CONTROL = 4;
  private static final int METHODID_LOOK_AT = 5;
  private static final int METHODID_OPEN_COVER = 6;
  private static final int METHODID_CLOSE_COVER = 7;
  private static final int METHODID_START_CHARGING = 8;
  private static final int METHODID_STOP_CHARGING = 9;
  private static final int METHODID_REBOOT_ASSET = 10;
  private static final int METHODID_BOOT_SUB_ASSET = 11;
  private static final int METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE = 12;
  private static final int METHODID_CHANGE_AC_MODE = 13;
  private static final int METHODID_MANUAL_CONTROL_INPUT = 14;

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
        case METHODID_TAKE_OFF:
          serviceImpl.takeOff((com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_GO_TO:
          serviceImpl.goTo((com.zequent.framework.services.remote.proto.RemoteControlGoToRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_RETURN_TO_HOME:
          serviceImpl.returnToHome((com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_ENTER_MANUAL_CONTROL:
          serviceImpl.enterManualControl((com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_EXIT_MANUAL_CONTROL:
          serviceImpl.exitManualControl((com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_LOOK_AT:
          serviceImpl.lookAt((com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_OPEN_COVER:
          serviceImpl.openCover((com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_CLOSE_COVER:
          serviceImpl.closeCover((com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_START_CHARGING:
          serviceImpl.startCharging((com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_STOP_CHARGING:
          serviceImpl.stopCharging((com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_REBOOT_ASSET:
          serviceImpl.rebootAsset((com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_BOOT_SUB_ASSET:
          serviceImpl.bootSubAsset((com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE:
          serviceImpl.enterOrCloseRemoteDebugMode((com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
          break;
        case METHODID_CHANGE_AC_MODE:
          serviceImpl.changeAcMode((com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.remote.proto.RemoteControlResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTakeOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlTakeOffRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_TAKE_OFF)))
        .addMethod(
          getGoToMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlGoToRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_GO_TO)))
        .addMethod(
          getReturnToHomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlReturnToHomeRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_RETURN_TO_HOME)))
        .addMethod(
          getEnterManualControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_ENTER_MANUAL_CONTROL)))
        .addMethod(
          getExitManualControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlManualControlRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_EXIT_MANUAL_CONTROL)))
        .addMethod(
          getManualControlInputMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlManualControlInputRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_MANUAL_CONTROL_INPUT)))
        .addMethod(
          getLookAtMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlLookAtRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_LOOK_AT)))
        .addMethod(
          getOpenCoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlOpenCoverRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_OPEN_COVER)))
        .addMethod(
          getCloseCoverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlCloseCoverRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_CLOSE_COVER)))
        .addMethod(
          getStartChargingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlStartChargingRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_START_CHARGING)))
        .addMethod(
          getStopChargingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlStopChargingRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_STOP_CHARGING)))
        .addMethod(
          getRebootAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlRebootAssetRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_REBOOT_ASSET)))
        .addMethod(
          getBootSubAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlBootSubAssetRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_BOOT_SUB_ASSET)))
        .addMethod(
          getEnterOrCloseRemoteDebugModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlDebugModeRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_ENTER_OR_CLOSE_REMOTE_DEBUG_MODE)))
        .addMethod(
          getChangeAcModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.remote.proto.RemoteControlChangeAcModeRequest,
              com.zequent.framework.services.remote.proto.RemoteControlResponse>(
                service, METHODID_CHANGE_AC_MODE)))
        .build();
  }

  private static abstract class RemoteControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zequent.framework.services.remote.proto.RemoteControlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteControlService");
    }
  }

  private static final class RemoteControlServiceFileDescriptorSupplier
      extends RemoteControlServiceBaseDescriptorSupplier {
    RemoteControlServiceFileDescriptorSupplier() {}
  }

  private static final class RemoteControlServiceMethodDescriptorSupplier
      extends RemoteControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RemoteControlServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RemoteControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteControlServiceFileDescriptorSupplier())
              .addMethod(getTakeOffMethod())
              .addMethod(getGoToMethod())
              .addMethod(getReturnToHomeMethod())
              .addMethod(getEnterManualControlMethod())
              .addMethod(getExitManualControlMethod())
              .addMethod(getManualControlInputMethod())
              .addMethod(getLookAtMethod())
              .addMethod(getOpenCoverMethod())
              .addMethod(getCloseCoverMethod())
              .addMethod(getStartChargingMethod())
              .addMethod(getStopChargingMethod())
              .addMethod(getRebootAssetMethod())
              .addMethod(getBootSubAssetMethod())
              .addMethod(getEnterOrCloseRemoteDebugModeMethod())
              .addMethod(getChangeAcModeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
