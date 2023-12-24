package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Racco")
public class Racco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private String refpav;
    private String idra;
    private int nblgts;
    private String idimmeuble;
    private int distancepbopto;
    private String action;
    private String pbo;
    private int distance;
    private String commentaire;
    private String nom;
    private String majnetworks;
    private String majsadirah;
    private String ancienpm;
    private String nouveaupm;
    private Date datereception;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;

    public Racco() {

    }

    public Projet getProjet() {
        return projet;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
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

    public String getRefpav() {
        return refpav;
    }

    public void setRefpav(String refpav) {
        this.refpav = refpav;
    }

    public String getIdra() {
        return idra;
    }

    public void setIdra(String idra) {
        this.idra = idra;
    }

    public int getNblgts() {
        return nblgts;
    }

    public void setNblgts(int nblgts) {
        this.nblgts = nblgts;
    }

    public String getIdimmeuble() {
        return idimmeuble;
    }

    public void setIdimmeuble(String idimmeuble) {
        this.idimmeuble = idimmeuble;
    }

    public int getDistancepbopto() {
        return distancepbopto;
    }

    public void setDistancepbopto(int distancepbopto) {
        this.distancepbopto = distancepbopto;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPbo() {
        return pbo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPbo(String pbo) {
        this.pbo = pbo;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }



    public String getMajnetworks() {
        return majnetworks;
    }

    public void setMajnetworks(String majnetworks) {
        this.majnetworks = majnetworks;
    }

    public String getMajsadirah() {
        return majsadirah;
    }

    public void setMajsadirah(String majsadirah) {
        this.majsadirah = majsadirah;
    }

    public String getAncienpm() {
        return ancienpm;
    }

    public void setAncienpm(String ancienpm) {
        this.ancienpm = ancienpm;
    }

    public String getNouveaupm() {
        return nouveaupm;
    }

    public void setNouveaupm(String nouveaupm) {
        this.nouveaupm = nouveaupm;
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

    public Racco(Long id, String demandeur, String refpav, String idra, int nblgts, String idimmeuble, int distancepbopto, String action, String pbo, int distance, String commentaire, String nom, String majnetworks, String majsadirah, String ancienpm, String nouveaupm, Date datereception, Etat etat, User user, Region region, Projet projet) {
        this.id = id;
        this.demandeur = demandeur;
        this.refpav = refpav;
        this.idra = idra;
        this.nblgts = nblgts;
        this.idimmeuble = idimmeuble;
        this.distancepbopto = distancepbopto;
        this.action = action;
        this.pbo = pbo;
        this.distance = distance;
        this.commentaire = commentaire;
        this.nom = nom;
        this.majnetworks = majnetworks;
        this.majsadirah = majsadirah;
        this.ancienpm = ancienpm;
        this.nouveaupm = nouveaupm;
        this.datereception = datereception;
        this.etat = etat;
        this.user = user;
        this.region = region;
        this.projet = projet;
    }
}
