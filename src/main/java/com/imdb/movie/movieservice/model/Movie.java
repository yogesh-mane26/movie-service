package com.imdb.movie.movieservice.model;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "mId")
    private Long id;

    @Column(name = "title")
    private String name;

    @Column(name = "year")
    private String releaseData;

    private String director;

}
