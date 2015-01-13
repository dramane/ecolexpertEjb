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
    @NamedQuery(name = "EcoFraisScolarite.findByCodeMyinfo", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeMyinfo = :codeMyinfo"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeClasse", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoFraisScolarite.findByMontantFrais", query = "SELECT e FROM EcoFraisScolarite e WHERE e.montantFrais = :montantFrais"),
    @NamedQuery(name = "EcoFraisScolarite.findByIdacademique", query = "SELECT e FROM EcoFraisScolarite e WHERE e.idacademique = :idacademique"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeCycle", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeNiveau", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeRegime", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeRegime = :codeRegime"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeElementFrais", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeElementFrais = :codeElementFrais"),
    @NamedQuery(name = "EcoFraisScolarite.findByCodeCycleCodeRegime", query = "SELECT e FROM EcoFraisScolarite e WHERE e.codeMyinfo = :codeMyinfo "+
            "AND e.idacademique = :idacademique AND e.codeCycle = :codeCycle AND e.codeNiveau = :codeNiveau AND e.codeRegime = :codeRegime")})
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
    @Size(max = 50)
    @Column(name = "CODE_MYINFO")
    private String codeMyinfo;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Column(name = "MONTANT_FRAIS")
    private Integer montantFrais;
    @Column(name = "IDACADEMIQUE")
    private Integer idacademique;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 50)
    @Column(name = "CODE_REGIME")
    private String codeRegime;
    @Size(max = 50)
    @Column(name = "CODE_ELEMENT_FRAIS")
    private String codeElementFrais;

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

    public String getCodeMyinfo() {
        return codeMyinfo;
    }

    public void setCodeMyinfo(String codeMyinfo) {
        this.codeMyinfo = codeMyinfo;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public Integer getMontantFrais() {
        return montantFrais;
    }

    public void setMontantFrais(Integer montantFrais) {
        this.montantFrais = montantFrais;
    }

    public Integer getIdacademique() {
        return idacademique;
    }

    public void setIdacademique(Integer idacademique) {
        this.idacademique = idacademique;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    public String getCodeNiveau() {
        return codeNiveau;
    }

    public void setCodeNiveau(String codeNiveau) {
        this.codeNiveau = codeNiveau;
    }
    
    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    public String getCodeElementFrais() {
        return codeElementFrais;
    }

    public void setCodeElementFrais(String codeElementFrais) {
        this.codeElementFrais = codeElementFrais;
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
