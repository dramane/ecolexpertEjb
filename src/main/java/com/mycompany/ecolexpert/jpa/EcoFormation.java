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
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoFormation.findAll", query = "SELECT e FROM EcoFormation e"),
    @NamedQuery(name = "EcoFormation.findByIdFormation", query = "SELECT e FROM EcoFormation e WHERE e.idFormation = :idFormation"),
    @NamedQuery(name = "EcoFormation.findByCodeFormation", query = "SELECT e FROM EcoFormation e WHERE e.codeFormation = :codeFormation"),
    @NamedQuery(name = "EcoFormation.findByFormation", query = "SELECT e FROM EcoFormation e WHERE e.formation = :formation"),
    @NamedQuery(name = "EcoFormation.findByDescription", query = "SELECT e FROM EcoFormation e WHERE e.description = :description"),
    @NamedQuery(name = "EcoFormation.findByActif", query = "SELECT e FROM EcoFormation e WHERE e.actif = :actif")})
public class EcoFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_FORMATION")
    private int idFormation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 1)
    @Column(name = "CODE_FORMATION")
    private String codeFormation;
    @Size(max = 50)
    @Column(name = "FORMATION")
    private String formation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoFormation() {
    }

    public EcoFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public EcoFormation(String codeFormation, int idFormation) {
        this.codeFormation = codeFormation;
        this.idFormation = idFormation;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (codeFormation != null ? codeFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoFormation)) {
            return false;
        }
        EcoFormation other = (EcoFormation) object;
        if ((this.codeFormation == null && other.codeFormation != null) || (this.codeFormation != null && !this.codeFormation.equals(other.codeFormation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoFormation[ codeFormation=" + codeFormation + " ]";
    }
    
}
