package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStore implements  SortAble {
    @Override
    public void printAllMovies(List<Movies> movies) {
        movies.forEach(System.out::println);
    }

    @Override
    public void findMovie(List<Movies> movies, String in) {
    movies.stream().map(Movies::getName).filter(x->x.contains(in)).forEach(System.out::println);
    }

    @Override
    public void sortByYear(List<Movies> movies) {
     movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
     movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Map<Director,List<Movies>> classificationListMap =
                movies.stream().collect(Collectors.groupingBy(Movies::getDirector));
        List<Director> directors = new ArrayList<>();
        directors.addAll(classificationListMap.keySet());
        directors.stream().sorted(Comparator.comparing(Director::getFullName)).forEach(System.out::println);
    }
}
