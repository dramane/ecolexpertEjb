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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_academique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoAcademique.findAll", query = "SELECT e FROM EcoAcademique e"),
    @NamedQuery(name = "EcoAcademique.findByIdacademique", query = "SELECT e FROM EcoAcademique e WHERE e.idacademique = :idacademique"),
    @NamedQuery(name = "EcoAcademique.findByActif", query = "SELECT e FROM EcoAcademique e WHERE e.actif = :actif"),
    @NamedQuery(name = "EcoAcademique.findByAnneePre", query = "SELECT e FROM EcoAcademique e WHERE e.anneePre = :anneePre"),
    @NamedQuery(name = "EcoAcademique.findByAnneeaca", query = "SELECT e FROM EcoAcademique e WHERE e.anneeaca = :anneeaca"),
    @NamedQuery(name = "EcoAcademique.findByDateDebut", query = "SELECT e FROM EcoAcademique e WHERE e.dateDebut = :dateDebut"),
    @NamedQuery(name = "EcoAcademique.findByDateFin", query = "SELECT e FROM EcoAcademique e WHERE e.dateFin = :dateFin"),
    @NamedQuery(name = "EcoAcademique.findByNannee", query = "SELECT e FROM EcoAcademique e WHERE e.nannee = :nannee")})
public class EcoAcademique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDACADEMIQUE")
    private Integer idacademique;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;
    @Size(max = 9)
    @Column(name = "ANNEE_PRE")
    private String anneePre;
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Column(name = "DATE_DEBUT")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Size(max = 2)
    @Column(name = "NANNEE")
    private String nannee;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "OBJECTIF")
    private String objectif;

    public EcoAcademique() {
    }

    public EcoAcademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public Integer getIdacademique() {
        return idacademique;
    }

    public void setIdacademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public String getAnneePre() {
        return anneePre;
    }

    public void setAnneePre(String anneePre) {
        this.anneePre = anneePre;
    }

    public String getAnneeaca() {
        return anneeaca;
    }

    public void setAnneeaca(String anneeaca) {
        this.anneeaca = anneeaca;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getNannee() {
        return nannee;
    }

    public void setNannee(String nannee) {
        this.nannee = nannee;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacademique != null ? idacademique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoAcademique)) {
            return false;
        }
        EcoAcademique other = (EcoAcademique) object;
        if ((this.idacademique == null && other.idacademique != null) || (this.idacademique != null && !this.idacademique.equals(other.idacademique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoAcademique[ idacademique=" + idacademique + " ]";
    }
    
}
