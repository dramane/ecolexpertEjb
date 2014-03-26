/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexperte.jpa;

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
@Table(name = "type_etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeEtudiant.findAll", query = "SELECT t FROM TypeEtudiant t"),
    @NamedQuery(name = "TypeEtudiant.findByIdtypeEtudiant", query = "SELECT t FROM TypeEtudiant t WHERE t.idtypeEtudiant = :idtypeEtudiant"),
    @NamedQuery(name = "TypeEtudiant.findByTypeEtudiant", query = "SELECT t FROM TypeEtudiant t WHERE t.typeEtudiant = :typeEtudiant")})
public class TypeEtudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTYPE_ETUDIANT")
    private Integer idtypeEtudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "TYPE_ETUDIANT")
    private String typeEtudiant;

    public TypeEtudiant() {
    }

    public TypeEtudiant(Integer idtypeEtudiant) {
        this.idtypeEtudiant = idtypeEtudiant;
    }

    public TypeEtudiant(Integer idtypeEtudiant, String typeEtudiant) {
        this.idtypeEtudiant = idtypeEtudiant;
        this.typeEtudiant = typeEtudiant;
    }

    public Integer getIdtypeEtudiant() {
        return idtypeEtudiant;
    }

    public void setIdtypeEtudiant(Integer idtypeEtudiant) {
        this.idtypeEtudiant = idtypeEtudiant;
    }

    public String getTypeEtudiant() {
        return typeEtudiant;
    }

    public void setTypeEtudiant(String typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeEtudiant != null ? idtypeEtudiant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeEtudiant)) {
            return false;
        }
        TypeEtudiant other = (TypeEtudiant) object;
        if ((this.idtypeEtudiant == null && other.idtypeEtudiant != null) || (this.idtypeEtudiant != null && !this.idtypeEtudiant.equals(other.idtypeEtudiant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.TypeEtudiant[ idtypeEtudiant=" + idtypeEtudiant + " ]";
    }
    
}
