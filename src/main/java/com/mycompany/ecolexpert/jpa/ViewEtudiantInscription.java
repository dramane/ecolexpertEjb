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
import javax.persistence.Id;
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
 * @author HP
 */
@Entity
@Table(name = "view_etudiant_inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewEtudiantInscription.findAll", query = "SELECT v FROM ViewEtudiantInscription v"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNumetu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.numetu = :numetu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNometu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.nometu = :nometu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByPrenetu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.prenetu = :prenetu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNationalite", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.nationalite = :nationalite"),
    @NamedQuery(name = "ViewEtudiantInscription.findByMatricule", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.matricule = :matricule"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDtinscri", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.dtinscri = :dtinscri"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeCycle", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeCycle = :codeCycle"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeNiveau", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeClasse", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeClasse = :codeClasse")})
public class ViewEtudiantInscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "NUMETU")
    @Id
    private String numetu;
    @Size(max = 30)
    @Column(name = "NOMETU")
    private String nometu;
    @Size(max = 70)
    @Column(name = "PRENETU")
    private String prenetu;
    @Size(max = 50)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Size(max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @Column(name = "DTINSCRI")
    @Temporal(TemporalType.DATE)
    private Date dtinscri;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;

    public ViewEtudiantInscription() {
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public String getNometu() {
        return nometu;
    }

    public void setNometu(String nometu) {
        this.nometu = nometu;
    }

    public String getPrenetu() {
        return prenetu;
    }

    public void setPrenetu(String prenetu) {
        this.prenetu = prenetu;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDtinscri() {
        return dtinscri;
    }

    public void setDtinscri(Date dtinscri) {
        this.dtinscri = dtinscri;
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
    
}
