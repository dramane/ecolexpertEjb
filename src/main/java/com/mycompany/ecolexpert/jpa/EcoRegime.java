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
@Table(name = "eco_regime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoRegime.findAll", query = "SELECT e FROM EcoRegime e"),
    @NamedQuery(name = "EcoRegime.findByIdEcoRegime", query = "SELECT e FROM EcoRegime e WHERE e.idEcoRegime = :idEcoRegime"),
    @NamedQuery(name = "EcoRegime.findByCodeRegime", query = "SELECT e FROM EcoRegime e WHERE e.codeRegime = :codeRegime"),
    @NamedQuery(name = "EcoRegime.findByRegime", query = "SELECT e FROM EcoRegime e WHERE e.regime = :regime"),
    @NamedQuery(name = "EcoRegime.findByDescription", query = "SELECT e FROM EcoRegime e WHERE e.description = :description")})
public class EcoRegime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_REGIME")
    private int idEcoRegime;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_REGIME")
    private String codeRegime;
    @Size(max = 50)
    @Column(name = "REGIME")
    private String regime;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;

    public EcoRegime() {
    }

    public EcoRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    public EcoRegime(String codeRegime, int idEcoRegime) {
        this.codeRegime = codeRegime;
        this.idEcoRegime = idEcoRegime;
    }

    public int getIdEcoRegime() {
        return idEcoRegime;
    }

    public void setIdEcoRegime(int idEcoRegime) {
        this.idEcoRegime = idEcoRegime;
    }

    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
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
        hash += (codeRegime != null ? codeRegime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoRegime)) {
            return false;
        }
        EcoRegime other = (EcoRegime) object;
        if ((this.codeRegime == null && other.codeRegime != null) || (this.codeRegime != null && !this.codeRegime.equals(other.codeRegime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoRegime[ codeRegime=" + codeRegime + " ]";
    }
    
}
