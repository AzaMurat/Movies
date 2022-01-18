package com.company.model;

import com.company.model.Cast;
import com.company.model.Director;
import com.company.service.SortAble;

import java.util.List;
import java.util.stream.Stream;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public void printCast() {
        int counter = 1;
        for (Cast s : cast) {
            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;
        }
    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Названия:"+"|" + name + " \n " +
                "Год:"+"|" + year + "\n" +
                "Описание:"+"|" + description +"\n"+
                "Директор:"+"|" + director + "\n" +
                "В ролях:"+"|" + cast + "\n"
                +"---------------------------"+"\n";
    }
}
