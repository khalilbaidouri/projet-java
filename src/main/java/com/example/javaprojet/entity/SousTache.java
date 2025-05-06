package com.example.javaprojet.entity;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class SousTache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    private String description;

    @ElementCollection
    @CollectionTable(name = "sous_tache_tags", joinColumns = @JoinColumn(name = "sous_tache_id"))
    @Column(name = "tag")
    private String[] tags;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;

    private String etat;

    private boolean estTerminee;

    @ManyToOne
    @JoinColumn(name = "id_tache")
    private Tache tache;

}
