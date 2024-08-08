package com.empregos.projeto.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @Column(name = "candidate_user")
    private String user;

    @Column(name = "candidate_name")
    private String name;

    @Column(name = "candidate_salaryExpectation")
    private String salaryExpectation;

    @Column(name = "candidate_education")
    private String education;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<Experience> listExperiences;

    public Candidate(){}

    public Candidate(String user, String name, String salaryExpectation, String education) {
        this.user = user;
        this.name = name;
        this.salaryExpectation = salaryExpectation;
        this.education = education;
    }

}