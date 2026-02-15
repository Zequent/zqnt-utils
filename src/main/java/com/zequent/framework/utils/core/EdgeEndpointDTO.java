package com.zequent.framework.utils.core;

import com.zequent.framework.common.proto.AssetTypeEnum;
import com.zequent.framework.common.proto.AssetVendor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EdgeEndpointDTO {

	private String endpoint;

	private Boolean online;

	private AssetTypeEnum assetType;

	private AssetVendor assetVendor;


}
