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
@Table(name = "eco_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoFormation.findAll", query = "SELECT e FROM EcoFormation e"),
    @NamedQuery(name = "EcoFormation.findByIdformation", query = "SELECT e FROM EcoFormation e WHERE e.idformation = :idformation"),
    @NamedQuery(name = "EcoFormation.findByActif", query = "SELECT e FROM EcoFormation e WHERE e.actif = :actif"),
    @NamedQuery(name = "EcoFormation.findByCodeformation", query = "SELECT e FROM EcoFormation e WHERE e.codeformation = :codeformation"),
    @NamedQuery(name = "EcoFormation.findByDescription", query = "SELECT e FROM EcoFormation e WHERE e.description = :description"),
    @NamedQuery(name = "EcoFormation.findByFormation", query = "SELECT e FROM EcoFormation e WHERE e.formation = :formation")})
public class EcoFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFORMATION")
    private Integer idformation;
    @Size(max = 255)
    @Column(name = "ACTIF")
    private String actif;
    @Column(name = "CODEFORMATION")
    private Character codeformation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "FORMATION")
    private String formation;

    public EcoFormation() {
    }

    public EcoFormation(Integer idformation) {
        this.idformation = idformation;
    }

    public Integer getIdformation() {
        return idformation;
    }

    public void setIdformation(Integer idformation) {
        this.idformation = idformation;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public Character getCodeformation() {
        return codeformation;
    }

    public void setCodeformation(Character codeformation) {
        this.codeformation = codeformation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformation != null ? idformation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoFormation)) {
            return false;
        }
        EcoFormation other = (EcoFormation) object;
        if ((this.idformation == null && other.idformation != null) || (this.idformation != null && !this.idformation.equals(other.idformation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoFormation[ idformation=" + idformation + " ]";
    }
    
}
