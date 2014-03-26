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
@Table(name = "nation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nation.findAll", query = "SELECT n FROM Nation n"),
    @NamedQuery(name = "Nation.findByIdnation", query = "SELECT n FROM Nation n WHERE n.idnation = :idnation"),
    @NamedQuery(name = "Nation.findByNomFr", query = "SELECT n FROM Nation n WHERE n.nomFr = :nomFr"),
    @NamedQuery(name = "Nation.findByNomUs", query = "SELECT n FROM Nation n WHERE n.nomUs = :nomUs"),
    @NamedQuery(name = "Nation.findByCode", query = "SELECT n FROM Nation n WHERE n.code = :code"),
    @NamedQuery(name = "Nation.findByCode2", query = "SELECT n FROM Nation n WHERE n.code2 = :code2"),
    @NamedQuery(name = "Nation.findByCapitale", query = "SELECT n FROM Nation n WHERE n.capitale = :capitale"),
    @NamedQuery(name = "Nation.findByIndicatif", query = "SELECT n FROM Nation n WHERE n.indicatif = :indicatif"),
    @NamedQuery(name = "Nation.findByNationalite", query = "SELECT n FROM Nation n WHERE n.nationalite = :nationalite"),
    @NamedQuery(name = "Nation.findByContinent", query = "SELECT n FROM Nation n WHERE n.continent = :continent"),
    @NamedQuery(name = "Nation.findByZone", query = "SELECT n FROM Nation n WHERE n.zone = :zone"),
    @NamedQuery(name = "Nation.findByActif", query = "SELECT n FROM Nation n WHERE n.actif = :actif")})
public class Nation implements Serializable {
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
    @Column(name = "ZONE")
    private int zone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public Nation() {
    }

    public Nation(Integer idnation) {
        this.idnation = idnation;
    }

    public Nation(Integer idnation, String continent, int zone, String actif) {
        this.idnation = idnation;
        this.continent = continent;
        this.zone = zone;
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

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
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
        if (!(object instanceof Nation)) {
            return false;
        }
        Nation other = (Nation) object;
        if ((this.idnation == null && other.idnation != null) || (this.idnation != null && !this.idnation.equals(other.idnation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.Nation[ idnation=" + idnation + " ]";
    }
    
}
