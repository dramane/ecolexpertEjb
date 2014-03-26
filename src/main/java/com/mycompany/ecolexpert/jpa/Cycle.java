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
@Table(name = "cycle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cycle.findAll", query = "SELECT c FROM Cycle c"),
    @NamedQuery(name = "Cycle.findByIdcycle", query = "SELECT c FROM Cycle c WHERE c.idcycle = :idcycle"),
    @NamedQuery(name = "Cycle.findByDesignation", query = "SELECT c FROM Cycle c WHERE c.designation = :designation"),
    @NamedQuery(name = "Cycle.findByCodecycle", query = "SELECT c FROM Cycle c WHERE c.codecycle = :codecycle"),
    @NamedQuery(name = "Cycle.findByCode3", query = "SELECT c FROM Cycle c WHERE c.code3 = :code3"),
    @NamedQuery(name = "Cycle.findByCodefiliere", query = "SELECT c FROM Cycle c WHERE c.codefiliere = :codefiliere")})
public class Cycle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCYCLE")
    private Integer idcycle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "DESIGNATION")
    private String designation;
    @Size(max = 2)
    @Column(name = "CODECYCLE")
    private String codecycle;
    @Size(max = 3)
    @Column(name = "CODE3")
    private String code3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "CODEFILIERE")
    private String codefiliere;

    public Cycle() {
    }

    public Cycle(Integer idcycle) {
        this.idcycle = idcycle;
    }

    public Cycle(Integer idcycle, String designation, String codefiliere) {
        this.idcycle = idcycle;
        this.designation = designation;
        this.codefiliere = codefiliere;
    }

    public Integer getIdcycle() {
        return idcycle;
    }

    public void setIdcycle(Integer idcycle) {
        this.idcycle = idcycle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCodecycle() {
        return codecycle;
    }

    public void setCodecycle(String codecycle) {
        this.codecycle = codecycle;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public String getCodefiliere() {
        return codefiliere;
    }

    public void setCodefiliere(String codefiliere) {
        this.codefiliere = codefiliere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcycle != null ? idcycle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cycle)) {
            return false;
        }
        Cycle other = (Cycle) object;
        if ((this.idcycle == null && other.idcycle != null) || (this.idcycle != null && !this.idcycle.equals(other.idcycle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexperte.jpa.Cycle[ idcycle=" + idcycle + " ]";
    }
    
}
