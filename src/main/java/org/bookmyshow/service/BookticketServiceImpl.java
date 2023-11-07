package org.bookmyshow.service;

import org.bookmyshow.model.Bookticket;
import org.bookmyshow.repository.BookticketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookticketServiceImpl implements BookticketService {
	@Autowired
	public BookticketRepository bookticketRepository;

	public Bookticket addBookticket(Bookticket bookticket) {

		return bookticketRepository.saveAndFlush(bookticket);
	}

	@Override
	public int getId(int id) {

		return bookticketRepository.findById(id).getId();
	}

}
