
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Persona;
import com.example.aplicacion.service.PersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "aplicacion/persona")
public class PersonaController extends CommonControllerImpl <Persona, PersonaService> {}
    