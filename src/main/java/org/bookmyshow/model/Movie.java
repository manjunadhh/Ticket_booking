package org.bookmyshow.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Table(name = "movie")
@Entity
public class Movie {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "movie_title")
	private String movieTitle;

	@Column(name = "movie_duration")
	private int movieDuration;

	@Column(name = "movie_ticket_price")
	private double movieTicketPrice;

	@CreationTimestamp
	@Column(name = "last_modified")
	private Timestamp lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	public void setMovieduration(int movieDuration) {
		this.movieDuration = movieDuration;
	}

	public int getMovieduration() {
		return this.movieDuration;
	}

	public void setMovieticketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}

	public double getMovieticketPrice() {
		return this.movieTicketPrice;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public Movie orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
