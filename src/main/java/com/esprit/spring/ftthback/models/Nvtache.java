package com.esprit.spring.ftthback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="nvtache")
public class Nvtache {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "demandeur")
    private String demandeur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "Datereception")
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate datereception;
    @Column(name = "Commentaire")
    private String commentaire;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    @ManyToOne
    @JoinColumn(name="region_id", nullable=true)
    private Region region;
    @ManyToOne
    @JoinColumn(name="projet_id", nullable=true)
    private Projet projet;
    @ManyToOne
    @JoinColumn(name="tache", nullable=true)
    private Tache nomTache;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ColumnSup> columnsSuplimentaires;
    @ManyToOne
    @JsonIgnore
    private User user;

    public Nvtache(Long id, String demandeur, LocalDate datereception, String charge,String nom, String commentaire, Etat etat, Region region, Projet projet, Tache nomTache, List<ColumnSup> columnsSuplimentaires, User user) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;
this.nom=nom;
        this.commentaire = commentaire;
        this.etat = etat;
        this.region = region;
        this.projet = projet;
        this.nomTache = nomTache;
        this.columnsSuplimentaires = columnsSuplimentaires;
        this.user = user;
    }

    public Nvtache(Long id, String demandeur, LocalDate datereception, String charge, String commentaire, Etat etat, Region region, Projet projet, Tache nomTache, List<ColumnSup> columnsSuplimentaires) {
        this.id = id;
        this.demandeur = demandeur;
        this.datereception = datereception;

        this.commentaire = commentaire;
        this.etat = etat;
        this.region = region;
        this.projet = projet;
        this.nomTache = nomTache;
        this.columnsSuplimentaires = columnsSuplimentaires;
    }



    public List<ColumnSup> getColumnsSuplimentaires() {
        return columnsSuplimentaires;
    }

    public void setColumnsSuplimentaires(List<ColumnSup> columnsSuplimentaires) {
        this.columnsSuplimentaires = columnsSuplimentaires;
    }

    public Tache getNomTache() {
        return nomTache;
    }

    public void setNomTache(Tache nomTache) {
        this.nomTache = nomTache;
    }

    public Nvtache() {

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

    public LocalDate getDatereception() {
        return datereception;
    }

    public void setDatereception(LocalDate datereception) {
        this.datereception = datereception;
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
}
