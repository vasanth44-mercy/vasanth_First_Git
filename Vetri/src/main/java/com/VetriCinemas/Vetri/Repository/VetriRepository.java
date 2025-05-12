package com.VetriCinemas.Vetri.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VetriCinemas.Vetri.Bean.VetriCinema;

@Repository
public interface VetriRepository extends JpaRepository<VetriCinema, Long> {

}
