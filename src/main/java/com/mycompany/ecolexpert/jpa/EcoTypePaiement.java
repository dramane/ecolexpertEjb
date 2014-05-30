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
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_type_paiement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoTypePaiement.findAll", query = "SELECT e FROM EcoTypePaiement e"),
    @NamedQuery(name = "EcoTypePaiement.findByIdTypePaiement", query = "SELECT e FROM EcoTypePaiement e WHERE e.idTypePaiement = :idTypePaiement"),
    @NamedQuery(name = "EcoTypePaiement.findByCodeTypePaiement", query = "SELECT e FROM EcoTypePaiement e WHERE e.codeTypePaiement = :codeTypePaiement"),
    @NamedQuery(name = "EcoTypePaiement.findByTypePaiement", query = "SELECT e FROM EcoTypePaiement e WHERE e.typePaiement = :typePaiement"),
    @NamedQuery(name = "EcoTypePaiement.findByDescription", query = "SELECT e FROM EcoTypePaiement e WHERE e.description = :description"),
    @NamedQuery(name = "EcoTypePaiement.findByActif", query = "SELECT e FROM EcoTypePaiement e WHERE e.actif = :actif")})
public class EcoTypePaiement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TYPE_PAIEMENT")
    private Short idTypePaiement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CODE_TYPE_PAIEMENT")
    private String codeTypePaiement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TYPE_PAIEMENT")
    private String typePaiement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ACTIF")
    private String actif;

    public EcoTypePaiement() {
    }

    public EcoTypePaiement(Short idTypePaiement) {
        this.idTypePaiement = idTypePaiement;
    }

    public EcoTypePaiement(Short idTypePaiement, String codeTypePaiement, String typePaiement, String description, String actif) {
        this.idTypePaiement = idTypePaiement;
        this.codeTypePaiement = codeTypePaiement;
        this.typePaiement = typePaiement;
        this.description = description;
        this.actif = actif;
    }

    public Short getIdTypePaiement() {
        return idTypePaiement;
    }

    public void setIdTypePaiement(Short idTypePaiement) {
        this.idTypePaiement = idTypePaiement;
    }

    public String getCodeTypePaiement() {
        return codeTypePaiement;
    }

    public void setCodeTypePaiement(String codeTypePaiement) {
        this.codeTypePaiement = codeTypePaiement;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (idTypePaiement != null ? idTypePaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoTypePaiement)) {
            return false;
        }
        EcoTypePaiement other = (EcoTypePaiement) object;
        if ((this.idTypePaiement == null && other.idTypePaiement != null) || (this.idTypePaiement != null && !this.idTypePaiement.equals(other.idTypePaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoTypePaiement[ idTypePaiement=" + idTypePaiement + " ]";
    }
    
}
