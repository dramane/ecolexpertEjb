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
 * @author HP
 */
@Entity
@Table(name = "eco_numetu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoNumetu.findAll", query = "SELECT e FROM EcoNumetu e"),
    @NamedQuery(name = "EcoNumetu.findByIdnumetu", query = "SELECT e FROM EcoNumetu e WHERE e.idnumetu = :idnumetu"),
    @NamedQuery(name = "EcoNumetu.findByCompte", query = "SELECT e FROM EcoNumetu e WHERE e.compte = :compte"),
    @NamedQuery(name = "EcoNumetu.findByLibelle", query = "SELECT e FROM EcoNumetu e WHERE e.libelle = :libelle")})
public class EcoNumetu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDNUMETU")
    private Integer idnumetu;
    @Size(max = 9)
    @Column(name = "COMPTE")
    private String compte;
    @Size(max = 70)
    @Column(name = "LIBELLE")
    private String libelle;

    public EcoNumetu() {
    }

    public EcoNumetu(Integer idnumetu) {
        this.idnumetu = idnumetu;
    }

    public Integer getIdnumetu() {
        return idnumetu;
    }

    public void setIdnumetu(Integer idnumetu) {
        this.idnumetu = idnumetu;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
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
        hash += (idnumetu != null ? idnumetu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoNumetu)) {
            return false;
        }
        EcoNumetu other = (EcoNumetu) object;
        if ((this.idnumetu == null && other.idnumetu != null) || (this.idnumetu != null && !this.idnumetu.equals(other.idnumetu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoNumetu[ idnumetu=" + idnumetu + " ]";
    }
    
}
