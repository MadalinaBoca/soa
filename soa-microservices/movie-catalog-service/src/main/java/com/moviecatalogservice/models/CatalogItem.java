package com.moviecatalogservice.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CatalogItem {
    private String movieTitle;
    private String movieDesc;
    private Integer rating;

}
