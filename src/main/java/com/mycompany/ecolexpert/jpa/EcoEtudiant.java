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
import javax.persistence.Lob;
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
@Table(name = "eco_etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEtudiant.findAll", query = "SELECT e FROM EcoEtudiant e"),
    @NamedQuery(name = "EcoEtudiant.findByNumetu", query = "SELECT e FROM EcoEtudiant e WHERE e.numetu = :numetu"),
    @NamedQuery(name = "EcoEtudiant.findByIdnumetu", query = "SELECT e FROM EcoEtudiant e WHERE e.idnumetu = :idnumetu"),
    @NamedQuery(name = "EcoEtudiant.findByNometu", query = "SELECT e FROM EcoEtudiant e WHERE e.nometu = :nometu"),
    @NamedQuery(name = "EcoEtudiant.findByPrenetu", query = "SELECT e FROM EcoEtudiant e WHERE e.prenetu = :prenetu"),
    @NamedQuery(name = "EcoEtudiant.findByCivilite", query = "SELECT e FROM EcoEtudiant e WHERE e.civilite = :civilite"),
    @NamedQuery(name = "EcoEtudiant.findByTitre", query = "SELECT e FROM EcoEtudiant e WHERE e.titre = :titre"),
    @NamedQuery(name = "EcoEtudiant.findByDtnaiss", query = "SELECT e FROM EcoEtudiant e WHERE e.dtnaiss = :dtnaiss"),
    @NamedQuery(name = "EcoEtudiant.findByVilleNaiss", query = "SELECT e FROM EcoEtudiant e WHERE e.villeNaiss = :villeNaiss"),
    @NamedQuery(name = "EcoEtudiant.findByPaysNaiss", query = "SELECT e FROM EcoEtudiant e WHERE e.paysNaiss = :paysNaiss"),
    @NamedQuery(name = "EcoEtudiant.findBySexe", query = "SELECT e FROM EcoEtudiant e WHERE e.sexe = :sexe"),
    @NamedQuery(name = "EcoEtudiant.findByNationalite", query = "SELECT e FROM EcoEtudiant e WHERE e.nationalite = :nationalite"),
    @NamedQuery(name = "EcoEtudiant.findByPhone", query = "SELECT e FROM EcoEtudiant e WHERE e.phone = :phone"),
    @NamedQuery(name = "EcoEtudiant.findByCell", query = "SELECT e FROM EcoEtudiant e WHERE e.cell = :cell"),
    @NamedQuery(name = "EcoEtudiant.findByCell2", query = "SELECT e FROM EcoEtudiant e WHERE e.cell2 = :cell2"),
    @NamedQuery(name = "EcoEtudiant.findByTelbur", query = "SELECT e FROM EcoEtudiant e WHERE e.telbur = :telbur"),
    @NamedQuery(name = "EcoEtudiant.findByBoitePostal", query = "SELECT e FROM EcoEtudiant e WHERE e.boitePostal = :boitePostal"),
    @NamedQuery(name = "EcoEtudiant.findByEmail", query = "SELECT e FROM EcoEtudiant e WHERE e.email = :email"),
    @NamedQuery(name = "EcoEtudiant.findByMatriculeNle", query = "SELECT e FROM EcoEtudiant e WHERE e.matriculeNle = :matriculeNle"),
    @NamedQuery(name = "EcoEtudiant.findByCheminPhoto", query = "SELECT e FROM EcoEtudiant e WHERE e.cheminPhoto = :cheminPhoto"),
    @NamedQuery(name = "EcoEtudiant.findByCompte", query = "SELECT e FROM EcoEtudiant e WHERE e.compte = :compte"),
    @NamedQuery(name = "EcoEtudiant.findByIntitule", query = "SELECT e FROM EcoEtudiant e WHERE e.intitule = :intitule"),
    @NamedQuery(name = "EcoEtudiant.findByTypeCompte", query = "SELECT e FROM EcoEtudiant e WHERE e.typeCompte = :typeCompte")})
public class EcoEtudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "NUMETU")
    private String numetu;
    @Column(name = "IDNUMETU")
    private Integer idnumetu;
    @Size(max = 30)
    @Column(name = "NOMETU")
    private String nometu;
    @Size(max = 70)
    @Column(name = "PRENETU")
    private String prenetu;
    @Size(max = 5)
    @Column(name = "CIVILITE")
    private String civilite;
    @Size(max = 12)
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "DTNAISS")
    @Temporal(TemporalType.DATE)
    private Date dtnaiss;
    @Size(max = 70)
    @Column(name = "VILLE_NAISS")
    private String villeNaiss;
    @Size(max = 70)
    @Column(name = "PAYS_NAISS")
    private String paysNaiss;
    @Column(name = "SEXE")
    private Character sexe;
    @Size(max = 50)
    @Column(name = "NATIONALITE")
    private String nationalite;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 18)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 18)
    @Column(name = "CELL")
    private String cell;
    @Size(max = 18)
    @Column(name = "CELL_2")
    private String cell2;
    @Size(max = 18)
    @Column(name = "TELBUR")
    private String telbur;
    @Lob
    @Size(max = 16777215)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 70)
    @Column(name = "BOITE_POSTAL")
    private String boitePostal;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 70)
    @Column(name = "EMAIL")
    private String email;
    @Lob
    @Column(name = "PHOTO")
    private byte[] photo;
    @Size(max = 15)
    @Column(name = "MATRICULE_NLE")
    private String matriculeNle;
    @Size(max = 70)
    @Column(name = "CHEMIN_PHOTO")
    private String cheminPhoto;
    @Size(max = 9)
    @Column(name = "COMPTE")
    private String compte;
    @Size(max = 70)
    @Column(name = "INTITULE")
    private String intitule;
    @Column(name = "TYPE_COMPTE")
    private Character typeCompte;

    public EcoEtudiant() {
    }

    public EcoEtudiant(String numetu) {
        this.numetu = numetu;
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public Integer getIdnumetu() {
        return idnumetu;
    }

    public void setIdnumetu(Integer idnumetu) {
        this.idnumetu = idnumetu;
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

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDtnaiss() {
        return dtnaiss;
    }

    public void setDtnaiss(Date dtnaiss) {
        this.dtnaiss = dtnaiss;
    }

    public String getVilleNaiss() {
        return villeNaiss;
    }

    public void setVilleNaiss(String villeNaiss) {
        this.villeNaiss = villeNaiss;
    }

    public String getPaysNaiss() {
        return paysNaiss;
    }

    public void setPaysNaiss(String paysNaiss) {
        this.paysNaiss = paysNaiss;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getTelbur() {
        return telbur;
    }

    public void setTelbur(String telbur) {
        this.telbur = telbur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getBoitePostal() {
        return boitePostal;
    }

    public void setBoitePostal(String boitePostal) {
        this.boitePostal = boitePostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getMatriculeNle() {
        return matriculeNle;
    }

    public void setMatriculeNle(String matriculeNle) {
        this.matriculeNle = matriculeNle;
    }

    public String getCheminPhoto() {
        return cheminPhoto;
    }

    public void setCheminPhoto(String cheminPhoto) {
        this.cheminPhoto = cheminPhoto;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Character getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(Character typeCompte) {
        this.typeCompte = typeCompte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numetu != null ? numetu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEtudiant)) {
            return false;
        }
        EcoEtudiant other = (EcoEtudiant) object;
        if ((this.numetu == null && other.numetu != null) || (this.numetu != null && !this.numetu.equals(other.numetu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEtudiant[ numetu=" + numetu + " ]";
    }
    
}
