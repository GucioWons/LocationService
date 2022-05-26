package com.example.task1.Person;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

import static com.example.task1.Person.PersonService.JsonObject;

@RestController
@RequestMapping("/generate")
public class PersonController {

    @GetMapping("/json/{x}")
    public static JsonNode ObjectJson(@PathVariable int x) {return JsonObject(x);
    }
}
