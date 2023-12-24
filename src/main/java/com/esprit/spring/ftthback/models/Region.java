package com.esprit.spring.ftthback.models;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name="regions")
public class Region  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String paysregion;
    private String departementregion;

    public String getPaysregion() {
        return paysregion;
    }

    public void setPiregion(String piregion) {
        paysregion =paysregion;
    }

    public String getDepartementregion() {
        return departementregion;
    }

    public void setDepartementregion(String departementregion) {
        this.departementregion = departementregion;
    }

    @ManyToOne
    @JoinColumn(name = "creationidm_id",nullable = true)
    private Creationidm creationidm;
    @ManyToOne
    @JoinColumn(name = "crationsadirah_id",nullable = true)
    private Creationsadirah creationsadirah;
    @ManyToOne
    @JoinColumn(name = "fsc_id",nullable = true)
    private Fsc fsc;
    @ManyToOne
    @JoinColumn(name = "gs_id",nullable = true)
    private Gc gc;
    @ManyToOne
    @JoinColumn(name="identificationimmeuble_id",nullable = true)
    private Identificationimmeuble identificationimmeuble;
    @ManyToOne
    @JoinColumn(name = "modelisationidm_id",nullable = true)
    private Modelisationidm modelisationidm;
    @ManyToOne
    @JoinColumn(name = "modelisationpbo_id",nullable = true)
    private Modelisationpbo modelisationpbo;
    @ManyToOne
    @JoinColumn(name = "racco_id",nullable = true)
    private Racco racco;
    @ManyToOne
    @JoinColumn(name = "trame_id",nullable = true)
    private Trame trame;
    @ManyToOne
    @JoinColumn(name = "vtls_id")
    private Vtl vtl;

    public Region() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Creationidm getCreationidm() {
        return creationidm;
    }

    public void setCreationidm(Creationidm creationidm) {
        this.creationidm = creationidm;
    }

    public Creationsadirah getCreationsadirah() {
        return creationsadirah;
    }

    public void setCreationsadirah(Creationsadirah creationsadirah) {
        this.creationsadirah = creationsadirah;
    }

    public Fsc getFsc() {
        return fsc;
    }

    public void setFsc(Fsc fsc) {
        this.fsc = fsc;
    }

    public Gc getGc() {
        return gc;
    }

    public void setGc(Gc gc) {
        this.gc = gc;
    }

    public Identificationimmeuble getIdentificationimmeuble() {
        return identificationimmeuble;
    }

    public void setIdentificationimmeuble(Identificationimmeuble identificationimmeuble) {
        this.identificationimmeuble = identificationimmeuble;
    }

    public Modelisationidm getModelisationidm() {
        return modelisationidm;
    }

    public void setModelisationidm(Modelisationidm modelisationidm) {
        this.modelisationidm = modelisationidm;
    }

    public Modelisationpbo getModelisationpbo() {
        return modelisationpbo;
    }

    public void setModelisationpbo(Modelisationpbo modelisationpbo) {
        this.modelisationpbo = modelisationpbo;
    }

    public Racco getRacco() {
        return racco;
    }

    public void setRacco(Racco racco) {
        this.racco = racco;
    }

    public Trame getTrame() {
        return trame;
    }

    public void setTrame(Trame trame) {
        this.trame = trame;
    }

    public Vtl getVtl() {
        return vtl;
    }

    public void setVtl(Vtl vtl) {
        this.vtl = vtl;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Region(String name, List<Creationidm> creationidms, List<Identificationimmeuble> identificationimmeubles) {
        super();
        this.name = name;
    }

    public Region(String name, String piregion, String departementregion) {
        this.name = name;
        this.paysregion = piregion;
        this.departementregion = departementregion;
    }

    public Region(String name) {
        this.name = name;
    }

}

