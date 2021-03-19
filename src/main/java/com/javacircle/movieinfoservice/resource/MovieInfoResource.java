package com.javacircle.movieinfoservice.resource;

import com.javacircle.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moviesInfo")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId") String movieId){
        return new Movie("YFRT", "terminitor");
    }
}
