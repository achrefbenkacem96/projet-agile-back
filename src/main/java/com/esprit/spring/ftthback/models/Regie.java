package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "regies")

public class Regie implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private Date datereception;
    private String pm;
    private String site;
    private String idra;
    private String idm;
    private String tache;
    private String duree;
    @Enumerated(EnumType.STRING)
    private Etat etat;
private String nom;
    private String commentaire;
    @ManyToOne
    @JsonIgnore
    private User user;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;


    public Regie() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getIdra() {
        return idra;
    }

    public void setIdra(String idra) {
        this.idra = idra;
    }

    public String getIdm() {
        return idm;
    }

    public void setIdm(String idm) {
        this.idm = idm;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public Regie(String demandeur, Date datereception, String pm, String site, String idra, String idm, String tache,
                 String duree, Etat etat,  String commentaire, Region region,Projet projet,User user ,String nom) {
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.pm = pm;
        this.site = site;
        this.idra = idra;
        this.idm = idm;
        this.tache = tache;
        this.duree = duree;
        this.etat = etat;
        this.commentaire = commentaire;
        this.region = region;
        this.projet=projet;
        this.user=user;
        this.nom=nom;
    }
}
