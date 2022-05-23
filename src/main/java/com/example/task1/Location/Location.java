package com.example.task1.Location;

public class Location {
    private String type;
    private String country;
    private Position geo_position;
    private int location_id;
    private boolean inEurope;
    private String countryCode;
    private boolean coreCountry;
    private String distance;

    public Location(String country, Position geo_position, boolean inEurope, String countryCode, boolean coreCountry) {
        this.type = "Location";
        this.country = country;
        this.geo_position = geo_position;
        this.location_id = 50;
        this.inEurope = inEurope;
        this.countryCode = countryCode;
        this.coreCountry = coreCountry;
        this.distance = null;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public Position getGeo_position() {
        return geo_position;
    }

    public int getLocation_id() {
        return location_id;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public String getDistance() {
        return distance;
    }
}
