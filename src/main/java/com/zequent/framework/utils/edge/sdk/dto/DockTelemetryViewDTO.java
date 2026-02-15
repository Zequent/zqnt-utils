package com.zequent.framework.utils.edge.sdk.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO for dock_telemetry_view.
 * Contains dock-specific telemetry data extracted from the view.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DockTelemetryViewDTO {

    private Instant time;
    private String dockId;

    // Location
    private Double latitude;
    private Double longitude;
    private Double altitude;

    // Battery
    private Double batteryPercentage;

    // Environmental
    private Double temperature;
    private Double humidity;
    private Double windSpeed;

    // Status
    private String dockMode;

    // Dock-specific fields from JSONB
    private Double environmentTemp;
    private Double insideTemp;
    private String rainfall;
    private String coverState;
    private Integer workingVoltage;
    private Integer workingCurrent;
    private Integer supplyVoltage;

    // Sub-asset information
    private Boolean subAssetAtHome;
    private Boolean subAssetCharging;
    private Double subAssetPercentage;
    private String subAssetSn;
    private Boolean subAssetPaired;
    private Boolean subAssetOnline;

    // Air conditioner
    private String acState;

    // Network
    private String networkTypeDetail;
    private Double networkRate;

    // Full telemetry data as JSON
    private JsonNode telemetryData;
}
