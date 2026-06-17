package com.gestion.depense.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Depense {
    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id_depense;
    private String description;
    private double montant;

    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Categorie categorie;

}
