package com.imdb.movie.movieservice.service;

import com.imdb.movie.movieservice.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<Movie> getAllMovie();

    Movie getMovieById(Long id);

    public void addMovie(Movie movie);

    public void updateMovie(Movie movie);

    public void deleteMovie(Long id);
}
