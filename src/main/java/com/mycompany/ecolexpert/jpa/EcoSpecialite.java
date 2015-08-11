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
@Table(name = "eco_specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSpecialite.findAll", query = "SELECT e FROM EcoSpecialite e"),
    @NamedQuery(name = "EcoSpecialite.findByCodeSpecialite", query = "SELECT e FROM EcoSpecialite e WHERE e.codeSpecialite = :codeSpecialite"),
    @NamedQuery(name = "EcoSpecialite.findByLibelleSpecialite", query = "SELECT e FROM EcoSpecialite e WHERE e.libelleSpecialite = :libelleSpecialite"),
    @NamedQuery(name = "EcoSpecialite.findByDescriptionSpecialite", query = "SELECT e FROM EcoSpecialite e WHERE e.descriptionSpecialite = :descriptionSpecialite"),
    @NamedQuery(name = "EcoSpecialite.findByCodeFiliere", query = "SELECT e FROM EcoSpecialite e WHERE e.codeFiliere = :codeFiliere")})
public class EcoSpecialite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_SPECIALITE")
    private String codeSpecialite;
    @Size(max = 50)
    @Column(name = "LIBELLE_SPECIALITE")
    private String libelleSpecialite;
    @Size(max = 70)
    @Column(name = "DESCRIPTION_SPECIALITE")
    private String descriptionSpecialite;
    @Size(max = 50)
    @Column(name = "CODE_FILIERE")
    private String codeFiliere;

    public EcoSpecialite() {
    }

    public EcoSpecialite(String codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    public void setCodeSpecialite(String codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    public String getLibelleSpecialite() {
        return libelleSpecialite;
    }

    public void setLibelleSpecialite(String libelleSpecialite) {
        this.libelleSpecialite = libelleSpecialite;
    }

    public String getDescriptionSpecialite() {
        return descriptionSpecialite;
    }

    public void setDescriptionSpecialite(String descriptionSpecialite) {
        this.descriptionSpecialite = descriptionSpecialite;
    }

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSpecialite != null ? codeSpecialite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSpecialite)) {
            return false;
        }
        EcoSpecialite other = (EcoSpecialite) object;
        if ((this.codeSpecialite == null && other.codeSpecialite != null) || (this.codeSpecialite != null && !this.codeSpecialite.equals(other.codeSpecialite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSpecialite[ codeSpecialite=" + codeSpecialite + " ]";
    }
    
}
