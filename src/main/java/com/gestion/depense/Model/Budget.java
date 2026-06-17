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
public class Budget {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_budget;
    private double budget_total;
    private double budget_restant;
    private double budget_categorie;

    @ManyToOne
    private Utilisateur utilisateur;

}
