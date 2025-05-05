package com.example.javaprojet.repo;
import com.example.javaprojet.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProjetRepesitory extends JpaRepository<Projet, Long> {
}
