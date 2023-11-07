package org.bookmyshow.controller;

import org.bookmyshow.model.Bookticket;
import org.bookmyshow.service.BookticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movieticketbooking/booktickets")
public class BookticketController {

	@Autowired
	public BookticketService bookticketService;

	@PostMapping("/add")
	public Bookticket addTicket(@RequestBody Bookticket bookticket) {
		// System.out.println("theater name :::: " + bookticket.getTheaterName());
		// System.out.println("show time :::: " + bookticket.getShowTime());
		// System.out.println("movie title :::: " + bookticket.getMovieTitle());
		return bookticketService.addBookticket(bookticket);
	}

	@GetMapping("/id")
	public int getId(@RequestParam int id) {
		return bookticketService.getId(id);
	}

}
