package com.imdb.movie.movieservice.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {
    private String id;
    private String name;
    private String description;
    private String director;

}
