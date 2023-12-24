package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "idimmeubles")
public class Identificationimmeuble implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private Date datereception;
    private String refimmo;
    private String adresse;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private String commentaire;
    private String nom;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Identificationimmeuble() {

    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public Date getDatereception() {
        return datereception;
    }

    public void setDatereception(Date datereception) {
        this.datereception = datereception;
    }

    public String getRefimmo() {
        return refimmo;
    }

    public void setRefimmo(String refimmo) {
        this.refimmo = refimmo;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Identificationimmeuble(Long id, String demandeur, Date datereception, String refimmo, String adresse, Etat etat, String commentaire, String nom, Region region, Projet projet, User user) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.refimmo = refimmo;
        this.adresse = adresse;
        this.etat = etat;
        this.commentaire = commentaire;
        this.nom = nom;
        this.region = region;
        this.projet = projet;
        this.user = user;
    }
}
