package com.zqnt.utils.missionautonomy.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * DTO for {@link com.zequent.framework.services.connector.entities.Organization}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrganizationDTO implements Serializable {
	private UUID id;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	private String modifiedFrom;
	private String name;
	private String description;
	private Set<UUID> assets;
}