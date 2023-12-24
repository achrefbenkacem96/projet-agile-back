package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Modelisationpbo")
public class Modelisationpbo implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String demandeur;
    private Date datereception;
    private String commune;
    private String pm;
    private String pbo;
    private int bal;
    private String tache;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private String audit;
    private String nom;
    private String commentaire;
    private String emprise;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Modelisationpbo() {

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

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    public String getPbo() {
        return pbo;
    }

    public void setPbo(String pbo) {
        this.pbo = pbo;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }


    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
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

    public String getEmprise() {
        return emprise;
    }

    public void setEmprise(String emprise) {
        this.emprise = emprise;
    }

    public Region getRegion() {
        return region;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Modelisationpbo(String demandeur, Date datereception, String commune, String pm, String pbo, int bal, String tache,Etat etat,
                           String audit,  String commentaire,
                           String emprise, Region region,Projet projet,User user, String nom ) {
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.commune = commune;
        this.pm = pm;
        this.pbo = pbo;
        this.bal = bal;
        this.tache = tache;
        this.etat = etat;
        this.audit = audit;

        this.commentaire = commentaire;
        this.emprise = emprise;
        this.region = region;
        this.projet=projet;
        this.user=user;
        this.nom=nom;
    }
}
