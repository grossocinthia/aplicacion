
package com.example.aplicacion.service;

import com.example.aplicacion.model.Proyecto;
import com.example.aplicacion.repository.CommonRepository;
import com.example.aplicacion.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService extends CommonServiceImpl <Proyecto, Long> implements IProyectoService {

 @Autowired
    private ProyectoRepository proyerepo;
    
    public ProyectoService(CommonRepository <Proyecto, Long> commonRepository){
        
    super(commonRepository);
    }
}