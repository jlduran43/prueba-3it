package com.example.prueba3it.repository;

import com.example.prueba3it.model.entities.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {
    boolean existsByEmail(String email);
}
