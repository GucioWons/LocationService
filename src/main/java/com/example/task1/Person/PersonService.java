package com.example.task1.Person;

import com.example.task1.Json.Json;
import com.example.task1.Location.Country;
import com.example.task1.Location.Position;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {
    private Json json;

    private String[] names = new String[] {"Mróz", "Pawlak", "Marciniak","Przybylski","Szewczyk","Tomaszewski","Brzeziński",
            "Krawczyk","Kowalczyk","Mazur","Stępień","Baran","Krajewska","Kołodziej","Sawicki","Błaszczyk","Marciniak",
            "Wasilewska","Bąk","Górski",};
    private Country[] countries= new Country[]{new Country("Poland", "PL", true),
            new Country("Spain", "ES", true),
            new Country("United States of America", "US", false)};
    private Random rand = new Random();

    public PersonService(Json json) {
        this.json = json;
    }

    public JsonNode personToJson(int quantity){
        JsonNode[] jsons = new JsonNode[quantity];
        for(int i = 0; i<quantity; i++) {
            jsons[i] = generatePerson();
        }
        return json.toJson(jsons);
    }

    private JsonNode generatePerson(){
        int randomCountryNumber = rand.nextInt(3);
        Person person = new Person("Position",
                names[rand.nextInt(20)], countries[randomCountryNumber].getName(),
                new Position(), countries[randomCountryNumber].isInEurope(),
                countries[randomCountryNumber].getCode(), rand.nextBoolean());
        JsonNode personNode = json.toJson(person);
        return personNode;
    }
}
