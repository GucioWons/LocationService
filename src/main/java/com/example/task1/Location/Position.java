package com.example.task1.Location;

public class Position {
    private double latitude;
    private double longitude;

    public Position() {
        double minLat = -90.00;
        double maxLat = 90.00;
        double latitude = minLat + (double)(Math.random() * ((maxLat - minLat) + 1));
        this.latitude = latitude;
        double minLon = 0.00;
        double maxLon = 180.00;
        double longitude = minLon + (double)(Math.random() * ((maxLon - minLon) + 1));
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

