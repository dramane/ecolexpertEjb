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
    @NamedQuery(name = "EcoInscription.findByNomclasse", query = "SELECT e FROM EcoInscription e WHERE e.nomclasse = :nomclasse"),
    @NamedQuery(name = "EcoInscription.findByEcoleAnterieure", query = "SELECT e FROM EcoInscription e WHERE e.ecoleAnterieure = :ecoleAnterieure"),
    @NamedQuery(name = "EcoInscription.findByClasseAnterieure", query = "SELECT e FROM EcoInscription e WHERE e.classeAnterieure = :classeAnterieure"),
    @NamedQuery(name = "EcoInscription.findByStatut", query = "SELECT e FROM EcoInscription e WHERE e.statut = :statut"),
    @NamedQuery(name = "EcoInscription.findByAnneeDecision", query = "SELECT e FROM EcoInscription e WHERE e.anneeDecision = :anneeDecision"),
    @NamedQuery(name = "EcoInscription.findByTypeEtudiant", query = "SELECT e FROM EcoInscription e WHERE e.typeEtudiant = :typeEtudiant"),
    @NamedQuery(name = "EcoInscription.findByNumDecision", query = "SELECT e FROM EcoInscription e WHERE e.numDecision = :numDecision"),
    @NamedQuery(name = "EcoInscription.findByExtrait", query = "SELECT e FROM EcoInscription e WHERE e.extrait = :extrait"),
    @NamedQuery(name = "EcoInscription.findByCv", query = "SELECT e FROM EcoInscription e WHERE e.cv = :cv"),
    @NamedQuery(name = "EcoInscription.findByDiplome", query = "SELECT e FROM EcoInscription e WHERE e.diplome = :diplome"),
    @NamedQuery(name = "EcoInscription.findByDosPhoto", query = "SELECT e FROM EcoInscription e WHERE e.dosPhoto = :dosPhoto"),
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
    @NamedQuery(name = "EcoInscription.findBySomAutresFrais", query = "SELECT e FROM EcoInscription e WHERE e.somAutresFrais = :somAutresFrais"),
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
    @Size(max = 10)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 4)
    @Column(name = "NUMETU")
    private String numetu;
    @Column(name = "DTINSCRI")
    @Temporal(TemporalType.DATE)
    private Date dtinscri;
    @Column(name = "H_INSCRI")
    @Temporal(TemporalType.TIME)
    private Date hInscri;
    @Size(max = 32)
    @Column(name = "RESPINS")
    private String respins;
    @Column(name = "DOUBLANT")
    private Character doublant;
    @Size(max = 4)
    @Column(name = "COURS")
    private String cours;
    @Column(name = "DRTFORMA_NORMAL")
    private Integer drtformaNormal;
    @Column(name = "SCOLARITE_NORMAL")
    private Integer scolariteNormal;
    @Size(max = 10)
    @Column(name = "NOMCLASSE")
    private String nomclasse;
    @Size(max = 70)
    @Column(name = "ECOLE_ANTERIEURE")
    private String ecoleAnterieure;
    @Size(max = 10)
    @Column(name = "CLASSE_ANTERIEURE")
    private String classeAnterieure;
    @Size(max = 25)
    @Column(name = "STATUT")
    private String statut;
    @Size(max = 9)
    @Column(name = "ANNEE_DECISION")
    private String anneeDecision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "TYPE_ETUDIANT")
    private String typeEtudiant;
    @Size(max = 14)
    @Column(name = "NUM_DECISION")
    private String numDecision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXTRAIT")
    private Character extrait;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CV")
    private Character cv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIPLOME")
    private Character diplome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOS_PHOTO")
    private Character dosPhoto;
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
    @Column(name = "INSCRIPTION_A_PAYE")
    private Integer inscriptionAPaye;
    @Column(name = "INSCRIPTION_PAYE")
    private Integer inscriptionPaye;
    @Column(name = "FORMATION_A_PAYE")
    private Integer formationAPaye;
    @Column(name = "FORMATION_PAYE")
    private Integer formationPaye;
    @Column(name = "SOM_AUTRES_FRAIS")
    private Integer somAutresFrais;
    @Column(name = "SCOLARITE_A_PAYE")
    private Integer scolariteAPaye;
    @Column(name = "SCOLARITE_PAYE")
    private Integer scolaritePaye;
    @Column(name = "EXAMEN_A_PAYE")
    private Integer examenAPaye;
    @Column(name = "EXAMEN_PAYE")
    private Integer examenPaye;
    @Column(name = "SOUTENANCE_A_PAYE")
    private Integer soutenanceAPaye;
    @Column(name = "SOUTENANCE_PAYE")
    private Integer soutenancePaye;
    @Column(name = "ASSURANCE_A_PAYE")
    private Integer assuranceAPaye;
    @Column(name = "ASSURANCE_PAYE")
    private Integer assurancePaye;
    @Column(name = "CANTINE_A_PAYE")
    private Integer cantineAPaye;
    @Column(name = "CANTINE_PAYE")
    private Integer cantinePaye;
    @Column(name = "FOURNITURE_A_PAYE")
    private Integer fournitureAPaye;
    @Column(name = "FOURNITURE_PAYE")
    private Integer fourniturePaye;
    @Column(name = "INFORMATIQUE_A_PAYE")
    private Integer informatiqueAPaye;
    @Column(name = "INFORMATIQUE_PAYE")
    private Integer informatiquePaye;
    @Column(name = "MEDICAL_A_PAYE")
    private Integer medicalAPaye;
    @Column(name = "MEDICAL_PAYE")
    private Integer medicalPaye;
    @Column(name = "TRANSPORT_A_PAYE")
    private Integer transportAPaye;
    @Column(name = "TRANSPORT_PAYE")
    private Integer transportPaye;

    public EcoInscription() {
    }

    public EcoInscription(Integer idinscription) {
        this.idinscription = idinscription;
    }

    public EcoInscription(Integer idinscription, String typeEtudiant, Character extrait, Character cv, Character diplome, Character dosPhoto) {
        this.idinscription = idinscription;
        this.typeEtudiant = typeEtudiant;
        this.extrait = extrait;
        this.cv = cv;
        this.diplome = diplome;
        this.dosPhoto = dosPhoto;
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

    public Date getHInscri() {
        return hInscri;
    }

    public void setHInscri(Date hInscri) {
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

    public Integer getDrtformaNormal() {
        return drtformaNormal;
    }

    public void setDrtformaNormal(Integer drtformaNormal) {
        this.drtformaNormal = drtformaNormal;
    }

    public Integer getScolariteNormal() {
        return scolariteNormal;
    }

    public void setScolariteNormal(Integer scolariteNormal) {
        this.scolariteNormal = scolariteNormal;
    }

    public String getNomclasse() {
        return nomclasse;
    }

    public void setNomclasse(String nomclasse) {
        this.nomclasse = nomclasse;
    }

    public String getEcoleAnterieure() {
        return ecoleAnterieure;
    }

    public void setEcoleAnterieure(String ecoleAnterieure) {
        this.ecoleAnterieure = ecoleAnterieure;
    }

    public String getClasseAnterieure() {
        return classeAnterieure;
    }

    public void setClasseAnterieure(String classeAnterieure) {
        this.classeAnterieure = classeAnterieure;
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

    public String getTypeEtudiant() {
        return typeEtudiant;
    }

    public void setTypeEtudiant(String typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
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

    public Integer getInscriptionAPaye() {
        return inscriptionAPaye;
    }

    public void setInscriptionAPaye(Integer inscriptionAPaye) {
        this.inscriptionAPaye = inscriptionAPaye;
    }

    public Integer getInscriptionPaye() {
        return inscriptionPaye;
    }

    public void setInscriptionPaye(Integer inscriptionPaye) {
        this.inscriptionPaye = inscriptionPaye;
    }

    public Integer getFormationAPaye() {
        return formationAPaye;
    }

    public void setFormationAPaye(Integer formationAPaye) {
        this.formationAPaye = formationAPaye;
    }

    public Integer getFormationPaye() {
        return formationPaye;
    }

    public void setFormationPaye(Integer formationPaye) {
        this.formationPaye = formationPaye;
    }

    public Integer getSomAutresFrais() {
        return somAutresFrais;
    }

    public void setSomAutresFrais(Integer somAutresFrais) {
        this.somAutresFrais = somAutresFrais;
    }

    public Integer getScolariteAPaye() {
        return scolariteAPaye;
    }

    public void setScolariteAPaye(Integer scolariteAPaye) {
        this.scolariteAPaye = scolariteAPaye;
    }

    public Integer getScolaritePaye() {
        return scolaritePaye;
    }

    public void setScolaritePaye(Integer scolaritePaye) {
        this.scolaritePaye = scolaritePaye;
    }

    public Integer getExamenAPaye() {
        return examenAPaye;
    }

    public void setExamenAPaye(Integer examenAPaye) {
        this.examenAPaye = examenAPaye;
    }

    public Integer getExamenPaye() {
        return examenPaye;
    }

    public void setExamenPaye(Integer examenPaye) {
        this.examenPaye = examenPaye;
    }

    public Integer getSoutenanceAPaye() {
        return soutenanceAPaye;
    }

    public void setSoutenanceAPaye(Integer soutenanceAPaye) {
        this.soutenanceAPaye = soutenanceAPaye;
    }

    public Integer getSoutenancePaye() {
        return soutenancePaye;
    }

    public void setSoutenancePaye(Integer soutenancePaye) {
        this.soutenancePaye = soutenancePaye;
    }

    public Integer getAssuranceAPaye() {
        return assuranceAPaye;
    }

    public void setAssuranceAPaye(Integer assuranceAPaye) {
        this.assuranceAPaye = assuranceAPaye;
    }

    public Integer getAssurancePaye() {
        return assurancePaye;
    }

    public void setAssurancePaye(Integer assurancePaye) {
        this.assurancePaye = assurancePaye;
    }

    public Integer getCantineAPaye() {
        return cantineAPaye;
    }

    public void setCantineAPaye(Integer cantineAPaye) {
        this.cantineAPaye = cantineAPaye;
    }

    public Integer getCantinePaye() {
        return cantinePaye;
    }

    public void setCantinePaye(Integer cantinePaye) {
        this.cantinePaye = cantinePaye;
    }

    public Integer getFournitureAPaye() {
        return fournitureAPaye;
    }

    public void setFournitureAPaye(Integer fournitureAPaye) {
        this.fournitureAPaye = fournitureAPaye;
    }

    public Integer getFourniturePaye() {
        return fourniturePaye;
    }

    public void setFourniturePaye(Integer fourniturePaye) {
        this.fourniturePaye = fourniturePaye;
    }

    public Integer getInformatiqueAPaye() {
        return informatiqueAPaye;
    }

    public void setInformatiqueAPaye(Integer informatiqueAPaye) {
        this.informatiqueAPaye = informatiqueAPaye;
    }

    public Integer getInformatiquePaye() {
        return informatiquePaye;
    }

    public void setInformatiquePaye(Integer informatiquePaye) {
        this.informatiquePaye = informatiquePaye;
    }

    public Integer getMedicalAPaye() {
        return medicalAPaye;
    }

    public void setMedicalAPaye(Integer medicalAPaye) {
        this.medicalAPaye = medicalAPaye;
    }

    public Integer getMedicalPaye() {
        return medicalPaye;
    }

    public void setMedicalPaye(Integer medicalPaye) {
        this.medicalPaye = medicalPaye;
    }

    public Integer getTransportAPaye() {
        return transportAPaye;
    }

    public void setTransportAPaye(Integer transportAPaye) {
        this.transportAPaye = transportAPaye;
    }

    public Integer getTransportPaye() {
        return transportPaye;
    }

    public void setTransportPaye(Integer transportPaye) {
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
