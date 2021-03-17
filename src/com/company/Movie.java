package com.company;

// Feature: Abstract class
public abstract class Movie {

    public String title;
    public String director;
    public String release;
    public String runTime;
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}


