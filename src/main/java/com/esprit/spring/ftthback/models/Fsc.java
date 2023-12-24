package com.esprit.spring.ftthback.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "fscs")
public class Fsc  implements Serializable  {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private String ref;
    private String tache;
    private String charge;
    private String commentaire;
    private Date datereception;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToOne
    @JoinColumn(name = "region_id",nullable = true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Fsc() {

    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDatereception() {
        return datereception;
    }

    public void setDatereception(Date datereception) {
        this.datereception = datereception;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Fsc(Long id, String demandeur, String ref, String tache, String charge, String commentaire, Date datereception, String nom, Etat etat, Region region, Projet projet, User user) {
        this.id = id;
        this.demandeur = demandeur;
        this.ref = ref;
        this.tache = tache;
        this.charge = charge;
        this.commentaire = commentaire;
        this.datereception = datereception;
        this.nom = nom;
        this.etat = etat;
        this.region = region;
        this.projet = projet;
        this.user = user;
    }

    public Fsc(String demandeur, String ref, String tache, String charge,
               String commentaire, Date datereception ) {
        this.demandeur = demandeur;
        this.ref = ref;
        this.tache = tache;
        this.charge = charge;
        this.commentaire = commentaire;
        this.datereception = datereception;


    }

}
