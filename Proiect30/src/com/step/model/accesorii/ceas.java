package com.step.model.accesorii;

public class ceas {


    private String tip;
    private int ora;
    private int minute;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
       if(ora<0)
           this.ora=0;
       else if(ora>59)
           this.ora=59;
       else
        this.ora = ora;
    }
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<0)
            this.minute=0;
        else if(minute>59)
            this.minute=59;
        else
        this.minute = minute;
    }
}
