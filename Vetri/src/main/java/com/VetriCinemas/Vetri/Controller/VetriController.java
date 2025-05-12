package com.VetriCinemas.Vetri.Controller;

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

import com.VetriCinemas.Vetri.Bean.VetriCinema;
import com.VetriCinemas.Vetri.Service.VetriService;

@RestController
	@RequestMapping("/vetri")
	public class VetriController {

	    @Autowired
	    VetriService vetriService;

	    // Create a new Vetri entry (POST)
	    @PostMapping("/add")
	    public ResponseEntity<VetriCinema> createVetri(@RequestBody VetriCinema vetri) {
	        VetriCinema savedVetri = vetriService.saveVetri(vetri);
	        return ResponseEntity.ok(savedVetri);
	    }

	    // Get all Vetri entries (GET)
	    @GetMapping("/allmovie")
	    public List<VetriCinema> getAllVetri() {
	        return vetriService.getAllVetri();
	    }

	    // Get a single Vetri entry by ID (GET)
	    @GetMapping("/{id}")
	    public ResponseEntity<VetriCinema> getVetriById(@PathVariable Long id) {
	        Optional<VetriCinema> vetri = vetriService.getVetriById(id);
	        return vetri.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    // Update a Vetri entry by ID (PUT)
	    @PutMapping("/{id}")
	    public ResponseEntity<VetriCinema> updateVetri(
	            @PathVariable Long id,
	            @RequestBody VetriCinema vetriDetails) {
	    	VetriCinema updatedVetri = vetriService.updateVetri(id, vetriDetails);
	        if (updatedVetri != null) {
	            return ResponseEntity.ok(updatedVetri);
	        }
	        return ResponseEntity.notFound().build();
	    }

	    // Delete a Vetri entry by ID (DELETE)
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteVetri(@PathVariable Long id) {
	        vetriService.deleteVetri(id);
	        return ResponseEntity.noContent().build();
	    }
	}


