package com.zqnt.utils.edge.sdk.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * DTO for asset_telemetry_1hour continuous aggregate view.
 * Contains 1-hour aggregated telemetry data for historical analysis.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetTelemetryHourAggregateDTO {

    private Instant bucket;
    private String assetId;
    private String assetType;
    private String missionId;
    private String organizationId;

    // Altitude statistics
    private Double avgAltitude;
    private Double minAltitude;
    private Double maxAltitude;

    // Battery statistics
    private Double avgBattery;
    private Double minBattery;
    private Double maxBattery;

    // Temperature statistics
    private Double avgTemperature;
    private Double minTemperature;
    private Double maxTemperature;

    // Activity metrics
    private Long totalSamples;
    private Long activeSamples;
    private Long onlineSamples;

    // Data quality
    private Long validLocationSamples;
}
