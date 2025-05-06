package com.example.javaprojet.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String identifiant;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String motDePasse;

    @Lob
    private byte[] photoProfile;

    private boolean actif;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateInscription;

    @ManyToMany(mappedBy = "membres")
    private Set<Groupe> groupes = new HashSet<>();

    @ManyToMany(mappedBy = "membres")
    private Set<Projet> projets = new HashSet<>();

    @ManyToMany(mappedBy = "admins")
    private Set<Projet> projetsAdministres = new HashSet<>();

    @OneToMany(mappedBy = "expediteur")
    private Set<Message> messagesEnvoyes = new HashSet<>();

    @OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToMany(mappedBy = "proprietaire")
    private Set<Calendrier> calendriers = new HashSet<>();

}
