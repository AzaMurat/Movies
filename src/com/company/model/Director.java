package com.company.model;

public class Director {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public Director() {
        this.fullName = fullName;

    }

    @Override
    public String toString() {
        return "Директор" +"\n"+
                "Полное имя"+"|" + fullName + "\n"
                +"##########################"+"\n";
    }
}


