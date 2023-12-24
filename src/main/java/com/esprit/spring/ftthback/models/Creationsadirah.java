package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="crationsadirah")

public class Creationsadirah  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private Date daterec;
    private String pm;
    private String pav;
    private String poche;
    private String etatsadirah;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private String nom;

    private String commentaire;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Creationsadirah() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public Date getDaterec() {
        return daterec;
    }

    public void setDaterec(Date daterec) {
        this.daterec = daterec;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public String getPoche() {
        return poche;
    }

    public void setPoche(String poche) {
        this.poche = poche;
    }

    public String getEtatsadirah() {
        return etatsadirah;
    }

    public void setEtatsadirah(String etatsadirah) {
        this.etatsadirah = etatsadirah;
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

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Creationsadirah(Long id, String demandeur, Date daterec, String pm, String pav, String poche, String etatsadirah, Etat etat, String nom, String commentaire, Region region, Projet projet, User user) {
        this.id = id;
        this.demandeur = demandeur;
        this.daterec = daterec;
        this.pm = pm;
        this.pav = pav;
        this.poche = poche;
        this.etatsadirah = etatsadirah;
        this.etat = etat;
        this.nom = nom;
        this.commentaire = commentaire;
        this.region = region;
        this.projet = projet;
        this.user = user;
    }
}
