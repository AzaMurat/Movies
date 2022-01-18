package com.company.service.impl;

import com.company.dataBase.JsonIO;
import com.company.model.Movies;
import com.company.service.SortAble;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;

public class MovieStore implements SortAble {

    @Override
    public void printAllMovies(List<Movies> movies) {
        JsonIO.getMovies().forEach(System.out::println);

    }

    @Override
    public void findMovie(List<Movies> movies,String findMovie) {
         JsonIO.getMovies().stream().filter(movies1 -> movies1.getName()
                 .startsWith(findMovie)).forEach((movies1)-> {
            System.out.println(movies1.getName());
        });
    }

    @Override
    public void sortByYear(List<Movies> movies) {
       movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach((year)->{
           PrintStream var10000 = System.out;
           String var10001 = year.getName();
           var10000.println(var10001+year.getYear());
       });
    }

    @Override
    public void sortByName(List<Movies> movies) {
       movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach((movies1) -> {
           System.out.println(movies1.getName());
       });
    }


    @Override
    public void sortByDirector(List<Movies> movies) {
      movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach((movies1) -> {
          System.out.println(movies1.getDirector());
      });
    }
}
