package com.step.model.tehnica;

public class CuptorCuMicrounde {
    private int temperatura=0;
    private int timp=0;
    private String starea="Off";
    private String usa="Deschis";
    private String lumina="Off";

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }



    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }


    public String getStarea() {
        return starea;
    }

    public void cuptorOn(){
        this.starea="On";
    }
    public void cuptorOff(){
        this.starea="Off";
    }


    public String getLumina() {
        return lumina;
    }



    public String getUsa() {
        return usa;
    }


    public void luminaOn(){
        if(this.usa=="Deschis"&&this.starea=="On")
        {this.lumina="On";}
        else this.lumina="Off";
    }
    public void deschideUsa(){
        this.usa="Deschis";
    }
    public void inchideUsa(){
        this.usa="Inchis";
    }


}
