package com.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String movieId;
    private Integer rating;

}
