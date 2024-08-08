package com.empregos.projeto.services;

import com.empregos.projeto.entities.Candidate;
import com.empregos.projeto.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository repository;

    public Candidate saveCandidate(Candidate candidate){
        return repository.save(candidate);
    }

    public List<Candidate> getAll(){
        return repository.findAll();
    }

}
