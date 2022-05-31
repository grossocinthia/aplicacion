
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Escuela;
import com.example.aplicacion.service.EscuelaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "aplicacion/escuela")
public class EscuelaController extends CommonControllerImpl <Escuela, EscuelaService> {
    
    
}