package com.step.model.tehnica;

public class Frigider {
    private String inaltime;
    private String culoare;
    private double temperatura=0;
    private String lumina="Off";
    private String usa="Inchis";
    public String getUsa() {
        return usa;
    }

    public void setUsa(String usa) {
        this.usa = usa;
    }

    private void setLumina(){
        if(this.usa=="Inchis"){
            this.lumina="Off";
        }
        else if(this.usa=="Deschis")
        {
            this.lumina="On";
        }


    }


    public String getLumina() {
        return lumina;
    }


    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    public String getInaltime() {
        return inaltime;
    }

    public void setInaltime(String inaltime) {
        this.inaltime = inaltime;
    }


    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }




}
