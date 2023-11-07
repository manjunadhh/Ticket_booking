package org.bookmyshow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.bookmyshow.model.Bookticket;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookticketAspect {
	@Before("execution(* org.bookmyshow.service.BookticketService.addBookticket(org.bookmyshow.model.Bookticket)) && args(bookticket)")
	public void beforeAddBookticket(Bookticket bookticket) {
		System.out.println("Movie Title : " + bookticket.getMovieTitle());
		System.out.println("ShowTime : " + bookticket.getShowTime());
		System.out.println("LocalDate : " + bookticket.getLocaldate());
		System.out.println("Number of Seats : " + bookticket.getNumOfSeats());
		System.out.println("Theater Name : " + bookticket.getTheaterName());

	}

}
