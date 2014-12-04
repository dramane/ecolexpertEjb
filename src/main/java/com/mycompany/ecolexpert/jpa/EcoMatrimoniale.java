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
 * @author HP
 */
@Entity
@Table(name = "eco_matrimoniale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoMatrimoniale.findAll", query = "SELECT e FROM EcoMatrimoniale e"),
    @NamedQuery(name = "EcoMatrimoniale.findByCodeMatrimoniale", query = "SELECT e FROM EcoMatrimoniale e WHERE e.codeMatrimoniale = :codeMatrimoniale"),
    @NamedQuery(name = "EcoMatrimoniale.findByLibelleMatrimoniale", query = "SELECT e FROM EcoMatrimoniale e WHERE e.libelleMatrimoniale = :libelleMatrimoniale")})
public class EcoMatrimoniale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 20)
    @Column(name = "CODE_MATRIMONIALE")
    private String codeMatrimoniale;
    @Size(max = 20)
    @Column(name = "LIBELLE_MATRIMONIALE")
    private String libelleMatrimoniale;

    public EcoMatrimoniale() {
    }

    public EcoMatrimoniale(String codeMatrimoniale) {
        this.codeMatrimoniale = codeMatrimoniale;
    }

    public String getCodeMatrimoniale() {
        return codeMatrimoniale;
    }

    public void setCodeMatrimoniale(String codeMatrimoniale) {
        this.codeMatrimoniale = codeMatrimoniale;
    }

    public String getLibelleMatrimoniale() {
        return libelleMatrimoniale;
    }

    public void setLibelleMatrimoniale(String libelleMatrimoniale) {
        this.libelleMatrimoniale = libelleMatrimoniale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeMatrimoniale != null ? codeMatrimoniale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoMatrimoniale)) {
            return false;
        }
        EcoMatrimoniale other = (EcoMatrimoniale) object;
        if ((this.codeMatrimoniale == null && other.codeMatrimoniale != null) || (this.codeMatrimoniale != null && !this.codeMatrimoniale.equals(other.codeMatrimoniale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoMatrimoniale[ codeMatrimoniale=" + codeMatrimoniale + " ]";
    }
    
}
