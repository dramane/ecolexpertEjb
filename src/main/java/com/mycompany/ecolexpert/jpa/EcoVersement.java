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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "eco_versement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoVersement.findAll", query = "SELECT e FROM EcoVersement e"),
    @NamedQuery(name = "EcoVersement.findByIdversement", query = "SELECT e FROM EcoVersement e WHERE e.idversement = :idversement"),
    @NamedQuery(name = "EcoVersement.findByNumressu", query = "SELECT e FROM EcoVersement e WHERE e.numressu = :numressu"),
    @NamedQuery(name = "EcoVersement.findByAnneesco", query = "SELECT e FROM EcoVersement e WHERE e.anneesco = :anneesco"),
    @NamedQuery(name = "EcoVersement.findByNumetu", query = "SELECT e FROM EcoVersement e WHERE e.numetu = :numetu"),
    @NamedQuery(name = "EcoVersement.findByMatriEtu", query = "SELECT e FROM EcoVersement e WHERE e.matriEtu = :matriEtu"),
    @NamedQuery(name = "EcoVersement.findByCodeCycle", query = "SELECT e FROM EcoVersement e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoVersement.findByCodeNiveau", query = "SELECT e FROM EcoVersement e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoVersement.findByCodeClasse", query = "SELECT e FROM EcoVersement e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoVersement.findByCours", query = "SELECT e FROM EcoVersement e WHERE e.cours = :cours"),
    @NamedQuery(name = "EcoVersement.findByFormation", query = "SELECT e FROM EcoVersement e WHERE e.formation = :formation"),
    @NamedQuery(name = "EcoVersement.findByModeReglement", query = "SELECT e FROM EcoVersement e WHERE e.modeReglement = :modeReglement"),
    @NamedQuery(name = "EcoVersement.findByMotifReglement", query = "SELECT e FROM EcoVersement e WHERE e.motifReglement = :motifReglement"),
    @NamedQuery(name = "EcoVersement.findByMontant", query = "SELECT e FROM EcoVersement e WHERE e.montant = :montant"),
    @NamedQuery(name = "EcoVersement.findByDateReglement", query = "SELECT e FROM EcoVersement e WHERE e.dateReglement = :dateReglement"),
    @NamedQuery(name = "EcoVersement.findByHeureReglement", query = "SELECT e FROM EcoVersement e WHERE e.heureReglement = :heureReglement"),
    @NamedQuery(name = "EcoVersement.findByCaissiere", query = "SELECT e FROM EcoVersement e WHERE e.caissiere = :caissiere"),
    @NamedQuery(name = "EcoVersement.findByBanque", query = "SELECT e FROM EcoVersement e WHERE e.banque = :banque"),
    @NamedQuery(name = "EcoVersement.findByDateChq", query = "SELECT e FROM EcoVersement e WHERE e.dateChq = :dateChq"),
    @NamedQuery(name = "EcoVersement.findByNumChq", query = "SELECT e FROM EcoVersement e WHERE e.numChq = :numChq"),
    @NamedQuery(name = "EcoVersement.findByNumVersViremBq", query = "SELECT e FROM EcoVersement e WHERE e.numVersViremBq = :numVersViremBq"),
    @NamedQuery(name = "EcoVersement.findByEmetteur", query = "SELECT e FROM EcoVersement e WHERE e.emetteur = :emetteur"),
    @NamedQuery(name = "EcoVersement.findByBqDepartVirem", query = "SELECT e FROM EcoVersement e WHERE e.bqDepartVirem = :bqDepartVirem"),
    @NamedQuery(name = "EcoVersement.findByBqArriveVirem", query = "SELECT e FROM EcoVersement e WHERE e.bqArriveVirem = :bqArriveVirem"),
    @NamedQuery(name = "EcoVersement.findByObjet", query = "SELECT e FROM EcoVersement e WHERE e.objet = :objet"),
    @NamedQuery(name = "EcoVersement.findByNumPiece", query = "SELECT e FROM EcoVersement e WHERE e.numPiece = :numPiece"),
    @NamedQuery(name = "EcoVersement.findByAnnule", query = "SELECT e FROM EcoVersement e WHERE e.annule = :annule")})
public class EcoVersement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVERSEMENT")
    private Integer idversement;
    @Size(max = 8)
    @Column(name = "NUMRESSU")
    private String numressu;
    @Size(max = 9)
    @Column(name = "ANNEESCO")
    private String anneesco;
    @Size(max = 6)
    @Column(name = "NUMETU")
    private String numetu;
    @Size(max = 14)
    @Column(name = "MATRI_ETU")
    private String matriEtu;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Size(max = 4)
    @Column(name = "COURS")
    private String cours;
    @Size(max = 10)
    @Column(name = "FORMATION")
    private String formation;
    @Size(max = 8)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Size(max = 45)
    @Column(name = "MOTIF_REGLEMENT")
    private String motifReglement;
    @Column(name = "MONTANT")
    private Integer montant;
    @Column(name = "DATE_REGLEMENT")
    @Temporal(TemporalType.DATE)
    private Date dateReglement;
    @Size(max = 5)
    @Column(name = "HEURE_REGLEMENT")
    private String heureReglement;
    @Size(max = 32)
    @Column(name = "CAISSIERE")
    private String caissiere;
    @Size(max = 32)
    @Column(name = "BANQUE")
    private String banque;
    @Column(name = "DATE_CHQ")
    @Temporal(TemporalType.DATE)
    private Date dateChq;
    @Size(max = 10)
    @Column(name = "NUM_CHQ")
    private String numChq;
    @Size(max = 16)
    @Column(name = "NUM_VERS_VIREM_BQ")
    private String numVersViremBq;
    @Size(max = 70)
    @Column(name = "EMETTEUR")
    private String emetteur;
    @Size(max = 32)
    @Column(name = "BQ_DEPART_VIREM")
    private String bqDepartVirem;
    @Size(max = 32)
    @Column(name = "BQ_ARRIVE_VIREM")
    private String bqArriveVirem;
    @Size(max = 70)
    @Column(name = "OBJET")
    private String objet;
    @Size(max = 4)
    @Column(name = "NUM_PIECE")
    private String numPiece;
    @Size(max = 1)
    @Column(name = "ANNULE")
    private String annule;

    public EcoVersement() {
    }

    public EcoVersement(Integer idversement) {
        this.idversement = idversement;
    }

    public Integer getIdversement() {
        return idversement;
    }

    public void setIdversement(Integer idversement) {
        this.idversement = idversement;
    }

    public String getNumressu() {
        return numressu;
    }

    public void setNumressu(String numressu) {
        this.numressu = numressu;
    }

    public String getAnneesco() {
        return anneesco;
    }

    public void setAnneesco(String anneesco) {
        this.anneesco = anneesco;
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public String getMatriEtu() {
        return matriEtu;
    }

    public void setMatriEtu(String matriEtu) {
        this.matriEtu = matriEtu;
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

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getMotifReglement() {
        return motifReglement;
    }

    public void setMotifReglement(String motifReglement) {
        this.motifReglement = motifReglement;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }

    public String getHeureReglement() {
        return heureReglement;
    }

    public void setHeureReglement(String heureReglement) {
        this.heureReglement = heureReglement;
    }

    public String getCaissiere() {
        return caissiere;
    }

    public void setCaissiere(String caissiere) {
        this.caissiere = caissiere;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public Date getDateChq() {
        return dateChq;
    }

    public void setDateChq(Date dateChq) {
        this.dateChq = dateChq;
    }

    public String getNumChq() {
        return numChq;
    }

    public void setNumChq(String numChq) {
        this.numChq = numChq;
    }

    public String getNumVersViremBq() {
        return numVersViremBq;
    }

    public void setNumVersViremBq(String numVersViremBq) {
        this.numVersViremBq = numVersViremBq;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getBqDepartVirem() {
        return bqDepartVirem;
    }

    public void setBqDepartVirem(String bqDepartVirem) {
        this.bqDepartVirem = bqDepartVirem;
    }

    public String getBqArriveVirem() {
        return bqArriveVirem;
    }

    public void setBqArriveVirem(String bqArriveVirem) {
        this.bqArriveVirem = bqArriveVirem;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getNumPiece() {
        return numPiece;
    }

    public void setNumPiece(String numPiece) {
        this.numPiece = numPiece;
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
        hash += (idversement != null ? idversement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoVersement)) {
            return false;
        }
        EcoVersement other = (EcoVersement) object;
        if ((this.idversement == null && other.idversement != null) || (this.idversement != null && !this.idversement.equals(other.idversement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoVersement[ idversement=" + idversement + " ]";
    }
    
}
