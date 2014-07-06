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
@Table(name = "eco_nation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoNation.findAll", query = "SELECT e FROM EcoNation e"),
    @NamedQuery(name = "EcoNation.findByIdnation", query = "SELECT e FROM EcoNation e WHERE e.idnation = :idnation"),
    @NamedQuery(name = "EcoNation.findByNomFr", query = "SELECT e FROM EcoNation e WHERE e.nomFr = :nomFr"),
    @NamedQuery(name = "EcoNation.findByNomUs", query = "SELECT e FROM EcoNation e WHERE e.nomUs = :nomUs"),
    @NamedQuery(name = "EcoNation.findByCode", query = "SELECT e FROM EcoNation e WHERE e.code = :code"),
    @NamedQuery(name = "EcoNation.findByCode2", query = "SELECT e FROM EcoNation e WHERE e.code2 = :code2"),
    @NamedQuery(name = "EcoNation.findByCapitale", query = "SELECT e FROM EcoNation e WHERE e.capitale = :capitale"),
    @NamedQuery(name = "EcoNation.findByIndicatif", query = "SELECT e FROM EcoNation e WHERE e.indicatif = :indicatif"),
    @NamedQuery(name = "EcoNation.findByNationalite", query = "SELECT e FROM EcoNation e WHERE e.nationalite = :nationalite"),
    @NamedQuery(name = "EcoNation.findByContinent", query = "SELECT e FROM EcoNation e WHERE e.continent = :continent"),
    @NamedQuery(name = "EcoNation.findByZones", query = "SELECT e FROM EcoNation e WHERE e.zones = :zones"),
    @NamedQuery(name = "EcoNation.findByActif", query = "SELECT e FROM EcoNation e WHERE e.actif = :actif")})
public class EcoNation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDNATION")
    private Integer idnation;
    @Size(max = 50)
    @Column(name = "NOM_FR")
    private String nomFr;
    @Size(max = 50)
    @Column(name = "NOM_US")
    private String nomUs;
    @Size(max = 3)
    @Column(name = "CODE")
    private String code;
    @Size(max = 2)
    @Column(name = "CODE2")
    private String code2;
    @Size(max = 50)
    @Column(name = "CAPITALE")
    private String capitale;
    @Size(max = 6)
    @Column(name = "INDICATIF")
    private String indicatif;
    @Size(max = 50)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CONTINENT")
    private String continent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZONES")
    private int zones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoNation() {
    }

    public EcoNation(Integer idnation) {
        this.idnation = idnation;
    }

    public EcoNation(Integer idnation, String continent, int zones, String actif) {
        this.idnation = idnation;
        this.continent = continent;
        this.zones = zones;
        this.actif = actif;
    }

    public Integer getIdnation() {
        return idnation;
    }

    public void setIdnation(Integer idnation) {
        this.idnation = idnation;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }

    public String getNomUs() {
        return nomUs;
    }

    public void setNomUs(String nomUs) {
        this.nomUs = nomUs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public String getIndicatif() {
        return indicatif;
    }

    public void setIndicatif(String indicatif) {
        this.indicatif = indicatif;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getZones() {
        return zones;
    }

    public void setZones(int zones) {
        this.zones = zones;
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
        hash += (idnation != null ? idnation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoNation)) {
            return false;
        }
        EcoNation other = (EcoNation) object;
        if ((this.idnation == null && other.idnation != null) || (this.idnation != null && !this.idnation.equals(other.idnation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoNation[ idnation=" + idnation + " ]";
    }
    
}
