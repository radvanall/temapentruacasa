package com.step.model.tehnica;

public class Arzator {
    private String putere="1900 W";
    private int temperatura=0;

    public String getPutere() {
        return putere;
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
       if(temperatura<0)
           this.temperatura =0;
       else if(temperatura>1900)
           this.temperatura =1900;
       else
        this.temperatura = temperatura;
    }


}
