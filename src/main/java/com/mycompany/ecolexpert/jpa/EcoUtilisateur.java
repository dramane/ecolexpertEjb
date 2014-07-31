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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoUtilisateur.findAll", query = "SELECT e FROM EcoUtilisateur e"),
    @NamedQuery(name = "EcoUtilisateur.findByIdUtilisateur", query = "SELECT e FROM EcoUtilisateur e WHERE e.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "EcoUtilisateur.findByEmailUtilisateur", query = "SELECT e FROM EcoUtilisateur e WHERE e.emailUtilisateur = :emailUtilisateur"),
    @NamedQuery(name = "EcoUtilisateur.findByLogin", query = "SELECT e FROM EcoUtilisateur e WHERE e.login = :login"),
    @NamedQuery(name = "EcoUtilisateur.findByMotDePasse", query = "SELECT e FROM EcoUtilisateur e WHERE e.motDePasse = :motDePasse"),
    @NamedQuery(name = "EcoUtilisateur.findByNomUtilisateur", query = "SELECT e FROM EcoUtilisateur e WHERE e.nomUtilisateur = :nomUtilisateur"),
    @NamedQuery(name = "EcoUtilisateur.findByPrenomUtilisateur", query = "SELECT e FROM EcoUtilisateur e WHERE e.prenomUtilisateur = :prenomUtilisateur"),
    @NamedQuery(name = "EcoUtilisateur.findByLoginAndPassword", query = "SELECT e FROM EcoUtilisateur e WHERE e.login = :login AND e.motDePasse = :motDePasse")})
public class EcoUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUtilisateur")
    private Integer idUtilisateur;
    @Size(max = 255)
    @Column(name = "emailUtilisateur")
    private String emailUtilisateur;
    @Size(max = 255)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "motDePasse")
    private String motDePasse;
    @Size(max = 255)
    @Column(name = "nomUtilisateur")
    private String nomUtilisateur;
    @Size(max = 255)
    @Column(name = "prenomUtilisateur")
    private String prenomUtilisateur;

    public EcoUtilisateur() {
    }

    public EcoUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEmailUtilisateur() {
        return emailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        this.emailUtilisateur = emailUtilisateur;
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

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtilisateur != null ? idUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoUtilisateur)) {
            return false;
        }
        EcoUtilisateur other = (EcoUtilisateur) object;
        if ((this.idUtilisateur == null && other.idUtilisateur != null) || (this.idUtilisateur != null && !this.idUtilisateur.equals(other.idUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoUtilisateur[ idUtilisateur=" + idUtilisateur + " ]";
    }
    
}
