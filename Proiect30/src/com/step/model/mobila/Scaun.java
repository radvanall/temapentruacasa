package com.step.model.mobila;

public class Scaun {
    private String culoare;
    private int inaltime=50;
    private int rotatieGrade =0;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        if (inaltime < 50)
            this.inaltime = 50;
        else if (inaltime > 100)
            this.inaltime = 100;
        else
            this.inaltime = inaltime;
    }

       public int getRotatieGrade() {
            return rotatieGrade;
        }

        public void setRotatieGrade(int rotatieGrade) {
            if(rotatieGrade<0)
                this.rotatieGrade =0;
            else if(rotatieGrade>360)
                this.rotatieGrade =360;
            else
                this.rotatieGrade = rotatieGrade;
        }
    }




