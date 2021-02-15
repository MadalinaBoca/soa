package com.ratingsdataservice.ctrl;

import com.ratingsdataservice.models.Rating;
import com.ratingsdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
    HashMap<String, UserRatings> usersRatings = new HashMap<>() {{
        put("user1", getUser1UsersRatings());
        put("admin", getAdminUsersRatings());
    }};

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 10);
    }

    @RequestMapping("/users/{userId}")
    public UserRatings getUserRating(@PathVariable("userId") String userId) {
        return usersRatings.get(userId);
    }

    private UserRatings getUser1UsersRatings() {
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(
                asList(new Rating("500", 10),
                        new Rating("200", 8),
                        new Rating("201", 10)));
        return userRatings;
    }

    private UserRatings getAdminUsersRatings() {
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(asList(new Rating("100", 10), new Rating("101", 5)));
        return userRatings;
    }
}
