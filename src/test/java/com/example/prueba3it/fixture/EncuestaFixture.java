package com.example.prueba3it.fixture;

import com.example.prueba3it.model.entities.Encuesta;

import java.util.ArrayList;
import java.util.List;

public class EncuestaFixture {
    public static List<Encuesta> getEncuestas(){
        List<Encuesta> encuestaList = new ArrayList<>();

        Encuesta encuesta = new Encuesta();
        encuesta.setEmail("pepe@gmail.com");
        encuesta.setEstilo_musical("Rock");

        Encuesta encuesta2 = new Encuesta();
        encuesta2.setEmail("hola@gmail.com");
        encuesta2.setEstilo_musical("Pop");

        Encuesta encuesta3 = new Encuesta();
        encuesta3.setEmail("adios@gmail.com");
        encuesta3.setEstilo_musical("Jazz");

        encuestaList.add(encuesta);
        encuestaList.add(encuesta2);
        encuestaList.add(encuesta3);

        return encuestaList;
    }
}
