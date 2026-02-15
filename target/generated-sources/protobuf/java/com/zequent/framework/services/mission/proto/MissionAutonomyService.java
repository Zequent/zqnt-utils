package com.zequent.framework.services.mission.proto;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: mission-autonomy.proto")
public interface MissionAutonomyService extends MutinyService {

    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request);
    
    io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request);
    
    
    

}