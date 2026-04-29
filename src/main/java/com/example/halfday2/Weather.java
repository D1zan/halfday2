package com.example.halfday2;

public class Weather {
    private int temperature;

    private String city;

    public Weather( int temperature, String city) {
        this.temperature = temperature;
        this.city = city;
    }
    private int getTemperature() {
        return temperature;
    }

    private String getCity() {
        return city;
    }
}
