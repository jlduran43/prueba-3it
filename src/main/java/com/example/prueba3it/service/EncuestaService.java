package com.example.prueba3it.service;

import com.example.prueba3it.model.entities.Encuesta;

import java.util.List;

public interface EncuestaService {
    List<Encuesta> listar();
    Encuesta crearEncuesta(Encuesta encuesta);

    boolean existsByEmail(String email);
}
