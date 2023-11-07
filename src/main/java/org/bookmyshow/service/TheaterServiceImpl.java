package org.bookmyshow.service;

import org.bookmyshow.model.Theater;
import org.bookmyshow.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterServiceImpl implements TheaterService {
	@Autowired
	public TheaterRepository theaterRepository;

	@Override
	public Theater addTheater(Theater theater) {

		return theaterRepository.saveAndFlush(theater);
	}

	@Override
	public String getName(String name) {

		return theaterRepository.findByName(name).getName();
	}

}
