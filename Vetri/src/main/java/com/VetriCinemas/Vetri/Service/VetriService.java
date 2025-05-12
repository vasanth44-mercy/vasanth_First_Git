package com.VetriCinemas.Vetri.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VetriCinemas.Vetri.Bean.VetriCinema;
import com.VetriCinemas.Vetri.Repository.VetriRepository;

@Service
	public class VetriService {

	    @Autowired
	    VetriRepository vetriRepository;

	    // Create a new Vetri entry
	    public VetriCinema saveVetri(VetriCinema vetri) {
	        return vetriRepository.save(vetri);
	    }

	    // Get all Vetri entries
	    public List<VetriCinema> getAllVetri() {
	        return vetriRepository.findAll();
	    }

	    // Get a single Vetri entry by ID
	    public Optional<VetriCinema> getVetriById(Long id) {
	        return vetriRepository.findById(id);
	    }

	    // Update a Vetri entry
	    public VetriCinema updateVetri(Long id, VetriCinema vetriDetails) {
	        Optional<VetriCinema> optionalVetri = vetriRepository.findById(id);
	        if (optionalVetri.isPresent()) {
	            VetriCinema vetri = optionalVetri.get();
	            vetri.setMovieName(vetriDetails.getMovieName());
	            vetri.setLanguage(vetriDetails.getLanguage());
	            vetri.setPrize(vetriDetails.getPrize());
	            vetri.setSeats(vetriDetails.getSeats());
	            vetri.setLocation(vetriDetails.getLocation());
	            return vetriRepository.save(vetri);
	        }
	        return null; // Or throw a custom exception if not found
	    }

	    // Delete a Vetri entry by ID
	    public void deleteVetri(Long id) {
	        vetriRepository.deleteById(id);
	    }
	}


