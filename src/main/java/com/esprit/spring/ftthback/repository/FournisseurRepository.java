package com.esprit.spring.ftthback.repository;

import com.esprit.spring.ftthback.models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
