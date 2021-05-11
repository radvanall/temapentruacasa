package com.step.model.tehnica;

public class Mixer {


    private String stare="Off";
    private int viteza=0;

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
       if(viteza<0)
           this.viteza =0;
       else if(viteza>6)
           this.viteza = 6;
       else
        this.viteza = viteza;
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
