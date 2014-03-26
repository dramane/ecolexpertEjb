/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexperte.jpa;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f"),
    @NamedQuery(name = "Formation.findByIdformation", query = "SELECT f FROM Formation f WHERE f.idformation = :idformation"),
    @NamedQuery(name = "Formation.findByFormation", query = "SELECT f FROM Formation f WHERE f.formation = :formation"),
    @NamedQuery(name = "Formation.findByDescription", query = "SELECT f FROM Formation f WHERE f.description = :description"),
    @NamedQuery(name = "Formation.findByCodeformation", query = "SELECT f FROM Formation f WHERE f.codeformation = :codeformation"),
    @NamedQuery(name = "Formation.findByActif", query = "SELECT f FROM Formation f WHERE f.actif = :actif")})
public class Formation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFORMATION")
    private Integer idformation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FORMATION")
    private String formation;
    @Size(max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEFORMATION")
    private char codeformation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public Formation() {
    }

    public Formation(Integer idformation) {
        this.idformation = idformation;
    }

    public Formation(Integer idformation, String formation, char codeformation, String actif) {
        this.idformation = idformation;
        this.formation = formation;
        this.codeformation = codeformation;
        this.actif = actif;
    }

    public Integer getIdformation() {
        return idformation;
    }

    public void setIdformation(Integer idformation) {
        this.idformation = idformation;
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

    public char getCodeformation() {
        return codeformation;
    }

    public void setCodeformation(char codeformation) {
        this.codeformation = codeformation;
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
        hash += (idformation != null ? idformation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.idformation == null && other.idformation != null) || (this.idformation != null && !this.idformation.equals(other.idformation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.Formation[ idformation=" + idformation + " ]";
    }
    
}
