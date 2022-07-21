package com.example.task1.Person;

import com.example.task1.Json.Json;
import com.example.task1.Location.Country;
import com.example.task1.Location.Position;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {

    static String[] names = new String[] {"Mróz", "Pawlak", "Marciniak","Przybylski","Szewczyk","Tomaszewski","Brzeziński",
            "Krawczyk","Kowalczyk","Mazur","Stępień","Baran","Krajewska","Kołodziej","Sawicki","Błaszczyk","Marciniak",
            "Wasilewska","Bąk","Górski",};
    static Country[] countries= new Country[]{new Country("Poland", "PL", true),
            new Country("Spain", "ES", true),
            new Country("United States of America", "US", false)};
    static Random rand = new Random();

    public JsonNode personToJson(int quantity){
        Json json = new Json();
        JsonNode[] jsons = new JsonNode[quantity];
        for(int i = 0; i<quantity; i++) {
            int randomCountryNumber = rand.nextInt(3);
            Person person = new Person("Position", names[rand.nextInt(20)], countries[randomCountryNumber].getName(),
                    new Position(), countries[randomCountryNumber].isInEurope(), countries[randomCountryNumber].getCode(), rand.nextBoolean());
            JsonNode personNode = json.toJson(person);
            jsons[i] = personNode;
        }
        return json.toJson(jsons);
    }
}
