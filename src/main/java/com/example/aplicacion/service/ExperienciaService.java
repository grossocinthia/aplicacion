
package com.example.aplicacion.service;

import com.example.aplicacion.model.Experiencia;
import com.example.aplicacion.repository.CommonRepository;
import com.example.aplicacion.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService extends CommonServiceImpl <Experiencia, Long> implements IExperienciaService{

 @Autowired
    private ExperienciaRepository experienciarepository;
    
    public ExperienciaService(CommonRepository <Experiencia, Long> commonRepository){
        
    super(commonRepository);
    }
}