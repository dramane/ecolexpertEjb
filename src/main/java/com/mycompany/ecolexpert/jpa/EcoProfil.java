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
@Table(name = "eco_profil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoProfil.findAll", query = "SELECT e FROM EcoProfil e"),
    @NamedQuery(name = "EcoProfil.findByIdProfil", query = "SELECT e FROM EcoProfil e WHERE e.idProfil = :idProfil"),
    @NamedQuery(name = "EcoProfil.findByLibelleProfil", query = "SELECT e FROM EcoProfil e WHERE e.libelleProfil = :libelleProfil")})
public class EcoProfil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "idProfil")
    private String idProfil;
    @Size(max = 255)
    @Column(name = "libelleProfil")
    private String libelleProfil;

    public EcoProfil() {
    }

    public EcoProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public String getLibelleProfil() {
        return libelleProfil;
    }

    public void setLibelleProfil(String libelleProfil) {
        this.libelleProfil = libelleProfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfil != null ? idProfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoProfil)) {
            return false;
        }
        EcoProfil other = (EcoProfil) object;
        if ((this.idProfil == null && other.idProfil != null) || (this.idProfil != null && !this.idProfil.equals(other.idProfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoProfil[ idProfil=" + idProfil + " ]";
    }
    
}
