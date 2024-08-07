package com.empregos.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String companyName;

    public Company(){}

    public Company(Long id, String user, String companyName) {
        this.id = id;
        this.user = user;
        this.companyName = companyName;
    }

}
