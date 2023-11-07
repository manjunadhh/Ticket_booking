package org.bookmyshow.controller;

import org.bookmyshow.model.Movie;
import org.bookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movieticketbooking/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public Movie addNewMovie(@RequestBody Movie movie) {
        // System.out.println("Movie Name :::: " + movie.getMovieTitle());
        // System.out.println("movie ticket price :::: " + movie.getMovieticketPrice());
        // System.out.println("Movie duration :::: " + movie.getMovieduration());
        return movieService.addMovie(movie);
    }

    @GetMapping("/id")
    public int getId(@RequestParam Integer id) {
        return movieService.getId(id);
    }
}
