package com.example.prueba3it.controller;

import com.example.prueba3it.fixture.EncuestaFixture;
import com.example.prueba3it.model.entities.Encuesta;
import com.example.prueba3it.service.EncuestaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class EncuestaControllerTest {
    @InjectMocks
    EncuestaController encuestaController;

    @Mock
    EncuestaService encuestaService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testEncuestaControllerOk(){

        when(encuestaService.listar()).thenReturn(EncuestaFixture.getEncuestas());

        List<Encuesta> encuestas = encuestaController.listaEncuestas();

        Assertions.assertEquals(encuestas.size(), 3);
    }
}
