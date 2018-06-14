package com.company;

import java.util.ArrayList;

public class MovieList {
    ArrayList<Movie> movie;

    public MovieList() {

        movie = new ArrayList<Movie>();
    }

    public void add(Movie m) {


        this.movie.add(m);


    }


    public String print() {
        String print = "";
        for (Movie mo : movie) {


            print += ("Movie Name: "+mo.getMovieName() + "||  Movie year:  " + mo.getMovieYear() + "\n");

        }
        return print;
    }
}
