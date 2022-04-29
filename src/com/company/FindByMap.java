package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindByMap implements FindAble {
    @Override
    public void findMoviesByActor(List<Movies> movies, String actorname) {
        movies.stream().filter(movies1 -> movies1.getCast().stream().anyMatch(cast -> cast.getFullName()
                        .equalsIgnoreCase(actorname)))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies, String directname) {
        movies.stream().filter(movies1 ->
                movies1.getDirector().getFullName().equalsIgnoreCase(directname)).forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
        movies.stream().filter(x -> x.getYear() == (name)).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies, String rolename) {
        movies.stream().filter(movies1 ->
                        movies1.getCast().stream().anyMatch(cast ->
                                cast.getFullName().equalsIgnoreCase(rolename)))
                .forEach(System.out::println);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        List<Cast> allCast = new ArrayList<>();
        movies.forEach(movie -> allCast.addAll(movie.getCast()));
        allCast.stream().sorted(Comparator.comparing(Cast::getFullName)).forEach(System.out::println);
    }
}
