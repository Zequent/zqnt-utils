package com.zqnt.utils.missionautonomy.domains;

import com.zequent.framework.common.proto.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link Task}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDTO implements Serializable {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String modifiedFrom;
    private UUID missionId;
    private String name;
    private String description;
    private TaskStatus status;
    private String assetId;
    private String snNumber;
    private String flightId;
    private FlyToWaylineModeProto flyToWaylineMode;
    private WaylineFinishActionProto waylineFinishAction;
    private ExitWaylineWhenRcLostEnumProto exitWaylineWhenRcLostEnum;
    private RcLostActionEnumProto rcLostActionEnum;
    private Float takeOffSecurityHeight;
    private Float globalTransitionSpeed;
    private WaylineTypeEnumProto waylineType;
    private String payloadImagingType;
    private WaylineTurnModeProto waylineTurnMode;
    private Boolean useStraightLine;
    private WaylineGimbalPitchModeProto gimbalPitchMode;
	private Integer globalGimbalPitch;
    private Float globalSpeed;
    private Float globalHeight;
    private String fileUrl;
    private String fileMd5;
    private String flightAreaFileUrl;
    private String flightAreaChecksum;
    private Integer rthAltitude;
    private RthModeEnumProto rthMode;
    private Float rthSpeed;
    private OutOfControlActionEnumProto outOfControlAction;
    private WaylinePrecisionTypeEnumProto waylinePrecisionType;
    private Integer currentProgress;
    private String currentStep;
    private FlighttaskBreakReasonEnumProto breakReason;
    private List<WaypointDTO> waypoints;
}
