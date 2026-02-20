package com.zqnt.utils.edge.sdk.domains;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO for aircraft_telemetry_view.
 * Contains drone/aircraft-specific telemetry data extracted from the view.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AircraftTelemetryViewDTO {

    private Instant time;
    private String droneId;
    private String missionId;

    // Location
    private Double latitude;
    private Double longitude;
    private Double altitude;
    private Double relativeAltitude;
    private Double heading;

    // Battery
    private Double batteryPercentage;
    private Double batteryVoltage;

    // Status
    private String flightMode;
    private Boolean isFlying;

    // Drone-specific fields from JSONB
    private Double speed;
    private Double velocityX;
    private Double velocityY;
    private Double velocityZ;
    private Double roll;
    private Double pitch;
    private Double yaw;
    private Integer gpsSatelliteCount;

    // Full telemetry data as JSON
    private JsonNode telemetryData;
}
