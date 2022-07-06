package com.example.task1.Location;

public class Position {
    private final double latitude;
    private final double longitude;

    public Position() {
        double minLat = -90.00;
        double maxLat = 90.00;
        this.latitude = minLat + (Math.random() * ((maxLat - minLat) + 1));
        double minLon = 0.00;
        double maxLon = 180.00;
        this.longitude = minLon + (Math.random() * ((maxLon - minLon) + 1));
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

