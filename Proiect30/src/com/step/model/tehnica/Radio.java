package com.step.model.tehnica;

public class Radio {
    private String stare="Off";
    private int post=0;
    private int volum=0;

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }



    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }



    public String getStare() {
        return stare;
    }
    public void radioOff(){
        this.stare="Off";

    }
    public void radioOn(){
        this.stare="On";
    }
}
