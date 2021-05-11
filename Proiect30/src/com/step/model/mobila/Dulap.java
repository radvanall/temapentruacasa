package com.step.model.mobila;

public class Dulap {

    private String sertar;
    private String usa;

    public void  deschideSertar(){
        sertar="deschis";
    }

    public void  inchideSertar(){
        sertar="inchis";
    }

    public void  deschideUsa(){
        usa="deschis";
    }

    public void  inchideUsa(){
        usa="inchis";
    }

    public String getSertar() {
        return sertar;
    }

    public void setSertar(String sertar) {
        this.sertar = sertar;
    }

    public String getUsa() {
        return usa;
    }

    public void setUsa(String usa) {
        this.usa = usa;
    }
}
