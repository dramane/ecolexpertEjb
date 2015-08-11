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
@Table(name = "eco_ue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoUe.findAll", query = "SELECT e FROM EcoUe e"),
    @NamedQuery(name = "EcoUe.findByCodeUe", query = "SELECT e FROM EcoUe e WHERE e.codeUe = :codeUe"),
    @NamedQuery(name = "EcoUe.findByLibelleUe", query = "SELECT e FROM EcoUe e WHERE e.libelleUe = :libelleUe"),
    @NamedQuery(name = "EcoUe.findByDescriptionUe", query = "SELECT e FROM EcoUe e WHERE e.descriptionUe = :descriptionUe")})
public class EcoUe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_UE")
    private String codeUe;
    @Size(max = 45)
    @Column(name = "LIBELLE_UE")
    private String libelleUe;
    @Size(max = 70)
    @Column(name = "DESCRIPTION_UE")
    private String descriptionUe;

    public EcoUe() {
    }

    public EcoUe(String codeUe) {
        this.codeUe = codeUe;
    }

    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    public String getLibelleUe() {
        return libelleUe;
    }

    public void setLibelleUe(String libelleUe) {
        this.libelleUe = libelleUe;
    }

    public String getDescriptionUe() {
        return descriptionUe;
    }

    public void setDescriptionUe(String descriptionUe) {
        this.descriptionUe = descriptionUe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeUe != null ? codeUe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoUe)) {
            return false;
        }
        EcoUe other = (EcoUe) object;
        if ((this.codeUe == null && other.codeUe != null) || (this.codeUe != null && !this.codeUe.equals(other.codeUe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoUe[ codeUe=" + codeUe + " ]";
    }
    
}
