package com.example.javaprojet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class Tache {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private int defficulte;
    private boolean etat;
    private int notation;
    @OneToOne
    private Projet projet;
    @OneToMany
    private List<SousTache> sousTaches;
}
