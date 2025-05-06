package com.example.javaprojet.entity;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calendrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private boolean estPartage;

    @ManyToOne
    @JoinColumn(name = "id_proprietaire")
    private Utilisateur proprietaire;

    @OneToMany(mappedBy = "calendrier", cascade = CascadeType.ALL)
    private Set<Evenement> evenements = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "calendrier_utilisateur",
            joinColumns = @JoinColumn(name = "calendrier_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private Set<Utilisateur> utilisateursPartages = new HashSet<>();

}
