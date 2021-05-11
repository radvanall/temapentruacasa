package com.step.model.tehnica;

public class Hota {

    private String lumina="Off";
    private int putere=0;



    public String getLumina() {
        return lumina;
    }
    public void luminaOn()
    {
        this.lumina="On";
    }
    public void luminaOff()
    {
        this.lumina="Off";
    }


    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if(putere<0)
            this.putere =0;
        else if(putere>6)
            this.putere =6;
        else
        this.putere = putere;
    }


}
