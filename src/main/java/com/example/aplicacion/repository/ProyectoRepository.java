
package com.example.aplicacion.repository;

import com.example.aplicacion.model.Proyecto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends CommonRepository <Proyecto, Long> {
    
}