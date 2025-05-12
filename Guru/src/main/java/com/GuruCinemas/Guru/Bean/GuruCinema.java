
package com.GuruCinemas.Guru.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class GuruCinema {

	    @Id
	    @GeneratedValue
	    private Long id;
	    
	    private String movieName;
	    private String language;
	    private Integer prize;
	    private Integer seats;
	    private String location;

	    // Default constructor
	    public GuruCinema() {
	    }

	    // Constructor with fields
	    public GuruCinema(String movieName, String language, Integer prize, Integer seats, String location) {
	        this.movieName = movieName;
	        this.language = language;
	        this.prize = prize;
	        this.seats = seats;
	        this.location = location;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getMovieName() {
	        return movieName;
	    }

	    public void setMovieName(String movieName) {
	        this.movieName = movieName;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public void setLanguage(String language) {
	        this.language = language;
	    }

	    public Integer getPrize() {
	        return prize;
	    }

	    public void setPrize(Integer prize) {
	        this.prize = prize;
	    }

	    public Integer getSeats() {
	        return seats;
	    }

	    public void setSeats(Integer seats) {
	        this.seats = seats;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    @Override
	    public String toString() {
	        return "GuruCinema{" +
	                "id=" + id +
	                ", movieName='" + movieName + '\'' +
	                ", language='" + language + '\'' +
	                ", prize=" + prize +
	                ", seats=" + seats +
	                ", location='" + location + '\'' +
	                '}';
	    }
	}


