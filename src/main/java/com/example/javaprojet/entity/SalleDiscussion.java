package com.example.javaprojet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SalleDiscussion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Projet projet;
    private String nom;
    private String description;
    private boolean estPublique;
    private List<Utilisateur> membres = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
}
