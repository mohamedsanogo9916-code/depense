package com.gestion.depense.Modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id_categorie;
    private String nom;
}
