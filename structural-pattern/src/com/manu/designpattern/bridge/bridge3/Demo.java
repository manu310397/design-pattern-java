package com.manu.designpattern.bridge.bridge3;

public class Demo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("Sky scrapper");
        movie.setYear("2019");
        movie.setRuntime("2h");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String details = moviePrinter.print(printFormatter);

        System.out.println(details);

        Formatter htmlFormatter = new HtmlFormatter();

        String html = moviePrinter.print(htmlFormatter);

        System.out.println(html);
    }
}
