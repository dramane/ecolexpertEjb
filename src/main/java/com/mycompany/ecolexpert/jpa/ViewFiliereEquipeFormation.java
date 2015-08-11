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
@Table(name = "view_filiere_equipe_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewFiliereEquipeFormation.findAll", query = "SELECT v FROM ViewFiliereEquipeFormation v"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByIdEcoFiliere", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.idEcoFiliere = :idEcoFiliere"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByCodeFiliere", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.codeFiliere = :codeFiliere"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByDesignation", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.designation = :designation"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByDescription", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.description = :description"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByCodeDomaine", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.codeDomaine = :codeDomaine"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByActif", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.actif = :actif"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByCodeEquipeForm", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.codeEquipeForm = :codeEquipeForm"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByNomFormateur1", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.nomFormateur1 = :nomFormateur1"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByPrenomFormateur1", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.prenomFormateur1 = :prenomFormateur1"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByTitreFormateur1", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.titreFormateur1 = :titreFormateur1"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByNomFormateur2", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.nomFormateur2 = :nomFormateur2"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByPrenomFormateur2", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.prenomFormateur2 = :prenomFormateur2"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByTitreFormateur2", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.titreFormateur2 = :titreFormateur2"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByNomFormateur3", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.nomFormateur3 = :nomFormateur3"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByPrenomFormateur3", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.prenomFormateur3 = :prenomFormateur3"),
    @NamedQuery(name = "ViewFiliereEquipeFormation.findByTitreFormateur3", query = "SELECT v FROM ViewFiliereEquipeFormation v WHERE v.titreFormateur3 = :titreFormateur3")})
public class ViewFiliereEquipeFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ECO_FILIERE")
    private int idEcoFiliere;
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_FILIERE")
    @Id
    private String codeFiliere;
    @Size(max = 50)
    @Column(name = "DESIGNATION")
    private String designation;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "CODE_DOMAINE")
    private String codeDomaine;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_EQUIPE_FORM")
    private int codeEquipeForm;
    @Size(max = 45)
    @Column(name = "NOM_FORMATEUR1")
    private String nomFormateur1;
    @Size(max = 45)
    @Column(name = "PRENOM_FORMATEUR1")
    private String prenomFormateur1;
    @Size(max = 45)
    @Column(name = "TITRE_FORMATEUR1")
    private String titreFormateur1;
    @Size(max = 45)
    @Column(name = "NOM_FORMATEUR2")
    private String nomFormateur2;
    @Size(max = 45)
    @Column(name = "PRENOM_FORMATEUR2")
    private String prenomFormateur2;
    @Size(max = 45)
    @Column(name = "TITRE_FORMATEUR2")
    private String titreFormateur2;
    @Size(max = 45)
    @Column(name = "NOM_FORMATEUR3")
    private String nomFormateur3;
    @Size(max = 45)
    @Column(name = "PRENOM_FORMATEUR3")
    private String prenomFormateur3;
    @Size(max = 45)
    @Column(name = "TITRE_FORMATEUR3")
    private String titreFormateur3;

    public ViewFiliereEquipeFormation() {
    }

    public int getIdEcoFiliere() {
        return idEcoFiliere;
    }

    public void setIdEcoFiliere(int idEcoFiliere) {
        this.idEcoFiliere = idEcoFiliere;
    }

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        this.codeDomaine = codeDomaine;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public int getCodeEquipeForm() {
        return codeEquipeForm;
    }

    public void setCodeEquipeForm(int codeEquipeForm) {
        this.codeEquipeForm = codeEquipeForm;
    }

    public String getNomFormateur1() {
        return nomFormateur1;
    }

    public void setNomFormateur1(String nomFormateur1) {
        this.nomFormateur1 = nomFormateur1;
    }

    public String getPrenomFormateur1() {
        return prenomFormateur1;
    }

    public void setPrenomFormateur1(String prenomFormateur1) {
        this.prenomFormateur1 = prenomFormateur1;
    }

    public String getTitreFormateur1() {
        return titreFormateur1;
    }

    public void setTitreFormateur1(String titreFormateur1) {
        this.titreFormateur1 = titreFormateur1;
    }

    public String getNomFormateur2() {
        return nomFormateur2;
    }

    public void setNomFormateur2(String nomFormateur2) {
        this.nomFormateur2 = nomFormateur2;
    }

    public String getPrenomFormateur2() {
        return prenomFormateur2;
    }

    public void setPrenomFormateur2(String prenomFormateur2) {
        this.prenomFormateur2 = prenomFormateur2;
    }

    public String getTitreFormateur2() {
        return titreFormateur2;
    }

    public void setTitreFormateur2(String titreFormateur2) {
        this.titreFormateur2 = titreFormateur2;
    }

    public String getNomFormateur3() {
        return nomFormateur3;
    }

    public void setNomFormateur3(String nomFormateur3) {
        this.nomFormateur3 = nomFormateur3;
    }

    public String getPrenomFormateur3() {
        return prenomFormateur3;
    }

    public void setPrenomFormateur3(String prenomFormateur3) {
        this.prenomFormateur3 = prenomFormateur3;
    }

    public String getTitreFormateur3() {
        return titreFormateur3;
    }

    public void setTitreFormateur3(String titreFormateur3) {
        this.titreFormateur3 = titreFormateur3;
    }
    
}
