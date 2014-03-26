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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "civilite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Civilite.findAll", query = "SELECT c FROM Civilite c"),
    @NamedQuery(name = "Civilite.findByIdcivilite", query = "SELECT c FROM Civilite c WHERE c.idcivilite = :idcivilite"),
    @NamedQuery(name = "Civilite.findByCivilite", query = "SELECT c FROM Civilite c WHERE c.civilite = :civilite"),
    @NamedQuery(name = "Civilite.findByLibelle", query = "SELECT c FROM Civilite c WHERE c.libelle = :libelle")})
public class Civilite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCIVILITE")
    private Integer idcivilite;
    @Size(max = 5)
    @Column(name = "CIVILITE")
    private String civilite;
    @Size(max = 12)
    @Column(name = "LIBELLE")
    private String libelle;

    public Civilite() {
    }

    public Civilite(Integer idcivilite) {
        this.idcivilite = idcivilite;
    }

    public Integer getIdcivilite() {
        return idcivilite;
    }

    public void setIdcivilite(Integer idcivilite) {
        this.idcivilite = idcivilite;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcivilite != null ? idcivilite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Civilite)) {
            return false;
        }
        Civilite other = (Civilite) object;
        if ((this.idcivilite == null && other.idcivilite != null) || (this.idcivilite != null && !this.idcivilite.equals(other.idcivilite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.Civilite[ idcivilite=" + idcivilite + " ]";
    }
    
}
