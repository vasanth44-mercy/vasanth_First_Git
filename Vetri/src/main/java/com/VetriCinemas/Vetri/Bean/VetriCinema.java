package com.VetriCinemas.Vetri.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class VetriCinema {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String movieName ;
	private String language ;
	private Integer prize;
	private Integer seats ;
	private String location ;
	
	public VetriCinema() {
	}

	public VetriCinema(Long id, String movieName, String language, Integer prize, Integer seats, String location) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.language = language;
		this.prize = prize;
		this.seats = seats;
		this.location = location;
	}

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

	public String toString() {
        return "Vetri{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", language='" + language + '\'' +
                ", prize=" + prize +
                ", seats=" + seats +
                ", location='" + location + '\'' +
                '}';
    }
	
	

}
