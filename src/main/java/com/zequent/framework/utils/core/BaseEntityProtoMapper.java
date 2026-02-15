package com.zequent.framework.utils.core;

import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig
public interface BaseEntityProtoMapper<T, R> {


	T entityToProto(R entity);

	void protoToEntity(T proto, @MappingTarget R entity);

}
