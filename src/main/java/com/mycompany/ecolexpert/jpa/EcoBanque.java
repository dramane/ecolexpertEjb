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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "eco_banque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoBanque.findAll", query = "SELECT e FROM EcoBanque e"),
    @NamedQuery(name = "EcoBanque.findByIdbanque", query = "SELECT e FROM EcoBanque e WHERE e.idbanque = :idbanque"),
    @NamedQuery(name = "EcoBanque.findByCdBq", query = "SELECT e FROM EcoBanque e WHERE e.cdBq = :cdBq"),
    @NamedQuery(name = "EcoBanque.findByBanque", query = "SELECT e FROM EcoBanque e WHERE e.banque = :banque"),
    @NamedQuery(name = "EcoBanque.findBySigleBq", query = "SELECT e FROM EcoBanque e WHERE e.sigleBq = :sigleBq"),
    @NamedQuery(name = "EcoBanque.findByPostalBq", query = "SELECT e FROM EcoBanque e WHERE e.postalBq = :postalBq"),
    @NamedQuery(name = "EcoBanque.findByPhoneBq", query = "SELECT e FROM EcoBanque e WHERE e.phoneBq = :phoneBq"),
    @NamedQuery(name = "EcoBanque.findByFaxBq", query = "SELECT e FROM EcoBanque e WHERE e.faxBq = :faxBq"),
    @NamedQuery(name = "EcoBanque.findByTelex", query = "SELECT e FROM EcoBanque e WHERE e.telex = :telex"),
    @NamedQuery(name = "EcoBanque.findByEmailBq", query = "SELECT e FROM EcoBanque e WHERE e.emailBq = :emailBq"),
    @NamedQuery(name = "EcoBanque.findByWebSite", query = "SELECT e FROM EcoBanque e WHERE e.webSite = :webSite")})
public class EcoBanque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDBANQUE")
    private Integer idbanque;
    @Size(max = 45)
    @Column(name = "CD_BQ")
    private String cdBq;
    @Size(max = 70)
    @Column(name = "BANQUE")
    private String banque;
    @Size(max = 32)
    @Column(name = "SIGLE_BQ")
    private String sigleBq;
    @Lob
    @Size(max = 16777215)
    @Column(name = "ADRESSE_BQ")
    private String adresseBq;
    @Size(max = 22)
    @Column(name = "POSTAL_BQ")
    private String postalBq;
    @Size(max = 11)
    @Column(name = "PHONE_BQ")
    private String phoneBq;
    @Size(max = 11)
    @Column(name = "FAX_BQ")
    private String faxBq;
    @Size(max = 25)
    @Column(name = "TELEX")
    private String telex;
    @Size(max = 45)
    @Column(name = "EMAIL_BQ")
    private String emailBq;
    @Size(max = 45)
    @Column(name = "WEB_SITE")
    private String webSite;

    public EcoBanque() {
    }

    public EcoBanque(Integer idbanque) {
        this.idbanque = idbanque;
    }

    public Integer getIdbanque() {
        return idbanque;
    }

    public void setIdbanque(Integer idbanque) {
        this.idbanque = idbanque;
    }

    public String getCdBq() {
        return cdBq;
    }

    public void setCdBq(String cdBq) {
        this.cdBq = cdBq;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getSigleBq() {
        return sigleBq;
    }

    public void setSigleBq(String sigleBq) {
        this.sigleBq = sigleBq;
    }

    public String getAdresseBq() {
        return adresseBq;
    }

    public void setAdresseBq(String adresseBq) {
        this.adresseBq = adresseBq;
    }

    public String getPostalBq() {
        return postalBq;
    }

    public void setPostalBq(String postalBq) {
        this.postalBq = postalBq;
    }

    public String getPhoneBq() {
        return phoneBq;
    }

    public void setPhoneBq(String phoneBq) {
        this.phoneBq = phoneBq;
    }

    public String getFaxBq() {
        return faxBq;
    }

    public void setFaxBq(String faxBq) {
        this.faxBq = faxBq;
    }

    public String getTelex() {
        return telex;
    }

    public void setTelex(String telex) {
        this.telex = telex;
    }

    public String getEmailBq() {
        return emailBq;
    }

    public void setEmailBq(String emailBq) {
        this.emailBq = emailBq;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbanque != null ? idbanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoBanque)) {
            return false;
        }
        EcoBanque other = (EcoBanque) object;
        if ((this.idbanque == null && other.idbanque != null) || (this.idbanque != null && !this.idbanque.equals(other.idbanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoBanque[ idbanque=" + idbanque + " ]";
    }
    
}
