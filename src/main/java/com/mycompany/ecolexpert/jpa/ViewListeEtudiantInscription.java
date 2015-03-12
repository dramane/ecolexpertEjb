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
@Table(name = "view_liste_etudiant_inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewListeEtudiantInscription.findAll", query = "SELECT v FROM ViewListeEtudiantInscription v"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByIdinscription", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.idinscription = :idinscription"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByNumetu", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.numetu = :numetu"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByNometu", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.nometu = :nometu"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByPrenetu", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.prenetu = :prenetu"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByNomEtPrenom", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.nomEtPrenom = :nomEtPrenom"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByDtnaiss", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.dtnaiss = :dtnaiss"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findBySexe", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.sexe = :sexe"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCell", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.cell = :cell"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCell2", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.cell2 = :cell2"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByEmail", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.email = :email"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCompte", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.compte = :compte"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByMatricule", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.matricule = :matricule"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByAnneeaca", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.anneeaca = :anneeaca"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCours", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.cours = :cours"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByDoublant", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.doublant = :doublant"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCodeCycle", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeCycle = :codeCycle"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCodeNiveau", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCodeClasse", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeClasse = :codeClasse"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByCodeRegime", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeRegime = :codeRegime"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByScolariteAPaye", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.scolariteAPaye = :scolariteAPaye"),
    @NamedQuery(name = "ViewListeEtudiantInscription.findByScolaritePaye", query = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.scolaritePaye = :scolaritePaye")})
public class ViewListeEtudiantInscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINSCRIPTION")
    @Id
    private int idinscription;    
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

    public ViewListeEtudiantInscription() {
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
    
}
