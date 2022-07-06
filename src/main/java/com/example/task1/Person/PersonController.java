package com.example.task1.Person;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import static com.example.task1.Person.PersonService.PersonToJson;

@RestController
@RequestMapping("/generate")
public class PersonController {

    @GetMapping("/json/{quantity}")
    public static JsonNode PersonJsonEndpoint(@PathVariable int quantity) {return PersonToJson(quantity);
    }
}
