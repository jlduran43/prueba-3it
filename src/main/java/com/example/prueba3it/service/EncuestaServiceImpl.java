package com.example.prueba3it.service;

import com.example.prueba3it.model.entities.Encuesta;
import com.example.prueba3it.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EncuestaServiceImpl implements EncuestaService{
    @Autowired
    EncuestaRepository encuestaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Encuesta> listar() {
        return encuestaRepository.findAll();
    }

    @Override
    public Encuesta crearEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

    @Override
    public boolean existsByEmail(String email) {
        return encuestaRepository.existsByEmail(email);
    }
}
