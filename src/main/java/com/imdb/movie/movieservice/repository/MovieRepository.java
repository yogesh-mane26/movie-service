package com.imdb.movie.movieservice.repository;

import com.imdb.movie.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    Movie findByMid(Long id);
}
