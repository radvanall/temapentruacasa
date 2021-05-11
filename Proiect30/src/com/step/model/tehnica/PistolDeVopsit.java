package com.step.model.tehnica;

public class PistolDeVopsit {


    private int consumDeEnergie=400;
    private int capacitatreaRezervorului=900;
    private double greutateaProdusului=1.5;
    private String starea="Off";

    public String getStarea() {
        return starea;
    }
    public void stareOn() {

        this.starea= "On";
    }
    public void stareOff() {

        this.starea = "Off";
    }
    public int getCapacitatreaRezervorului() {
        return capacitatreaRezervorului;
    }
    public int getConsumDeEnergie() {
        return consumDeEnergie;
    }
    public double getGreutateaProdusului() {
        return greutateaProdusului;
    }
}
