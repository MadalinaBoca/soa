package com.ratingsdataservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRatings {
    private List<Rating> userRatings;
}
