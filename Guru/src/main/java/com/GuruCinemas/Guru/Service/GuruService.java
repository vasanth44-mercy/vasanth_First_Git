package com.GuruCinemas.Guru.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GuruCinemas.Guru.Bean.GuruCinema;
import com.GuruCinemas.Guru.Repository.GuruRepository;

@Service
public class GuruService {

	    @Autowired
	     GuruRepository guruRepository;

	    // Save a new GuruCinema entry
	    public GuruCinema saveGuruCinema(GuruCinema guruCinema) {
	        return guruRepository.save(guruCinema);
	    }

	    // Get all GuruCinema entries
	    public List<GuruCinema> getAllGuruCinemas() {
	        return guruRepository.findAll();
	    }

	    // Get a single GuruCinema by ID
	    public Optional<GuruCinema> getGuruCinemaById(Long id) {
	        return guruRepository.findById(id);
	    }

	    // Update a GuruCinema entry
	    public GuruCinema updateGuruCinema(Long id, GuruCinema guruCinemaDetails) {
	        Optional<GuruCinema> optionalGuruCinema = guruRepository.findById(id);
	        if (optionalGuruCinema.isPresent()) {
	            GuruCinema guruCinema = optionalGuruCinema.get();
	            guruCinema.setMovieName(guruCinemaDetails.getMovieName());
	            guruCinema.setLanguage(guruCinemaDetails.getLanguage());
	            guruCinema.setPrize(guruCinemaDetails.getPrize());
	            guruCinema.setSeats(guruCinemaDetails.getSeats());
	            guruCinema.setLocation(guruCinemaDetails.getLocation());
	            return guruRepository.save(guruCinema);
	        }
	        return null; // Or throw an exception if not found
	    }

	    // Delete a GuruCinema entry by ID
	    public void deleteGuruCinema(Long id) {
	        guruRepository.deleteById(id);
	    }
	}


