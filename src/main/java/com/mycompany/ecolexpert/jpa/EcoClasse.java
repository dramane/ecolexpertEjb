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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_classe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoClasse.findAll", query = "SELECT e FROM EcoClasse e"),
    @NamedQuery(name = "EcoClasse.findByIdEcoClasse", query = "SELECT e FROM EcoClasse e WHERE e.idEcoClasse = :idEcoClasse"),
    @NamedQuery(name = "EcoClasse.findByCodeClasse", query = "SELECT e FROM EcoClasse e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoClasse.findByNomclasse", query = "SELECT e FROM EcoClasse e WHERE e.nomclasse = :nomclasse"),
    @NamedQuery(name = "EcoClasse.findByCodeFiliere", query = "SELECT e FROM EcoClasse e WHERE e.codeFiliere = :codeFiliere"),
    @NamedQuery(name = "EcoClasse.findByCodeCycle", query = "SELECT e FROM EcoClasse e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoClasse.findByFormation", query = "SELECT e FROM EcoClasse e WHERE e.formation = :formation"),
    @NamedQuery(name = "EcoClasse.findByDescription", query = "SELECT e FROM EcoClasse e WHERE e.description = :description"),
    @NamedQuery(name = "EcoClasse.findByNomSalle", query = "SELECT e FROM EcoClasse e WHERE e.nomSalle = :nomSalle"),
    @NamedQuery(name = "EcoClasse.findByEffectifMax", query = "SELECT e FROM EcoClasse e WHERE e.effectifMax = :effectifMax"),
    @NamedQuery(name = "EcoClasse.findByIsExam", query = "SELECT e FROM EcoClasse e WHERE e.isExam = :isExam"),
    @NamedQuery(name = "EcoClasse.findByActif", query = "SELECT e FROM EcoClasse e WHERE e.actif = :actif")})
public class EcoClasse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_CLASSE")
    private int idEcoClasse;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Size(max = 10)
    @Column(name = "NOMCLASSE")
    private String nomclasse;
    @Size(max = 50)
    @Column(name = "CODE_FILIERE")
    private String codeFiliere;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Column(name = "FORMATION")
    private Character formation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 50)
    @Column(name = "NOM_SALLE")
    private String nomSalle;
    @Column(name = "EFFECTIF_MAX")
    private Integer effectifMax;
    @Size(max = 3)
    @Column(name = "IS_EXAM")
    private String isExam;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoClasse() {
    }

    public EcoClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public EcoClasse(String codeClasse, int idEcoClasse) {
        this.codeClasse = codeClasse;
        this.idEcoClasse = idEcoClasse;
    }

    public int getIdEcoClasse() {
        return idEcoClasse;
    }

    public void setIdEcoClasse(int idEcoClasse) {
        this.idEcoClasse = idEcoClasse;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public String getNomclasse() {
        return nomclasse;
    }

    public void setNomclasse(String nomclasse) {
        this.nomclasse = nomclasse;
    }

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    public Character getFormation() {
        return formation;
    }

    public void setFormation(Character formation) {
        this.formation = formation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public Integer getEffectifMax() {
        return effectifMax;
    }

    public void setEffectifMax(Integer effectifMax) {
        this.effectifMax = effectifMax;
    }

    public String getIsExam() {
        return isExam;
    }

    public void setIsExam(String isExam) {
        this.isExam = isExam;
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
        hash += (codeClasse != null ? codeClasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoClasse)) {
            return false;
        }
        EcoClasse other = (EcoClasse) object;
        if ((this.codeClasse == null && other.codeClasse != null) || (this.codeClasse != null && !this.codeClasse.equals(other.codeClasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoClasse[ codeClasse=" + codeClasse + " ]";
    }
    
}
