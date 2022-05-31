
package com.example.aplicacion.service;

import com.example.aplicacion.model.Skill;
import com.example.aplicacion.repository.CommonRepository;
import com.example.aplicacion.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService extends CommonServiceImpl <Skill, Long> implements ISkillService {

 @Autowired
    private SkillRepository Skillrepo;
    
    public SkillService(CommonRepository <Skill, Long> commonRepository){
        
    super(commonRepository);
    }
    
}