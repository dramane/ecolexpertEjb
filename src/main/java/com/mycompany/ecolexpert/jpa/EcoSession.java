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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "eco_session")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSession.findAll", query = "SELECT e FROM EcoSession e"),
    @NamedQuery(name = "EcoSession.findByIdsession", query = "SELECT e FROM EcoSession e WHERE e.idsession = :idsession"),
    @NamedQuery(name = "EcoSession.findByExercice", query = "SELECT e FROM EcoSession e WHERE e.exercice = :exercice"),
    @NamedQuery(name = "EcoSession.findByDateSession", query = "SELECT e FROM EcoSession e WHERE e.dateSession = :dateSession"),
    @NamedQuery(name = "EcoSession.findByPiece", query = "SELECT e FROM EcoSession e WHERE e.piece = :piece"),
    @NamedQuery(name = "EcoSession.findByCompte", query = "SELECT e FROM EcoSession e WHERE e.compte = :compte"),
    @NamedQuery(name = "EcoSession.findByLibelle", query = "SELECT e FROM EcoSession e WHERE e.libelle = :libelle"),
    @NamedQuery(name = "EcoSession.findByDebit", query = "SELECT e FROM EcoSession e WHERE e.debit = :debit"),
    @NamedQuery(name = "EcoSession.findByCredit", query = "SELECT e FROM EcoSession e WHERE e.credit = :credit"),
    @NamedQuery(name = "EcoSession.findByTypeVersement", query = "SELECT e FROM EcoSession e WHERE e.typeVersement = :typeVersement"),
    @NamedQuery(name = "EcoSession.findByNumressu", query = "SELECT e FROM EcoSession e WHERE e.numressu = :numressu"),
    @NamedQuery(name = "EcoSession.findByMatriEtu", query = "SELECT e FROM EcoSession e WHERE e.matriEtu = :matriEtu"),
    @NamedQuery(name = "EcoSession.findByAnnule", query = "SELECT e FROM EcoSession e WHERE e.annule = :annule")})
public class EcoSession implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSESSION")
    private Integer idsession;
    @Size(max = 4)
    @Column(name = "EXERCICE")
    private String exercice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_SESSION")
    @Temporal(TemporalType.DATE)
    private Date dateSession;
    @Size(max = 4)
    @Column(name = "PIECE")
    private String piece;
    @Size(max = 8)
    @Column(name = "COMPTE")
    private String compte;
    @Size(max = 70)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DEBIT")
    private int debit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREDIT")
    private int credit;
    @Column(name = "TYPE_VERSEMENT")
    private Character typeVersement;
    @Size(max = 8)
    @Column(name = "NUMRESSU")
    private String numressu;
    @Size(max = 14)
    @Column(name = "MATRI_ETU")
    private String matriEtu;
    @Size(max = 1)
    @Column(name = "ANNULE")
    private String annule;

    public EcoSession() {
    }

    public EcoSession(Integer idsession) {
        this.idsession = idsession;
    }

    public EcoSession(Integer idsession, Date dateSession, int debit, int credit) {
        this.idsession = idsession;
        this.dateSession = dateSession;
        this.debit = debit;
        this.credit = credit;
    }

    public Integer getIdsession() {
        return idsession;
    }

    public void setIdsession(Integer idsession) {
        this.idsession = idsession;
    }

    public String getExercice() {
        return exercice;
    }

    public void setExercice(String exercice) {
        this.exercice = exercice;
    }

    public Date getDateSession() {
        return dateSession;
    }

    public void setDateSession(Date dateSession) {
        this.dateSession = dateSession;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Character getTypeVersement() {
        return typeVersement;
    }

    public void setTypeVersement(Character typeVersement) {
        this.typeVersement = typeVersement;
    }

    public String getNumressu() {
        return numressu;
    }

    public void setNumressu(String numressu) {
        this.numressu = numressu;
    }

    public String getMatriEtu() {
        return matriEtu;
    }

    public void setMatriEtu(String matriEtu) {
        this.matriEtu = matriEtu;
    }

    public String getAnnule() {
        return annule;
    }

    public void setAnnule(String annule) {
        this.annule = annule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsession != null ? idsession.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSession)) {
            return false;
        }
        EcoSession other = (EcoSession) object;
        if ((this.idsession == null && other.idsession != null) || (this.idsession != null && !this.idsession.equals(other.idsession))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSession[ idsession=" + idsession + " ]";
    }
    
}
