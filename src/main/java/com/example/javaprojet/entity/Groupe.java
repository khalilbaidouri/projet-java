package com.example.javaprojet.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class Groupe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private boolean estSysteme;
    private Date dateCreation;
    @OneToMany
    private Collection<Utilisateurs> membres;
    @OneToMany
    private Collection<Projet> projets;
    @OneToOne
    private Utilisateurs adminGroupe;
    @OneToMany
    private Collection<SalleDiscussion> salleDiscussions;
}
