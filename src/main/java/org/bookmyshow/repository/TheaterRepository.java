package org.bookmyshow.repository;

import org.bookmyshow.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, String> {
	public Theater findByName(String name);

}
