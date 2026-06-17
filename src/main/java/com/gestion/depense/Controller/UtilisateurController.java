package com.gestion.depense.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.depense.Modele.Utilisateur;
import com.gestion.depense.Repository.RepositoryUtilisateur;



@RestController
public class UtilisateurController {

    @Autowired
    private RepositoryUtilisateur repositoryUtilisateur;

    @PostMapping("/utilisateurs")
    public void ajouterUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur utilisateur1 = new Utilisateur();
        utilisateur1.setNom(utilisateur.getNom());
        utilisateur1.setEmail(utilisateur.getEmail());
        utilisateur1.setMotDePasse(utilisateur.getMotDePasse());
        utilisateur1.setDateNaissance(utilisateur.getDateNaissance());
        utilisateur1.setPrenom(utilisateur.getPrenom());
        utilisateur1.setTelephone(utilisateur.getTelephone());


        repositoryUtilisateur.save(utilisateur1);
    }


    @GetMapping("/afficher")
    public List<Utilisateur> afficheUtilisateurs() {
        return repositoryUtilisateur.findAll();
    }

    @GetMapping("/afficher/{id}")
    public Utilisateur afficherParId(@PathVariable Long id) {
        return repositoryUtilisateur.findById(id).orElse(null);
    }

    @GetMapping("/nom/{nom}")
    public Utilisateur afficherParNom(@PathVariable String nom) {
        return repositoryUtilisateur.findByNom(nom).orElse(null);
    }
    
    
}
