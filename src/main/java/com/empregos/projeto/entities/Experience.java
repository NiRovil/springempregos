package com.empregos.projeto.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "experience")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_user", referencedColumnName = "candidate_user")
    private String user;

    @Column(name = "candidate_pastExperience")
    private String pastExperience;

    @Column(name = "candidate_actualExperience")
    private Boolean actualExperience;

    @Column(name = "candidate_startDate")
    private Date startDate;

    @Column(name = "candidate_endDate")
    private Date endDate;

    @Column(name = "candidate_jobDescription")
    private String jobDescription;

}