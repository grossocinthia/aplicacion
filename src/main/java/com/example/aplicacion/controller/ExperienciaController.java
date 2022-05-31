
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Experiencia;
import com.example.aplicacion.service.ExperienciaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @CrossOrigin(origins = "https://appcinthiagrosso.web.app/")
@RequestMapping (path= "aplicacion/experiencia")
public class ExperienciaController extends CommonControllerImpl <Experiencia, ExperienciaService> {
    
}