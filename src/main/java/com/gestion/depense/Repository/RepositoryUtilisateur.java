package com.gestion.depense.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.depense.Modele.Utilisateur;

@Repository
public interface RepositoryUtilisateur extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByEmail(String email);
    Optional<Utilisateur> findByNom(String nom);
}
