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
@Table(name = "view_etudiant_inscription_echeance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findAll", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByIdinscription", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.idinscription = :idinscription"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByNumetu", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.numetu = :numetu"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByNometu", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.nometu = :nometu"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByPrenetu", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.prenetu = :prenetu"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByNomEtPrenom", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.nomEtPrenom = :nomEtPrenom"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByDtnaiss", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.dtnaiss = :dtnaiss"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findBySexe", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.sexe = :sexe"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCell", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.cell = :cell"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCell2", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.cell2 = :cell2"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByEmail", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.email = :email"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCompte", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.compte = :compte"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByMatricule", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.matricule = :matricule"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByAnneeaca", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.anneeaca = :anneeaca"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCours", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.cours = :cours"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByDoublant", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.doublant = :doublant"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCodeCycle", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.codeCycle = :codeCycle"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCodeNiveau", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCodeClasse", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.codeClasse = :codeClasse"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByCodeRegime", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.codeRegime = :codeRegime"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByScolariteAPaye", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.scolariteAPaye = :scolariteAPaye"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByScolaritePaye", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.scolaritePaye = :scolaritePaye"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByIdEcheanceEtu", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.idEcheanceEtu = :idEcheanceEtu"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers1", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers1 = :vers1"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers2", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers2 = :vers2"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers3", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers3 = :vers3"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers4", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers4 = :vers4"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers5", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers5 = :vers5"),
    @NamedQuery(name = "ViewEtudiantInscriptionEcheance.findByVers6", query = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.vers6 = :vers6")})
public class ViewEtudiantInscriptionEcheance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSCRIPTION")
    @Id
    private int idinscription;
    @Basic(optional = false)
    @NotNull
    @Size(max = 6)
    @Column(name = "NUMETU")
    private String numetu;
    @Size(max = 30)
    @Column(name = "NOMETU")
    private String nometu;
    @Size(max = 70)
    @Column(name = "PRENETU")
    private String prenetu;
    @Size(max = 101)
    @Column(name = "NOM_ET_PRENOM")
    private String nomEtPrenom;
    @Column(name = "DTNAISS")
    @Temporal(TemporalType.DATE)
    private Date dtnaiss;
    @Column(name = "SEXE")
    private Character sexe;
    @Size(max = 18)
    @Column(name = "CELL")
    private String cell;
    @Size(max = 18)
    @Column(name = "CELL_2")
    private String cell2;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 70)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 9)
    @Column(name = "COMPTE")
    private String compte;
    @Size(max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Size(max = 4)
    @Column(name = "COURS")
    private String cours;
    @Column(name = "DOUBLANT")
    private Character doublant;
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
    @Column(name = "SCOLARITE_A_PAYE")
    private int scolariteAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_PAYE")
    private int scolaritePaye;
    @Column(name = "ID_ECHEANCE_ETU")
    private Integer idEcheanceEtu;
    @Column(name = "VERS_1")
    private Integer vers1;
    @Column(name = "VERS_2")
    private Integer vers2;
    @Column(name = "VERS_3")
    private Integer vers3;
    @Column(name = "VERS_4")
    private Integer vers4;
    @Column(name = "VERS_5")
    private Integer vers5;
    @Column(name = "VERS_6")
    private Integer vers6;

    public ViewEtudiantInscriptionEcheance() {
    }

    public int getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(int idinscription) {
        this.idinscription = idinscription;
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

    public String getNomEtPrenom() {
        return nomEtPrenom;
    }

    public void setNomEtPrenom(String nomEtPrenom) {
        this.nomEtPrenom = nomEtPrenom;
    }

    public Date getDtnaiss() {
        return dtnaiss;
    }

    public void setDtnaiss(Date dtnaiss) {
        this.dtnaiss = dtnaiss;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getCell2() {
        return cell2;
    }

    public void setCell2(String cell2) {
        this.cell2 = cell2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getAnneeaca() {
        return anneeaca;
    }

    public void setAnneeaca(String anneeaca) {
        this.anneeaca = anneeaca;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public Character getDoublant() {
        return doublant;
    }

    public void setDoublant(Character doublant) {
        this.doublant = doublant;
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

    public int getScolariteAPaye() {
        return scolariteAPaye;
    }

    public void setScolariteAPaye(int scolariteAPaye) {
        this.scolariteAPaye = scolariteAPaye;
    }

    public int getScolaritePaye() {
        return scolaritePaye;
    }

    public void setScolaritePaye(int scolaritePaye) {
        this.scolaritePaye = scolaritePaye;
    }

    public Integer getIdEcheanceEtu() {
        return idEcheanceEtu;
    }

    public void setIdEcheanceEtu(Integer idEcheanceEtu) {
        this.idEcheanceEtu = idEcheanceEtu;
    }

    public Integer getVers1() {
        return vers1;
    }

    public void setVers1(Integer vers1) {
        this.vers1 = vers1;
    }

    public Integer getVers2() {
        return vers2;
    }

    public void setVers2(Integer vers2) {
        this.vers2 = vers2;
    }

    public Integer getVers3() {
        return vers3;
    }

    public void setVers3(Integer vers3) {
        this.vers3 = vers3;
    }

    public Integer getVers4() {
        return vers4;
    }

    public void setVers4(Integer vers4) {
        this.vers4 = vers4;
    }

    public Integer getVers5() {
        return vers5;
    }

    public void setVers5(Integer vers5) {
        this.vers5 = vers5;
    }

    public Integer getVers6() {
        return vers6;
    }

    public void setVers6(Integer vers6) {
        this.vers6 = vers6;
    }
    
}
