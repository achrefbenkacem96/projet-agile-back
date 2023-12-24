package com.esprit.spring.ftthback.services;

import com.esprit.spring.ftthback.models.Fournisseur;
import com.esprit.spring.ftthback.models.Projet;

import java.util.List;

public interface FournisseurService {
    List<Fournisseur> RetreiveAllFournisseur ();
    Fournisseur AddFournisseur(Fournisseur fournisseur);
    public void DeleteFournisseur(Long id);
    Fournisseur findById (Long id);
    Fournisseur updateFournisseur( Fournisseur fournisseur, Long id);
}
