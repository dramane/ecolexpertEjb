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
@Table(name = "eco_semetre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoSemetre.findAll", query = "SELECT e FROM EcoSemetre e"),
    @NamedQuery(name = "EcoSemetre.findByCodeSemetre", query = "SELECT e FROM EcoSemetre e WHERE e.codeSemetre = :codeSemetre"),
    @NamedQuery(name = "EcoSemetre.findByLibelleSemetre", query = "SELECT e FROM EcoSemetre e WHERE e.libelleSemetre = :libelleSemetre")})
public class EcoSemetre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_SEMETRE")
    private String codeSemetre;
    @Size(max = 45)
    @Column(name = "LIBELLE_SEMETRE")
    private String libelleSemetre;

    public EcoSemetre() {
    }

    public EcoSemetre(String codeSemetre) {
        this.codeSemetre = codeSemetre;
    }

    public String getCodeSemetre() {
        return codeSemetre;
    }

    public void setCodeSemetre(String codeSemetre) {
        this.codeSemetre = codeSemetre;
    }

    public String getLibelleSemetre() {
        return libelleSemetre;
    }

    public void setLibelleSemetre(String libelleSemetre) {
        this.libelleSemetre = libelleSemetre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSemetre != null ? codeSemetre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoSemetre)) {
            return false;
        }
        EcoSemetre other = (EcoSemetre) object;
        if ((this.codeSemetre == null && other.codeSemetre != null) || (this.codeSemetre != null && !this.codeSemetre.equals(other.codeSemetre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoSemetre[ codeSemetre=" + codeSemetre + " ]";
    }
    
}
