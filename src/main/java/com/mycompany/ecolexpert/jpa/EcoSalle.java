/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_salle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSalle.findAll", query = "SELECT e FROM EcoSalle e"),
    @NamedQuery(name = "EcoSalle.findByIdSalle", query = "SELECT e FROM EcoSalle e WHERE e.idSalle = :idSalle"),
    @NamedQuery(name = "EcoSalle.findByNomSalle", query = "SELECT e FROM EcoSalle e WHERE e.nomSalle = :nomSalle"),
    @NamedQuery(name = "EcoSalle.findByCapacite", query = "SELECT e FROM EcoSalle e WHERE e.capacite = :capacite"),
    @NamedQuery(name = "EcoSalle.findByActif", query = "SELECT e FROM EcoSalle e WHERE e.actif = :actif"),
    @NamedQuery(name = "EcoSalle.findByDateEnregistrement", query = "SELECT e FROM EcoSalle e WHERE e.dateEnregistrement = :dateEnregistrement"),
    @NamedQuery(name = "EcoSalle.findByCodeBatiment", query = "SELECT e FROM EcoSalle e WHERE e.codeBatiment = :codeBatiment")})
public class EcoSalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_SALLE")
    private int idSalle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "NOM_SALLE")
    private String nomSalle;
    @Column(name = "CAPACITE")
    private Integer capacite;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;
    @Column(name = "DATE_ENREGISTREMENT")
    @Temporal(TemporalType.DATE)
    private Date dateEnregistrement;
    @Size(max = 8)
    @Column(name = "CODE_BATIMENT")
    private String codeBatiment;

    public EcoSalle() {
    }

    public EcoSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public EcoSalle(String nomSalle, int idSalle) {
        this.nomSalle = nomSalle;
        this.idSalle = idSalle;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public Date getDateEnregistrement() {
        return dateEnregistrement;
    }

    public void setDateEnregistrement(Date dateEnregistrement) {
        this.dateEnregistrement = dateEnregistrement;
    }

    public String getCodeBatiment() {
        return codeBatiment;
    }

    public void setCodeBatiment(String codeBatiment) {
        this.codeBatiment = codeBatiment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomSalle != null ? nomSalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSalle)) {
            return false;
        }
        EcoSalle other = (EcoSalle) object;
        if ((this.nomSalle == null && other.nomSalle != null) || (this.nomSalle != null && !this.nomSalle.equals(other.nomSalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSalle[ nomSalle=" + nomSalle + " ]";
    }
    
}
