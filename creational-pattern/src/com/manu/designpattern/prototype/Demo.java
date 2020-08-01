package com.manu.designpattern.prototype;

public class Demo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational patterns");
        movie.setPrice(500D);
        printDetails(movie);
        Movie movie1 = (Movie) registry.createItem("Movie");
        movie1.setTitle("Another movie");

        printDetails(movie1);
    }

    private static void printDetails(Movie item) {
        System.out.println(item.getTitle());
        System.out.println(item.getRunTime());
        System.out.println(item.getPrice());
        System.out.println(item.getUrl());
        System.out.println(item);
    }
}
