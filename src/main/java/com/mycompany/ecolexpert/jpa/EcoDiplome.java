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
 * @author HARRISON
 */
@Entity
@Table(name = "eco_diplome")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoDiplome.findAll", query = "SELECT e FROM EcoDiplome e"),
    @NamedQuery(name = "EcoDiplome.findByIdDiplome", query = "SELECT e FROM EcoDiplome e WHERE e.idDiplome = :idDiplome"),
    @NamedQuery(name = "EcoDiplome.findByCodeDiplome", query = "SELECT e FROM EcoDiplome e WHERE e.codeDiplome = :codeDiplome"),
    @NamedQuery(name = "EcoDiplome.findByNomDiplome", query = "SELECT e FROM EcoDiplome e WHERE e.nomDiplome = :nomDiplome"),
    @NamedQuery(name = "EcoDiplome.findByDescription", query = "SELECT e FROM EcoDiplome e WHERE e.description = :description"),
    @NamedQuery(name = "EcoDiplome.findByCodeCycle", query = "SELECT e FROM EcoDiplome e WHERE e.codeCycle = :codeCycle"),
    @NamedQuery(name = "EcoDiplome.findByCodeNiveau", query = "SELECT e FROM EcoDiplome e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoDiplome.findByActif", query = "SELECT e FROM EcoDiplome e WHERE e.actif = :actif")})
public class EcoDiplome implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DIPLOME")
    private Integer idDiplome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CODE_DIPLOME")
    private String codeDiplome;
    @Size(max = 255)
    @Column(name = "NOM_DIPLOME")
    private String nomDiplome;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoDiplome() {
    }

    public EcoDiplome(Integer idDiplome) {
        this.idDiplome = idDiplome;
    }

    public EcoDiplome(Integer idDiplome, String codeDiplome) {
        this.idDiplome = idDiplome;
        this.codeDiplome = codeDiplome;
    }

    public Integer getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(Integer idDiplome) {
        this.idDiplome = idDiplome;
    }

    public String getCodeDiplome() {
        return codeDiplome;
    }

    public void setCodeDiplome(String codeDiplome) {
        this.codeDiplome = codeDiplome;
    }

    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiplome != null ? idDiplome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoDiplome)) {
            return false;
        }
        EcoDiplome other = (EcoDiplome) object;
        if ((this.idDiplome == null && other.idDiplome != null) || (this.idDiplome != null && !this.idDiplome.equals(other.idDiplome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoDiplome[ idDiplome=" + idDiplome + " ]";
    }
    
}
