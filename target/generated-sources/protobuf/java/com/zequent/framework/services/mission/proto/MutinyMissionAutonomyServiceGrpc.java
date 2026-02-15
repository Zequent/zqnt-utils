package com.zequent.framework.services.mission.proto;

import static com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: mission-autonomy.proto")
public final class MutinyMissionAutonomyServiceGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyMissionAutonomyServiceGrpc() {}

    public static MutinyMissionAutonomyServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMissionAutonomyServiceStub(channel);
    }

    
    public static final class MutinyMissionAutonomyServiceStub extends io.grpc.stub.AbstractStub<MutinyMissionAutonomyServiceStub> implements io.quarkus.grpc.MutinyStub {
        private MissionAutonomyServiceGrpc.MissionAutonomyServiceStub delegateStub;

        private MutinyMissionAutonomyServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MissionAutonomyServiceGrpc.newStub(channel);
        }

        private MutinyMissionAutonomyServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MissionAutonomyServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMissionAutonomyServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMissionAutonomyServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteMission);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getTaskByFlightId);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteScheduler);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::startTask);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::stopTask);
        }

    }

    
    public static abstract class MissionAutonomyServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public MissionAutonomyServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getGetMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.GetMissionRequest,
                                            com.zequent.framework.services.mission.proto.MissionResponse>(
                                            this, METHODID_GET_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getCreateMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.CreateMissionRequest,
                                            com.zequent.framework.services.mission.proto.MissionResponse>(
                                            this, METHODID_CREATE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getUpdateMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.UpdateMissionRequest,
                                            com.zequent.framework.services.mission.proto.MissionResponse>(
                                            this, METHODID_UPDATE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getDeleteMissionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.DeleteMissionRequest,
                                            com.zequent.framework.services.mission.proto.MissionResponse>(
                                            this, METHODID_DELETE_MISSION, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getGetTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.GetTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_GET_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getGetTaskByFlightIdMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.GetTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_GET_TASK_BY_FLIGHT_ID, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getCreateTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.CreateTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_CREATE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getUpdateTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.UpdateTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_UPDATE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getDeleteTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.DeleteTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_DELETE_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getGetSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.GetSchedulerRequest,
                                            com.zequent.framework.services.mission.proto.SchedulerResponse>(
                                            this, METHODID_GET_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getCreateSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.CreateSchedulerRequest,
                                            com.zequent.framework.services.mission.proto.SchedulerResponse>(
                                            this, METHODID_CREATE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getUpdateSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.UpdateSchedulerRequest,
                                            com.zequent.framework.services.mission.proto.SchedulerResponse>(
                                            this, METHODID_UPDATE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getDeleteSchedulerMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.DeleteSchedulerRequest,
                                            com.zequent.framework.services.mission.proto.SchedulerResponse>(
                                            this, METHODID_DELETE_SCHEDULER, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getStartTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.StartTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_START_TASK, compression)))
                    .addMethod(
                            com.zequent.framework.services.mission.proto.MissionAutonomyServiceGrpc.getStopTaskMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.zequent.framework.services.mission.proto.StopTaskRequest,
                                            com.zequent.framework.services.mission.proto.TaskResponse>(
                                            this, METHODID_STOP_TASK, compression)))
                    .build();
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
        private final MissionAutonomyServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(MissionAutonomyServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.GetMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver,
                            compression,
                            serviceImpl::getMission);
                    break;
                case METHODID_CREATE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.CreateMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver,
                            compression,
                            serviceImpl::createMission);
                    break;
                case METHODID_UPDATE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.UpdateMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver,
                            compression,
                            serviceImpl::updateMission);
                    break;
                case METHODID_DELETE_MISSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.DeleteMissionRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.MissionResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteMission);
                    break;
                case METHODID_GET_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.GetTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::getTask);
                    break;
                case METHODID_GET_TASK_BY_FLIGHT_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.GetTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::getTaskByFlightId);
                    break;
                case METHODID_CREATE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.CreateTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::createTask);
                    break;
                case METHODID_UPDATE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.UpdateTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::updateTask);
                    break;
                case METHODID_DELETE_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.DeleteTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteTask);
                    break;
                case METHODID_GET_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.GetSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver,
                            compression,
                            serviceImpl::getScheduler);
                    break;
                case METHODID_CREATE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.CreateSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver,
                            compression,
                            serviceImpl::createScheduler);
                    break;
                case METHODID_UPDATE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.UpdateSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver,
                            compression,
                            serviceImpl::updateScheduler);
                    break;
                case METHODID_DELETE_SCHEDULER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.DeleteSchedulerRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.SchedulerResponse>) responseObserver,
                            compression,
                            serviceImpl::deleteScheduler);
                    break;
                case METHODID_START_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.StartTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::startTask);
                    break;
                case METHODID_STOP_TASK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.zequent.framework.services.mission.proto.StopTaskRequest) request,
                            (io.grpc.stub.StreamObserver<com.zequent.framework.services.mission.proto.TaskResponse>) responseObserver,
                            compression,
                            serviceImpl::stopTask);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}