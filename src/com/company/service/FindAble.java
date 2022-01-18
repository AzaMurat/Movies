package com.company.service;

import com.company.model.Movies;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies,String actorName);

    void findMoviesByDirector(List<Movies> movies,String directorName);

    void findMoviesByYear(List<Movies> movies, int year);

    void findMoviesAndRoleByActor(List<Movies> movies,String rolActor);

    void showActorRoles(List<Movies> movies);
}
