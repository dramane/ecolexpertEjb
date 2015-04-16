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
@Table(name = "eco_echeance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoEcheance.findAll", query = "SELECT e FROM EcoEcheance e"),
    @NamedQuery(name = "EcoEcheance.findByIdEcheance", query = "SELECT e FROM EcoEcheance e WHERE e.idEcheance = :idEcheance"),
    @NamedQuery(name = "EcoEcheance.findByCodeCycle", query = "SELECT e FROM EcoEcheance e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoEcheance.findByCodeNiveau", query = "SELECT e FROM EcoEcheance e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoEcheance.findByDrtformat", query = "SELECT e FROM EcoEcheance e WHERE e.drtformat = :drtformat"),
    @NamedQuery(name = "EcoEcheance.findByVers1", query = "SELECT e FROM EcoEcheance e WHERE e.vers1 = :vers1"),
    @NamedQuery(name = "EcoEcheance.findByVers2", query = "SELECT e FROM EcoEcheance e WHERE e.vers2 = :vers2"),
    @NamedQuery(name = "EcoEcheance.findByVers3", query = "SELECT e FROM EcoEcheance e WHERE e.vers3 = :vers3"),
    @NamedQuery(name = "EcoEcheance.findByVers4", query = "SELECT e FROM EcoEcheance e WHERE e.vers4 = :vers4"),
    @NamedQuery(name = "EcoEcheance.findByVers5", query = "SELECT e FROM EcoEcheance e WHERE e.vers5 = :vers5"),
    @NamedQuery(name = "EcoEcheance.findByVers6", query = "SELECT e FROM EcoEcheance e WHERE e.vers6 = :vers6"),
    @NamedQuery(name = "EcoEcheance.findByCompteDrtins", query = "SELECT e FROM EcoEcheance e WHERE e.compteDrtins = :compteDrtins"),
    @NamedQuery(name = "EcoEcheance.findByCompteFour", query = "SELECT e FROM EcoEcheance e WHERE e.compteFour = :compteFour"),
    @NamedQuery(name = "EcoEcheance.findByCompteProduit", query = "SELECT e FROM EcoEcheance e WHERE e.compteProduit = :compteProduit")})
public class EcoEcheance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID-ECHEANCE")
    private Integer idEcheance;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Column(name = "DRTFORMAT")
    private int drtformat;
    @Column(name = "VERS_1")
    private int vers1;
    @Column(name = "VERS_2")
    private int vers2;
    @Column(name = "VERS_3")
    private int vers3;
    @Column(name = "VERS_4")
    private int vers4;
    @Column(name = "VERS_5")
    private int vers5;
    @Column(name = "VERS_6")
    private int vers6;
    @Size(max = 7)
    @Column(name = "COMPTE_DRTINS")
    private String compteDrtins;
    @Size(max = 7)
    @Column(name = "COMPTE_FOUR")
    private String compteFour;
    @Size(max = 7)
    @Column(name = "COMPTE_PRODUIT")
    private String compteProduit;

    public EcoEcheance() {
    }

    public EcoEcheance(Integer idEcheance) {
        this.idEcheance = idEcheance;
    }

    public EcoEcheance(Integer idEcheance, int drtformat, int vers1, int vers2, int vers3, int vers4, int vers5, int vers6) {
        this.idEcheance = idEcheance;
        this.drtformat = drtformat;
        this.vers1 = vers1;
        this.vers2 = vers2;
        this.vers3 = vers3;
        this.vers4 = vers4;
        this.vers5 = vers5;
        this.vers6 = vers6;
    }

    public Integer getIdEcheance() {
        return idEcheance;
    }

    public void setIdEcheance(Integer idEcheance) {
        this.idEcheance = idEcheance;
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

    public int getDrtformat() {
        return drtformat;
    }

    public void setDrtformat(int drtformat) {
        this.drtformat = drtformat;
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

    public String getCompteDrtins() {
        return compteDrtins;
    }

    public void setCompteDrtins(String compteDrtins) {
        this.compteDrtins = compteDrtins;
    }

    public String getCompteFour() {
        return compteFour;
    }

    public void setCompteFour(String compteFour) {
        this.compteFour = compteFour;
    }

    public String getCompteProduit() {
        return compteProduit;
    }

    public void setCompteProduit(String compteProduit) {
        this.compteProduit = compteProduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEcheance != null ? idEcheance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoEcheance)) {
            return false;
        }
        EcoEcheance other = (EcoEcheance) object;
        if ((this.idEcheance == null && other.idEcheance != null) || (this.idEcheance != null && !this.idEcheance.equals(other.idEcheance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoEcheance[ idEcheance=" + idEcheance + " ]";
    }
    
}
