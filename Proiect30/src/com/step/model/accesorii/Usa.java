package com.step.model.accesorii;

public class Usa {

    private String culoare;
    private String stare="Inchis";
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public String getStare() {
        return stare;
    }
    public void deschideUsa(){
        this.stare="Deschis";
    }

    public void inchideUsa(){
        this.stare="Inchis";
    }



}
