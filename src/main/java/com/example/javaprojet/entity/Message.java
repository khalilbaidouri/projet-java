package com.example.javaprojet.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Entity
@Data

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String contenu;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnvoi;

    private boolean estLu;

    @ManyToOne
    @JoinColumn(name = "id_expediteur")
    private Utilisateur expediteur;

    @ManyToOne
    @JoinColumn(name = "id_salle")
    private SalleDiscussion salle;


}