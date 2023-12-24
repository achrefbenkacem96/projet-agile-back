package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "gcs")
public class Gc implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur ;
    private String adressegc;
    private int nbrpoteaux;
    private int reel;
    private String action ;
    private Date datereception;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private String commentaire	;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Projet getProjet() {
        return projet;
    }

    public User getUser() {
        return user;
    }

    public Gc(String demandeur, String adressegc, int nbrpoteaux, int reel, String action, String charge,
              Date datereception, Etat etat, String commentaire, Region region, User user) {
        this.demandeur = demandeur;
        this.adressegc = adressegc;
        this.nbrpoteaux = nbrpoteaux;
        this.reel = reel;
        this.action = action;
        this.datereception = datereception;
        this.etat = etat;
        this.commentaire = commentaire;
        this.region = region;
        this.projet=projet;
        this.user=user;}

    public Gc() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public String getAdressegc() {
        return adressegc;
    }

    public void setAdressegc(String adressegc) {
        this.adressegc = adressegc;
    }

    public int getNbrpoteaux() {
        return nbrpoteaux;
    }

    public void setNbrpoteaux(int nbrpoteaux) {
        this.nbrpoteaux = nbrpoteaux;
    }

    public int getReel() {
        return reel;
    }

    public void setReel(int reel) {
        this.reel = reel;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatereception() {
        return datereception;
    }

    public void setDatereception(Date datereception) {
        this.datereception = datereception;
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
}
