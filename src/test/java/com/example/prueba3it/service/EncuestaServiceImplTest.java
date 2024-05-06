package com.example.prueba3it.service;

import com.example.prueba3it.fixture.EncuestaFixture;
import com.example.prueba3it.model.entities.Encuesta;
import com.example.prueba3it.repository.EncuestaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class EncuestaServiceImplTest {
    @InjectMocks
    EncuestaServiceImpl encuestaService;

    @Mock
    EncuestaRepository encuestaRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testEncuestaService(){

        when(encuestaRepository.findAll()).thenReturn(EncuestaFixture.getEncuestas());

        List<Encuesta> result = encuestaService.listar();

        Assertions.assertEquals(result.get(0).getEmail(), EncuestaFixture.getEncuestas().get(0).getEmail());
    }
}
