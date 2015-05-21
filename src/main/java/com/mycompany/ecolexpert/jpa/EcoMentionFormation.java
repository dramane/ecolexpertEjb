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
@Table(name = "eco_mention_formation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoMentionFormation.findAll", query = "SELECT e FROM EcoMentionFormation e"),
    @NamedQuery(name = "EcoMentionFormation.findByIdMentionFormation", query = "SELECT e FROM EcoMentionFormation e WHERE e.idMentionFormation = :idMentionFormation"),
    @NamedQuery(name = "EcoMentionFormation.findByCodeMentionFormation", query = "SELECT e FROM EcoMentionFormation e WHERE e.codeMentionFormation = :codeMentionFormation"),
    @NamedQuery(name = "EcoMentionFormation.findByLibelleMentionFormation", query = "SELECT e FROM EcoMentionFormation e WHERE e.libelleMentionFormation = :libelleMentionFormation"),
    @NamedQuery(name = "EcoMentionFormation.findByDescriptionMention", query = "SELECT e FROM EcoMentionFormation e WHERE e.descriptionMention = :descriptionMention"),
    @NamedQuery(name = "EcoMentionFormation.findByCodeDomaine", query = "SELECT e FROM EcoMentionFormation e WHERE e.codeDomaine = :codeDomaine"),
    @NamedQuery(name = "EcoMentionFormation.findByActif", query = "SELECT e FROM EcoMentionFormation e WHERE e.actif = :actif")})
public class EcoMentionFormation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_MENTION_FORMATION")
    private int idMentionFormation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_MENTION_FORMATION")
    private String codeMentionFormation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "LIBELLE_MENTION_FORMATION")
    private String libelleMentionFormation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPTION_MENTION")
    private String descriptionMention;
    @Size(max = 50)
    @Column(name = "CODE_DOMAINE")
    private String codeDomaine;
    @Size(max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoMentionFormation() {
    }

    public EcoMentionFormation(String codeMentionFormation) {
        this.codeMentionFormation = codeMentionFormation;
    }

    public EcoMentionFormation(String codeMentionFormation, int idMentionFormation, String libelleMentionFormation, String descriptionMention) {
        this.codeMentionFormation = codeMentionFormation;
        this.idMentionFormation = idMentionFormation;
        this.libelleMentionFormation = libelleMentionFormation;
        this.descriptionMention = descriptionMention;
    }

    public int getIdMentionFormation() {
        return idMentionFormation;
    }

    public void setIdMentionFormation(int idMentionFormation) {
        this.idMentionFormation = idMentionFormation;
    }

    public String getCodeMentionFormation() {
        return codeMentionFormation;
    }

    public void setCodeMentionFormation(String codeMentionFormation) {
        this.codeMentionFormation = codeMentionFormation;
    }

    public String getLibelleMentionFormation() {
        return libelleMentionFormation;
    }

    public void setLibelleMentionFormation(String libelleMentionFormation) {
        this.libelleMentionFormation = libelleMentionFormation;
    }

    public String getDescriptionMention() {
        return descriptionMention;
    }

    public void setDescriptionMention(String descriptionMention) {
        this.descriptionMention = descriptionMention;
    }

    public String getCodeDomaine() {
        return codeDomaine;
    }

    public void setCodeDomaine(String codeDomaine) {
        this.codeDomaine = codeDomaine;
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
        hash += (codeMentionFormation != null ? codeMentionFormation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoMentionFormation)) {
            return false;
        }
        EcoMentionFormation other = (EcoMentionFormation) object;
        if ((this.codeMentionFormation == null && other.codeMentionFormation != null) || (this.codeMentionFormation != null && !this.codeMentionFormation.equals(other.codeMentionFormation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoMentionFormation[ codeMentionFormation=" + codeMentionFormation + " ]";
    }
    
}
