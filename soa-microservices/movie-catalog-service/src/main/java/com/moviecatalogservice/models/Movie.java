package com.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    String movieId;
    String title;
    String description;
}
