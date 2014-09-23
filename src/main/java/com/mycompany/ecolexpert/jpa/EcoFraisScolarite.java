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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "eco_frais_scolarite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoFraisScolarite.findAll", query = "SELECT e FROM EcoFraisScolarite e"),
    @NamedQuery(name = "EcoFraisScolarite.findByIdEcoFraisScol", query = "SELECT e FROM EcoFraisScolarite e WHERE e.idEcoFraisScol = :idEcoFraisScol"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeFraisScolarite", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeFraisScolarite = :codeFraisScolarite"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeClasse", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoFraisScolarite.findByInscription", query = "SELECT e FROM EcoFraisScolarite e WHERE e.inscription = :inscription"),
    @NamedQuery(name = "EcoFraisScolarite.findByFormation", query = "SELECT e FROM EcoFraisScolarite e WHERE e.formation = :formation"),
    @NamedQuery(name = "EcoFraisScolarite.findBySoutenance", query = "SELECT e FROM EcoFraisScolarite e WHERE e.soutenance = :soutenance"),
    @NamedQuery(name = "EcoFraisScolarite.findByExamen", query = "SELECT e FROM EcoFraisScolarite e WHERE e.examen = :examen"),
    @NamedQuery(name = "EcoFraisScolarite.findByAssurance", query = "SELECT e FROM EcoFraisScolarite e WHERE e.assurance = :assurance"),
    @NamedQuery(name = "EcoFraisScolarite.findByTimbre", query = "SELECT e FROM EcoFraisScolarite e WHERE e.timbre = :timbre"),
    @NamedQuery(name = "EcoFraisScolarite.findByInformatique", query = "SELECT e FROM EcoFraisScolarite e WHERE e.informatique = :informatique"),
    @NamedQuery(name = "EcoFraisScolarite.findBySport", query = "SELECT e FROM EcoFraisScolarite e WHERE e.sport = :sport"),
    @NamedQuery(name = "EcoFraisScolarite.findByTransport", query = "SELECT e FROM EcoFraisScolarite e WHERE e.transport = :transport"),
    @NamedQuery(name = "EcoFraisScolarite.findByCantine", query = "SELECT e FROM EcoFraisScolarite e WHERE e.cantine = :cantine"),
    @NamedQuery(name = "EcoFraisScolarite.findByFourniture", query = "SELECT e FROM EcoFraisScolarite e WHERE e.fourniture = :fourniture"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeCycle", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoFraisScolarite.findByIdacademique", query = "SELECT e FROM EcoFraisScolarite e WHERE e.idacademique = :idacademique"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeRegime", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeRegime = :codeRegime")})
public class EcoFraisScolarite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_ECO_FRAIS_SCOL")
    private int idEcoFraisScol;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_FRAIS_SCOLARITE")
    private String codeFraisScolarite;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Column(name = "INSCRIPTION")
    private Integer inscription;
    @Column(name = "FORMATION")
    private Integer formation;
    @Column(name = "SOUTENANCE")
    private Integer soutenance;
    @Column(name = "EXAMEN")
    private Integer examen;
    @Column(name = "ASSURANCE")
    private Integer assurance;
    @Column(name = "TIMBRE")
    private Integer timbre;
    @Column(name = "INFORMATIQUE")
    private Integer informatique;
    @Column(name = "SPORT")
    private Integer sport;
    @Column(name = "TRANSPORT")
    private Integer transport;
    @Column(name = "CANTINE")
    private Integer cantine;
    @Column(name = "FOURNITURE")
    private Integer fourniture;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Column(name = "IDACADEMIQUE")
    private Integer idacademique;
    @Size(max = 50)
    @Column(name = "CODE_REGIME")
    private String codeRegime;

    public EcoFraisScolarite() {
    }

    public EcoFraisScolarite(String codeFraisScolarite) {
        this.codeFraisScolarite = codeFraisScolarite;
    }

    public EcoFraisScolarite(String codeFraisScolarite, int idEcoFraisScol) {
        this.codeFraisScolarite = codeFraisScolarite;
        this.idEcoFraisScol = idEcoFraisScol;
    }

    public int getIdEcoFraisScol() {
        return idEcoFraisScol;
    }

    public void setIdEcoFraisScol(int idEcoFraisScol) {
        this.idEcoFraisScol = idEcoFraisScol;
    }

    public String getCodeFraisScolarite() {
        return codeFraisScolarite;
    }

    public void setCodeFraisScolarite(String codeFraisScolarite) {
        this.codeFraisScolarite = codeFraisScolarite;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public Integer getInscription() {
        return inscription;
    }

    public void setInscription(Integer inscription) {
        this.inscription = inscription;
    }

    public Integer getFormation() {
        return formation;
    }

    public void setFormation(Integer formation) {
        this.formation = formation;
    }

    public Integer getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Integer soutenance) {
        this.soutenance = soutenance;
    }

    public Integer getExamen() {
        return examen;
    }

    public void setExamen(Integer examen) {
        this.examen = examen;
    }

    public Integer getAssurance() {
        return assurance;
    }

    public void setAssurance(Integer assurance) {
        this.assurance = assurance;
    }

    public Integer getTimbre() {
        return timbre;
    }

    public void setTimbre(Integer timbre) {
        this.timbre = timbre;
    }

    public Integer getInformatique() {
        return informatique;
    }

    public void setInformatique(Integer informatique) {
        this.informatique = informatique;
    }

    public Integer getSport() {
        return sport;
    }

    public void setSport(Integer sport) {
        this.sport = sport;
    }

    public Integer getTransport() {
        return transport;
    }

    public void setTransport(Integer transport) {
        this.transport = transport;
    }

    public Integer getCantine() {
        return cantine;
    }

    public void setCantine(Integer cantine) {
        this.cantine = cantine;
    }

    public Integer getFourniture() {
        return fourniture;
    }

    public void setFourniture(Integer fourniture) {
        this.fourniture = fourniture;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    public Integer getIdacademique() {
        return idacademique;
    }

    public void setIdacademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeFraisScolarite != null ? codeFraisScolarite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoFraisScolarite)) {
            return false;
        }
        EcoFraisScolarite other = (EcoFraisScolarite) object;
        if ((this.codeFraisScolarite == null && other.codeFraisScolarite != null) || (this.codeFraisScolarite != null && !this.codeFraisScolarite.equals(other.codeFraisScolarite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoFraisScolarite[ codeFraisScolarite=" + codeFraisScolarite + " ]";
    }
    
}
