package com.step.model.tehnica;

public class Aragaz {

    private int nrOchi=4;


    private double temperaturaOchi1=0;
    private double temperaturaOchi2=0;
    private double temperaturaOchi3=0;
    private double temperaturaOchi4=0;

    public double getTemperaturaOchi4() {
        return temperaturaOchi4;
    }

    public void setTemperaturaOchi4(double temperaturaOchi4) {
        if(temperaturaOchi4>150)
            this.temperaturaOchi4 = 150;
        else if(temperaturaOchi4<0)
            this.temperaturaOchi4= 0;
        else
            this.temperaturaOchi4 = temperaturaOchi4;
    }




    public double getTemperaturaOchi3() {
        return temperaturaOchi3;
    }

    public void setTemperaturaOchi3(double temperaturaOchi3) {
        if(temperaturaOchi3>150)
            this.temperaturaOchi3 = 150;
        else if(temperaturaOchi3<0)
            this.temperaturaOchi3= 0;
        else
            this.temperaturaOchi3 = temperaturaOchi3;
    }



    public int getNrOchi() {
        return nrOchi;
    }

    public double getTemperaturaOchi1() {
        return temperaturaOchi1;
    }

    public void setTemperaturaOchi1(double temperaturaOchi1) {
       if(temperaturaOchi1>150)
           this.temperaturaOchi1 = 150;
       else if(temperaturaOchi1<0)
           this.temperaturaOchi1 = 0;
       else
           this.temperaturaOchi1 = temperaturaOchi1;
    }

    public double getTemperaturaOchi2() {
        return temperaturaOchi2;
    }

    public void setTemperaturaOchi2(double temperaturaOchi2) {
        if(temperaturaOchi2>150)
            this.temperaturaOchi2 = 150;
        else if(temperaturaOchi2<0)
            this.temperaturaOchi2= 0;
        else
            this.temperaturaOchi2 = temperaturaOchi2;
    }



}
