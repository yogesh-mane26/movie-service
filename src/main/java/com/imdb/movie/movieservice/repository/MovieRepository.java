package com.imdb.movie.movieservice.repository;

import com.imdb.movie.movieservice.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {

}
