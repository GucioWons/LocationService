package com.example.task1.Person;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generate")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/json/{quantity}")
    public JsonNode personJsonEndpoint(@PathVariable int quantity) {
        return personService.personToJson(quantity);
    }
}
