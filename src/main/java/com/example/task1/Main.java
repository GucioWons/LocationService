package com.example.task1;

import com.example.task1.Json.Json;
import com.example.task1.Location.Country;
import com.example.task1.Location.Location;
import com.example.task1.Location.Position;
import com.example.task1.Person.Person;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.Locale;
import java.util.Random;


public class Main {
    static String[] names = new String[] {"Mróz", "Pawlak", "Marciniak","Przybylski","Szewczyk","Tomaszewski","Brzeziński",
            "Krawczyk","Kowalczyk","Mazur","Stępień","Baran","Krajewska","Kołodziej","Sawicki","Błaszczyk","Marciniak",
            "Wasilewska","Bąk","Górski",};
    static Country[] countries= new Country[]{new Country("Poland", "PL", true),
            new Country("Spain", "ES", true),
            new Country("United States of America", "US", false)};
    static Random rand = new Random();
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            Person person = new Person("Position", names[rand.nextInt(20)]);
            int tmp = rand.nextInt(3);
            Location location = new Location(countries[tmp].getName(), new Position(), countries[tmp].isInEurope(), countries[tmp].getCode(), rand.nextBoolean());
            JsonNode node = Json.toJson(person);
            JsonNode node2 = Json.toJson(location);
            JsonNode nodefinal = Json.merge(node, node2);
            System.out.println(nodefinal);
        }
    }
}
