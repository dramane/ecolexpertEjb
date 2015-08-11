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
@Table(name = "eco_parcours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoParcours.findAll", query = "SELECT e FROM EcoParcours e"),
    @NamedQuery(name = "EcoParcours.findByCodeParcours", query = "SELECT e FROM EcoParcours e WHERE e.codeParcours = :codeParcours"),
    @NamedQuery(name = "EcoParcours.findByAnneeAcademique", query = "SELECT e FROM EcoParcours e WHERE e.anneeAcademique = :anneeAcademique"),
    @NamedQuery(name = "EcoParcours.findByLibelleParcours", query = "SELECT e FROM EcoParcours e WHERE e.libelleParcours = :libelleParcours"),
    @NamedQuery(name = "EcoParcours.findByDescriptionParcours", query = "SELECT e FROM EcoParcours e WHERE e.descriptionParcours = :descriptionParcours"),
    @NamedQuery(name = "EcoParcours.findByNbreSemestre", query = "SELECT e FROM EcoParcours e WHERE e.nbreSemestre = :nbreSemestre"),
    @NamedQuery(name = "EcoParcours.findByCodeProfilParcours", query = "SELECT e FROM EcoParcours e WHERE e.codeProfilParcours = :codeProfilParcours"),
    @NamedQuery(name = "EcoParcours.findByCodeTypeParcours", query = "SELECT e FROM EcoParcours e WHERE e.codeTypeParcours = :codeTypeParcours"),
    @NamedQuery(name = "EcoParcours.findByCodeCycle", query = "SELECT e FROM EcoParcours e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoParcours.findByCodeSpecialite", query = "SELECT e FROM EcoParcours e WHERE e.codeSpecialite = :codeSpecialite")})
public class EcoParcours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODE_PARCOURS")
    private Integer codeParcours;
    @Size(max = 9)
    @Column(name = "ANNEE_ACADEMIQUE")
    private String anneeAcademique;
    @Size(max = 45)
    @Column(name = "LIBELLE_PARCOURS")
    private String libelleParcours;
    @Size(max = 70)
    @Column(name = "DESCRIPTION_PARCOURS")
    private String descriptionParcours;
    @Column(name = "NBRE_SEMESTRE")
    private Integer nbreSemestre;
    @Size(max = 50)
    @Column(name = "CODE_PROFIL_PARCOURS")
    private String codeProfilParcours;
    @Size(max = 50)
    @Column(name = "CODE_TYPE_PARCOURS")
    private String codeTypeParcours;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 50)
    @Column(name = "CODE_SPECIALITE")
    private String codeSpecialite;

    public EcoParcours() {
    }

    public EcoParcours(Integer codeParcours) {
        this.codeParcours = codeParcours;
    }

    public Integer getCodeParcours() {
        return codeParcours;
    }

    public void setCodeParcours(Integer codeParcours) {
        this.codeParcours = codeParcours;
    }

    public String getAnneeAcademique() {
        return anneeAcademique;
    }

    public void setAnneeAcademique(String anneeAcademique) {
        this.anneeAcademique = anneeAcademique;
    }

    public String getLibelleParcours() {
        return libelleParcours;
    }

    public void setLibelleParcours(String libelleParcours) {
        this.libelleParcours = libelleParcours;
    }

    public String getDescriptionParcours() {
        return descriptionParcours;
    }

    public void setDescriptionParcours(String descriptionParcours) {
        this.descriptionParcours = descriptionParcours;
    }

    public Integer getNbreSemestre() {
        return nbreSemestre;
    }

    public void setNbreSemestre(Integer nbreSemestre) {
        this.nbreSemestre = nbreSemestre;
    }

    public String getCodeProfilParcours() {
        return codeProfilParcours;
    }

    public void setCodeProfilParcours(String codeProfilParcours) {
        this.codeProfilParcours = codeProfilParcours;
    }

    public String getCodeTypeParcours() {
        return codeTypeParcours;
    }

    public void setCodeTypeParcours(String codeTypeParcours) {
        this.codeTypeParcours = codeTypeParcours;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    public void setCodeSpecialite(String codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeParcours != null ? codeParcours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoParcours)) {
            return false;
        }
        EcoParcours other = (EcoParcours) object;
        if ((this.codeParcours == null && other.codeParcours != null) || (this.codeParcours != null && !this.codeParcours.equals(other.codeParcours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoParcours[ codeParcours=" + codeParcours + " ]";
    }
    
}
