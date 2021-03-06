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
@Table(name = "eco_systeme_academique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSystemeAcademique.findAll", query = "SELECT e FROM EcoSystemeAcademique e"),
    @NamedQuery(name = "EcoSystemeAcademique.findByCodeAcademique", query = "SELECT e FROM EcoSystemeAcademique e WHERE e.codeAcademique = :codeAcademique"),
    @NamedQuery(name = "EcoSystemeAcademique.findByDesignation", query = "SELECT e FROM EcoSystemeAcademique e WHERE e.designation = :designation"),
    @NamedQuery(name = "EcoSystemeAcademique.findByDescription", query = "SELECT e FROM EcoSystemeAcademique e WHERE e.description = :description")})
public class EcoSystemeAcademique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 10)
    @Column(name = "CODE_ACADEMIQUE")
    private String codeAcademique;
    @Size(max = 255)
    @Column(name = "DESIGNATION")
    private String designation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;

    public EcoSystemeAcademique() {
    }

    public EcoSystemeAcademique(String codeAcademique) {
        this.codeAcademique = codeAcademique;
    }

    public String getCodeAcademique() {
        return codeAcademique;
    }

    public void setCodeAcademique(String codeAcademique) {
        this.codeAcademique = codeAcademique;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAcademique != null ? codeAcademique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSystemeAcademique)) {
            return false;
        }
        EcoSystemeAcademique other = (EcoSystemeAcademique) object;
        if ((this.codeAcademique == null && other.codeAcademique != null) || (this.codeAcademique != null && !this.codeAcademique.equals(other.codeAcademique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSystemeAcademique[ codeAcademique=" + codeAcademique + " ]";
    }
    
}
