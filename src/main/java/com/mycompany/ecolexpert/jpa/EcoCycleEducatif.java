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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Harrison
 */
@Entity
@Table(name = "eco_cycle_educatif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoCycleEducatif.findAll", query = "SELECT e FROM EcoCycleEducatif e"),
    @NamedQuery(name = "EcoCycleEducatif.findByIdCycleEducatif", query = "SELECT e FROM EcoCycleEducatif e WHERE e.idCycleEducatif = :idCycleEducatif"),
    @NamedQuery(name = "EcoCycleEducatif.findByCodeCycleEducatif", query = "SELECT e FROM EcoCycleEducatif e WHERE e.codeCycleEducatif = :codeCycleEducatif"),
    @NamedQuery(name = "EcoCycleEducatif.findByLibelle", query = "SELECT e FROM EcoCycleEducatif e WHERE e.libelle = :libelle"),
    @NamedQuery(name = "EcoCycleEducatif.findByDescription", query = "SELECT e FROM EcoCycleEducatif e WHERE e.description = :description"),
    @NamedQuery(name = "EcoCycleEducatif.findByActif", query = "SELECT e FROM EcoCycleEducatif e WHERE e.actif = :actif")})
public class EcoCycleEducatif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ID_CYCLE_EDUCATIF")
    private Integer idCycleEducatif;
    @Id
    @Basic(optional = false)
    @NotNull (message = "Veuillez entrer le code")
    @Size(min = 1, max = 2)
    @Column(name = "CODE_CYCLE_EDUCATIF")
    private String codeCycleEducatif;
    @Basic(optional = false)
    @NotNull (message = "Veuillez entrer le libellé")
    @Pattern (regexp = "[A-Z]", message = "Veuillez mettre les lettres en majuscule svp !")
    @Size(min = 1, max = 12)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull 
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoCycleEducatif() {
    }

    public EcoCycleEducatif(String codeCycleEducatif) {
        this.codeCycleEducatif = codeCycleEducatif;
    }

    public EcoCycleEducatif(String codeCycleEducatif, String libelle, String description, String actif) {
        this.codeCycleEducatif = codeCycleEducatif;
        this.libelle = libelle;
        this.description = description;
        this.actif = actif;
    }

    public Integer getIdCycleEducatif() {
        return idCycleEducatif;
    }

    public void setIdCycleEducatif(Integer idCycleEducatif) {
        this.idCycleEducatif = idCycleEducatif;
    }

    public String getCodeCycleEducatif() {
        return codeCycleEducatif;
    }

    public void setCodeCycleEducatif(String codeCycleEducatif) {
        this.codeCycleEducatif = codeCycleEducatif;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCycleEducatif != null ? codeCycleEducatif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoCycleEducatif)) {
            return false;
        }
        EcoCycleEducatif other = (EcoCycleEducatif) object;
        if ((this.codeCycleEducatif == null && other.codeCycleEducatif != null) || (this.codeCycleEducatif != null && !this.codeCycleEducatif.equals(other.codeCycleEducatif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoCycleEducatif[ codeCycleEducatif=" + codeCycleEducatif + " ]";
    }
    
}
