package com.moviecatalogservice.ctrl;

import com.moviecatalogservice.models.CatalogItem;
import com.moviecatalogservice.models.Movie;
import com.moviecatalogservice.models.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId) {
        // get all movie rated ids
        UserRatings userRatings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRatings.class);

        // for each movieId call movie info service and get details
        return userRatings.getUserRatings().stream().map(rating -> {
            // makes a REST call to an URL and populate Movie object
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
            // put them all together
            return new CatalogItem(movie.getTitle(), movie.getDescription(), rating.getRating());
        }).collect(Collectors.toList());

    }
}
