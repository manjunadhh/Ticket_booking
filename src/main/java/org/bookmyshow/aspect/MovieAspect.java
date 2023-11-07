package org.bookmyshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Movie;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MovieAspect {
	@Before("execution(* org.bookmyshow.service.MovieService.addMovie(org.bookmyshow.model.Movie)) && args(movie)")
	public void beforeAddMovie(Movie movie) {
		System.out.println("Movie Name : " + movie.getMovieTitle());
		System.out.println("Duration : " + movie.getMovieduration());
		System.out.println("Movie Ticket Price : " + movie.getMovieticketPrice());

	}

}
