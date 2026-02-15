package com.zequent.framework.services.mission.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mission-autonomy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MissionAutonomyServiceGrpc {

  private MissionAutonomyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MissionAutonomyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getGetMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMission",
      requestType = com.zequent.framework.services.mission.proto.GetMissionRequest.class,
      responseType = com.zequent.framework.services.mission.proto.MissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getGetMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse> getGetMissionMethod;
    if ((getGetMissionMethod = MissionAutonomyServiceGrpc.getGetMissionMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getGetMissionMethod = MissionAutonomyServiceGrpc.getGetMissionMethod) == null) {
          MissionAutonomyServiceGrpc.getGetMissionMethod = getGetMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.GetMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.GetMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.MissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("GetMission"))
              .build();
        }
      }
    }
    return getGetMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getCreateMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMission",
      requestType = com.zequent.framework.services.mission.proto.CreateMissionRequest.class,
      responseType = com.zequent.framework.services.mission.proto.MissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getCreateMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse> getCreateMissionMethod;
    if ((getCreateMissionMethod = MissionAutonomyServiceGrpc.getCreateMissionMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getCreateMissionMethod = MissionAutonomyServiceGrpc.getCreateMissionMethod) == null) {
          MissionAutonomyServiceGrpc.getCreateMissionMethod = getCreateMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.CreateMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.CreateMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.MissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("CreateMission"))
              .build();
        }
      }
    }
    return getCreateMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getUpdateMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMission",
      requestType = com.zequent.framework.services.mission.proto.UpdateMissionRequest.class,
      responseType = com.zequent.framework.services.mission.proto.MissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getUpdateMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse> getUpdateMissionMethod;
    if ((getUpdateMissionMethod = MissionAutonomyServiceGrpc.getUpdateMissionMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getUpdateMissionMethod = MissionAutonomyServiceGrpc.getUpdateMissionMethod) == null) {
          MissionAutonomyServiceGrpc.getUpdateMissionMethod = getUpdateMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.UpdateMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.UpdateMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.MissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("UpdateMission"))
              .build();
        }
      }
    }
    return getUpdateMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getDeleteMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMission",
      requestType = com.zequent.framework.services.mission.proto.DeleteMissionRequest.class,
      responseType = com.zequent.framework.services.mission.proto.MissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteMissionRequest,
      com.zequent.framework.services.mission.proto.MissionResponse> getDeleteMissionMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse> getDeleteMissionMethod;
    if ((getDeleteMissionMethod = MissionAutonomyServiceGrpc.getDeleteMissionMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getDeleteMissionMethod = MissionAutonomyServiceGrpc.getDeleteMissionMethod) == null) {
          MissionAutonomyServiceGrpc.getDeleteMissionMethod = getDeleteMissionMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.DeleteMissionRequest, com.zequent.framework.services.mission.proto.MissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.DeleteMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.MissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("DeleteMission"))
              .build();
        }
      }
    }
    return getDeleteMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.zequent.framework.services.mission.proto.GetTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskMethod;
    if ((getGetTaskMethod = MissionAutonomyServiceGrpc.getGetTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getGetTaskMethod = MissionAutonomyServiceGrpc.getGetTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.GetTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskByFlightIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaskByFlightId",
      requestType = com.zequent.framework.services.mission.proto.GetTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskByFlightIdMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getGetTaskByFlightIdMethod;
    if ((getGetTaskByFlightIdMethod = MissionAutonomyServiceGrpc.getGetTaskByFlightIdMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getGetTaskByFlightIdMethod = MissionAutonomyServiceGrpc.getGetTaskByFlightIdMethod) == null) {
          MissionAutonomyServiceGrpc.getGetTaskByFlightIdMethod = getGetTaskByFlightIdMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.GetTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaskByFlightId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.GetTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("GetTaskByFlightId"))
              .build();
        }
      }
    }
    return getGetTaskByFlightIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.zequent.framework.services.mission.proto.CreateTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = MissionAutonomyServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getCreateTaskMethod = MissionAutonomyServiceGrpc.getCreateTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.CreateTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.zequent.framework.services.mission.proto.UpdateTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = MissionAutonomyServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getUpdateTaskMethod = MissionAutonomyServiceGrpc.getUpdateTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.UpdateTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("UpdateTask"))
              .build();
        }
      }
    }
    return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.zequent.framework.services.mission.proto.DeleteTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = MissionAutonomyServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getDeleteTaskMethod = MissionAutonomyServiceGrpc.getDeleteTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.DeleteTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("DeleteTask"))
              .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getGetSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScheduler",
      requestType = com.zequent.framework.services.mission.proto.GetSchedulerRequest.class,
      responseType = com.zequent.framework.services.mission.proto.SchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getGetSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.GetSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse> getGetSchedulerMethod;
    if ((getGetSchedulerMethod = MissionAutonomyServiceGrpc.getGetSchedulerMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getGetSchedulerMethod = MissionAutonomyServiceGrpc.getGetSchedulerMethod) == null) {
          MissionAutonomyServiceGrpc.getGetSchedulerMethod = getGetSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.GetSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.GetSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.SchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("GetScheduler"))
              .build();
        }
      }
    }
    return getGetSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getCreateSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScheduler",
      requestType = com.zequent.framework.services.mission.proto.CreateSchedulerRequest.class,
      responseType = com.zequent.framework.services.mission.proto.SchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getCreateSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.CreateSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse> getCreateSchedulerMethod;
    if ((getCreateSchedulerMethod = MissionAutonomyServiceGrpc.getCreateSchedulerMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getCreateSchedulerMethod = MissionAutonomyServiceGrpc.getCreateSchedulerMethod) == null) {
          MissionAutonomyServiceGrpc.getCreateSchedulerMethod = getCreateSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.CreateSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.CreateSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.SchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("CreateScheduler"))
              .build();
        }
      }
    }
    return getCreateSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getUpdateSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduler",
      requestType = com.zequent.framework.services.mission.proto.UpdateSchedulerRequest.class,
      responseType = com.zequent.framework.services.mission.proto.SchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getUpdateSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.UpdateSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse> getUpdateSchedulerMethod;
    if ((getUpdateSchedulerMethod = MissionAutonomyServiceGrpc.getUpdateSchedulerMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getUpdateSchedulerMethod = MissionAutonomyServiceGrpc.getUpdateSchedulerMethod) == null) {
          MissionAutonomyServiceGrpc.getUpdateSchedulerMethod = getUpdateSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.UpdateSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.UpdateSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.SchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("UpdateScheduler"))
              .build();
        }
      }
    }
    return getUpdateSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getDeleteSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScheduler",
      requestType = com.zequent.framework.services.mission.proto.DeleteSchedulerRequest.class,
      responseType = com.zequent.framework.services.mission.proto.SchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteSchedulerRequest,
      com.zequent.framework.services.mission.proto.SchedulerResponse> getDeleteSchedulerMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.DeleteSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse> getDeleteSchedulerMethod;
    if ((getDeleteSchedulerMethod = MissionAutonomyServiceGrpc.getDeleteSchedulerMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getDeleteSchedulerMethod = MissionAutonomyServiceGrpc.getDeleteSchedulerMethod) == null) {
          MissionAutonomyServiceGrpc.getDeleteSchedulerMethod = getDeleteSchedulerMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.DeleteSchedulerRequest, com.zequent.framework.services.mission.proto.SchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.DeleteSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.SchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("DeleteScheduler"))
              .build();
        }
      }
    }
    return getDeleteSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StartTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getStartTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartTask",
      requestType = com.zequent.framework.services.mission.proto.StartTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StartTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getStartTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StartTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getStartTaskMethod;
    if ((getStartTaskMethod = MissionAutonomyServiceGrpc.getStartTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getStartTaskMethod = MissionAutonomyServiceGrpc.getStartTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getStartTaskMethod = getStartTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.StartTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.StartTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("StartTask"))
              .build();
        }
      }
    }
    return getStartTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StopTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getStopTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopTask",
      requestType = com.zequent.framework.services.mission.proto.StopTaskRequest.class,
      responseType = com.zequent.framework.services.mission.proto.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StopTaskRequest,
      com.zequent.framework.services.mission.proto.TaskResponse> getStopTaskMethod() {
    io.grpc.MethodDescriptor<com.zequent.framework.services.mission.proto.StopTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse> getStopTaskMethod;
    if ((getStopTaskMethod = MissionAutonomyServiceGrpc.getStopTaskMethod) == null) {
      synchronized (MissionAutonomyServiceGrpc.class) {
        if ((getStopTaskMethod = MissionAutonomyServiceGrpc.getStopTaskMethod) == null) {
          MissionAutonomyServiceGrpc.getStopTaskMethod = getStopTaskMethod =
              io.grpc.MethodDescriptor.<com.zequent.framework.services.mission.proto.StopTaskRequest, com.zequent.framework.services.mission.proto.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.StopTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zequent.framework.services.mission.proto.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MissionAutonomyServiceMethodDescriptorSupplier("StopTask"))
              .build();
        }
      }
    }
    return getStopTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MissionAutonomyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceStub>() {
        @java.lang.Override
        public MissionAutonomyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionAutonomyServiceStub(channel, callOptions);
        }
      };
    return MissionAutonomyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MissionAutonomyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceBlockingStub>() {
        @java.lang.Override
        public MissionAutonomyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionAutonomyServiceBlockingStub(channel, callOptions);
        }
      };
    return MissionAutonomyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MissionAutonomyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionAutonomyServiceFutureStub>() {
        @java.lang.Override
        public MissionAutonomyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionAutonomyServiceFutureStub(channel, callOptions);
        }
      };
    return MissionAutonomyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMissionMethod(), responseObserver);
    }

    /**
     */
    default void createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMissionMethod(), responseObserver);
    }

    /**
     */
    default void updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMissionMethod(), responseObserver);
    }

    /**
     */
    default void deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMissionMethod(), responseObserver);
    }

    /**
     */
    default void getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     */
    default void getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskByFlightIdMethod(), responseObserver);
    }

    /**
     */
    default void createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    default void updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     */
    default void deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    default void getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSchedulerMethod(), responseObserver);
    }

    /**
     */
    default void startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartTaskMethod(), responseObserver);
    }

    /**
     */
    default void stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MissionAutonomyService.
   */
  public static abstract class MissionAutonomyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MissionAutonomyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MissionAutonomyService.
   */
  public static final class MissionAutonomyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MissionAutonomyServiceStub> {
    private MissionAutonomyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionAutonomyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionAutonomyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskByFlightIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request,
        io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MissionAutonomyService.
   */
  public static final class MissionAutonomyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MissionAutonomyServiceBlockingStub> {
    private MissionAutonomyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionAutonomyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionAutonomyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.MissionResponse getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.MissionResponse createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.MissionResponse updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.MissionResponse deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskByFlightIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.SchedulerResponse getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.SchedulerResponse createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.SchedulerResponse updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.SchedulerResponse deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSchedulerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.zequent.framework.services.mission.proto.TaskResponse stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MissionAutonomyService.
   */
  public static final class MissionAutonomyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MissionAutonomyServiceFutureStub> {
    private MissionAutonomyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionAutonomyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionAutonomyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.MissionResponse> getMission(
        com.zequent.framework.services.mission.proto.GetMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.MissionResponse> createMission(
        com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(
        com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(
        com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> getTask(
        com.zequent.framework.services.mission.proto.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(
        com.zequent.framework.services.mission.proto.GetTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskByFlightIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> createTask(
        com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(
        com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(
        com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(
        com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(
        com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(
        com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(
        com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSchedulerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> startTask(
        com.zequent.framework.services.mission.proto.StartTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(
        com.zequent.framework.services.mission.proto.StopTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MISSION = 0;
  private static final int METHODID_CREATE_MISSION = 1;
  private static final int METHODID_UPDATE_MISSION = 2;
  private static final int METHODID_DELETE_MISSION = 3;
  private static final int METHODID_GET_TASK = 4;
  private static final int METHODID_GET_TASK_BY_FLIGHT_ID = 5;
  private static final int METHODID_CREATE_TASK = 6;
  private static final int METHODID_UPDATE_TASK = 7;
  private static final int METHODID_DELETE_TASK = 8;
  private static final int METHODID_GET_SCHEDULER = 9;
  private static final int METHODID_CREATE_SCHEDULER = 10;
  private static final int METHODID_UPDATE_SCHEDULER = 11;
  private static final int METHODID_DELETE_SCHEDULER = 12;
  private static final int METHODID_START_TASK = 13;
  private static final int METHODID_STOP_TASK = 14;

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
        case METHODID_GET_MISSION:
          serviceImpl.getMission((com.zequent.framework.services.mission.proto.GetMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver);
          break;
        case METHODID_CREATE_MISSION:
          serviceImpl.createMission((com.zequent.framework.services.mission.proto.CreateMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MISSION:
          serviceImpl.updateMission((com.zequent.framework.services.mission.proto.UpdateMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver);
          break;
        case METHODID_DELETE_MISSION:
          serviceImpl.deleteMission((com.zequent.framework.services.mission.proto.DeleteMissionRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.zequent.framework.services.mission.proto.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK_BY_FLIGHT_ID:
          serviceImpl.getTaskByFlightId((com.zequent.framework.services.mission.proto.GetTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.zequent.framework.services.mission.proto.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.zequent.framework.services.mission.proto.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.zequent.framework.services.mission.proto.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULER:
          serviceImpl.getScheduler((com.zequent.framework.services.mission.proto.GetSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver);
          break;
        case METHODID_CREATE_SCHEDULER:
          serviceImpl.createScheduler((com.zequent.framework.services.mission.proto.CreateSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULER:
          serviceImpl.updateScheduler((com.zequent.framework.services.mission.proto.UpdateSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCHEDULER:
          serviceImpl.deleteScheduler((com.zequent.framework.services.mission.proto.DeleteSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver);
          break;
        case METHODID_START_TASK:
          serviceImpl.startTask((com.zequent.framework.services.mission.proto.StartTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
          break;
        case METHODID_STOP_TASK:
          serviceImpl.stopTask((com.zequent.framework.services.mission.proto.StopTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.GetMissionRequest,
              com.zequent.framework.services.mission.proto.MissionResponse>(
                service, METHODID_GET_MISSION)))
        .addMethod(
          getCreateMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.CreateMissionRequest,
              com.zequent.framework.services.mission.proto.MissionResponse>(
                service, METHODID_CREATE_MISSION)))
        .addMethod(
          getUpdateMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.UpdateMissionRequest,
              com.zequent.framework.services.mission.proto.MissionResponse>(
                service, METHODID_UPDATE_MISSION)))
        .addMethod(
          getDeleteMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.DeleteMissionRequest,
              com.zequent.framework.services.mission.proto.MissionResponse>(
                service, METHODID_DELETE_MISSION)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.GetTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getGetTaskByFlightIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.GetTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_GET_TASK_BY_FLIGHT_ID)))
        .addMethod(
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.CreateTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getUpdateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.UpdateTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_UPDATE_TASK)))
        .addMethod(
          getDeleteTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.DeleteTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_DELETE_TASK)))
        .addMethod(
          getGetSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.GetSchedulerRequest,
              com.zequent.framework.services.mission.proto.SchedulerResponse>(
                service, METHODID_GET_SCHEDULER)))
        .addMethod(
          getCreateSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.CreateSchedulerRequest,
              com.zequent.framework.services.mission.proto.SchedulerResponse>(
                service, METHODID_CREATE_SCHEDULER)))
        .addMethod(
          getUpdateSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.UpdateSchedulerRequest,
              com.zequent.framework.services.mission.proto.SchedulerResponse>(
                service, METHODID_UPDATE_SCHEDULER)))
        .addMethod(
          getDeleteSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.DeleteSchedulerRequest,
              com.zequent.framework.services.mission.proto.SchedulerResponse>(
                service, METHODID_DELETE_SCHEDULER)))
        .addMethod(
          getStartTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.StartTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_START_TASK)))
        .addMethod(
          getStopTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zequent.framework.services.mission.proto.StopTaskRequest,
              com.zequent.framework.services.mission.proto.TaskResponse>(
                service, METHODID_STOP_TASK)))
        .build();
  }

  private static abstract class MissionAutonomyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MissionAutonomyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zequent.framework.services.mission.proto.MissionAutonomyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MissionAutonomyService");
    }
  }

  private static final class MissionAutonomyServiceFileDescriptorSupplier
      extends MissionAutonomyServiceBaseDescriptorSupplier {
    MissionAutonomyServiceFileDescriptorSupplier() {}
  }

  private static final class MissionAutonomyServiceMethodDescriptorSupplier
      extends MissionAutonomyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MissionAutonomyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MissionAutonomyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MissionAutonomyServiceFileDescriptorSupplier())
              .addMethod(getGetMissionMethod())
              .addMethod(getCreateMissionMethod())
              .addMethod(getUpdateMissionMethod())
              .addMethod(getDeleteMissionMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getGetTaskByFlightIdMethod())
              .addMethod(getCreateTaskMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getGetSchedulerMethod())
              .addMethod(getCreateSchedulerMethod())
              .addMethod(getUpdateSchedulerMethod())
              .addMethod(getDeleteSchedulerMethod())
              .addMethod(getStartTaskMethod())
              .addMethod(getStopTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
