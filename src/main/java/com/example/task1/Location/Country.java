package com.example.task1.Location;

public class Country {
    protected String name;
    protected String code;
    protected boolean inEurope;

    public Country(String name, String code, boolean inEurope) {
        this.name = name;
        this.code = code;
        this.inEurope = inEurope;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean isInEurope() {
        return inEurope;
    }
}
