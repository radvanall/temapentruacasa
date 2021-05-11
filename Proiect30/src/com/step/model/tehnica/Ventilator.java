package com.step.model.tehnica;

public class Ventilator {

    private String stare="Off";



    private int rotatii=0;

    public String getStare() {
        return stare;
    }

    public void stareOn() {

        this.stare = "On";
    }
    public void stareOff() {

        this.stare = "Off";
    }
    public int getRotatii() {
        return rotatii;
    }
    public void setRotatii(int rotatii) {
        if(rotatii<0)
            this.rotatii =0;
        else if(rotatii>240)
            this.rotatii =240;
        else
        this.rotatii = rotatii;
    }

}
