package com.example.task1.Person;

import com.example.task1.Location.Location;
import com.example.task1.Location.Position;
public class Person {
    private String _type;
    private int id;
    private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    public static int number;

    public Person(String _type, String name) {
        this._type = _type;
        this.id = number;
        this.key = null;
        this.name = name;
        this.iata_airport_code = null;
        number++;
    }

    public String getKey() {
        return key;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public String get_type() {
        return _type;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(Location location) {
        this.fullName = this.name + ", " + location.getCountry();
    }
}
