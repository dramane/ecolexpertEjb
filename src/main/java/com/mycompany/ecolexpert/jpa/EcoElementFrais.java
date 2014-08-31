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
@Table(name = "eco_element_frais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoElementFrais.findAll", query = "SELECT e FROM EcoElementFrais e"),
    @NamedQuery(name = "EcoElementFrais.findByIdEcoElementFrais", query = "SELECT e FROM EcoElementFrais e WHERE e.idEcoElementFrais = :idEcoElementFrais"),
    @NamedQuery(name = "EcoElementFrais.findByCodeElementFrais", query = "SELECT e FROM EcoElementFrais e WHERE e.codeElementFrais = :codeElementFrais"),
    @NamedQuery(name = "EcoElementFrais.findByDescription", query = "SELECT e FROM EcoElementFrais e WHERE e.description = :description"),
    @NamedQuery(name = "EcoElementFrais.findByModes", query = "SELECT e FROM EcoElementFrais e WHERE e.modes = :modes"),
    @NamedQuery(name = "EcoElementFrais.findByActif", query = "SELECT e FROM EcoElementFrais e WHERE e.actif = :actif")})
public class EcoElementFrais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_ELEMENT_FRAIS")
    private int idEcoElementFrais;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_ELEMENT_FRAIS")
    private String codeElementFrais;
    @Size(max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "MODES")
    private String modes;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoElementFrais() {
    }

    public EcoElementFrais(String codeElementFrais) {
        this.codeElementFrais = codeElementFrais;
    }

    public EcoElementFrais(String codeElementFrais, int idEcoElementFrais) {
        this.codeElementFrais = codeElementFrais;
        this.idEcoElementFrais = idEcoElementFrais;
    }

    public int getIdEcoElementFrais() {
        return idEcoElementFrais;
    }

    public void setIdEcoElementFrais(int idEcoElementFrais) {
        this.idEcoElementFrais = idEcoElementFrais;
    }

    public String getCodeElementFrais() {
        return codeElementFrais;
    }

    public void setCodeElementFrais(String codeElementFrais) {
        this.codeElementFrais = codeElementFrais;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModes() {
        return modes;
    }

    public void setModes(String modes) {
        this.modes = modes;
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
        hash += (codeElementFrais != null ? codeElementFrais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoElementFrais)) {
            return false;
        }
        EcoElementFrais other = (EcoElementFrais) object;
        if ((this.codeElementFrais == null && other.codeElementFrais != null) || (this.codeElementFrais != null && !this.codeElementFrais.equals(other.codeElementFrais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoElementFrais[ codeElementFrais=" + codeElementFrais + " ]";
    }
    
}
