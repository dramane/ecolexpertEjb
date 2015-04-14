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
 * @author HP
 */
@Entity
@Table(name = "eco_echeance_etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEcheanceEtudiant.findAll", query = "SELECT e FROM EcoEcheanceEtudiant e"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByIdEcheanceEtu", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.idEcheanceEtu = :idEcheanceEtu"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByAnneeaca", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.anneeaca = :anneeaca"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByNumetu", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.numetu = :numetu"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByMatricule", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.matricule = :matricule"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByCodeCycle", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByCodeNiveau", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByCodeClasse", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByCodeRegime", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.codeRegime = :codeRegime"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByDrtinscri", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.drtinscri = :drtinscri"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByDrtforma", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.drtforma = :drtforma"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers1", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers1 = :vers1"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers2", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers2 = :vers2"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers3", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers3 = :vers3"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers4", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers4 = :vers4"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers5", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers5 = :vers5"),
    @NamedQuery(name = "EcoEcheanceEtudiant.findByVers6", query = "SELECT e FROM EcoEcheanceEtudiant e WHERE e.vers6 = :vers6")})
public class EcoEcheanceEtudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID-ECHEANCE-ETU")
    private Integer idEcheanceEtu;
    @Basic(optional = false)
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Size(max = 6)
    @Column(name = "NUMETU")
    private String numetu;
    @Size(max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Size(max = 50)
    @Column(name = "CODE_REGIME")
    private String codeRegime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DRTINSCRI")
    private int drtinscri;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DRTFORMA")
    private int drtforma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_1")
    private int vers1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_2")
    private int vers2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_3")
    private int vers3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_4")
    private int vers4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_5")
    private int vers5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VERS_6")
    private int vers6;

    public EcoEcheanceEtudiant() {
    }

    public EcoEcheanceEtudiant(Integer idEcheanceEtu) {
        this.idEcheanceEtu = idEcheanceEtu;
    }

    public EcoEcheanceEtudiant(Integer idEcheanceEtu, String anneeaca, int drtinscri, int drtforma, int vers1, int vers2, int vers3, int vers4, int vers5, int vers6) {
        this.idEcheanceEtu = idEcheanceEtu;
        this.anneeaca = anneeaca;
        this.drtinscri = drtinscri;
        this.drtforma = drtforma;
        this.vers1 = vers1;
        this.vers2 = vers2;
        this.vers3 = vers3;
        this.vers4 = vers4;
        this.vers5 = vers5;
        this.vers6 = vers6;
    }

    public Integer getIdEcheanceEtu() {
        return idEcheanceEtu;
    }

    public void setIdEcheanceEtu(Integer idEcheanceEtu) {
        this.idEcheanceEtu = idEcheanceEtu;
    }

    public String getAnneeaca() {
        return anneeaca;
    }

    public void setAnneeaca(String anneeaca) {
        this.anneeaca = anneeaca;
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    public int getDrtinscri() {
        return drtinscri;
    }

    public void setDrtinscri(int drtinscri) {
        this.drtinscri = drtinscri;
    }

    public int getDrtforma() {
        return drtforma;
    }

    public void setDrtforma(int drtforma) {
        this.drtforma = drtforma;
    }

    public int getVers1() {
        return vers1;
    }

    public void setVers1(int vers1) {
        this.vers1 = vers1;
    }

    public int getVers2() {
        return vers2;
    }

    public void setVers2(int vers2) {
        this.vers2 = vers2;
    }

    public int getVers3() {
        return vers3;
    }

    public void setVers3(int vers3) {
        this.vers3 = vers3;
    }

    public int getVers4() {
        return vers4;
    }

    public void setVers4(int vers4) {
        this.vers4 = vers4;
    }

    public int getVers5() {
        return vers5;
    }

    public void setVers5(int vers5) {
        this.vers5 = vers5;
    }

    public int getVers6() {
        return vers6;
    }

    public void setVers6(int vers6) {
        this.vers6 = vers6;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEcheanceEtu != null ? idEcheanceEtu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEcheanceEtudiant)) {
            return false;
        }
        EcoEcheanceEtudiant other = (EcoEcheanceEtudiant) object;
        if ((this.idEcheanceEtu == null && other.idEcheanceEtu != null) || (this.idEcheanceEtu != null && !this.idEcheanceEtu.equals(other.idEcheanceEtu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEcheanceEtudiant[ idEcheanceEtu=" + idEcheanceEtu + " ]";
    }
    
}
