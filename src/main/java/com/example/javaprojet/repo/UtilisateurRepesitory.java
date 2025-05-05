package com.example.javaprojet.repo;
import com.example.javaprojet.entity.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UtilisateurRepesitory extends JpaRepository<Utilisateurs,Long> {
    List<Utilisateurs> findByEmail(String email);
    List<Utilisateurs> findByEmailAndMotPasse(String email, String motPasse);
}
