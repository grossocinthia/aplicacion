
package com.example.aplicacion.service;

import com.example.aplicacion.model.Persona;
import com.example.aplicacion.repository.CommonRepository;
import com.example.aplicacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends CommonServiceImpl <Persona, Long> implements IPersonaService{

    @Autowired
    private PersonaRepository persorepo;
    
    public PersonaService(CommonRepository <Persona, Long> commonRepository){
        
    super(commonRepository);
    }
}
   