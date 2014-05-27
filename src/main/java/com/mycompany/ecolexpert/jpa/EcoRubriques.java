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
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_rubriques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoRubriques.findAll", query = "SELECT e FROM EcoRubriques e"),
    @NamedQuery(name = "EcoRubriques.findByCode", query = "SELECT e FROM EcoRubriques e WHERE e.code = :code"),
    @NamedQuery(name = "EcoRubriques.findByRubrique", query = "SELECT e FROM EcoRubriques e WHERE e.rubrique = :rubrique")})
public class EcoRubriques implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "RUBRIQUE")
    private String rubrique;

    public EcoRubriques() {
    }

    public EcoRubriques(String code) {
        this.code = code;
    }

    public EcoRubriques(String code, String rubrique) {
        this.code = code;
        this.rubrique = rubrique;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRubrique() {
        return rubrique;
    }

    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoRubriques)) {
            return false;
        }
        EcoRubriques other = (EcoRubriques) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoRubriques[ code=" + code + " ]";
    }
    
}
