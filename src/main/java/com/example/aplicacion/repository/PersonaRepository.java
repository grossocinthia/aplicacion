
package com.example.aplicacion.repository;

import com.example.aplicacion.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CommonRepository <Persona, Long> {
    
}