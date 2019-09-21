package com.imdb.movie.movieservice.service;

import com.imdb.movie.movieservice.model.Movie;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies= new ArrayList<>(Arrays.asList(
            new Movie("101", "Fun Movie", "Fun Movie Descriptions","Yogesh"),
            new Movie("102","Func","Descriptions","Yogesh Mane")));

    public List<Movie> getAllMovie() {
        return movies;
    }

    public Movie getMovieById(String id) {
        return movies.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void updateMovie(Movie movie, String id) {
        for (int i = 0; i < movies.size(); i++) {
            Movie t = movies.get(i);
            if (t.getId().equals(id)) {
                movies.set(i, movie);
            }
        }
    }

    public void deleteMovie(String id) {
        movies.removeIf(t->t.getId().equals(id));
    }
}
