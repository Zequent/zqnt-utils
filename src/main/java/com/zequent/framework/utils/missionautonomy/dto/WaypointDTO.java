package com.zequent.framework.utils.missionautonomy.dto;

import com.zequent.framework.common.proto.VehicleAction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * DTO for {@link Waypoint}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WaypointDTO implements Serializable {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String modifiedFrom;
    private Double latitude;
    private Double longitude;
    private Float altitude;
    private Float speed;
    private Boolean flyThrough;
    private VehicleAction vehicleAction;
	private Integer wpOrder;
	private Integer gimbalPitch;
	private UUID task;
}
