package com.step.model.tehnica;

public class FierDeCalcat {


    private String stare="Off";
    private int temperatura=0;
    private String  aburi="Off";

    public void aburiOn() {

        this.aburi = "On";
    }
    public void aburiOff() {

        this.aburi = "Off";
    }


    public String getAburi() {
        return aburi;
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
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura){
        if(temperatura<0)
            this.temperatura=0;
        else if(temperatura>100)
            this.temperatura=100;
        else this.temperatura=temperatura;
    }

}
