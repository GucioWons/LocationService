package com.example.task1.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Json {
    private static final ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper(){
        return new ObjectMapper();
    }
    public static JsonNode toJson(Object a){
        return objectMapper.valueToTree(a);
    }
}
