package com.zequent.framework.utils.core;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;


@MapperConfig
public interface BaseDtoProtoMapper<T, R> {


	@Mapping(target = "defaultInstanceForType", ignore = true)
	@Mapping(target = "clearOneof", ignore = true)
	@Mapping(target = "allFields", ignore = true)
	@Mapping(target = "clearField", ignore = true)
    T dtoToProto(R dto);

	R protoToDto(T proto);


}
