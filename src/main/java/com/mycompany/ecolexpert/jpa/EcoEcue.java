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
@Table(name = "eco_ecue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEcue.findAll", query = "SELECT e FROM EcoEcue e"),
    @NamedQuery(name = "EcoEcue.findByCodeEcue", query = "SELECT e FROM EcoEcue e WHERE e.codeEcue = :codeEcue"),
    @NamedQuery(name = "EcoEcue.findByLibelleEcue", query = "SELECT e FROM EcoEcue e WHERE e.libelleEcue = :libelleEcue"),
    @NamedQuery(name = "EcoEcue.findByHeureCm", query = "SELECT e FROM EcoEcue e WHERE e.heureCm = :heureCm"),
    @NamedQuery(name = "EcoEcue.findByHeureTd", query = "SELECT e FROM EcoEcue e WHERE e.heureTd = :heureTd"),
    @NamedQuery(name = "EcoEcue.findByHeureTp", query = "SELECT e FROM EcoEcue e WHERE e.heureTp = :heureTp"),
    @NamedQuery(name = "EcoEcue.findByCodeUeParcours", query = "SELECT e FROM EcoEcue e WHERE e.codeUeParcours = :codeUeParcours")})
public class EcoEcue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODE_ECUE")
    private Integer codeEcue;
    @Size(max = 70)
    @Column(name = "LIBELLE_ECUE")
    private String libelleEcue;
    @Column(name = "HEURE_CM")
    private Integer heureCm;
    @Column(name = "HEURE_TD")
    private Integer heureTd;
    @Column(name = "HEURE_TP")
    private Integer heureTp;
    @Column(name = "CODE_UE_PARCOURS")
    private Integer codeUeParcours;

    public EcoEcue() {
    }

    public EcoEcue(Integer codeEcue) {
        this.codeEcue = codeEcue;
    }

    public Integer getCodeEcue() {
        return codeEcue;
    }

    public void setCodeEcue(Integer codeEcue) {
        this.codeEcue = codeEcue;
    }

    public String getLibelleEcue() {
        return libelleEcue;
    }

    public void setLibelleEcue(String libelleEcue) {
        this.libelleEcue = libelleEcue;
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

    public Integer getCodeUeParcours() {
        return codeUeParcours;
    }

    public void setCodeUeParcours(Integer codeUeParcours) {
        this.codeUeParcours = codeUeParcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEcue != null ? codeEcue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEcue)) {
            return false;
        }
        EcoEcue other = (EcoEcue) object;
        if ((this.codeEcue == null && other.codeEcue != null) || (this.codeEcue != null && !this.codeEcue.equals(other.codeEcue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEcue[ codeEcue=" + codeEcue + " ]";
    }
    
}
