package com.imdb.movie.movieservice.controller;

import com.imdb.movie.movieservice.model.Movie;
import com.imdb.movie.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/movie")
    public List<Movie> getMovieList() {
      return  movieService.getAllMovie();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/movie/{id}")
    public Movie getMovieById(@PathVariable("id") Long id){
        return movieService.getMovieById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movie")
    public void addMovie(@RequestBody Movie movie){
         movieService.addMovie(movie);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/movie")
    public void updateMovie(@RequestBody Movie movie){
         movieService.updateMovie(movie);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/movie/{id}")
    public void deleteMovie(@PathVariable("id") Long id) {
        movieService.deleteMovie(id);
    }
}