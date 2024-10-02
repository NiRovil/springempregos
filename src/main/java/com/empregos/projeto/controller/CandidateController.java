package com.empregos.projeto.controller;

import com.empregos.projeto.entities.Candidate;
import com.empregos.projeto.services.CandidateService;
import com.fasterxml.jackson.databind.JsonNode;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @GetMapping
    public ResponseEntity<List<Candidate>> getAll(){
        List<Candidate> candidates = candidateService.getAll();
        if(!candidates.isEmpty()){
            return new ResponseEntity<>(candidates, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Candidate> saveOrUpdateCandidate(@RequestBody @NotNull JsonNode candidate){

        String user = candidate.path("user").asText();
        String name = candidate.path("name").asText();
        String salaryExpectation = candidate.path("salaryExpectation").asText();
        String education = candidate.path("education").asText();

        Candidate newCandidate = new Candidate(user, name, salaryExpectation, education);

        return new ResponseEntity<>(candidateService.saveOrUpdateCandidate(newCandidate), HttpStatus.OK);
    }

}
