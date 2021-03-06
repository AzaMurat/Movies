package com.company.service;

import com.company.model.Movies;
import com.company.model.Director;

import java.util.List;

public interface SortAble {

    void printAllMovies(List<Movies> movies);

    void findMovie(List<Movies> movies,String findMovie);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}
