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
@Table(name = "eco_profil_parcours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoProfilParcours.findAll", query = "SELECT e FROM EcoProfilParcours e"),
    @NamedQuery(name = "EcoProfilParcours.findByCodeProfilParcours", query = "SELECT e FROM EcoProfilParcours e WHERE e.codeProfilParcours = :codeProfilParcours"),
    @NamedQuery(name = "EcoProfilParcours.findByLibelleProfilParcours", query = "SELECT e FROM EcoProfilParcours e WHERE e.libelleProfilParcours = :libelleProfilParcours")})
public class EcoProfilParcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_PROFIL_PARCOURS")
    private String codeProfilParcours;
    @Size(max = 70)
    @Column(name = "LIBELLE_PROFIL_PARCOURS")
    private String libelleProfilParcours;

    public EcoProfilParcours() {
    }

    public EcoProfilParcours(String codeProfilParcours) {
        this.codeProfilParcours = codeProfilParcours;
    }

    public String getCodeProfilParcours() {
        return codeProfilParcours;
    }

    public void setCodeProfilParcours(String codeProfilParcours) {
        this.codeProfilParcours = codeProfilParcours;
    }

    public String getLibelleProfilParcours() {
        return libelleProfilParcours;
    }

    public void setLibelleProfilParcours(String libelleProfilParcours) {
        this.libelleProfilParcours = libelleProfilParcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProfilParcours != null ? codeProfilParcours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoProfilParcours)) {
            return false;
        }
        EcoProfilParcours other = (EcoProfilParcours) object;
        if ((this.codeProfilParcours == null && other.codeProfilParcours != null) || (this.codeProfilParcours != null && !this.codeProfilParcours.equals(other.codeProfilParcours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoProfilParcours[ codeProfilParcours=" + codeProfilParcours + " ]";
    }
    
}
