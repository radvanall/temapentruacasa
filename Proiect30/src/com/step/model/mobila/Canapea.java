package com.step.model.mobila;

public class Canapea {


    private String culoare;
    private int inaltime;
    private int lungime;
    private String stare="strins";

    public String getStare() {
        return stare;
    }
    public void changeStarea() {
        if (this.stare == "strins")
        {
            this.stare="extins";
        }
        else this.stare="strins";
    }


    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        if( lungime<150)
            this.lungime =150;
        else if( lungime>200)
            this.lungime =200;
        else
            this.lungime =  lungime;
    }



    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
       if(inaltime<50)
           this.inaltime =50;
       else if(inaltime>150)
           this.inaltime =150;
       else
        this.inaltime = inaltime;
    }


    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
