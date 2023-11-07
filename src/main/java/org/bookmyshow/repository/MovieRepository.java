package org.bookmyshow.repository;

import org.bookmyshow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // You don't need to declare the 'findById' method here as it is already provided by JpaRepository.
}
