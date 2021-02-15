package com.movieinfoservice.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    String id;
    String title;
    String description;
}
