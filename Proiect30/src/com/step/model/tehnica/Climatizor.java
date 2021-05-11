package com.step.model.tehnica;

public class Climatizor {


    private  String stare="Off";
    private int temperatura=0;
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura<10)
            this.temperatura =10;
        else if(temperatura>35)
            this.temperatura = 35;
        else
            this.temperatura = temperatura;
    }



    public String getStare() {
        return stare;
    }

    public void stareVara() {
        this.stare ="Vara";
    }

    public void stareIarna() {
        this.stare ="Iarna";
    }

}
