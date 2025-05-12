package com.GuruCinemas.Guru.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GuruCinemas.Guru.Bean.GuruCinema;

@Repository
public interface GuruRepository extends JpaRepository<GuruCinema, Long>{

}
