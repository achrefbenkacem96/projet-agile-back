package com.esprit.spring.ftthback.services;

import com.esprit.spring.ftthback.models.Projet;
import com.esprit.spring.ftthback.models.Region;

import java.util.List;

public interface ProjetService {
    List<Projet> RetreiveAllProjet ();
    Projet AddProjet(Projet projet);
    public void DeleteProjet(Long id);
    Projet findById (Long id);
    Projet updateProjet( Projet projet, Long id);
}
