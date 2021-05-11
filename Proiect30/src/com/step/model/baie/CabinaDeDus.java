package com.step.model.baie;

public class CabinaDeDus {

    private String stare="Off";
    private String temperaturaApa="Rece";

    public String getStare() {
        return stare;
    }

    public void stareRobinet() {
        this.stare = "Robinet";
    }
    public void stareSifon() {
        this.stare = "Sifon";
    }




    public String getTemperaturaApa() {
        return temperaturaApa;
    }

    public void temperaturaApaRece() {
        this.temperaturaApa = "Rece";
    }
    public void temperaturaApaCalda() {
        this.temperaturaApa = "Calda";
    }




}
