/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "eco_utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoUtilisateur.findAll", query = "SELECT e FROM EcoUtilisateur e"),
    @NamedQuery(name = "EcoUtilisateur.findByIdUtilisateur", query = "SELECT e FROM EcoUtilisateur e WHERE e.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "EcoUtilisateur.findByLogin", query = "SELECT e FROM EcoUtilisateur e WHERE e.login = :login"),
    @NamedQuery(name = "EcoUtilisateur.findByMotDePasse", query = "SELECT e FROM EcoUtilisateur e WHERE e.motDePasse = :motDePasse"),
    @NamedQuery(name = "EcoUtilisateur.findByNom", query = "SELECT e FROM EcoUtilisateur e WHERE e.nom = :nom"),
    @NamedQuery(name = "EcoUtilisateur.findByPrenom", query = "SELECT e FROM EcoUtilisateur e WHERE e.prenom = :prenom"),
    @NamedQuery(name = "EcoUtilisateur.findByEmail", query = "SELECT e FROM EcoUtilisateur e WHERE e.email = :email"),
    @NamedQuery(name = "EcoUtilisateur.findByLoginAndPassword", query = "SELECT e FROM EcoUtilisateur e WHERE e.login = :login AND e.motDePasse = :motDePasse")})
public class EcoUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id_utilisateur")
    private int idUtilisateur;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 255)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "motDePasse")
    private String motDePasse;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @Size(max = 255)
    @Column(name = "prenom")
    private String prenom;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;

    public EcoUtilisateur() {
    }

    public EcoUtilisateur(String login) {
        this.login = login;
    }

    public EcoUtilisateur(String login, int idUtilisateur) {
        this.login = login;
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoUtilisateur)) {
            return false;
        }
        EcoUtilisateur other = (EcoUtilisateur) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoUtilisateur[ login=" + login + " ]";
    }
    
}
