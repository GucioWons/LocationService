package com.example.task1.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Json {
    private final ObjectMapper objectMapper = getDefaultObjectMapper();

    private ObjectMapper getDefaultObjectMapper(){
        return new ObjectMapper();
    }
    public JsonNode toJson(Object a){
        return objectMapper.valueToTree(a);
    }
}
