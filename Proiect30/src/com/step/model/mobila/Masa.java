package com.step.model.mobila;

public class Masa {


    private String culoare;



    private int lungime=70;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        if(lungime<70)
            this.lungime=70;
        else if(lungime>246)
            this.lungime=246;
        else
        this.lungime = lungime;
    }


}

