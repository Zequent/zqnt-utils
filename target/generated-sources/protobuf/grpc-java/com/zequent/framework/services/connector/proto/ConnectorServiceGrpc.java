package com.zequent.framework.services.connector.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: connector.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectorServiceGrpc {

  private ConnectorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ConnectorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getRegisterAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAsset",
      requestType = com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getRegisterAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getRegisterAssetMethod;
    if ((getRegisterAssetMethod = ConnectorServiceGrpc.getRegisterAssetMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getRegisterAssetMethod = ConnectorServiceGrpc.getRegisterAssetMethod) == null) {
          ConnectorServiceGrpc.getRegisterAssetMethod = getRegisterAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("RegisterAsset"))
              .build();
        }
      }
    }
    return getRegisterAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeRegisterAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeRegisterAsset",
      requestType = com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeRegisterAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getDeRegisterAssetMethod;
    if ((getDeRegisterAssetMethod = ConnectorServiceGrpc.getDeRegisterAssetMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getDeRegisterAssetMethod = ConnectorServiceGrpc.getDeRegisterAssetMethod) == null) {
          ConnectorServiceGrpc.getDeRegisterAssetMethod = getDeRegisterAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeRegisterAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("DeRegisterAsset"))
              .build();
        }
      }
    }
    return getDeRegisterAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest,
      com.zequent.framework.services.connector.proto.AssetMonitoringResponse> getAssetMonitoringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetMonitoring",
      requestType = com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest.class,
      responseType = com.zequent.framework.services.connector.proto.AssetMonitoringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest,
      com.zequent.framework.services.connector.proto.AssetMonitoringResponse> getAssetMonitoringMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest, com.zequent.framework.services.connector.proto.AssetMonitoringResponse> getAssetMonitoringMethod;
    if ((getAssetMonitoringMethod = ConnectorServiceGrpc.getAssetMonitoringMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getAssetMonitoringMethod = ConnectorServiceGrpc.getAssetMonitoringMethod) == null) {
          ConnectorServiceGrpc.getAssetMonitoringMethod = getAssetMonitoringMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest, com.zequent.framework.services.connector.proto.AssetMonitoringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetMonitoring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.AssetMonitoringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("AssetMonitoring"))
              .build();
        }
      }
    }
    return getAssetMonitoringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAsset",
      requestType = com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateAssetMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateAssetMethod;
    if ((getUpdateAssetMethod = ConnectorServiceGrpc.getUpdateAssetMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getUpdateAssetMethod = ConnectorServiceGrpc.getUpdateAssetMethod) == null) {
          ConnectorServiceGrpc.getUpdateAssetMethod = getUpdateAssetMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("UpdateAsset"))
              .build();
        }
      }
    }
    return getUpdateAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetBySnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetBySn",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetBySnMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetBySnMethod;
    if ((getGetAssetBySnMethod = ConnectorServiceGrpc.getGetAssetBySnMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetAssetBySnMethod = ConnectorServiceGrpc.getGetAssetBySnMethod) == null) {
          ConnectorServiceGrpc.getGetAssetBySnMethod = getGetAssetBySnMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetBySn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetAssetBySn"))
              .build();
        }
      }
    }
    return getGetAssetBySnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetById",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetByIdMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetAssetByIdMethod;
    if ((getGetAssetByIdMethod = ConnectorServiceGrpc.getGetAssetByIdMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetAssetByIdMethod = ConnectorServiceGrpc.getGetAssetByIdMethod) == null) {
          ConnectorServiceGrpc.getGetAssetByIdMethod = getGetAssetByIdMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetAssetById"))
              .build();
        }
      }
    }
    return getGetAssetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSubAssetBySnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubAssetBySn",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSubAssetBySnMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSubAssetBySnMethod;
    if ((getGetSubAssetBySnMethod = ConnectorServiceGrpc.getGetSubAssetBySnMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetSubAssetBySnMethod = ConnectorServiceGrpc.getGetSubAssetBySnMethod) == null) {
          ConnectorServiceGrpc.getGetSubAssetBySnMethod = getGetSubAssetBySnMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubAssetBySn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetSubAssetBySn"))
              .build();
        }
      }
    }
    return getGetSubAssetBySnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = ConnectorServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetOrganizationMethod = ConnectorServiceGrpc.getGetOrganizationMethod) == null) {
          ConnectorServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMission",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetMissionMethod;
    if ((getGetMissionMethod = ConnectorServiceGrpc.getGetMissionMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetMissionMethod = ConnectorServiceGrpc.getGetMissionMethod) == null) {
          ConnectorServiceGrpc.getGetMissionMethod = getGetMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetMission"))
              .build();
        }
      }
    }
    return getGetMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMission",
      requestType = com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateMissionMethod;
    if ((getCreateMissionMethod = ConnectorServiceGrpc.getCreateMissionMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getCreateMissionMethod = ConnectorServiceGrpc.getCreateMissionMethod) == null) {
          ConnectorServiceGrpc.getCreateMissionMethod = getCreateMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("CreateMission"))
              .build();
        }
      }
    }
    return getCreateMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMission",
      requestType = com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateMissionMethod;
    if ((getUpdateMissionMethod = ConnectorServiceGrpc.getUpdateMissionMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getUpdateMissionMethod = ConnectorServiceGrpc.getUpdateMissionMethod) == null) {
          ConnectorServiceGrpc.getUpdateMissionMethod = getUpdateMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("UpdateMission"))
              .build();
        }
      }
    }
    return getUpdateMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMission",
      requestType = com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteMissionMethod;
    if ((getDeleteMissionMethod = ConnectorServiceGrpc.getDeleteMissionMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getDeleteMissionMethod = ConnectorServiceGrpc.getDeleteMissionMethod) == null) {
          ConnectorServiceGrpc.getDeleteMissionMethod = getDeleteMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("DeleteMission"))
              .build();
        }
      }
    }
    return getDeleteMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskMethod;
    if ((getGetTaskMethod = ConnectorServiceGrpc.getGetTaskMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetTaskMethod = ConnectorServiceGrpc.getGetTaskMethod) == null) {
          ConnectorServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskByFlightIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskByFlightId",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskByFlightIdMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetTaskByFlightIdMethod;
    if ((getGetTaskByFlightIdMethod = ConnectorServiceGrpc.getGetTaskByFlightIdMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetTaskByFlightIdMethod = ConnectorServiceGrpc.getGetTaskByFlightIdMethod) == null) {
          ConnectorServiceGrpc.getGetTaskByFlightIdMethod = getGetTaskByFlightIdMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskByFlightId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetTaskByFlightId"))
              .build();
        }
      }
    }
    return getGetTaskByFlightIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetWaypointsByTaskIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaypointsByTaskId",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetWaypointsByTaskIdMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetWaypointsByTaskIdMethod;
    if ((getGetWaypointsByTaskIdMethod = ConnectorServiceGrpc.getGetWaypointsByTaskIdMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetWaypointsByTaskIdMethod = ConnectorServiceGrpc.getGetWaypointsByTaskIdMethod) == null) {
          ConnectorServiceGrpc.getGetWaypointsByTaskIdMethod = getGetWaypointsByTaskIdMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaypointsByTaskId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetWaypointsByTaskId"))
              .build();
        }
      }
    }
    return getGetWaypointsByTaskIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = ConnectorServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getCreateTaskMethod = ConnectorServiceGrpc.getCreateTaskMethod) == null) {
          ConnectorServiceGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = ConnectorServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getUpdateTaskMethod = ConnectorServiceGrpc.getUpdateTaskMethod) == null) {
          ConnectorServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("UpdateTask"))
              .build();
        }
      }
    }
    return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = ConnectorServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getDeleteTaskMethod = ConnectorServiceGrpc.getDeleteTaskMethod) == null) {
          ConnectorServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("DeleteTask"))
              .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScheduler",
      requestType = com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getGetSchedulerMethod;
    if ((getGetSchedulerMethod = ConnectorServiceGrpc.getGetSchedulerMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getGetSchedulerMethod = ConnectorServiceGrpc.getGetSchedulerMethod) == null) {
          ConnectorServiceGrpc.getGetSchedulerMethod = getGetSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("GetScheduler"))
              .build();
        }
      }
    }
    return getGetSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScheduler",
      requestType = com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getCreateSchedulerMethod;
    if ((getCreateSchedulerMethod = ConnectorServiceGrpc.getCreateSchedulerMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getCreateSchedulerMethod = ConnectorServiceGrpc.getCreateSchedulerMethod) == null) {
          ConnectorServiceGrpc.getCreateSchedulerMethod = getCreateSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("CreateScheduler"))
              .build();
        }
      }
    }
    return getCreateSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduler",
      requestType = com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getUpdateSchedulerMethod;
    if ((getUpdateSchedulerMethod = ConnectorServiceGrpc.getUpdateSchedulerMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getUpdateSchedulerMethod = ConnectorServiceGrpc.getUpdateSchedulerMethod) == null) {
          ConnectorServiceGrpc.getUpdateSchedulerMethod = getUpdateSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("UpdateScheduler"))
              .build();
        }
      }
    }
    return getUpdateSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScheduler",
      requestType = com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getDeleteSchedulerMethod;
    if ((getDeleteSchedulerMethod = ConnectorServiceGrpc.getDeleteSchedulerMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getDeleteSchedulerMethod = ConnectorServiceGrpc.getDeleteSchedulerMethod) == null) {
          ConnectorServiceGrpc.getDeleteSchedulerMethod = getDeleteSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("DeleteScheduler"))
              .build();
        }
      }
    }
    return getDeleteSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getStoreTelemetryBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreTelemetryBatch",
      requestType = com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest.class,
      responseType = com.zequent.framework.services.connector.proto.ConnectorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest,
      com.zequent.framework.services.connector.proto.ConnectorResponse> getStoreTelemetryBatchMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest, com.zequent.framework.services.connector.proto.ConnectorResponse> getStoreTelemetryBatchMethod;
    if ((getStoreTelemetryBatchMethod = ConnectorServiceGrpc.getStoreTelemetryBatchMethod) == null) {
      synchronized (ConnectorServiceGrpc.class) {
        if ((getStoreTelemetryBatchMethod = ConnectorServiceGrpc.getStoreTelemetryBatchMethod) == null) {
          ConnectorServiceGrpc.getStoreTelemetryBatchMethod = getStoreTelemetryBatchMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest, com.zequent.framework.services.connector.proto.ConnectorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreTelemetryBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.connector.proto.ConnectorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorServiceMethodDescriptorSupplier("StoreTelemetryBatch"))
              .build();
        }
      }
    }
    return getStoreTelemetryBatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceStub>() {
        @java.lang.Override
        public ConnectorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceStub(channel, callOptions);
        }
      };
    return ConnectorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceBlockingStub>() {
        @java.lang.Override
        public ConnectorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceBlockingStub(channel, callOptions);
        }
      };
    return ConnectorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorServiceFutureStub>() {
        @java.lang.Override
        public ConnectorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorServiceFutureStub(channel, callOptions);
        }
      };
    return ConnectorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAssetMethod(), responseObserver);
    }

    /**
     */
    default void deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeRegisterAssetMethod(), responseObserver);
    }

    /**
     */
    default void assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetMonitoringMethod(), responseObserver);
    }

    /**
     */
    default void updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAssetMethod(), responseObserver);
    }

    /**
     */
    default void getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetBySnMethod(), responseObserver);
    }

    /**
     */
    default void getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetByIdMethod(), responseObserver);
    }

    /**
     */
    default void getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubAssetBySnMethod(), responseObserver);
    }

    /**
     */
    default void getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     */
    default void getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMissionMethod(), responseObserver);
    }

    /**
     */
    default void createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMissionMethod(), responseObserver);
    }

    /**
     */
    default void updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMissionMethod(), responseObserver);
    }

    /**
     */
    default void deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMissionMethod(), responseObserver);
    }

    /**
     */
    default void getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     */
    default void getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskByFlightIdMethod(), responseObserver);
    }

    /**
     */
    default void getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWaypointsByTaskIdMethod(), responseObserver);
    }

    /**
     */
    default void createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    default void updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     */
    default void deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    default void getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSchedulerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Telemetry Storage - batch processing from live-data service
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> storeTelemetryBatch(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStoreTelemetryBatchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConnectorService.
   */
  public static abstract class ConnectorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConnectorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConnectorService.
   */
  public static final class ConnectorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConnectorServiceStub> {
    private ConnectorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeRegisterAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assetMonitoring(com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getAssetMonitoringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetBySnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubAssetBySnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskByFlightIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWaypointsByTaskIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Telemetry Storage - batch processing from live-data service
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest> storeTelemetryBatch(
        io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStoreTelemetryBatchMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConnectorService.
   */
  public static final class ConnectorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConnectorServiceBlockingStub> {
    private ConnectorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse registerAsset(com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse deRegisterAsset(com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeRegisterAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.zequent.framework.services.connector.proto.AssetMonitoringResponse> assetMonitoring(
        com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getAssetMonitoringMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse updateAsset(com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetBySnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getAssetById(com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getSubAssetBySn(com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubAssetBySnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getOrganization(com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getMission(com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse createMission(com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse updateMission(com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse deleteMission(com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getTask(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getTaskByFlightId(com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskByFlightIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getWaypointsByTaskId(com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWaypointsByTaskIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse createTask(com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse updateTask(com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse deleteTask(com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse getScheduler(com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse createScheduler(com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse updateScheduler(com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.connector.proto.ConnectorResponse deleteScheduler(com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSchedulerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConnectorService.
   */
  public static final class ConnectorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConnectorServiceFutureStub> {
    private ConnectorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> registerAsset(
        com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> deRegisterAsset(
        com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeRegisterAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> updateAsset(
        com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetBySn(
        com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetBySnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getAssetById(
        com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getSubAssetBySn(
        com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubAssetBySnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getOrganization(
        com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getMission(
        com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> createMission(
        com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> updateMission(
        com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteMission(
        com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getTask(
        com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getTaskByFlightId(
        com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskByFlightIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getWaypointsByTaskId(
        com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWaypointsByTaskIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> createTask(
        com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> updateTask(
        com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteTask(
        com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> getScheduler(
        com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> createScheduler(
        com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> updateScheduler(
        com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.connector.proto.ConnectorResponse> deleteScheduler(
        com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSchedulerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ASSET = 0;
  private static final int METHODID_DE_REGISTER_ASSET = 1;
  private static final int METHODID_ASSET_MONITORING = 2;
  private static final int METHODID_UPDATE_ASSET = 3;
  private static final int METHODID_GET_ASSET_BY_SN = 4;
  private static final int METHODID_GET_ASSET_BY_ID = 5;
  private static final int METHODID_GET_SUB_ASSET_BY_SN = 6;
  private static final int METHODID_GET_ORGANIZATION = 7;
  private static final int METHODID_GET_MISSION = 8;
  private static final int METHODID_CREATE_MISSION = 9;
  private static final int METHODID_UPDATE_MISSION = 10;
  private static final int METHODID_DELETE_MISSION = 11;
  private static final int METHODID_GET_TASK = 12;
  private static final int METHODID_GET_TASK_BY_FLIGHT_ID = 13;
  private static final int METHODID_GET_WAYPOINTS_BY_TASK_ID = 14;
  private static final int METHODID_CREATE_TASK = 15;
  private static final int METHODID_UPDATE_TASK = 16;
  private static final int METHODID_DELETE_TASK = 17;
  private static final int METHODID_GET_SCHEDULER = 18;
  private static final int METHODID_CREATE_SCHEDULER = 19;
  private static final int METHODID_UPDATE_SCHEDULER = 20;
  private static final int METHODID_DELETE_SCHEDULER = 21;
  private static final int METHODID_STORE_TELEMETRY_BATCH = 22;

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
        case METHODID_REGISTER_ASSET:
          serviceImpl.registerAsset((com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_DE_REGISTER_ASSET:
          serviceImpl.deRegisterAsset((com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_ASSET_MONITORING:
          serviceImpl.assetMonitoring((com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.AssetMonitoringResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ASSET:
          serviceImpl.updateAsset((com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_ASSET_BY_SN:
          serviceImpl.getAssetBySn((com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_ASSET_BY_ID:
          serviceImpl.getAssetById((com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_SUB_ASSET_BY_SN:
          serviceImpl.getSubAssetBySn((com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_MISSION:
          serviceImpl.getMission((com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_CREATE_MISSION:
          serviceImpl.createMission((com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MISSION:
          serviceImpl.updateMission((com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_DELETE_MISSION:
          serviceImpl.deleteMission((com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_BY_FLIGHT_ID:
          serviceImpl.getTaskByFlightId((com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_WAYPOINTS_BY_TASK_ID:
          serviceImpl.getWaypointsByTaskId((com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULER:
          serviceImpl.getScheduler((com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_CREATE_SCHEDULER:
          serviceImpl.createScheduler((com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULER:
          serviceImpl.updateScheduler((com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCHEDULER:
          serviceImpl.deleteScheduler((com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
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
        case METHODID_STORE_TELEMETRY_BATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.storeTelemetryBatch(
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.connector.proto.ConnectorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorRegisterAssetRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_REGISTER_ASSET)))
        .addMethod(
          getDeRegisterAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorDeRegisterAssetRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_DE_REGISTER_ASSET)))
        .addMethod(
          getAssetMonitoringMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorAssetMonitorRequest,
              com.zequent.framework.services.connector.proto.AssetMonitoringResponse>(
                service, METHODID_ASSET_MONITORING)))
        .addMethod(
          getUpdateAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorUpdateAssetRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_UPDATE_ASSET)))
        .addMethod(
          getGetAssetBySnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetAssetBySnRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_ASSET_BY_SN)))
        .addMethod(
          getGetAssetByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetAssetByIdRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_ASSET_BY_ID)))
        .addMethod(
          getGetSubAssetBySnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetSubAssetBySnRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_SUB_ASSET_BY_SN)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetOrganizationRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getGetMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetMissionRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_MISSION)))
        .addMethod(
          getCreateMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorCreateMissionRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_CREATE_MISSION)))
        .addMethod(
          getUpdateMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorUpdateMissionRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_UPDATE_MISSION)))
        .addMethod(
          getDeleteMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorDeleteMissionRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_DELETE_MISSION)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getGetTaskByFlightIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetTaskRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_TASK_BY_FLIGHT_ID)))
        .addMethod(
          getGetWaypointsByTaskIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetWaypointsByTaskId,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_WAYPOINTS_BY_TASK_ID)))
        .addMethod(
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorCreateTaskRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getUpdateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorUpdateTaskRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_UPDATE_TASK)))
        .addMethod(
          getDeleteTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorDeleteTaskRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_DELETE_TASK)))
        .addMethod(
          getGetSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorGetSchedulerRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_GET_SCHEDULER)))
        .addMethod(
          getCreateSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorCreateSchedulerRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_CREATE_SCHEDULER)))
        .addMethod(
          getUpdateSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorUpdateSchedulerRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_UPDATE_SCHEDULER)))
        .addMethod(
          getDeleteSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorDeleteSchedulerRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_DELETE_SCHEDULER)))
        .addMethod(
          getStoreTelemetryBatchMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.zequent.framework.services.connector.proto.ConnectorStoreTelemetryRequest,
              com.zequent.framework.services.connector.proto.ConnectorResponse>(
                service, METHODID_STORE_TELEMETRY_BATCH)))
        .build();
  }

  private static abstract class ConnectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zequent.framework.services.connector.proto.ConnectorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectorService");
    }
  }

  private static final class ConnectorServiceFileDescriptorSupplier
      extends ConnectorServiceBaseDescriptorSupplier {
    ConnectorServiceFileDescriptorSupplier() {}
  }

  private static final class ConnectorServiceMethodDescriptorSupplier
      extends ConnectorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConnectorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConnectorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectorServiceFileDescriptorSupplier())
              .addMethod(getRegisterAssetMethod())
              .addMethod(getDeRegisterAssetMethod())
              .addMethod(getAssetMonitoringMethod())
              .addMethod(getUpdateAssetMethod())
              .addMethod(getGetAssetBySnMethod())
              .addMethod(getGetAssetByIdMethod())
              .addMethod(getGetSubAssetBySnMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getGetMissionMethod())
              .addMethod(getCreateMissionMethod())
              .addMethod(getUpdateMissionMethod())
              .addMethod(getDeleteMissionMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getGetTaskByFlightIdMethod())
              .addMethod(getGetWaypointsByTaskIdMethod())
              .addMethod(getCreateTaskMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getGetSchedulerMethod())
              .addMethod(getCreateSchedulerMethod())
              .addMethod(getUpdateSchedulerMethod())
              .addMethod(getDeleteSchedulerMethod())
              .addMethod(getStoreTelemetryBatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
