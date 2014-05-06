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
import javax.validation.constraints.NotNull;
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
    @NamedQuery(name = "EcoAcademique.findAll", query = "SELECT a FROM EcoAcademique a"),
    @NamedQuery(name = "EcoAcademique.findByIdacademique", query = "SELECT a FROM EcoAcademique a WHERE a.idacademique = :idacademique"),
    @NamedQuery(name = "EcoAcademique.findByNannee", query = "SELECT a FROM EcoAcademique a WHERE a.nannee = :nannee"),
    @NamedQuery(name = "EcoAcademique.findByAnneeaca", query = "SELECT a FROM EcoAcademique a WHERE a.anneeaca = :anneeaca"),
    @NamedQuery(name = "EcoAcademique.findByAnneePre", query = "SELECT a FROM EcoAcademique a WHERE a.anneePre = :anneePre"),
    @NamedQuery(name = "EcoAcademique.findByDateDebut", query = "SELECT a FROM EcoAcademique a WHERE a.dateDebut = :dateDebut"),
    @NamedQuery(name = "EcoAcademique.findByDateFin", query = "SELECT a FROM EcoAcademique a WHERE a.dateFin = :dateFin"),
    @NamedQuery(name = "EcoAcademique.findByActif", query = "SELECT a FROM EcoAcademique a WHERE a.actif = :actif")})
public class EcoAcademique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDACADEMIQUE")
    private Integer idacademique;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "NANNEE")
    private String nannee;
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Size(max = 9)
    @Column(name = "ANNEE_PRE")
    private String anneePre;
    @Column(name = "DATE_DEBUT")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Lob
    @Size(max = 16777215)
    @Column(name = "OBJECTIF")
    private String objectif;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoAcademique() {
    }

    public EcoAcademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public EcoAcademique(Integer idacademique, String nannee) {
        this.idacademique = idacademique;
        this.nannee = nannee;
    }

    public Integer getIdacademique() {
        return idacademique;
    }

    public void setIdacademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public String getNannee() {
        return nannee;
    }

    public void setNannee(String nannee) {
        this.nannee = nannee;
    }

    public String getAnneeaca() {
        return anneeaca;
    }

    public void setAnneeaca(String anneeaca) {
        this.anneeaca = anneeaca;
    }

    public String getAnneePre() {
        return anneePre;
    }

    public void setAnneePre(String anneePre) {
        this.anneePre = anneePre;
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

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
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
        return "com.mycompany.ecolexperte.jpa.Academique[ idacademique=" + idacademique + " ]";
    }
    
}
