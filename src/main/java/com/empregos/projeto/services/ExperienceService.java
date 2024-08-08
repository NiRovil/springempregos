package com.empregos.projeto.services;

import com.empregos.projeto.entities.Experience;
import com.empregos.projeto.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    @Autowired
    ExperienceRepository repository;

    public Experience saveExperiences(Experience experience){
        return repository.save(experience);
    }

    public List<Experience> getAll(){
        return repository.findAll();
    }

}
