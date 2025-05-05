package org.example.gestionprojet.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.gestionprojet.model.RoleType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String motPasse;
    private String photoProfile;
    private boolean actif;
    private Date dateInscription;
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<RoleType> roles;
    @OneToMany
    private Collection<Groupe> groupes;
}
