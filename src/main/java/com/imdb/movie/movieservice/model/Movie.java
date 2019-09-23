package com.imdb.movie.movieservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name = "mID")
    private Long mid;

    @Column(name = "title")
    private String name;

    @Column(name = "year")
    private String releaseData;

    private String director;

}
