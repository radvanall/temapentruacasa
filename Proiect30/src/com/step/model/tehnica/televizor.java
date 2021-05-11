package com.step.model.tehnica;

public class televizor {
    private String diagonala;
    private String rezolutie;
    private String stare="Off";
    private int postTV=1;

    public String getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(String diagonala) {
        this.diagonala = diagonala;
    }


    public String getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void tvOn(){
        stare="On";
    }
    public void tvOff(){
        stare="Off";
    }
    public void changePost(int postTV)
    {
        this.postTV=postTV;
    }


}

