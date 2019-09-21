package com.imdb.movie.movieservice.controller;

import com.imdb.movie.movieservice.model.Movie;
import com.imdb.movie.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movie")
    public List<Movie> getMovieList() {
      return  movieService.getAllMovie();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/movie/{id}")
    public Movie getMovieById(@PathVariable("id") String  id){
        return movieService.getMovieById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movie")
    public void addMovie(@RequestBody Movie movie){
         movieService.addMovie(movie);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/movie/{id}")
    public void updateMovie(@RequestBody Movie movie, @PathVariable("id") String id){
         movieService.updateMovie(movie,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/movie/{id}")
    public void deleteMovie(@PathVariable("id") String id) {
        movieService.deleteMovie(id);
    }
}