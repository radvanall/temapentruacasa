package com.step.model.tehnica;

public class MasinaDeGaurit {
    private int nrDeBaterii=2;
    private double tensiuneaBateriei=10.8;
    private int viteza=0;

    public double getTensiuneaBateriei() {
        return tensiuneaBateriei;
    }
    public int getNrDeBaterii() {
        return nrDeBaterii;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
       if(viteza<0)
         this.viteza=0;
       else if( viteza>4)
           this.viteza=4;
       else
        this.viteza = viteza;
    }




}
