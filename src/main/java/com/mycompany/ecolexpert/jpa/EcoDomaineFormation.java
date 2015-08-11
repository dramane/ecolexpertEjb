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
@Table(name = "eco_domaine_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoDomaineFormation.findAll", query = "SELECT e FROM EcoDomaineFormation e"),
    @NamedQuery(name = "EcoDomaineFormation.findByCodeDomaine", query = "SELECT e FROM EcoDomaineFormation e WHERE e.codeDomaine = :codeDomaine"),
    @NamedQuery(name = "EcoDomaineFormation.findByLibelleDomaine", query = "SELECT e FROM EcoDomaineFormation e WHERE e.libelleDomaine = :libelleDomaine")})
public class EcoDomaineFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 10)
    @Column(name = "CODE_DOMAINE")
    private String codeDomaine;
    @Size(max = 100)
    @Column(name = "LIBELLE_DOMAINE")
    private String libelleDomaine;

    public EcoDomaineFormation() {
    }

    public EcoDomaineFormation(String codeDomaine) {
        this.codeDomaine = codeDomaine;
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        this.codeDomaine = codeDomaine;
    }

    public String getLibelleDomaine() {
        return libelleDomaine;
    }

    public void setLibelleDomaine(String libelleDomaine) {
        this.libelleDomaine = libelleDomaine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeDomaine != null ? codeDomaine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoDomaineFormation)) {
            return false;
        }
        EcoDomaineFormation other = (EcoDomaineFormation) object;
        if ((this.codeDomaine == null && other.codeDomaine != null) || (this.codeDomaine != null && !this.codeDomaine.equals(other.codeDomaine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoDomaineFormation[ codeDomaine=" + codeDomaine + " ]";
    }
    
}
