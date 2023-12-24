package com.esprit.spring.ftthback.models;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_Id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name="active")
    private boolean active = false;
    @ManyToMany
    @JoinTable(name = "users_roles",
            joinColumns = { @JoinColumn(name = "user_Id") },
            inverseJoinColumns = { @JoinColumn(name = "role_Id") })
    private List<Role> roles;
    @OneToMany(mappedBy="user")
    private Set<Nvtache> nvtaches;
    @OneToMany(mappedBy="user")
    private Set<Creationidm> creationidms;
    @OneToMany(mappedBy="user")
    private Set<Creationsadirah> creationsadirahs;
    @OneToMany(mappedBy="user")
    private Set<Fsc> fscs;
    @OneToMany(mappedBy="user")
    private Set<Gc> gcs;
    @OneToMany(mappedBy="user")
    private Set<Identificationimmeuble> identificationimmeubles;
    @OneToMany(mappedBy="user")
    private Set<Modelisationidm> modelisationidms;
    @OneToMany(mappedBy="user")
    private Set<Modelisationpbo> modelisationpbos;
    @OneToMany(mappedBy="user")
    private Set<Racco> raccos;
    @OneToMany(mappedBy="user")
    private Set<Regie> regies;
    @OneToMany(mappedBy="user")
    private Set<Trame> trames;
    @OneToMany(mappedBy="user")
    private Set<Vtl> vtls;


    public User(long id, String username, String password, String email, boolean active, List<Role> roles) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = active;
        this.roles = roles;

    }

    public User(String username, String password, String email, boolean active) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = active;
    }

    public User(String username, String password, String email, boolean active, List<Role> roles) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = active;
        this.roles = roles;
    }

    public User(String username,  String email, String password,List<Role> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    public User(Long id, String username, String password, String email, boolean active, List<Role> roles, List<Nvtache> nvtaches) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = active;
        this.roles = roles;

    }

    public User(Long id, String username, String password, String email, boolean active, List<Role> roles, Set<Nvtache> nvtaches, Set<Creationidm> creationidms, Set<Creationsadirah> creationsadirahs, Set<Fsc> fscs, Set<Gc> gcs, Set<Identificationimmeuble> identificationimmeubles, Set<Modelisationidm> modelisationidms, Set<Modelisationpbo> modelisationpbos,
                Set<Racco> raccos, Set<Regie> regies, Set<Trame> trames, Set<Vtl> vtls) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = active;
        this.roles = roles;
        this.nvtaches = nvtaches;
        this.creationidms = creationidms;
        this.creationsadirahs = creationsadirahs;
        this.fscs = fscs;
        this.gcs = gcs;
        this.identificationimmeubles = identificationimmeubles;
        this.modelisationidms = modelisationidms;
        this.modelisationpbos = modelisationpbos;
        this.raccos = raccos;
        this.regies = regies;
        this.trames = trames;
        this.vtls = vtls;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public Set<Creationidm> getCreationidms() {
        return creationidms;
    }

    public void setCreationidms(Set<Creationidm> creationidms) {
        this.creationidms = creationidms;
    }

    public Set<Creationsadirah> getCreationsadirahs() {
        return creationsadirahs;
    }

    public void setCreationsadirahs(Set<Creationsadirah> creationsadirahs) {
        this.creationsadirahs = creationsadirahs;
    }

    public Set<Fsc> getFscs() {
        return fscs;
    }

    public void setFscs(Set<Fsc> fscs) {
        this.fscs = fscs;
    }

    public Set<Gc> getGcs() {
        return gcs;
    }

    public void setGcs(Set<Gc> gcs) {
        this.gcs = gcs;
    }

    public Set<Identificationimmeuble> getIdentificationimmeubles() {
        return identificationimmeubles;
    }

    public void setIdentificationimmeubles(Set<Identificationimmeuble> identificationimmeubles) {
        this.identificationimmeubles = identificationimmeubles;
    }

    public Set<Modelisationidm> getModelisationidms() {
        return modelisationidms;
    }

    public void setModelisationidms(Set<Modelisationidm> modelisationidms) {
        this.modelisationidms = modelisationidms;
    }

    public Set<Modelisationpbo> getModelisationpbos() {
        return modelisationpbos;
    }

    public void setModelisationpbos(Set<Modelisationpbo> modelisationpbos) {
        this.modelisationpbos = modelisationpbos;
    }

    public Set<Racco> getRaccos() {
        return raccos;
    }

    public void setRaccos(Set<Racco> raccos) {
        this.raccos = raccos;
    }

    public Set<Regie> getRegies() {
        return regies;
    }

    public void setRegies(Set<Regie> regies) {
        this.regies = regies;
    }

    public Set<Trame> getTrames() {
        return trames;
    }

    public void setTrames(Set<Trame> trames) {
        this.trames = trames;
    }

    public Set<Vtl> getVtls() {
        return vtls;
    }

    public void setVtls(Set<Vtl> vtls) {
        this.vtls = vtls;
    }

    public Set<Nvtache> getNvtaches() {
        return nvtaches;
    }

    public void setNvtaches(Set<Nvtache> nvtaches) {
        this.nvtaches = nvtaches;
    }

}


