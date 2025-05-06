package com.example.javaprojet.entity;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Admin  extends  Utilisateur{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

}
