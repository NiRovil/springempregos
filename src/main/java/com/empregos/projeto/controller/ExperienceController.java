package com.empregos.projeto.controller;

import com.empregos.projeto.entities.Experience;
import com.empregos.projeto.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidate/experience")
public class ExperienceController {

    @Autowired
    ExperienceService experienceService;

    @GetMapping
    public ResponseEntity<List<Experience>> getAll(){
        List<Experience> experiences = experienceService.getAll();
        if(!experiences.isEmpty()){
            return new ResponseEntity<>(experiences, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
