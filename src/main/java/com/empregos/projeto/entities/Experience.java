package com.empregos.projeto.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "experience_candidate_user")
    private Candidate candidate;

    @Column(name = "experience_pastExperience")
    private String pastExperience;

    @Column(name = "experience_actualExperience")
    private Boolean actualExperience;

    @Column(name = "experience_startDate")
    private Date startDate;

    @Column(name = "experience_endDate")
    private Date endDate;

    @Column(name = "experience_jobDescription")
    private String jobDescription;

    public Experience(){}

    public Experience(Long id, Candidate candidate, String pastExperience, Boolean actualExperience, Date startDate, Date endDate, String jobDescription) {
        this.id = id;
        this.candidate = candidate;
        this.pastExperience = pastExperience;
        this.actualExperience = actualExperience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

}