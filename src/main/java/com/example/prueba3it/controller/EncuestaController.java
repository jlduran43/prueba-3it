package com.example.prueba3it.controller;

import com.example.prueba3it.model.entities.Encuesta;
import com.example.prueba3it.service.EncuestaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.prueba3it.validation.ValidacionCampos.validation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/encuestas")
public class EncuestaController {
    @Autowired EncuestaService encuestaService;
    @GetMapping
    public List<Encuesta> listaEncuestas(){
        return encuestaService.listar();
    }
    @PostMapping("/registrar")
    public ResponseEntity<Object> crear(@Valid @RequestBody Encuesta encuesta, BindingResult result){
        if(result.hasFieldErrors()){
            return validation(result);
        }

        return ResponseEntity.status(HttpStatus.OK).body(encuestaService.crearEncuesta(encuesta));
    }
}