package com.step.model.tehnica;

public class MasinaDeSpalat {


    private String stare="Off";
    private int rotatiiPeMinut=0;
    private String regim="Obisnuit";


    public String getRegim() {
        return regim;
    }
    public void setObisnuit(){
        this.regim="Obisnuit";
    }
    public void setZiDeZi(){
        this.regim="ZiDeZi";
    }
    public void setAtent(){
        this.regim="Atent";
    }
    public void setBunbac(){
        this.regim="Bumbac";
    }
    public void setRapid(){
        this.regim="Rapid";
    }

    public String getStare() {
        return stare;
    }
    public void stareOn(){
        this.stare="On";
    }
    public void stareOff(){
        this.stare="Off";
    }

    public int getRotatiiPeMinut() {
        return rotatiiPeMinut;
    }

    public void setRotatiiPeMinut(int rotatiiPeMinut) {
        if(rotatiiPeMinut<100)
            this.rotatiiPeMinut =100;
        else if(rotatiiPeMinut>700)
            this.rotatiiPeMinut =700;
        else
        this.rotatiiPeMinut = rotatiiPeMinut;
    }




}
