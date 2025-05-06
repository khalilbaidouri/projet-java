package com.example.javaprojet.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String description;

    private boolean estSysteme;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @ManyToMany
    @JoinTable(
            name = "groupe_utilisateur",
            joinColumns = @JoinColumn(name = "groupe_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private Set<Utilisateur> membres = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "groupe_id")
    private Set<Projet> projets = new HashSet<>();

}

