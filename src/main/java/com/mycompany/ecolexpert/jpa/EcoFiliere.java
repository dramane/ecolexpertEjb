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
@Table(name = "eco_filiere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoFiliere.findAll", query = "SELECT e FROM EcoFiliere e"),
    @NamedQuery(name = "EcoFiliere.findByIdEcoFiliere", query = "SELECT e FROM EcoFiliere e WHERE e.idEcoFiliere = :idEcoFiliere"),
    @NamedQuery(name = "EcoFiliere.findByCodeFiliere", query = "SELECT e FROM EcoFiliere e WHERE e.codeFiliere = :codeFiliere"),
    @NamedQuery(name = "EcoFiliere.findByDesignation", query = "SELECT e FROM EcoFiliere e WHERE e.designation = :designation"),
    @NamedQuery(name = "EcoFiliere.findByDescription", query = "SELECT e FROM EcoFiliere e WHERE e.description = :description"),
    @NamedQuery(name = "EcoFiliere.findByCodeDomaine", query = "SELECT e FROM EcoFiliere e WHERE e.codeDomaine = :codeDomaine"),
    @NamedQuery(name = "EcoFiliere.findByActif", query = "SELECT e FROM EcoFiliere e WHERE e.actif = :actif")})
public class EcoFiliere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_FILIERE")
    private int idEcoFiliere;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_FILIERE")
    private String codeFiliere;
    @Size(max = 50)
    @Column(name = "DESIGNATION")
    private String designation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "CODE_DOMAINE")
    private String codeDomaine;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoFiliere() {
    }

    public EcoFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    public EcoFiliere(String codeFiliere, int idEcoFiliere) {
        this.codeFiliere = codeFiliere;
        this.idEcoFiliere = idEcoFiliere;
    }

    public int getIdEcoFiliere() {
        return idEcoFiliere;
    }

    public void setIdEcoFiliere(int idEcoFiliere) {
        this.idEcoFiliere = idEcoFiliere;
    }

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        this.codeDomaine = codeDomaine;
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
        hash += (codeFiliere != null ? codeFiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoFiliere)) {
            return false;
        }
        EcoFiliere other = (EcoFiliere) object;
        if ((this.codeFiliere == null && other.codeFiliere != null) || (this.codeFiliere != null && !this.codeFiliere.equals(other.codeFiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoFiliere[ codeFiliere=" + codeFiliere + " ]";
    }
    
}
