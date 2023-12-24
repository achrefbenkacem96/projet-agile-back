package com.esprit.spring.ftthback.repository;

import com.esprit.spring.ftthback.models.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {

}
