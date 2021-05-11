package com.step.model.accesorii;

public class Scara {


    private int latime=50;
    private int inaltime=107;
    private int nrPasi=6;

    public int getNrPasi() {
        return nrPasi;
    }
    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
       if(inaltime<107)
           this.inaltime = 107;
       else if(inaltime>313)
           this.inaltime = 313;
       else
        this.inaltime = inaltime;
    }
}
