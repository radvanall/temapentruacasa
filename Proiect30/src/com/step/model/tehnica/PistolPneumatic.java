package com.step.model.tehnica;

public class PistolPneumatic {


    private double presiune=0;
    private int turatii=0;
    private double greutate=1.5;

    public int getTuratii() {
        return turatii;
    }

    public void setTuratii(int turatii) {
       if(turatii<0)
           this.turatii=0;
       else if(turatii>8500)
           this.turatii=8500;
       else
        this.turatii = turatii;
    }

    public double getPresiune() {
        return presiune;
    }

    public void setPresiune(double presiune) {
        if(presiune<0)
            this.presiune=0;
        else if(presiune>6.3)
            this.presiune=6.3;
        else

        this.presiune = presiune;
    }



    public double getGreutate() {
        return greutate;
    }

}
