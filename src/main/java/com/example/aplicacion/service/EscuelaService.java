
package com.example.aplicacion.service;

import com.example.aplicacion.model.Escuela;
import com.example.aplicacion.repository.CommonRepository;
import com.example.aplicacion.repository.EscuelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscuelaService extends CommonServiceImpl <Escuela, Long> implements IEscuelaService {

 @Autowired
    private EscuelaRepository escurepo;
    
    public EscuelaService(CommonRepository <Escuela, Long> commonRepository){
        
    super(commonRepository);
    }
    
}
