package com.zequent.framework.services.mission.proto;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: mission-autonomy.proto")
public class MissionAutonomyServiceClient implements MissionAutonomyService, MutinyClient<MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub> {

    private final MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub stub;

    public MissionAutonomyServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub, MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyMissionAutonomyServiceGrpc.newMutinyStub(channel));
    }

    private MissionAutonomyServiceClient(MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub stub) {
       this.stub = stub;
    }

    public MissionAutonomyServiceClient newInstanceWithStub(MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub stub) {
        return new MissionAutonomyServiceClient(stub);
    }

    @Override
    public MutinyMissionAutonomyServiceGrpc.MutinyMissionAutonomyServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request) {
       return stub.getMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
       return stub.createMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
       return stub.updateMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
       return stub.deleteMission(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
       return stub.getTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
       return stub.getTaskByFlightId(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
       return stub.createTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
       return stub.updateTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
       return stub.deleteTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
       return stub.getScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
       return stub.createScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
       return stub.updateScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
       return stub.deleteScheduler(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request) {
       return stub.startTask(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request) {
       return stub.stopTask(request);
    }

}