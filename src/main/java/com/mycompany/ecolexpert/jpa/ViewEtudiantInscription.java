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
@Table(name = "view_etudiant_inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewEtudiantInscription.findAll", query = "SELECT v FROM ViewEtudiantInscription v"),
    @NamedQuery(name = "ViewEtudiantInscription.findByIdinscription", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.idinscription = :idinscription"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNumetu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.numetu = :numetu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNometu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.nometu = :nometu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByPrenetu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.prenetu = :prenetu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNomEtPrenom", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.nomEtPrenom = :nomEtPrenom"),
    @NamedQuery(name = "ViewEtudiantInscription.findByNationalite", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.nationalite = :nationalite"),
    @NamedQuery(name = "ViewEtudiantInscription.findByMatricule", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.matricule = :matricule"),
    @NamedQuery(name = "ViewEtudiantInscription.findByAnneeaca", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.anneeaca = :anneeaca"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDtinscri", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.dtinscri = :dtinscri"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCours", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.cours = :cours"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDernierEtablisFreqte", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.dernierEtablisFreqte = :dernierEtablisFreqte"),
    @NamedQuery(name = "ViewEtudiantInscription.findByAnneeEtablisFreqte", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.anneeEtablisFreqte = :anneeEtablisFreqte"),
    @NamedQuery(name = "ViewEtudiantInscription.findByClasseAnterieure", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.classeAnterieure = :classeAnterieure"),
    @NamedQuery(name = "ViewEtudiantInscription.findByOrigineRessource", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.origineRessource = :origineRessource"),
    @NamedQuery(name = "ViewEtudiantInscription.findByProfessionEtu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.professionEtu = :professionEtu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByActiviteEtu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.activiteEtu = :activiteEtu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDomaineAtiviteEtu", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.domaineAtiviteEtu = :domaineAtiviteEtu"),
    @NamedQuery(name = "ViewEtudiantInscription.findByLangueVivante", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.langueVivante = :langueVivante"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDemandeurEmploi", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.demandeurEmploi = :demandeurEmploi"),
    @NamedQuery(name = "ViewEtudiantInscription.findByInterruptionEtude", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.interruptionEtude = :interruptionEtude"),
    @NamedQuery(name = "ViewEtudiantInscription.findByDureeInterruption", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.dureeInterruption = :dureeInterruption"),
    @NamedQuery(name = "ViewEtudiantInscription.findBySportifHautNivo", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.sportifHautNivo = :sportifHautNivo"),
    @NamedQuery(name = "ViewEtudiantInscription.findByServiceNational", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.serviceNational = :serviceNational"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeCycle", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeCycle = :codeCycle"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeNiveau", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "ViewEtudiantInscription.findByCodeClasse", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.codeClasse = :codeClasse"),
    @NamedQuery(name = "ViewEtudiantInscription.findByScolariteAPaye", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.scolariteAPaye = :scolariteAPaye"),
    @NamedQuery(name = "ViewEtudiantInscription.findByScolaritePaye", query = "SELECT v FROM ViewEtudiantInscription v WHERE v.scolaritePaye = :scolaritePaye")})
public class ViewEtudiantInscription implements Serializable {
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
    @Size(max = 50)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Lob
    @Column(name = "PHOTO")
    private byte[] photo;
    @Size(max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Column(name = "DTINSCRI")
    @Temporal(TemporalType.DATE)
    private Date dtinscri;
    @Size(max = 4)
    @Column(name = "COURS")
    private String cours;
    @Size(max = 70)
    @Column(name = "DERNIER_ETABLIS_FREQTE")
    private String dernierEtablisFreqte;
    @Size(max = 9)
    @Column(name = "ANNEE_ETABLIS_FREQTE")
    private String anneeEtablisFreqte;
    @Size(max = 10)
    @Column(name = "CLASSE_ANTERIEURE")
    private String classeAnterieure;
    @Size(max = 20)
    @Column(name = "ORIGINE_RESSOURCE")
    private String origineRessource;
    @Size(max = 45)
    @Column(name = "PROFESSION_ETU")
    private String professionEtu;
    @Size(max = 45)
    @Column(name = "ACTIVITE_ETU")
    private String activiteEtu;
    @Size(max = 30)
    @Column(name = "DOMAINE_ATIVITE_ETU")
    private String domaineAtiviteEtu;
    @Size(max = 20)
    @Column(name = "LANGUE_VIVANTE")
    private String langueVivante;
    @Size(max = 3)
    @Column(name = "DEMANDEUR_EMPLOI")
    private String demandeurEmploi;
    @Size(max = 3)
    @Column(name = "INTERRUPTION_ETUDE")
    private String interruptionEtude;
    @Size(max = 2)
    @Column(name = "DUREE_INTERRUPTION")
    private String dureeInterruption;
    @Size(max = 3)
    @Column(name = "SPORTIF_HAUT_NIVO")
    private String sportifHautNivo;
    @Size(max = 40)
    @Column(name = "SERVICE_NATIONAL")
    private String serviceNational;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_A_PAYE")
    private int scolariteAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_PAYE")
    private int scolaritePaye;

    public ViewEtudiantInscription() {
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

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
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

    public Date getDtinscri() {
        return dtinscri;
    }

    public void setDtinscri(Date dtinscri) {
        this.dtinscri = dtinscri;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getDernierEtablisFreqte() {
        return dernierEtablisFreqte;
    }

    public void setDernierEtablisFreqte(String dernierEtablisFreqte) {
        this.dernierEtablisFreqte = dernierEtablisFreqte;
    }

    public String getAnneeEtablisFreqte() {
        return anneeEtablisFreqte;
    }

    public void setAnneeEtablisFreqte(String anneeEtablisFreqte) {
        this.anneeEtablisFreqte = anneeEtablisFreqte;
    }

    public String getClasseAnterieure() {
        return classeAnterieure;
    }

    public void setClasseAnterieure(String classeAnterieure) {
        this.classeAnterieure = classeAnterieure;
    }

    public String getOrigineRessource() {
        return origineRessource;
    }

    public void setOrigineRessource(String origineRessource) {
        this.origineRessource = origineRessource;
    }

    public String getProfessionEtu() {
        return professionEtu;
    }

    public void setProfessionEtu(String professionEtu) {
        this.professionEtu = professionEtu;
    }

    public String getActiviteEtu() {
        return activiteEtu;
    }

    public void setActiviteEtu(String activiteEtu) {
        this.activiteEtu = activiteEtu;
    }

    public String getDomaineAtiviteEtu() {
        return domaineAtiviteEtu;
    }

    public void setDomaineAtiviteEtu(String domaineAtiviteEtu) {
        this.domaineAtiviteEtu = domaineAtiviteEtu;
    }

    public String getLangueVivante() {
        return langueVivante;
    }

    public void setLangueVivante(String langueVivante) {
        this.langueVivante = langueVivante;
    }

    public String getDemandeurEmploi() {
        return demandeurEmploi;
    }

    public void setDemandeurEmploi(String demandeurEmploi) {
        this.demandeurEmploi = demandeurEmploi;
    }

    public String getInterruptionEtude() {
        return interruptionEtude;
    }

    public void setInterruptionEtude(String interruptionEtude) {
        this.interruptionEtude = interruptionEtude;
    }

    public String getDureeInterruption() {
        return dureeInterruption;
    }

    public void setDureeInterruption(String dureeInterruption) {
        this.dureeInterruption = dureeInterruption;
    }

    public String getSportifHautNivo() {
        return sportifHautNivo;
    }

    public void setSportifHautNivo(String sportifHautNivo) {
        this.sportifHautNivo = sportifHautNivo;
    }

    public String getServiceNational() {
        return serviceNational;
    }

    public void setServiceNational(String serviceNational) {
        this.serviceNational = serviceNational;
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
