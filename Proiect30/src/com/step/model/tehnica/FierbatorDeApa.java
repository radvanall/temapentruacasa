package com.step.model.tehnica;

public class FierbatorDeApa {
    private String putere="2200 W";
    private String stare="Off";

    public String getStare() {
        return stare;
    }

    public void stareOn() {

        this.stare = "On";
    }
    public void stareOff() {

        this.stare = "Off";
    }

    public String getPutere() {
        return putere;
    }



}
