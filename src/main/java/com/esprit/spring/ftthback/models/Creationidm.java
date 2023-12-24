package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="creationidms")
public class Creationidm  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "demandeur")
    private String demandeur;
    @Column(name = "Datereception")
    private Date datereception;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "Idra")
    private String idra;
    @Column(name = "idmeuble")
    private String idm;
    @Column(name = "nlr")
    private int nlr;
    @Column(name = "ville")
    private String ville;
    @Column(name = "codepostal")
    private int codepostal;
    @Column(name = "codeinsee")
    private int codeinsee;
    @Column(name = "Commentaire")
    private String commentaire;
    private String nom;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet  projet;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToOne
    @JsonIgnore
    private User user;



    

    public Creationidm() {

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public int getNlr() {
        return nlr;
    }

    public void setNlr(int nlr) {
        this.nlr = nlr;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public int getCodeinsee() {
        return codeinsee;
    }

    public void setCodeinsee(int codeinsee) {
        this.codeinsee = codeinsee;
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

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Creationidm(Long id, String demandeur, Date datereception, String adresse, String idra, String idm, int nlr, String ville, int codepostal, int codeinsee, String commentaire, String nom, Region region, Projet projet, Etat etat, User user) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;
        this.adresse = adresse;
        this.idra = idra;
        this.idm = idm;
        this.nlr = nlr;
        this.ville = ville;
        this.codepostal = codepostal;
        this.codeinsee = codeinsee;
        this.commentaire = commentaire;
        this.nom = nom;
        this.region = region;
        this.projet = projet;
        this.etat = etat;
        this.user = user;
    }
}
