
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Common;
import com.example.aplicacion.service.CommonServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;


public abstract class CommonControllerImpl <E extends Common, S extends CommonServiceImpl<E, Long>> implements CommonController <E, Long>{
    @Autowired
    protected S Servicio;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public void agregarE (@RequestBody E e){
        Servicio.agregarE(e);
        
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/ver")
    @ResponseBody
    public List<E> verE(){
    return Servicio.verE();
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public E buscarE(@PathVariable Long id) {
        return Servicio.buscarE(id);
    }
   @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarE (@PathVariable Long id){
        Servicio.borrarE(id);
        
    }
   
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar")
    @ResponseBody
    public  E  editarE(@RequestBody E e){
        Servicio.agregarE(e);
        return e;
          }

    
}