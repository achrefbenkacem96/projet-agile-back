package com.esprit.spring.ftthback.services;

import com.esprit.spring.ftthback.models.Fournisseur;
import com.esprit.spring.ftthback.models.Projet;
import com.esprit.spring.ftthback.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FournisseurServiceImpl implements FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Fournisseur> RetreiveAllFournisseur() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur AddFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void DeleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public Fournisseur findById(Long id) {
        return fournisseurRepository.findById(id).get();
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur, Long id) {
        fournisseur.setId(id);
        return fournisseurRepository.save(fournisseur);
    }



}
