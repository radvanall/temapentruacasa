package com.step.model.tehnica;

public class Cazan {


    private String stare="Off";
    private int temperatura=0;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura<0)
            this.temperatura = 0;
        else if(temperatura>100)
            this.temperatura = 100;
        else
        this.temperatura = temperatura;
    }

    public String getStare() {
        return stare;
    }
    public void stareOff(){
        this.stare="Off";
    }
    public void stareIarna(){
        this.stare="Iarna";
    }
    public void stareVara(){
        this.stare="Vara";
    }



}
