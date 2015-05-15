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
@Table(name = "eco_inscription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoInscription.findAll", query = "SELECT e FROM EcoInscription e"),
    @NamedQuery(name = "EcoInscription.findByIdinscription", query = "SELECT e FROM EcoInscription e WHERE e.idinscription = :idinscription"),
    @NamedQuery(name = "EcoInscription.findByAnneeaca", query = "SELECT e FROM EcoInscription e WHERE e.anneeaca = :anneeaca"),
    @NamedQuery(name = "EcoInscription.findByMatricule", query = "SELECT e FROM EcoInscription e WHERE e.matricule = :matricule"),
    @NamedQuery(name = "EcoInscription.findByNumetu", query = "SELECT e FROM EcoInscription e WHERE e.numetu = :numetu"),
    @NamedQuery(name = "EcoInscription.findByDtinscri", query = "SELECT e FROM EcoInscription e WHERE e.dtinscri = :dtinscri"),
    @NamedQuery(name = "EcoInscription.findByHInscri", query = "SELECT e FROM EcoInscription e WHERE e.hInscri = :hInscri"),
    @NamedQuery(name = "EcoInscription.findByRespins", query = "SELECT e FROM EcoInscription e WHERE e.respins = :respins"),
    @NamedQuery(name = "EcoInscription.findByDoublant", query = "SELECT e FROM EcoInscription e WHERE e.doublant = :doublant"),
    @NamedQuery(name = "EcoInscription.findByCours", query = "SELECT e FROM EcoInscription e WHERE e.cours = :cours"),
    @NamedQuery(name = "EcoInscription.findByDrtformaNormal", query = "SELECT e FROM EcoInscription e WHERE e.drtformaNormal = :drtformaNormal"),
    @NamedQuery(name = "EcoInscription.findByScolariteNormal", query = "SELECT e FROM EcoInscription e WHERE e.scolariteNormal = :scolariteNormal"),
    @NamedQuery(name = "EcoInscription.findByDernierEtablisFreqte", query = "SELECT e FROM EcoInscription e WHERE e.dernierEtablisFreqte = :dernierEtablisFreqte"),
    @NamedQuery(name = "EcoInscription.findByAnneeEtablisFreqte", query = "SELECT e FROM EcoInscription e WHERE e.anneeEtablisFreqte = :anneeEtablisFreqte"),
    @NamedQuery(name = "EcoInscription.findByClasseAnterieure", query = "SELECT e FROM EcoInscription e WHERE e.classeAnterieure = :classeAnterieure"),
    @NamedQuery(name = "EcoInscription.findByOrigineRessource", query = "SELECT e FROM EcoInscription e WHERE e.origineRessource = :origineRessource"),
    @NamedQuery(name = "EcoInscription.findByProfessionEtu", query = "SELECT e FROM EcoInscription e WHERE e.professionEtu = :professionEtu"),
    @NamedQuery(name = "EcoInscription.findByActiviteEtu", query = "SELECT e FROM EcoInscription e WHERE e.activiteEtu = :activiteEtu"),
    @NamedQuery(name = "EcoInscription.findByDomaineAtiviteEtu", query = "SELECT e FROM EcoInscription e WHERE e.domaineAtiviteEtu = :domaineAtiviteEtu"),
    @NamedQuery(name = "EcoInscription.findByLangueVivante", query = "SELECT e FROM EcoInscription e WHERE e.langueVivante = :langueVivante"),
    @NamedQuery(name = "EcoInscription.findByDemandeurEmploi", query = "SELECT e FROM EcoInscription e WHERE e.demandeurEmploi = :demandeurEmploi"),
    @NamedQuery(name = "EcoInscription.findByInterruptionEtude", query = "SELECT e FROM EcoInscription e WHERE e.interruptionEtude = :interruptionEtude"),
    @NamedQuery(name = "EcoInscription.findByDureeInterruption", query = "SELECT e FROM EcoInscription e WHERE e.dureeInterruption = :dureeInterruption"),
    @NamedQuery(name = "EcoInscription.findBySportifHautNivo", query = "SELECT e FROM EcoInscription e WHERE e.sportifHautNivo = :sportifHautNivo"),
    @NamedQuery(name = "EcoInscription.findByServiceNational", query = "SELECT e FROM EcoInscription e WHERE e.serviceNational = :serviceNational"),
    @NamedQuery(name = "EcoInscription.findByStatut", query = "SELECT e FROM EcoInscription e WHERE e.statut = :statut"),
    @NamedQuery(name = "EcoInscription.findByAnneeDecision", query = "SELECT e FROM EcoInscription e WHERE e.anneeDecision = :anneeDecision"),
    @NamedQuery(name = "EcoInscription.findByNumDecision", query = "SELECT e FROM EcoInscription e WHERE e.numDecision = :numDecision"),
    @NamedQuery(name = "EcoInscription.findByExtrait", query = "SELECT e FROM EcoInscription e WHERE e.extrait = :extrait"),
    @NamedQuery(name = "EcoInscription.findByCv", query = "SELECT e FROM EcoInscription e WHERE e.cv = :cv"),
    @NamedQuery(name = "EcoInscription.findByDiplome", query = "SELECT e FROM EcoInscription e WHERE e.diplome = :diplome"),
    @NamedQuery(name = "EcoInscription.findByDosPhoto", query = "SELECT e FROM EcoInscription e WHERE e.dosPhoto = :dosPhoto"),
    @NamedQuery(name = "EcoInscription.findByCodeAcademique", query = "SELECT e FROM EcoInscription e WHERE e.codeAcademique = :codeAcademique"),
    @NamedQuery(name = "EcoInscription.findByCodeDomaine", query = "SELECT e FROM EcoInscription e WHERE e.codeDomaine = :codeDomaine"),
    @NamedQuery(name = "EcoInscription.findByIdacademique", query = "SELECT e FROM EcoInscription e WHERE e.idacademique = :idacademique"),
    @NamedQuery(name = "EcoInscription.findByCodeCycle", query = "SELECT e FROM EcoInscription e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoInscription.findByCodeNiveau", query = "SELECT e FROM EcoInscription e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoInscription.findByCodeClasse", query = "SELECT e FROM EcoInscription e WHERE e.codeClasse = :codeClasse"),
    @NamedQuery(name = "EcoInscription.findByCodeRegime", query = "SELECT e FROM EcoInscription e WHERE e.codeRegime = :codeRegime"),
    @NamedQuery(name = "EcoInscription.findByInscriptionAPaye", query = "SELECT e FROM EcoInscription e WHERE e.inscriptionAPaye = :inscriptionAPaye"),
    @NamedQuery(name = "EcoInscription.findByInscriptionPaye", query = "SELECT e FROM EcoInscription e WHERE e.inscriptionPaye = :inscriptionPaye"),
    @NamedQuery(name = "EcoInscription.findByFormationAPaye", query = "SELECT e FROM EcoInscription e WHERE e.formationAPaye = :formationAPaye"),
    @NamedQuery(name = "EcoInscription.findByFormationPaye", query = "SELECT e FROM EcoInscription e WHERE e.formationPaye = :formationPaye"),
    @NamedQuery(name = "EcoInscription.findBySomAutresFraisAPaye", query = "SELECT e FROM EcoInscription e WHERE e.somAutresFraisAPaye = :somAutresFraisAPaye"),
    @NamedQuery(name = "EcoInscription.findByScolariteAPaye", query = "SELECT e FROM EcoInscription e WHERE e.scolariteAPaye = :scolariteAPaye"),
    @NamedQuery(name = "EcoInscription.findByScolaritePaye", query = "SELECT e FROM EcoInscription e WHERE e.scolaritePaye = :scolaritePaye"),
    @NamedQuery(name = "EcoInscription.findByExamenAPaye", query = "SELECT e FROM EcoInscription e WHERE e.examenAPaye = :examenAPaye"),
    @NamedQuery(name = "EcoInscription.findByExamenPaye", query = "SELECT e FROM EcoInscription e WHERE e.examenPaye = :examenPaye"),
    @NamedQuery(name = "EcoInscription.findBySoutenanceAPaye", query = "SELECT e FROM EcoInscription e WHERE e.soutenanceAPaye = :soutenanceAPaye"),
    @NamedQuery(name = "EcoInscription.findBySoutenancePaye", query = "SELECT e FROM EcoInscription e WHERE e.soutenancePaye = :soutenancePaye"),
    @NamedQuery(name = "EcoInscription.findByAssuranceAPaye", query = "SELECT e FROM EcoInscription e WHERE e.assuranceAPaye = :assuranceAPaye"),
    @NamedQuery(name = "EcoInscription.findByAssurancePaye", query = "SELECT e FROM EcoInscription e WHERE e.assurancePaye = :assurancePaye"),
    @NamedQuery(name = "EcoInscription.findByCantineAPaye", query = "SELECT e FROM EcoInscription e WHERE e.cantineAPaye = :cantineAPaye"),
    @NamedQuery(name = "EcoInscription.findByCantinePaye", query = "SELECT e FROM EcoInscription e WHERE e.cantinePaye = :cantinePaye"),
    @NamedQuery(name = "EcoInscription.findByFournitureAPaye", query = "SELECT e FROM EcoInscription e WHERE e.fournitureAPaye = :fournitureAPaye"),
    @NamedQuery(name = "EcoInscription.findByFourniturePaye", query = "SELECT e FROM EcoInscription e WHERE e.fourniturePaye = :fourniturePaye"),
    @NamedQuery(name = "EcoInscription.findByInformatiqueAPaye", query = "SELECT e FROM EcoInscription e WHERE e.informatiqueAPaye = :informatiqueAPaye"),
    @NamedQuery(name = "EcoInscription.findByInformatiquePaye", query = "SELECT e FROM EcoInscription e WHERE e.informatiquePaye = :informatiquePaye"),
    @NamedQuery(name = "EcoInscription.findByMedicalAPaye", query = "SELECT e FROM EcoInscription e WHERE e.medicalAPaye = :medicalAPaye"),
    @NamedQuery(name = "EcoInscription.findByMedicalPaye", query = "SELECT e FROM EcoInscription e WHERE e.medicalPaye = :medicalPaye"),
    @NamedQuery(name = "EcoInscription.findByTimbreAPaye", query = "SELECT e FROM EcoInscription e WHERE e.timbreAPaye = :timbreAPaye"),
    @NamedQuery(name = "EcoInscription.findByTimbrePaye", query = "SELECT e FROM EcoInscription e WHERE e.timbrePaye = :timbrePaye"),
    @NamedQuery(name = "EcoInscription.findByTransportAPaye", query = "SELECT e FROM EcoInscription e WHERE e.transportAPaye = :transportAPaye"),
    @NamedQuery(name = "EcoInscription.findByTransportPaye", query = "SELECT e FROM EcoInscription e WHERE e.transportPaye = :transportPaye")})
public class EcoInscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDINSCRIPTION")
    private Integer idinscription;
    @Size(max = 9)
    @Column(name = "ANNEEACA")
    private String anneeaca;
    @Size(max = 14)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 6)
    @Column(name = "NUMETU")
    private String numetu;
    @Column(name = "DTINSCRI")
    @Temporal(TemporalType.DATE)
    private Date dtinscri;
    @Size(max = 5)
    @Column(name = "H_INSCRI")
    private String hInscri;
    @Size(max = 32)
    @Column(name = "RESPINS")
    private String respins;
    @Column(name = "DOUBLANT")
    private Character doublant;
    @Size(max = 4)
    @Column(name = "COURS")
    private String cours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DRTFORMA_NORMAL")
    private int drtformaNormal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_NORMAL")
    private int scolariteNormal;
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
    @Size(max = 25)
    @Column(name = "STATUT")
    private String statut;
    @Size(max = 9)
    @Column(name = "ANNEE_DECISION")
    private String anneeDecision;
    @Size(max = 14)
    @Column(name = "NUM_DECISION")
    private String numDecision;
    @Column(name = "EXTRAIT")
    private Character extrait;
    @Column(name = "CV")
    private Character cv;
    @Column(name = "DIPLOME")
    private Character diplome;
    @Column(name = "DOS_PHOTO")
    private Character dosPhoto;
    @Size(max = 10)
    @Column(name = "CODE_ACADEMIQUE")
    private String codeAcademique;
    @Size(max = 50)
    @Column(name = "CODE_DOMAINE")
    private String codeDomaine;
    @Column(name = "IDACADEMIQUE")
    private Integer idacademique;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 9)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Size(max = 50)
    @Column(name = "CODE_REGIME")
    private String codeRegime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INSCRIPTION_A_PAYE")
    private int inscriptionAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INSCRIPTION_PAYE")
    private int inscriptionPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FORMATION_A_PAYE")
    private int formationAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FORMATION_PAYE")
    private int formationPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOM_AUTRES_FRAIS_A_PAYE")
    private int somAutresFraisAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_A_PAYE")
    private int scolariteAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCOLARITE_PAYE")
    private int scolaritePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXAMEN_A_PAYE")
    private int examenAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXAMEN_PAYE")
    private int examenPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOUTENANCE_A_PAYE")
    private int soutenanceAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOUTENANCE_PAYE")
    private int soutenancePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ASSURANCE_A_PAYE")
    private int assuranceAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ASSURANCE_PAYE")
    private int assurancePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTINE_A_PAYE")
    private int cantineAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTINE_PAYE")
    private int cantinePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOURNITURE_A_PAYE")
    private int fournitureAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOURNITURE_PAYE")
    private int fourniturePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INFORMATIQUE_A_PAYE")
    private int informatiqueAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INFORMATIQUE_PAYE")
    private int informatiquePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDICAL_A_PAYE")
    private int medicalAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDICAL_PAYE")
    private int medicalPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIMBRE_A_PAYE")
    private int timbreAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIMBRE_PAYE")
    private int timbrePaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRANSPORT_A_PAYE")
    private int transportAPaye;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRANSPORT_PAYE")
    private int transportPaye;

    public EcoInscription() {
    }

    public EcoInscription(Integer idinscription) {
        this.idinscription = idinscription;
    }

    public EcoInscription(Integer idinscription, int drtformaNormal, int scolariteNormal, int inscriptionAPaye, int inscriptionPaye, int formationAPaye, int formationPaye, int somAutresFraisAPaye, int scolariteAPaye, int scolaritePaye, int examenAPaye, int examenPaye, int soutenanceAPaye, int soutenancePaye, int assuranceAPaye, int assurancePaye, int cantineAPaye, int cantinePaye, int fournitureAPaye, int fourniturePaye, int informatiqueAPaye, int informatiquePaye, int medicalAPaye, int medicalPaye, int timbreAPaye, int timbrePaye, int transportAPaye, int transportPaye) {
        this.idinscription = idinscription;
        this.drtformaNormal = drtformaNormal;
        this.scolariteNormal = scolariteNormal;
        this.inscriptionAPaye = inscriptionAPaye;
        this.inscriptionPaye = inscriptionPaye;
        this.formationAPaye = formationAPaye;
        this.formationPaye = formationPaye;
        this.somAutresFraisAPaye = somAutresFraisAPaye;
        this.scolariteAPaye = scolariteAPaye;
        this.scolaritePaye = scolaritePaye;
        this.examenAPaye = examenAPaye;
        this.examenPaye = examenPaye;
        this.soutenanceAPaye = soutenanceAPaye;
        this.soutenancePaye = soutenancePaye;
        this.assuranceAPaye = assuranceAPaye;
        this.assurancePaye = assurancePaye;
        this.cantineAPaye = cantineAPaye;
        this.cantinePaye = cantinePaye;
        this.fournitureAPaye = fournitureAPaye;
        this.fourniturePaye = fourniturePaye;
        this.informatiqueAPaye = informatiqueAPaye;
        this.informatiquePaye = informatiquePaye;
        this.medicalAPaye = medicalAPaye;
        this.medicalPaye = medicalPaye;
        this.timbreAPaye = timbreAPaye;
        this.timbrePaye = timbrePaye;
        this.transportAPaye = transportAPaye;
        this.transportPaye = transportPaye;
    }

    public Integer getIdinscription() {
        return idinscription;
    }

    public void setIdinscription(Integer idinscription) {
        this.idinscription = idinscription;
    }

    public String getAnneeaca() {
        return anneeaca;
    }

    public void setAnneeaca(String anneeaca) {
        this.anneeaca = anneeaca;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumetu() {
        return numetu;
    }

    public void setNumetu(String numetu) {
        this.numetu = numetu;
    }

    public Date getDtinscri() {
        return dtinscri;
    }

    public void setDtinscri(Date dtinscri) {
        this.dtinscri = dtinscri;
    }

    public String getHInscri() {
        return hInscri;
    }

    public void setHInscri(String hInscri) {
        this.hInscri = hInscri;
    }

    public String getRespins() {
        return respins;
    }

    public void setRespins(String respins) {
        this.respins = respins;
    }

    public Character getDoublant() {
        return doublant;
    }

    public void setDoublant(Character doublant) {
        this.doublant = doublant;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public int getDrtformaNormal() {
        return drtformaNormal;
    }

    public void setDrtformaNormal(int drtformaNormal) {
        this.drtformaNormal = drtformaNormal;
    }

    public int getScolariteNormal() {
        return scolariteNormal;
    }

    public void setScolariteNormal(int scolariteNormal) {
        this.scolariteNormal = scolariteNormal;
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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getAnneeDecision() {
        return anneeDecision;
    }

    public void setAnneeDecision(String anneeDecision) {
        this.anneeDecision = anneeDecision;
    }

    public String getNumDecision() {
        return numDecision;
    }

    public void setNumDecision(String numDecision) {
        this.numDecision = numDecision;
    }

    public Character getExtrait() {
        return extrait;
    }

    public void setExtrait(Character extrait) {
        this.extrait = extrait;
    }

    public Character getCv() {
        return cv;
    }

    public void setCv(Character cv) {
        this.cv = cv;
    }

    public Character getDiplome() {
        return diplome;
    }

    public void setDiplome(Character diplome) {
        this.diplome = diplome;
    }

    public Character getDosPhoto() {
        return dosPhoto;
    }

    public void setDosPhoto(Character dosPhoto) {
        this.dosPhoto = dosPhoto;
    }

    public String getCodeAcademique() {
        return codeAcademique;
    }

    public void setCodeAcademique(String codeAcademique) {
        this.codeAcademique = codeAcademique;
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        this.codeDomaine = codeDomaine;
    }

    public Integer getIdacademique() {
        return idacademique;
    }

    public void setIdacademique(Integer idacademique) {
        this.idacademique = idacademique;
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

    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    public int getInscriptionAPaye() {
        return inscriptionAPaye;
    }

    public void setInscriptionAPaye(int inscriptionAPaye) {
        this.inscriptionAPaye = inscriptionAPaye;
    }

    public int getInscriptionPaye() {
        return inscriptionPaye;
    }

    public void setInscriptionPaye(int inscriptionPaye) {
        this.inscriptionPaye = inscriptionPaye;
    }

    public int getFormationAPaye() {
        return formationAPaye;
    }

    public void setFormationAPaye(int formationAPaye) {
        this.formationAPaye = formationAPaye;
    }

    public int getFormationPaye() {
        return formationPaye;
    }

    public void setFormationPaye(int formationPaye) {
        this.formationPaye = formationPaye;
    }

    public int getSomAutresFraisAPaye() {
        return somAutresFraisAPaye;
    }

    public void setSomAutresFraisAPaye(int somAutresFraisAPaye) {
        this.somAutresFraisAPaye = somAutresFraisAPaye;
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

    public int getExamenAPaye() {
        return examenAPaye;
    }

    public void setExamenAPaye(int examenAPaye) {
        this.examenAPaye = examenAPaye;
    }

    public int getExamenPaye() {
        return examenPaye;
    }

    public void setExamenPaye(int examenPaye) {
        this.examenPaye = examenPaye;
    }

    public int getSoutenanceAPaye() {
        return soutenanceAPaye;
    }

    public void setSoutenanceAPaye(int soutenanceAPaye) {
        this.soutenanceAPaye = soutenanceAPaye;
    }

    public int getSoutenancePaye() {
        return soutenancePaye;
    }

    public void setSoutenancePaye(int soutenancePaye) {
        this.soutenancePaye = soutenancePaye;
    }

    public int getAssuranceAPaye() {
        return assuranceAPaye;
    }

    public void setAssuranceAPaye(int assuranceAPaye) {
        this.assuranceAPaye = assuranceAPaye;
    }

    public int getAssurancePaye() {
        return assurancePaye;
    }

    public void setAssurancePaye(int assurancePaye) {
        this.assurancePaye = assurancePaye;
    }

    public int getCantineAPaye() {
        return cantineAPaye;
    }

    public void setCantineAPaye(int cantineAPaye) {
        this.cantineAPaye = cantineAPaye;
    }

    public int getCantinePaye() {
        return cantinePaye;
    }

    public void setCantinePaye(int cantinePaye) {
        this.cantinePaye = cantinePaye;
    }

    public int getFournitureAPaye() {
        return fournitureAPaye;
    }

    public void setFournitureAPaye(int fournitureAPaye) {
        this.fournitureAPaye = fournitureAPaye;
    }

    public int getFourniturePaye() {
        return fourniturePaye;
    }

    public void setFourniturePaye(int fourniturePaye) {
        this.fourniturePaye = fourniturePaye;
    }

    public int getInformatiqueAPaye() {
        return informatiqueAPaye;
    }

    public void setInformatiqueAPaye(int informatiqueAPaye) {
        this.informatiqueAPaye = informatiqueAPaye;
    }

    public int getInformatiquePaye() {
        return informatiquePaye;
    }

    public void setInformatiquePaye(int informatiquePaye) {
        this.informatiquePaye = informatiquePaye;
    }

    public int getMedicalAPaye() {
        return medicalAPaye;
    }

    public void setMedicalAPaye(int medicalAPaye) {
        this.medicalAPaye = medicalAPaye;
    }

    public int getMedicalPaye() {
        return medicalPaye;
    }

    public void setMedicalPaye(int medicalPaye) {
        this.medicalPaye = medicalPaye;
    }

    public int getTimbreAPaye() {
        return timbreAPaye;
    }

    public void setTimbreAPaye(int timbreAPaye) {
        this.timbreAPaye = timbreAPaye;
    }

    public int getTimbrePaye() {
        return timbrePaye;
    }

    public void setTimbrePaye(int timbrePaye) {
        this.timbrePaye = timbrePaye;
    }

    public int getTransportAPaye() {
        return transportAPaye;
    }

    public void setTransportAPaye(int transportAPaye) {
        this.transportAPaye = transportAPaye;
    }

    public int getTransportPaye() {
        return transportPaye;
    }

    public void setTransportPaye(int transportPaye) {
        this.transportPaye = transportPaye;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinscription != null ? idinscription.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoInscription)) {
            return false;
        }
        EcoInscription other = (EcoInscription) object;
        if ((this.idinscription == null && other.idinscription != null) || (this.idinscription != null && !this.idinscription.equals(other.idinscription))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoInscription[ idinscription=" + idinscription + " ]";
    }
    
}
