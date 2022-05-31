
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Proyecto;
import com.example.aplicacion.service.ProyectoService;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @CrossOrigin(origins = "https://appcinthiagrosso.web.app/")
@RequestMapping (path= "aplicacion/proyecto")
   
public class ProyectoController extends CommonControllerImpl <Proyecto, ProyectoService> {
    
}