package com.example.task1.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class Json {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public JsonNode toJson(Object a){
        return objectMapper.valueToTree(a);
    }
}
