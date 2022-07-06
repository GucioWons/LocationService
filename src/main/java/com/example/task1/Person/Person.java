package com.example.task1.Person;

import com.example.task1.Location.Location;
import com.example.task1.Location.Position;
import com.fasterxml.jackson.annotation.JsonAutoDetect;


import java.util.Random;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Person extends Location {
    private  final String _type;
    private final int _id;
    private final String key;
    private final String name;
    private final String fullName;
    private final String iata_airport_code;
    private static int counter;

    public Person(String _type, String name, String country, Position geo_position, boolean inEurope, String countryCode, boolean coreCountry) {
        this._type = _type;
        this._id = counter++;
        this.key = null;
        this.name = name;
        this.iata_airport_code = null;
        this.type = "Location";
        this.country = country;
        this.fullName = this.name + ", " + this.country;
        this.geo_position = geo_position;
        Random rand = new Random();
        this.location_id = rand.nextInt(100000);
        this.inEurope = inEurope;
        this.countryCode = countryCode;
        this.coreCountry = coreCountry;
        this.distance = null;
    }
}
