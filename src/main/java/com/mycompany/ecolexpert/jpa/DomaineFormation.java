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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "domaine_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DomaineFormation.findAll", query = "SELECT d FROM DomaineFormation d"),
    @NamedQuery(name = "DomaineFormation.findByIddomaine", query = "SELECT d FROM DomaineFormation d WHERE d.iddomaine = :iddomaine"),
    @NamedQuery(name = "DomaineFormation.findByCodedomaine", query = "SELECT d FROM DomaineFormation d WHERE d.codedomaine = :codedomaine"),
    @NamedQuery(name = "DomaineFormation.findByLibelledomaine", query = "SELECT d FROM DomaineFormation d WHERE d.libelledomaine = :libelledomaine")})
public class DomaineFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddomaine")
    private Integer iddomaine;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "codedomaine")
    private String codedomaine;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "libelledomaine")
    private String libelledomaine;

    public DomaineFormation() {
    }

    public DomaineFormation(Integer iddomaine) {
        this.iddomaine = iddomaine;
    }

    public DomaineFormation(Integer iddomaine, String codedomaine, String libelledomaine) {
        this.iddomaine = iddomaine;
        this.codedomaine = codedomaine;
        this.libelledomaine = libelledomaine;
    }

    public Integer getIddomaine() {
        return iddomaine;
    }

    public void setIddomaine(Integer iddomaine) {
        this.iddomaine = iddomaine;
    }

    public String getCodedomaine() {
        return codedomaine;
    }

    public void setCodedomaine(String codedomaine) {
        this.codedomaine = codedomaine;
    }

    public String getLibelledomaine() {
        return libelledomaine;
    }

    public void setLibelledomaine(String libelledomaine) {
        this.libelledomaine = libelledomaine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddomaine != null ? iddomaine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DomaineFormation)) {
            return false;
        }
        DomaineFormation other = (DomaineFormation) object;
        if ((this.iddomaine == null && other.iddomaine != null) || (this.iddomaine != null && !this.iddomaine.equals(other.iddomaine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.DomaineFormation[ iddomaine=" + iddomaine + " ]";
    }
    
}
