package com.zqnt.utils.core;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

public class ProtoJsonUtils {

    public static String toJson(Message message) {
        try {
            return JsonFormat.printer().print(message);
        } catch (Exception e) {
            throw new RuntimeException("Error on parsing message to json", e);
        }
    }


    public static <T extends Message.Builder> Message fromJson(String json, T builder) {
        try {
            JsonFormat.parser().ignoringUnknownFields()
            .merge(json, builder);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException("Error parsing Json to Message", e);
        }
        return builder.build();
    }
}
