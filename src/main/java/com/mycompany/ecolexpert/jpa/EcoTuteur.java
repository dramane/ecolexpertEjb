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
@Table(name = "eco_tuteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoTuteur.findAll", query = "SELECT e FROM EcoTuteur e"),
    @NamedQuery(name = "EcoTuteur.findByIdtuteur", query = "SELECT e FROM EcoTuteur e WHERE e.idtuteur = :idtuteur"),
    @NamedQuery(name = "EcoTuteur.findByNumetu", query = "SELECT e FROM EcoTuteur e WHERE e.numetu = :numetu"),
    @NamedQuery(name = "EcoTuteur.findByNomtuteur", query = "SELECT e FROM EcoTuteur e WHERE e.nomtuteur = :nomtuteur"),
    @NamedQuery(name = "EcoTuteur.findByPrentuteur", query = "SELECT e FROM EcoTuteur e WHERE e.prentuteur = :prentuteur"),
    @NamedQuery(name = "EcoTuteur.findByStatut", query = "SELECT e FROM EcoTuteur e WHERE e.statut = :statut"),
    @NamedQuery(name = "EcoTuteur.findByTelburt", query = "SELECT e FROM EcoTuteur e WHERE e.telburt = :telburt"),
    @NamedQuery(name = "EcoTuteur.findByTeldomt", query = "SELECT e FROM EcoTuteur e WHERE e.teldomt = :teldomt"),
    @NamedQuery(name = "EcoTuteur.findByCellt1", query = "SELECT e FROM EcoTuteur e WHERE e.cellt1 = :cellt1"),
    @NamedQuery(name = "EcoTuteur.findByCellt2", query = "SELECT e FROM EcoTuteur e WHERE e.cellt2 = :cellt2"),
    @NamedQuery(name = "EcoTuteur.findByAdresset", query = "SELECT e FROM EcoTuteur e WHERE e.adresset = :adresset"),
    @NamedQuery(name = "EcoTuteur.findByProfesst", query = "SELECT e FROM EcoTuteur e WHERE e.professt = :professt")})
public class EcoTuteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTUTEUR")
    private Integer idtuteur;
    @Size(max = 4)
    @Column(name = "NUMETU")
    private String numetu;
    @Size(max = 20)
    @Column(name = "NOMTUTEUR")
    private String nomtuteur;
    @Size(max = 25)
    @Column(name = "PRENTUTEUR")
    private String prentuteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STATUT")
    private String statut;
    @Size(max = 11)
    @Column(name = "TELBURT")
    private String telburt;
    @Size(max = 11)
    @Column(name = "TELDOMT")
    private String teldomt;
    @Size(max = 11)
    @Column(name = "CELLT_1")
    private String cellt1;
    @Size(max = 11)
    @Column(name = "CELLT_2")
    private String cellt2;
    @Size(max = 50)
    @Column(name = "ADRESSET")
    private String adresset;
    @Size(max = 25)
    @Column(name = "PROFESST")
    private String professt;

    public EcoTuteur() {
    }

    public EcoTuteur(Integer idtuteur) {
        this.idtuteur = idtuteur;
    }

    public EcoTuteur(Integer idtuteur, String statut) {
        this.idtuteur = idtuteur;
        this.statut = statut;
    }

    public Integer getIdtuteur() {
        return idtuteur;
    }

    public void setIdtuteur(Integer idtuteur) {
        this.idtuteur = idtuteur;
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public String getNomtuteur() {
        return nomtuteur;
    }

    public void setNomtuteur(String nomtuteur) {
        this.nomtuteur = nomtuteur;
    }

    public String getPrentuteur() {
        return prentuteur;
    }

    public void setPrentuteur(String prentuteur) {
        this.prentuteur = prentuteur;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getTelburt() {
        return telburt;
    }

    public void setTelburt(String telburt) {
        this.telburt = telburt;
    }

    public String getTeldomt() {
        return teldomt;
    }

    public void setTeldomt(String teldomt) {
        this.teldomt = teldomt;
    }

    public String getCellt1() {
        return cellt1;
    }

    public void setCellt1(String cellt1) {
        this.cellt1 = cellt1;
    }

    public String getCellt2() {
        return cellt2;
    }

    public void setCellt2(String cellt2) {
        this.cellt2 = cellt2;
    }

    public String getAdresset() {
        return adresset;
    }

    public void setAdresset(String adresset) {
        this.adresset = adresset;
    }

    public String getProfesst() {
        return professt;
    }

    public void setProfesst(String professt) {
        this.professt = professt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtuteur != null ? idtuteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoTuteur)) {
            return false;
        }
        EcoTuteur other = (EcoTuteur) object;
        if ((this.idtuteur == null && other.idtuteur != null) || (this.idtuteur != null && !this.idtuteur.equals(other.idtuteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoTuteur[ idtuteur=" + idtuteur + " ]";
    }
    
}
