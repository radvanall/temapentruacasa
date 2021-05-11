package com.step.model.accesorii;

public class Lumina {

    private String tip;
    private String stare="Off";

    public String getStare() {
        return stare;
    }
    public void stareOff(){
        this.stare="Off";
    }

    public void  stareOn(){
        this.stare="On";
    }


    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

}
