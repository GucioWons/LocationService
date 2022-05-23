package com.example.task1.Person;

import com.example.task1.Json.Json;
import com.example.task1.Location.Country;
import com.example.task1.Location.Location;
import com.example.task1.Location.Position;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.example.task1.Person.PersonService;

import static com.example.task1.Person.PersonService.JsonObject;

@RestController
@RequestMapping("/generate")
public class PersonController {

    @GetMapping("/json/{x}")
    public static JsonNode[] ObjectJson(@PathVariable int x) {
        return JsonObject(x);
    }
}
