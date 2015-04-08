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
 * @author HP
 */
@Entity
@Table(name = "eco_profil_utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoProfilUtilisateur.findAll", query = "SELECT e FROM EcoProfilUtilisateur e"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByCodeProfilUtilisateur", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.codeProfilUtilisateur = :codeProfilUtilisateur"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByActive", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.active = :active"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByLogin", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.login = :login"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByCodeProfil", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.codeProfil = :codeProfil"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByLoginAndActive", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.login = :login AND e.active = :active")})
public class EcoProfilUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code_profil_utilisateur")
    private Integer codeProfilUtilisateur;
    @Column(name = "active")
    private Integer active;
    @Size(max = 255)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "codeProfil")
    private String codeProfil;

    public EcoProfilUtilisateur() {
    }

    public EcoProfilUtilisateur(Integer codeProfilUtilisateur) {
        this.codeProfilUtilisateur = codeProfilUtilisateur;
    }

    public Integer getCodeProfilUtilisateur() {
        return codeProfilUtilisateur;
    }

    public void setCodeProfilUtilisateur(Integer codeProfilUtilisateur) {
        this.codeProfilUtilisateur = codeProfilUtilisateur;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCodeProfil() {
        return codeProfil;
    }

    public void setCodeProfil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProfilUtilisateur != null ? codeProfilUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoProfilUtilisateur)) {
            return false;
        }
        EcoProfilUtilisateur other = (EcoProfilUtilisateur) object;
        if ((this.codeProfilUtilisateur == null && other.codeProfilUtilisateur != null) || (this.codeProfilUtilisateur != null && !this.codeProfilUtilisateur.equals(other.codeProfilUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoProfilUtilisateur[ codeProfilUtilisateur=" + codeProfilUtilisateur + " ]";
    }
    
}
