package com.step.model.tehnica;

public class Aspirator {

    private String culoare;
    private int putere;
    private String stare="Off";
    private String cosGunoi="Empty";

    public void setCosGunoi(int masa) {
        if(masa<200)
          this.cosGunoi = "Empty";
        else if(masa>200 &&masa<700)
            this.cosGunoi = "Medium";
        else  this.cosGunoi = "Full";
    }



    public String getCosGunoi() {
        return cosGunoi;
    }



    public String getStare() {
        return stare;
    }
    public void stareOff(){
        this.stare="Off";
    }

    public void stareOn(){
        this.stare="On";
    }


    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if(putere>1200)
            this.putere=1200;
        else
        this.putere = putere;
    }
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

}
