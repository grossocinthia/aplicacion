
package com.example.aplicacion.controller;

import com.example.aplicacion.model.Skill;
import com.example.aplicacion.service.SkillService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping (path= "aplicacion/skill")
public class SkillController extends CommonControllerImpl <Skill, SkillService>{
    
}