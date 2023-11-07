package org.bookmyshow.controller;

import org.bookmyshow.model.Theater;
import org.bookmyshow.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movieticketbooking/theater")
public class TheaterController {
	@Autowired
	public TheaterService theaterService;

	@PostMapping("/add")
	public Theater addTheater(@RequestBody Theater theater) {
		// System.out.println("Show time :::: " + theater.getShowTime());
		return theaterService.addTheater(theater);
	}

	@GetMapping("/name")
	public String getName(@RequestParam String name) {

		return theaterService.getName(name);

	}

}
