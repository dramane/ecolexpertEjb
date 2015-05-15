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
@Table(name = "eco_langues")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoLangues.findAll", query = "SELECT e FROM EcoLangues e"),
    @NamedQuery(name = "EcoLangues.findByIdLangue", query = "SELECT e FROM EcoLangues e WHERE e.idLangue = :idLangue"),
    @NamedQuery(name = "EcoLangues.findByLibelleLangue", query = "SELECT e FROM EcoLangues e WHERE e.libelleLangue = :libelleLangue")})
public class EcoLangues implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 3)
    @Column(name = "ID_LANGUE")
    private String idLangue;
    @Size(max = 30)
    @Column(name = "LIBELLE_LANGUE")
    private String libelleLangue;

    public EcoLangues() {
    }

    public EcoLangues(String idLangue) {
        this.idLangue = idLangue;
    }

    public String getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(String idLangue) {
        this.idLangue = idLangue;
    }

    public String getLibelleLangue() {
        return libelleLangue;
    }

    public void setLibelleLangue(String libelleLangue) {
        this.libelleLangue = libelleLangue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLangue != null ? idLangue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoLangues)) {
            return false;
        }
        EcoLangues other = (EcoLangues) object;
        if ((this.idLangue == null && other.idLangue != null) || (this.idLangue != null && !this.idLangue.equals(other.idLangue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoLangues[ idLangue=" + idLangue + " ]";
    }
    
}
