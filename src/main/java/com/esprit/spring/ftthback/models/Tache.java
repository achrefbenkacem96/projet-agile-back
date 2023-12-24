package com.esprit.spring.ftthback.models;

import javax.persistence.*;
import java.util.List;

@Entity

public class Tache {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "Nom")
    private String nom;

    public String getColumnsSuplimentaires() {
        return columnsSuplimentaires;
    }

    public void setColumnsSuplimentaires(String columnsSuplimentaires) {
        this.columnsSuplimentaires = columnsSuplimentaires;
    }

    private  String columnsSuplimentaires;
    public Tache() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
