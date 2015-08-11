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
@Table(name = "eco_type_ue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoTypeUe.findAll", query = "SELECT e FROM EcoTypeUe e"),
    @NamedQuery(name = "EcoTypeUe.findByCodeTypeUe", query = "SELECT e FROM EcoTypeUe e WHERE e.codeTypeUe = :codeTypeUe"),
    @NamedQuery(name = "EcoTypeUe.findByLibelleTypeUe", query = "SELECT e FROM EcoTypeUe e WHERE e.libelleTypeUe = :libelleTypeUe"),
    @NamedQuery(name = "EcoTypeUe.findByDescrptionTypeUe", query = "SELECT e FROM EcoTypeUe e WHERE e.descrptionTypeUe = :descrptionTypeUe")})
public class EcoTypeUe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_TYPE_UE")
    private String codeTypeUe;
    @Size(max = 45)
    @Column(name = "LIBELLE_TYPE_UE")
    private String libelleTypeUe;
    @Size(max = 70)
    @Column(name = "DESCRPTION_TYPE_UE")
    private String descrptionTypeUe;

    public EcoTypeUe() {
    }

    public EcoTypeUe(String codeTypeUe) {
        this.codeTypeUe = codeTypeUe;
    }

    public String getCodeTypeUe() {
        return codeTypeUe;
    }

    public void setCodeTypeUe(String codeTypeUe) {
        this.codeTypeUe = codeTypeUe;
    }

    public String getLibelleTypeUe() {
        return libelleTypeUe;
    }

    public void setLibelleTypeUe(String libelleTypeUe) {
        this.libelleTypeUe = libelleTypeUe;
    }

    public String getDescrptionTypeUe() {
        return descrptionTypeUe;
    }

    public void setDescrptionTypeUe(String descrptionTypeUe) {
        this.descrptionTypeUe = descrptionTypeUe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypeUe != null ? codeTypeUe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoTypeUe)) {
            return false;
        }
        EcoTypeUe other = (EcoTypeUe) object;
        if ((this.codeTypeUe == null && other.codeTypeUe != null) || (this.codeTypeUe != null && !this.codeTypeUe.equals(other.codeTypeUe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoTypeUe[ codeTypeUe=" + codeTypeUe + " ]";
    }
    
}
