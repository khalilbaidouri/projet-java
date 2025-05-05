package com.example.javaprojet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Collection;
import java.util.Date;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class Projet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomCourt;
    private String nomLong;
    private String theme;
    private String type;
    private boolean estPublic;
    private String license;
    private String statut;
    private Date dateCreation;
    private Date dateCloture;
    @OneToOne
    Utilisateurs adminProjet;
    @OneToOne
    private Groupe groupe;
    @OneToMany
    private Collection<Tache> taches;
    @OneToMany
    private Collection<Utilisateurs> members;
    @OneToOne
    private ListeDiffusion listeDiffusion;
    @OneToOne
    private DepotDocument depotDocument;
    @OneToMany
    private Collection<SalleDiscussion> salleDiscussions;
    @OneToOne
    private Calendrier calendrier;
    @OneToOne
    private Reunion reunion;

}
