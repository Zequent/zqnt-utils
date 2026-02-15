package com.zequent.framework.utils.missionautonomy.dto;

import com.zequent.framework.common.proto.MissionStatus;
import com.zequent.framework.common.proto.MissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * DTO for {@link Mission}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissionDTO implements Serializable {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String modifiedFrom;
    private String name;
    private String description;
    private MissionStatus status;
    private MissionType type;
    private String geoJson;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Set<String> assignedAssets = new HashSet<>();
    private String updatedUser;
}