package com.moviecatalogservice.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRatings {
    private List<Rating> userRatings;
}
