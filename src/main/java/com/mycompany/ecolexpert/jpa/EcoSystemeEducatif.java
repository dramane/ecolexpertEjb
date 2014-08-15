/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_systeme_educatif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSystemeEducatif.findAll", query = "SELECT e FROM EcoSystemeEducatif e"),
    @NamedQuery(name = "EcoSystemeEducatif.findByCodeEducatif", query = "SELECT e FROM EcoSystemeEducatif e WHERE e.codeEducatif = :codeEducatif"),
    @NamedQuery(name = "EcoSystemeEducatif.findByLibelle", query = "SELECT e FROM EcoSystemeEducatif e WHERE e.libelle = :libelle"),
    @NamedQuery(name = "EcoSystemeEducatif.findByDescription", query = "SELECT e FROM EcoSystemeEducatif e WHERE e.description = :description"),
    @NamedQuery(name = "EcoSystemeEducatif.findByActif", query = "SELECT e FROM EcoSystemeEducatif e WHERE e.actif = :actif")})
public class EcoSystemeEducatif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)  
    @Size(max = 3)
    @Column(name = "CODE_EDUCATIF")
    private String codeEducatif;
    @Size(max = 12)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;
    @OneToMany(mappedBy = "codeEducatif")
    private List<EcoSystemeAcademique> ecoSystemeAcademiqueList;

    public EcoSystemeEducatif() {
    }

    public EcoSystemeEducatif(String codeEducatif) {
        this.codeEducatif = codeEducatif;
    }

    public String getCodeEducatif() {
        return codeEducatif;
    }

    public void setCodeEducatif(String codeEducatif) {
        this.codeEducatif = codeEducatif;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
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

    @XmlTransient
    public List<EcoSystemeAcademique> getEcoSystemeAcademiqueList() {
        return ecoSystemeAcademiqueList;
    }

    public void setEcoSystemeAcademiqueList(List<EcoSystemeAcademique> ecoSystemeAcademiqueList) {
        this.ecoSystemeAcademiqueList = ecoSystemeAcademiqueList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEducatif != null ? codeEducatif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSystemeEducatif)) {
            return false;
        }
        EcoSystemeEducatif other = (EcoSystemeEducatif) object;
        if ((this.codeEducatif == null && other.codeEducatif != null) || (this.codeEducatif != null && !this.codeEducatif.equals(other.codeEducatif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSystemeEducatif[ codeEducatif=" + codeEducatif + " ]";
    }
    
}
