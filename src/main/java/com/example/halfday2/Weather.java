package com.example.halfday2;

import static jdk.internal.agent.Agent.getText;

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

        city = getText(welcomeText) ;
        return city;
    }
}
