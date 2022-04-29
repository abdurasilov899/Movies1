package com.company;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies,String actorname);

    void findMoviesByDirector(List<Movies> movies,String directername);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies, String rolname);

    void showActorRoles(List<Movies> movies);
}
