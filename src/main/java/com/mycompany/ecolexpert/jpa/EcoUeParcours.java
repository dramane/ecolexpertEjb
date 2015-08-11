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
@Table(name = "eco_ue_parcours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoUeParcours.findAll", query = "SELECT e FROM EcoUeParcours e"),
    @NamedQuery(name = "EcoUeParcours.findByCodeUeParcours", query = "SELECT e FROM EcoUeParcours e WHERE e.codeUeParcours = :codeUeParcours"),
    @NamedQuery(name = "EcoUeParcours.findByCode2UeParcours", query = "SELECT e FROM EcoUeParcours e WHERE e.code2UeParcours = :code2UeParcours"),
    @NamedQuery(name = "EcoUeParcours.findByCodeParcours", query = "SELECT e FROM EcoUeParcours e WHERE e.codeParcours = :codeParcours"),
    @NamedQuery(name = "EcoUeParcours.findByCodeNiveau", query = "SELECT e FROM EcoUeParcours e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoUeParcours.findByCodeSpecialite", query = "SELECT e FROM EcoUeParcours e WHERE e.codeSpecialite = :codeSpecialite"),
    @NamedQuery(name = "EcoUeParcours.findByCodeSemetre", query = "SELECT e FROM EcoUeParcours e WHERE e.codeSemetre = :codeSemetre"),
    @NamedQuery(name = "EcoUeParcours.findByUe", query = "SELECT e FROM EcoUeParcours e WHERE e.ue = :ue"),
    @NamedQuery(name = "EcoUeParcours.findByCodeTypeUe", query = "SELECT e FROM EcoUeParcours e WHERE e.codeTypeUe = :codeTypeUe"),
    @NamedQuery(name = "EcoUeParcours.findByCreditUe", query = "SELECT e FROM EcoUeParcours e WHERE e.creditUe = :creditUe"),
    @NamedQuery(name = "EcoUeParcours.findByCoeficientUe", query = "SELECT e FROM EcoUeParcours e WHERE e.coeficientUe = :coeficientUe"),
    @NamedQuery(name = "EcoUeParcours.findByHeureCm", query = "SELECT e FROM EcoUeParcours e WHERE e.heureCm = :heureCm"),
    @NamedQuery(name = "EcoUeParcours.findByHeureTd", query = "SELECT e FROM EcoUeParcours e WHERE e.heureTd = :heureTd"),
    @NamedQuery(name = "EcoUeParcours.findByHeureTp", query = "SELECT e FROM EcoUeParcours e WHERE e.heureTp = :heureTp")})
public class EcoUeParcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODE_UE_PARCOURS")
    private Integer codeUeParcours;
    @Size(max = 25)
    @Column(name = "CODE2_UE_PARCOURS")
    private String code2UeParcours;
    @Column(name = "CODE_PARCOURS")
    private Integer codeParcours;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 50)
    @Column(name = "CODE_SPECIALITE")
    private String codeSpecialite;
    @Size(max = 50)
    @Column(name = "CODE_SEMETRE")
    private String codeSemetre;
    @Size(max = 50)
    @Column(name = "UE")
    private String ue;
    @Size(max = 50)
    @Column(name = "CODE_TYPE_UE")
    private String codeTypeUe;
    @Column(name = "CREDIT_UE")
    private Integer creditUe;
    @Column(name = "COEFICIENT_UE")
    private Integer coeficientUe;
    @Column(name = "HEURE_CM")
    private Integer heureCm;
    @Column(name = "HEURE_TD")
    private Integer heureTd;
    @Column(name = "HEURE_TP")
    private Integer heureTp;

    public EcoUeParcours() {
    }

    public EcoUeParcours(Integer codeUeParcours) {
        this.codeUeParcours = codeUeParcours;
    }

    public Integer getCodeUeParcours() {
        return codeUeParcours;
    }

    public void setCodeUeParcours(Integer codeUeParcours) {
        this.codeUeParcours = codeUeParcours;
    }

    public String getCode2UeParcours() {
        return code2UeParcours;
    }

    public void setCode2UeParcours(String code2UeParcours) {
        this.code2UeParcours = code2UeParcours;
    }

    public Integer getCodeParcours() {
        return codeParcours;
    }

    public void setCodeParcours(Integer codeParcours) {
        this.codeParcours = codeParcours;
    }

    public String getCodeNiveau() {
        return codeNiveau;
    }

    public void setCodeNiveau(String codeNiveau) {
        this.codeNiveau = codeNiveau;
    }

    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    public void setCodeSpecialite(String codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    public String getCodeSemetre() {
        return codeSemetre;
    }

    public void setCodeSemetre(String codeSemetre) {
        this.codeSemetre = codeSemetre;
    }

    public String getUe() {
        return ue;
    }

    public void setUe(String ue) {
        this.ue = ue;
    }

    public String getCodeTypeUe() {
        return codeTypeUe;
    }

    public void setCodeTypeUe(String codeTypeUe) {
        this.codeTypeUe = codeTypeUe;
    }

    public Integer getCreditUe() {
        return creditUe;
    }

    public void setCreditUe(Integer creditUe) {
        this.creditUe = creditUe;
    }

    public Integer getCoeficientUe() {
        return coeficientUe;
    }

    public void setCoeficientUe(Integer coeficientUe) {
        this.coeficientUe = coeficientUe;
    }

    public Integer getHeureCm() {
        return heureCm;
    }

    public void setHeureCm(Integer heureCm) {
        this.heureCm = heureCm;
    }

    public Integer getHeureTd() {
        return heureTd;
    }

    public void setHeureTd(Integer heureTd) {
        this.heureTd = heureTd;
    }

    public Integer getHeureTp() {
        return heureTp;
    }

    public void setHeureTp(Integer heureTp) {
        this.heureTp = heureTp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeUeParcours != null ? codeUeParcours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoUeParcours)) {
            return false;
        }
        EcoUeParcours other = (EcoUeParcours) object;
        if ((this.codeUeParcours == null && other.codeUeParcours != null) || (this.codeUeParcours != null && !this.codeUeParcours.equals(other.codeUeParcours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoUeParcours[ codeUeParcours=" + codeUeParcours + " ]";
    }
    
}
