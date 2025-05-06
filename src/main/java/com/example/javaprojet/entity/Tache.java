package com.example.javaprojet.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    private int priorite;

    private int difficulte;

    private String etat;

    private int notation;

    @ManyToOne
    @JoinColumn(name = "id_projet")
    private Projet projet;

    @OneToMany(mappedBy = "tache", cascade = CascadeType.ALL)
    private Set<SousTache> sousTaches = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur assigneA;


}