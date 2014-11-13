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
@Table(name = "eco_niveau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoNiveau.findAll", query = "SELECT e FROM EcoNiveau e"),
    @NamedQuery(name = "EcoNiveau.findByCodeNiveau", query = "SELECT e FROM EcoNiveau e WHERE e.codeNiveau = :codeNiveau"),
    @NamedQuery(name = "EcoNiveau.findByNiveauCycle", query = "SELECT e FROM EcoNiveau e WHERE e.niveauCycle = :niveauCycle"),
    @NamedQuery(name = "EcoNiveau.findByCodeCycle", query = "SELECT e FROM EcoNiveau e WHERE e.codeCycle = :codeCycle")})
public class EcoNiveau implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 10)
    @Column(name = "CODE_NIVEAU")
    private String codeNiveau;
    @Column(name = "NIVEAU_CYCLE")
    private Integer niveauCycle;
    @Size(max = 3)
    @Column(name = "CODE_CYCLE")
    private String codeCycle;

    public EcoNiveau() {
    }

    public EcoNiveau(String codeNiveau) {
        this.codeNiveau = codeNiveau;
    }

    public String getCodeNiveau() {
        return codeNiveau;
    }

    public void setCodeNiveau(String codeNiveau) {
        this.codeNiveau = codeNiveau;
    }

    public Integer getNiveauCycle() {
        return niveauCycle;
    }

    public void setNiveauCycle(Integer niveauCycle) {
        this.niveauCycle = niveauCycle;
    }

    public String getCodeCycle() {
        return codeCycle;
    }

    public void setCodeCycle(String codeCycle) {
        this.codeCycle = codeCycle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeNiveau != null ? codeNiveau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoNiveau)) {
            return false;
        }
        EcoNiveau other = (EcoNiveau) object;
        if ((this.codeNiveau == null && other.codeNiveau != null) || (this.codeNiveau != null && !this.codeNiveau.equals(other.codeNiveau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoNiveau[ codeNiveau=" + codeNiveau + " ]";
    }
    
}
