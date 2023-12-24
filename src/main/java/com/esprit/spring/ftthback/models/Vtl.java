package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "vtls")
public class Vtl implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private Long id;
    private String demandeur;
    private Date datereception;
    private String nomtache;
    private int nbal;
    private String pm;
    private String modelisation;
    private String apd;
    private String pds;
    private String doe;
    private String etatsite;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Etat etat;

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


    public Vtl() {

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbal() {
        return nbal;
    }

    public void setNbal(int nbal) {
        this.nbal = nbal;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getModelisation() {
        return modelisation;
    }

    public void setModelisation(String modelisation) {
        this.modelisation = modelisation;
    }

    public String getApd() {
        return apd;
    }

    public void setApd(String apd) {
        this.apd = apd;
    }

    public String getPds() {
        return pds;
    }

    public void setPds(String pds) {
        this.pds = pds;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getEtatsite() {
        return etatsite;
    }

    public void setEtatsite(String etatsite) {
        this.etatsite = etatsite;
    }

    public String getNomtache() {
        return nomtache;
    }

    public void setNomtache(String nomtache) {
        this.nomtache = nomtache;
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

    public String getNomcharge() {
        return nom;
    }

    public void setNomcharge(String nomcharge) {
        this.nom = nomcharge;
    }

    public Vtl(Long id, String demandeur, Date datereception, String nomtache, int nbal, String pm, String modelisation, String apd, String pds, String doe, String etatsite, String nom, Etat etat, String commentaire, User user, Region region, Projet projet) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.nomtache = nomtache;
        this.nbal = nbal;
        this.pm = pm;
        this.modelisation = modelisation;
        this.apd = apd;
        this.pds = pds;
        this.doe = doe;
        this.etatsite = etatsite;
        this.nom = nom;
        this.etat = etat;
        this.commentaire = commentaire;
        this.user = user;
        this.region = region;
        this.projet = projet;
    }
}
