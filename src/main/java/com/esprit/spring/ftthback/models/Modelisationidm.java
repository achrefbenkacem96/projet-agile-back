package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "modelisationidm")
public class Modelisationidm implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String idra;
    private String idm;
    private String nlr;
    private String tache;
    private String demandeur;
    private Date datereception;
    private String pm;
    private String pbo;
    private int bal;
    private String audit;
    private String nom;

    private String commentaire;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    private String commune;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Modelisationidm() {

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

    public String getNlr() {
        return nlr;
    }

    public void setNlr(String nlr) {
        this.nlr = nlr;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
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

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }


    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
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

    public Modelisationidm(String idra, String idm, String nlr, String tache, String demandeur, Date datereception,
                           String pm, String pbo, int bal, String audit,
                           String commentaire, Etat etat, String commune, Region region , Projet projet , User user,String nom) {

        this.idra = idra;
        this.idm = idm;
        this.nlr = nlr;
        this.tache = tache;
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.pm = pm;
        this.pbo = pbo;
        this.bal = bal;
        this.audit = audit;

        this.commentaire = commentaire;
        this.etat = etat;
        this.commune = commune;
        this.region = region;
        this.projet=projet;
        this.user=user;
        this.nom=nom;
    }
}
