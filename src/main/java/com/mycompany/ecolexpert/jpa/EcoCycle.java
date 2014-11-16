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
@Table(name = "eco_cycle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoCycle.findAll", query = "SELECT e FROM EcoCycle e"),
    @NamedQuery(name = "EcoCycle.findByIdEcoCycle", query = "SELECT e FROM EcoCycle e WHERE e.idEcoCycle = :idEcoCycle"),
    @NamedQuery(name = "EcoCycle.findByCodeCycle", query = "SELECT e FROM EcoCycle e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoCycle.findByDesignation", query = "SELECT e FROM EcoCycle e WHERE e.designation = :designation"),
    @NamedQuery(name = "EcoCycle.findByDescription", query = "SELECT e FROM EcoCycle e WHERE e.description = :description"),
    @NamedQuery(name = "EcoCycle.findByNombreNiveau", query = "SELECT e FROM EcoCycle e WHERE e.nombreNiveau = :nombreNiveau"),
    @NamedQuery(name = "EcoCycle.findByActif", query = "SELECT e FROM EcoCycle e WHERE e.actif = :actif"),
    @NamedQuery(name = "EcoCycle.findByCodeAcademique", query = "SELECT e FROM EcoCycle e WHERE e.codeAcademique = :codeAcademique")})
public class EcoCycle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_CYCLE")
    private int idEcoCycle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 50)
    @Column(name = "DESIGNATION")
    private String designation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "NOMBRE_NIVEAU")
    private Integer nombreNiveau;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;
    @Size(max = 10)
    @Column(name = "CODE_ACADEMIQUE")
    private String codeAcademique;

    public EcoCycle() {
    }

    public EcoCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    public EcoCycle(String codeCycle, int idEcoCycle) {
        this.codeCycle = codeCycle;
        this.idEcoCycle = idEcoCycle;
    }

    public int getIdEcoCycle() {
        return idEcoCycle;
    }

    public void setIdEcoCycle(int idEcoCycle) {
        this.idEcoCycle = idEcoCycle;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
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

    public Integer getNombreNiveau() {
        return nombreNiveau;
    }

    public void setNombreNiveau(Integer nombreNiveau) {
        this.nombreNiveau = nombreNiveau;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public String getCodeAcademique() {
        return codeAcademique;
    }

    public void setCodeAcademique(String codeAcademique) {
        this.codeAcademique = codeAcademique;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCycle != null ? codeCycle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoCycle)) {
            return false;
        }
        EcoCycle other = (EcoCycle) object;
        if ((this.codeCycle == null && other.codeCycle != null) || (this.codeCycle != null && !this.codeCycle.equals(other.codeCycle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoCycle[ codeCycle=" + codeCycle + " ]";
    }
    
}
