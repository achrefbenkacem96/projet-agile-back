package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "trames")
public class Trame implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String demandeur;
    private Date datereception;
    private int num;
    private String ext;
    private String libellevoie;
    private String typevoie;
    private String nomvoie;
    private int codepostal;
    private String ville;
    private int insee;
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


    public Trame() {

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLibellevoie() {
        return libellevoie;
    }

    public void setLibellevoie(String libellevoie) {
        this.libellevoie = libellevoie;
    }

    public String getTypevoie() {
        return typevoie;
    }

    public void setTypevoie(String typevoie) {
        this.typevoie = typevoie;
    }

    public String getNomvoie() {
        return nomvoie;
    }

    public void setNomvoie(String nomvoie) {
        this.nomvoie = nomvoie;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getInsee() {
        return insee;
    }

    public void setInsee(int insee) {
        this.insee = insee;
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

    public Trame(Long id, String demandeur, Date datereception, int num, String ext, String libellevoie, String typevoie, String nomvoie, int codepostal, String ville, int insee, String nom, Etat etat, String commentaire, User user, Region region, Projet projet) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.num = num;
        this.ext = ext;
        this.libellevoie = libellevoie;
        this.typevoie = typevoie;
        this.nomvoie = nomvoie;
        this.codepostal = codepostal;
        this.ville = ville;
        this.insee = insee;
        this.nom = nom;
        this.etat = etat;
        this.commentaire = commentaire;
        this.user = user;
        this.region = region;
        this.projet = projet;
    }
}
