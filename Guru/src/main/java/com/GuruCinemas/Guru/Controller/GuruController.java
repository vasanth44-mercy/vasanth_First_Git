package com.GuruCinemas.Guru.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GuruCinemas.Guru.Bean.GuruCinema;
import com.GuruCinemas.Guru.Service.GuruService;

@RestController
@RequestMapping("/guru")
public class GuruController {

	
	    @Autowired
	     GuruService guruService;

	    // Create a new GuruCinema entry
	    @PostMapping("/add")
	    public ResponseEntity<GuruCinema> createGuruCinema(@RequestBody GuruCinema guruCinema) {
	        GuruCinema savedGuruCinema = guruService.saveGuruCinema(guruCinema);
	        return ResponseEntity.ok(savedGuruCinema);
	    }

	    // Get all GuruCinema entries
	    @GetMapping("/allmovie")
	    public List<GuruCinema> getAllGuruCinemas() {
	        return guruService.getAllGuruCinemas();
	    }

	    // Get a single GuruCinema by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<GuruCinema> getGuruCinemaById(@PathVariable Long id) {
	        Optional<GuruCinema> guruCinema = guruService.getGuruCinemaById(id);
	        return guruCinema.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    // Update a GuruCinema entry
	    @PutMapping("/{id}")
	    public ResponseEntity<GuruCinema> updateGuruCinema(
	            @PathVariable Long id,
	            @RequestBody GuruCinema guruCinemaDetails) {
	        GuruCinema updatedGuruCinema = guruService.updateGuruCinema(id, guruCinemaDetails);
	        if (updatedGuruCinema != null) {
	            return ResponseEntity.ok(updatedGuruCinema);
	        }
	        return ResponseEntity.notFound().build();
	    }

	    // Delete a GuruCinema entry by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteGuruCinema(@PathVariable Long id) {
	        guruService.deleteGuruCinema(id);
	        return ResponseEntity.noContent().build();
	    }
	}


