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
@Table(name = "eco_profil_utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoProfilUtilisateur.findAll", query = "SELECT e FROM EcoProfilUtilisateur e"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByIdProfilUtilisateur", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.idProfilUtilisateur = :idProfilUtilisateur"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByActive", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.active = :active"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByIdProfil", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.idProfil = :idProfil"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByIdUtilisateur", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.idUtilisateur = :idUtilisateur"),
    @NamedQuery(name = "EcoProfilUtilisateur.findByIdUtilisateurAndActive", query = "SELECT e FROM EcoProfilUtilisateur e WHERE e.idUtilisateur = :idUtilisateur AND e.active = :active")})
public class EcoProfilUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProfilUtilisateur")
    private Integer idProfilUtilisateur;
    @Column(name = "active")
    private Integer active;
    @Size(max = 255)
    @Column(name = "idProfil")
    private String idProfil;
    @Column(name = "idUtilisateur")
    private Integer idUtilisateur;

    public EcoProfilUtilisateur() {
    }

    public EcoProfilUtilisateur(Integer idProfilUtilisateur) {
        this.idProfilUtilisateur = idProfilUtilisateur;
    }

    public Integer getIdProfilUtilisateur() {
        return idProfilUtilisateur;
    }

    public void setIdProfilUtilisateur(Integer idProfilUtilisateur) {
        this.idProfilUtilisateur = idProfilUtilisateur;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getIdProfil() {
        return idProfil;
    }

    public void setIdProfil(String idProfil) {
        this.idProfil = idProfil;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfilUtilisateur != null ? idProfilUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoProfilUtilisateur)) {
            return false;
        }
        EcoProfilUtilisateur other = (EcoProfilUtilisateur) object;
        if ((this.idProfilUtilisateur == null && other.idProfilUtilisateur != null) || (this.idProfilUtilisateur != null && !this.idProfilUtilisateur.equals(other.idProfilUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoProfilUtilisateur[ idProfilUtilisateur=" + idProfilUtilisateur + " ]";
    }
    
}
