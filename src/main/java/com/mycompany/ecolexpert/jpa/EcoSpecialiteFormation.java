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
 * @author HARRISON
 */
@Entity
@Table(name = "eco_specialite_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSpecialiteFormation.findAll", query = "SELECT e FROM EcoSpecialiteFormation e"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByIdSpecialiteFormation", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.idSpecialiteFormation = :idSpecialiteFormation"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByCodeSpecialiteFormation", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.codeSpecialiteFormation = :codeSpecialiteFormation"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByLibelleSpecialiteFormation", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.libelleSpecialiteFormation = :libelleSpecialiteFormation"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByDescriptionSpecialite", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.descriptionSpecialite = :descriptionSpecialite"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByCodeMentionFormation", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.codeMentionFormation = :codeMentionFormation"),
    @NamedQuery(name = "EcoSpecialiteFormation.findByActif", query = "SELECT e FROM EcoSpecialiteFormation e WHERE e.actif = :actif")})
public class EcoSpecialiteFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_SPECIALITE_FORMATION")
    private int idSpecialiteFormation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_SPECIALITE_FORMATION")
    private String codeSpecialiteFormation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "LIBELLE_SPECIALITE_FORMATION")
    private String libelleSpecialiteFormation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPTION_SPECIALITE")
    private String descriptionSpecialite;
    @Size(max = 50)
    @Column(name = "CODE_MENTION_FORMATION")
    private String codeMentionFormation;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoSpecialiteFormation() {
    }

    public EcoSpecialiteFormation(String codeSpecialiteFormation) {
        this.codeSpecialiteFormation = codeSpecialiteFormation;
    }

    public EcoSpecialiteFormation(String codeSpecialiteFormation, int idSpecialiteFormation, String libelleSpecialiteFormation, String descriptionSpecialite) {
        this.codeSpecialiteFormation = codeSpecialiteFormation;
        this.idSpecialiteFormation = idSpecialiteFormation;
        this.libelleSpecialiteFormation = libelleSpecialiteFormation;
        this.descriptionSpecialite = descriptionSpecialite;
    }

    public int getIdSpecialiteFormation() {
        return idSpecialiteFormation;
    }

    public void setIdSpecialiteFormation(int idSpecialiteFormation) {
        this.idSpecialiteFormation = idSpecialiteFormation;
    }

    public String getCodeSpecialiteFormation() {
        return codeSpecialiteFormation;
    }

    public void setCodeSpecialiteFormation(String codeSpecialiteFormation) {
        this.codeSpecialiteFormation = codeSpecialiteFormation;
    }

    public String getLibelleSpecialiteFormation() {
        return libelleSpecialiteFormation;
    }

    public void setLibelleSpecialiteFormation(String libelleSpecialiteFormation) {
        this.libelleSpecialiteFormation = libelleSpecialiteFormation;
    }

    public String getDescriptionSpecialite() {
        return descriptionSpecialite;
    }

    public void setDescriptionSpecialite(String descriptionSpecialite) {
        this.descriptionSpecialite = descriptionSpecialite;
    }

    public String getCodeMentionFormation() {
        return codeMentionFormation;
    }

    public void setCodeMentionFormation(String codeMentionFormation) {
        this.codeMentionFormation = codeMentionFormation;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSpecialiteFormation != null ? codeSpecialiteFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSpecialiteFormation)) {
            return false;
        }
        EcoSpecialiteFormation other = (EcoSpecialiteFormation) object;
        if ((this.codeSpecialiteFormation == null && other.codeSpecialiteFormation != null) || (this.codeSpecialiteFormation != null && !this.codeSpecialiteFormation.equals(other.codeSpecialiteFormation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSpecialiteFormation[ codeSpecialiteFormation=" + codeSpecialiteFormation + " ]";
    }
    
}
