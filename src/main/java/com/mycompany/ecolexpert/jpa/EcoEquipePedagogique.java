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
@Table(name = "eco_equipe_pedagogique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEquipePedagogique.findAll", query = "SELECT e FROM EcoEquipePedagogique e"),
    @NamedQuery(name = "EcoEquipePedagogique.findByCodeEquipePedag", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.codeEquipePedag = :codeEquipePedag"),
    @NamedQuery(name = "EcoEquipePedagogique.findByNomPedagog1", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.nomPedagog1 = :nomPedagog1"),
    @NamedQuery(name = "EcoEquipePedagogique.findByPrenomPedagog1", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.prenomPedagog1 = :prenomPedagog1"),
    @NamedQuery(name = "EcoEquipePedagogique.findByTitrePedagog1", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.titrePedagog1 = :titrePedagog1"),
    @NamedQuery(name = "EcoEquipePedagogique.findByNomPedagog2", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.nomPedagog2 = :nomPedagog2"),
    @NamedQuery(name = "EcoEquipePedagogique.findByPrenomPedagog2", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.prenomPedagog2 = :prenomPedagog2"),
    @NamedQuery(name = "EcoEquipePedagogique.findByTitrePedagog2", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.titrePedagog2 = :titrePedagog2"),
    @NamedQuery(name = "EcoEquipePedagogique.findByNomPedagog3", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.nomPedagog3 = :nomPedagog3"),
    @NamedQuery(name = "EcoEquipePedagogique.findByPrenomPedagog3", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.prenomPedagog3 = :prenomPedagog3"),
    @NamedQuery(name = "EcoEquipePedagogique.findByTitrePedagog3", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.titrePedagog3 = :titrePedagog3"),
    @NamedQuery(name = "EcoEquipePedagogique.findByCodeUeParcours", query = "SELECT e FROM EcoEquipePedagogique e WHERE e.codeUeParcours = :codeUeParcours")})
public class EcoEquipePedagogique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODE_EQUIPE_PEDAG")
    private Integer codeEquipePedag;
    @Size(max = 45)
    @Column(name = "NOM_PEDAGOG1")
    private String nomPedagog1;
    @Size(max = 45)
    @Column(name = "PRENOM_PEDAGOG1")
    private String prenomPedagog1;
    @Size(max = 45)
    @Column(name = "TITRE_PEDAGOG1")
    private String titrePedagog1;
    @Size(max = 45)
    @Column(name = "NOM_PEDAGOG2")
    private String nomPedagog2;
    @Size(max = 45)
    @Column(name = "PRENOM_PEDAGOG2")
    private String prenomPedagog2;
    @Size(max = 45)
    @Column(name = "TITRE_PEDAGOG2")
    private String titrePedagog2;
    @Size(max = 45)
    @Column(name = "NOM_PEDAGOG3")
    private String nomPedagog3;
    @Size(max = 45)
    @Column(name = "PRENOM_PEDAGOG3")
    private String prenomPedagog3;
    @Size(max = 45)
    @Column(name = "TITRE_PEDAGOG3")
    private String titrePedagog3;    
    @Column(name = "CODE_UE_PARCOURS")
    private Integer codeUeParcours;

    public EcoEquipePedagogique() {
    }

    public EcoEquipePedagogique(Integer codeEquipePedag) {
        this.codeEquipePedag = codeEquipePedag;
    }

    public Integer getCodeEquipePedag() {
        return codeEquipePedag;
    }

    public void setCodeEquipePedag(Integer codeEquipePedag) {
        this.codeEquipePedag = codeEquipePedag;
    }

    public String getNomPedagog1() {
        return nomPedagog1;
    }

    public void setNomPedagog1(String nomPedagog1) {
        this.nomPedagog1 = nomPedagog1;
    }

    public String getPrenomPedagog1() {
        return prenomPedagog1;
    }

    public void setPrenomPedagog1(String prenomPedagog1) {
        this.prenomPedagog1 = prenomPedagog1;
    }

    public String getTitrePedagog1() {
        return titrePedagog1;
    }

    public void setTitrePedagog1(String titrePedagog1) {
        this.titrePedagog1 = titrePedagog1;
    }

    public String getNomPedagog2() {
        return nomPedagog2;
    }

    public void setNomPedagog2(String nomPedagog2) {
        this.nomPedagog2 = nomPedagog2;
    }

    public String getPrenomPedagog2() {
        return prenomPedagog2;
    }

    public void setPrenomPedagog2(String prenomPedagog2) {
        this.prenomPedagog2 = prenomPedagog2;
    }

    public String getTitrePedagog2() {
        return titrePedagog2;
    }

    public void setTitrePedagog2(String titrePedagog2) {
        this.titrePedagog2 = titrePedagog2;
    }

    public String getNomPedagog3() {
        return nomPedagog3;
    }

    public void setNomPedagog3(String nomPedagog3) {
        this.nomPedagog3 = nomPedagog3;
    }

    public String getPrenomPedagog3() {
        return prenomPedagog3;
    }

    public void setPrenomPedagog3(String prenomPedagog3) {
        this.prenomPedagog3 = prenomPedagog3;
    }

    public String getTitrePedagog3() {
        return titrePedagog3;
    }

    public void setTitrePedagog3(String titrePedagog3) {
        this.titrePedagog3 = titrePedagog3;
    }
    
    public Integer getCodeUeParcours() {
        return codeUeParcours;
    }

    public void setCodeUeParcours(Integer codeUeParcours) {
        this.codeUeParcours = codeUeParcours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEquipePedag != null ? codeEquipePedag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEquipePedagogique)) {
            return false;
        }
        EcoEquipePedagogique other = (EcoEquipePedagogique) object;
        if ((this.codeEquipePedag == null && other.codeEquipePedag != null) || (this.codeEquipePedag != null && !this.codeEquipePedag.equals(other.codeEquipePedag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEquipePedagogique[ codeEquipePedag=" + codeEquipePedag + " ]";
    }
    
}
