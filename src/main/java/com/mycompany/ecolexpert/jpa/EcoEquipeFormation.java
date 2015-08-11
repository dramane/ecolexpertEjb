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
@Table(name = "eco_equipe_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEquipeFormation.findAll", query = "SELECT e FROM EcoEquipeFormation e"),
    @NamedQuery(name = "EcoEquipeFormation.findByCodeEquipeForm", query = "SELECT e FROM EcoEquipeFormation e WHERE e.codeEquipeForm = :codeEquipeForm"),
    @NamedQuery(name = "EcoEquipeFormation.findByNomFormateur1", query = "SELECT e FROM EcoEquipeFormation e WHERE e.nomFormateur1 = :nomFormateur1"),
    @NamedQuery(name = "EcoEquipeFormation.findByPrenomFormateur1", query = "SELECT e FROM EcoEquipeFormation e WHERE e.prenomFormateur1 = :prenomFormateur1"),
    @NamedQuery(name = "EcoEquipeFormation.findByTitreFormateur1", query = "SELECT e FROM EcoEquipeFormation e WHERE e.titreFormateur1 = :titreFormateur1"),
    @NamedQuery(name = "EcoEquipeFormation.findByNomFormateur2", query = "SELECT e FROM EcoEquipeFormation e WHERE e.nomFormateur2 = :nomFormateur2"),
    @NamedQuery(name = "EcoEquipeFormation.findByPrenomFormateur2", query = "SELECT e FROM EcoEquipeFormation e WHERE e.prenomFormateur2 = :prenomFormateur2"),
    @NamedQuery(name = "EcoEquipeFormation.findByTitreFormateur2", query = "SELECT e FROM EcoEquipeFormation e WHERE e.titreFormateur2 = :titreFormateur2"),
    @NamedQuery(name = "EcoEquipeFormation.findByNomFormateur3", query = "SELECT e FROM EcoEquipeFormation e WHERE e.nomFormateur3 = :nomFormateur3"),
    @NamedQuery(name = "EcoEquipeFormation.findByPrenomFormateur3", query = "SELECT e FROM EcoEquipeFormation e WHERE e.prenomFormateur3 = :prenomFormateur3"),
    @NamedQuery(name = "EcoEquipeFormation.findByTitreFormateur3", query = "SELECT e FROM EcoEquipeFormation e WHERE e.titreFormateur3 = :titreFormateur3"),
    @NamedQuery(name = "EcoEquipeFormation.findByCodeFiliere", query = "SELECT e FROM EcoEquipeFormation e WHERE e.codeFiliere = :codeFiliere")})
public class EcoEquipeFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODE_EQUIPE_FORM")
    private Integer codeEquipeForm;
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
    @Size(max = 50)
    @Column(name = "CODE_FILIERE")
    private String codeFiliere;

    public EcoEquipeFormation() {
    }

    public EcoEquipeFormation(Integer codeEquipeForm) {
        this.codeEquipeForm = codeEquipeForm;
    }

    public Integer getCodeEquipeForm() {
        return codeEquipeForm;
    }

    public void setCodeEquipeForm(Integer codeEquipeForm) {
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

    public String getCodeFiliere() {
        return codeFiliere;
    }

    public void setCodeFiliere(String codeFiliere) {
        this.codeFiliere = codeFiliere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEquipeForm != null ? codeEquipeForm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEquipeFormation)) {
            return false;
        }
        EcoEquipeFormation other = (EcoEquipeFormation) object;
        if ((this.codeEquipeForm == null && other.codeEquipeForm != null) || (this.codeEquipeForm != null && !this.codeEquipeForm.equals(other.codeEquipeForm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEquipeFormation[ codeEquipeForm=" + codeEquipeForm + " ]";
    }
    
}
