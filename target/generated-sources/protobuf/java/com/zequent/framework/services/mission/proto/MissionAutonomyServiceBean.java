package com.zequent.framework.services.mission.proto;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: mission-autonomy.proto")
public class MissionAutonomyServiceBean extends MutinyMissionAutonomyServiceGrpc.MissionAutonomyServiceImplBase implements BindableService, MutinyBean {

    private final MissionAutonomyService delegate;

    MissionAutonomyServiceBean(@GrpcService MissionAutonomyService delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> getMission(com.zequent.framework.services.mission.proto.GetMissionRequest request) {
       try {
         return delegate.getMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> createMission(com.zequent.framework.services.mission.proto.CreateMissionRequest request) {
       try {
         return delegate.createMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> updateMission(com.zequent.framework.services.mission.proto.UpdateMissionRequest request) {
       try {
         return delegate.updateMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.MissionResponse> deleteMission(com.zequent.framework.services.mission.proto.DeleteMissionRequest request) {
       try {
         return delegate.deleteMission(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTask(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
       try {
         return delegate.getTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> getTaskByFlightId(com.zequent.framework.services.mission.proto.GetTaskRequest request) {
       try {
         return delegate.getTaskByFlightId(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> createTask(com.zequent.framework.services.mission.proto.CreateTaskRequest request) {
       try {
         return delegate.createTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> updateTask(com.zequent.framework.services.mission.proto.UpdateTaskRequest request) {
       try {
         return delegate.updateTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> deleteTask(com.zequent.framework.services.mission.proto.DeleteTaskRequest request) {
       try {
         return delegate.deleteTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> getScheduler(com.zequent.framework.services.mission.proto.GetSchedulerRequest request) {
       try {
         return delegate.getScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> createScheduler(com.zequent.framework.services.mission.proto.CreateSchedulerRequest request) {
       try {
         return delegate.createScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> updateScheduler(com.zequent.framework.services.mission.proto.UpdateSchedulerRequest request) {
       try {
         return delegate.updateScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.SchedulerResponse> deleteScheduler(com.zequent.framework.services.mission.proto.DeleteSchedulerRequest request) {
       try {
         return delegate.deleteScheduler(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> startTask(com.zequent.framework.services.mission.proto.StartTaskRequest request) {
       try {
         return delegate.startTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }
    @Override
    public io.smallrye.mutiny.Uni<com.zequent.framework.services.mission.proto.TaskResponse> stopTask(com.zequent.framework.services.mission.proto.StopTaskRequest request) {
       try {
         return delegate.stopTask(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}