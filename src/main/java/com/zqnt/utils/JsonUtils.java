package com.zqnt.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Centralized JSON utility with pre-configured ObjectMapper
 * <p>
 * Configuration:
 * - JavaTimeModule for LocalDateTime, Instant, etc.
 * - Ignores unknown properties during deserialization
 * - Excludes null values from serialization
 * - Writes dates as ISO-8601 strings (not timestamps)
 */
public final class JsonUtils {

    private static final ObjectMapper MAPPER = createObjectMapper();

    private JsonUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    private static ObjectMapper createObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();

        // Time module for LocalDateTime, Instant, etc.
        mapper.registerModule(new JavaTimeModule());

        // Ignore unknown properties during deserialization
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Don't include null values in JSON
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // Write dates as ISO-8601 strings, not timestamps
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        return mapper;
    }

    /**
     * Serialize object to JSON string
     * @param object Object to serialize
     * @return JSON string or null if object is null
     */
    public static String toJson(Object object) {
        if (object == null) {
            return null;
        }
        try {
            return MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Failed to serialize object to JSON", e);
        }
    }

    /**
     * Deserialize JSON string to object
     * @param json JSON string
     * @param clazz Target class
     * @return Deserialized object or null if json is null
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        if (json == null || json.isBlank()) {
            return null;
        }
        try {
            return MAPPER.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Failed to deserialize JSON to " + clazz.getName(), e);
        }
    }

    /**
     * Get the configured ObjectMapper instance
     * @return Pre-configured ObjectMapper
     */
    public static ObjectMapper getMapper() {
        return MAPPER;
    }
}
