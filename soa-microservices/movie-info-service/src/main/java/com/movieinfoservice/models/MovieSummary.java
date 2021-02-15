package com.movieinfoservice.models;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MovieSummary {

    private String id;
    private String title;
    private String overview;
}