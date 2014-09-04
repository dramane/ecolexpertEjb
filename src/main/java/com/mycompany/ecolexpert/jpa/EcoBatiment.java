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
@Table(name = "eco_batiment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoBatiment.findAll", query = "SELECT e FROM EcoBatiment e"),
    @NamedQuery(name = "EcoBatiment.findByIdBatiment", query = "SELECT e FROM EcoBatiment e WHERE e.idBatiment = :idBatiment"),
    @NamedQuery(name = "EcoBatiment.findByCodeBatiment", query = "SELECT e FROM EcoBatiment e WHERE e.codeBatiment = :codeBatiment"),
    @NamedQuery(name = "EcoBatiment.findByNomBatiment", query = "SELECT e FROM EcoBatiment e WHERE e.nomBatiment = :nomBatiment"),
    @NamedQuery(name = "EcoBatiment.findByDescription", query = "SELECT e FROM EcoBatiment e WHERE e.description = :description")})
public class EcoBatiment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID_BATIMENT")
    private int idBatiment;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 8)
    @Column(name = "CODE_BATIMENT")
    private String codeBatiment;
    @Size(max = 50)
    @Column(name = "NOM_BATIMENT")
    private String nomBatiment;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;

    public EcoBatiment() {
    }

    public EcoBatiment(String codeBatiment) {
        this.codeBatiment = codeBatiment;
    }

    public EcoBatiment(String codeBatiment, int idBatiment) {
        this.codeBatiment = codeBatiment;
        this.idBatiment = idBatiment;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getCodeBatiment() {
        return codeBatiment;
    }

    public void setCodeBatiment(String codeBatiment) {
        this.codeBatiment = codeBatiment;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBatiment != null ? codeBatiment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoBatiment)) {
            return false;
        }
        EcoBatiment other = (EcoBatiment) object;
        if ((this.codeBatiment == null && other.codeBatiment != null) || (this.codeBatiment != null && !this.codeBatiment.equals(other.codeBatiment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoBatiment[ codeBatiment=" + codeBatiment + " ]";
    }
    
}
