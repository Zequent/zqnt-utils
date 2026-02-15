package com.zequent.framework.utils.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProtoEntityMapperUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Protobuf -> JSON
     */
    public static String toJson(Message message) {
        try {
            return JsonFormat.printer().print(message);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Protobuf to JSON", e);
        }
    }

    /**
     * JSON -> Protobuf
     */
    public static <T extends Message.Builder> Message fromJson(String json, T builder) {
        try {
            JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
            return builder.build();
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to Protobuf", e);
        }
    }

    /**
     * Protobuf -> Entity
     */
    public static <E> E toEntity(Message message, Class<E> entityClass) {
        try {
            String json = toJson(message);
            return objectMapper.readValue(json, entityClass);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Protobuf to Entity", e);
        }
    }

    /**
     * Entity -> Protobuf
     */
    @SuppressWarnings("unchecked")
    public static <T extends Message.Builder> Message toProto(Object entity, T builder) {
        try {
            String json = objectMapper.writeValueAsString(entity);
            return fromJson(json, builder);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Entity to Protobuf", e);
        }
    }

}
