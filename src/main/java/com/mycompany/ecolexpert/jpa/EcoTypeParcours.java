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
@Table(name = "eco_type_parcours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoTypeParcours.findAll", query = "SELECT e FROM EcoTypeParcours e"),
    @NamedQuery(name = "EcoTypeParcours.findByCodeTypeParcours", query = "SELECT e FROM EcoTypeParcours e WHERE e.codeTypeParcours = :codeTypeParcours"),
    @NamedQuery(name = "EcoTypeParcours.findByLibelleTypeParcours", query = "SELECT e FROM EcoTypeParcours e WHERE e.libelleTypeParcours = :libelleTypeParcours")})
public class EcoTypeParcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_TYPE_PARCOURS")
    private String codeTypeParcours;
    @Size(max = 70)
    @Column(name = "LIBELLE_TYPE_PARCOURS")
    private String libelleTypeParcours;

    public EcoTypeParcours() {
    }

    public EcoTypeParcours(String codeTypeParcours) {
        this.codeTypeParcours = codeTypeParcours;
    }

    public String getCodeTypeParcours() {
        return codeTypeParcours;
    }

    public void setCodeTypeParcours(String codeTypeParcours) {
        this.codeTypeParcours = codeTypeParcours;
    }

    public String getLibelleTypeParcours() {
        return libelleTypeParcours;
    }

    public void setLibelleTypeParcours(String libelleTypeParcours) {
        this.libelleTypeParcours = libelleTypeParcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypeParcours != null ? codeTypeParcours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoTypeParcours)) {
            return false;
        }
        EcoTypeParcours other = (EcoTypeParcours) object;
        if ((this.codeTypeParcours == null && other.codeTypeParcours != null) || (this.codeTypeParcours != null && !this.codeTypeParcours.equals(other.codeTypeParcours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoTypeParcours[ codeTypeParcours=" + codeTypeParcours + " ]";
    }
    
}
