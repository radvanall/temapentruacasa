package com.step.model.accesorii;

public class Lanterna {
    private int nrLeduri;
    private String stare="Off";

    public int getNrLeduri() {

        return nrLeduri;
    }

    public void setNrLeduri(int nrLeduri) {
        this.nrLeduri = nrLeduri;
        }
        public String getStare() {
            return stare;
    }

    public void stareOn() {

        this.stare = "On";
    }
    public void stareOff() {

        this.stare = "Off";
    }



}
