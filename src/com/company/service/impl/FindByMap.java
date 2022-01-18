package com.company.service.impl;

import com.company.dataBase.JsonIO;
import com.company.model.Cast;
import com.company.model.Movies;
import com.company.service.FindAble;

import java.util.List;
import java.util.function.BiPredicate;

public class FindByMap implements FindAble {
    @Override
    public void findMoviesByActor(List<Movies> movies,String actorName) {
        movies.stream().filter(film -> anonimObject1.test(actorName, film.getCast()))
                .forEach(movies1 -> System.out.println( movies1.getName()));

    }

    private static final BiPredicate<String, List<Cast>> anonimObject1 = (name, castsCasts) -> {
        List<Cast> collect = castsCasts.stream().filter(cast -> cast.getFullName().contains(name)).toList();
        return collect.size() > 0;
    };

    @Override
    public void findMoviesByDirector(List<Movies> movies,String directorName) {
        movies.stream().filter(movies1 -> movies1.getDirector().getFullName().equals(directorName))
                .forEach(film -> System.out.println(film.getName()));
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int year) {
        movies.stream().filter(movies1 -> movies1.getYear() == year)
                .forEach(movies1 -> System.out.println( movies1.getName()));
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies,String rolActor) {
        movies.stream().filter(kino -> anonimoject2.test(rolActor, kino.getCast()))
                .forEach(film1 -> System.out.println(film1.getName()));
    }
    private static final BiPredicate<String, List<Cast>> anonimoject2 = (name, casts) -> {
        List<Cast> castList = casts.stream().filter(cast -> cast.getFullName().contains(name)).toList();
        return castList.size() > 0;
    };

    @Override
    public void showActorRoles(List<Movies> movies) {
        movies.forEach(Movies::printCast);
    }
}
