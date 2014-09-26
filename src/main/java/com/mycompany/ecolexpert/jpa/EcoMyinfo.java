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
import javax.persistence.Lob;
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
@Table(name = "eco_myinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EcoMyinfo.findAll", query = "SELECT e FROM EcoMyinfo e"),
    @NamedQuery(name = "EcoMyinfo.findByIdmyinfo", query = "SELECT e FROM EcoMyinfo e WHERE e.idmyinfo = :idmyinfo"),
    @NamedQuery(name = "EcoMyinfo.findByCodeMyinfo", query = "SELECT e FROM EcoMyinfo e WHERE e.codeMyinfo = :codeMyinfo"),
    @NamedQuery(name = "EcoMyinfo.findByMyname", query = "SELECT e FROM EcoMyinfo e WHERE e.myname = :myname"),
    @NamedQuery(name = "EcoMyinfo.findByMymanager", query = "SELECT e FROM EcoMyinfo e WHERE e.mymanager = :mymanager"),
    @NamedQuery(name = "EcoMyinfo.findByMysigle", query = "SELECT e FROM EcoMyinfo e WHERE e.mysigle = :mysigle"),
    @NamedQuery(name = "EcoMyinfo.findByMyyear", query = "SELECT e FROM EcoMyinfo e WHERE e.myyear = :myyear"),
    @NamedQuery(name = "EcoMyinfo.findByMypostal", query = "SELECT e FROM EcoMyinfo e WHERE e.mypostal = :mypostal"),
    @NamedQuery(name = "EcoMyinfo.findByMyville", query = "SELECT e FROM EcoMyinfo e WHERE e.myville = :myville"),
    @NamedQuery(name = "EcoMyinfo.findByMycountry", query = "SELECT e FROM EcoMyinfo e WHERE e.mycountry = :mycountry"),
    @NamedQuery(name = "EcoMyinfo.findByMyphone", query = "SELECT e FROM EcoMyinfo e WHERE e.myphone = :myphone"),
    @NamedQuery(name = "EcoMyinfo.findByMyfax", query = "SELECT e FROM EcoMyinfo e WHERE e.myfax = :myfax"),
    @NamedQuery(name = "EcoMyinfo.findByMymail", query = "SELECT e FROM EcoMyinfo e WHERE e.mymail = :mymail"),
    @NamedQuery(name = "EcoMyinfo.findByMysite", query = "SELECT e FROM EcoMyinfo e WHERE e.mysite = :mysite"),
    @NamedQuery(name = "EcoMyinfo.findByMystatut", query = "SELECT e FROM EcoMyinfo e WHERE e.mystatut = :mystatut"),
    @NamedQuery(name = "EcoMyinfo.findByMymanagerTitle", query = "SELECT e FROM EcoMyinfo e WHERE e.mymanagerTitle = :mymanagerTitle"),
    @NamedQuery(name = "EcoMyinfo.findByMystudymanager", query = "SELECT e FROM EcoMyinfo e WHERE e.mystudymanager = :mystudymanager"),
    @NamedQuery(name = "EcoMyinfo.findByMystudytitle", query = "SELECT e FROM EcoMyinfo e WHERE e.mystudytitle = :mystudytitle")})
public class EcoMyinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "IDMYINFO")
    private int idmyinfo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(max = 50)
    @Column(name = "CODE_MYINFO")
    private String codeMyinfo;
    @Size(max = 45)
    @Column(name = "MYNAME")
    private String myname;
    @Size(max = 45)
    @Column(name = "MYMANAGER")
    private String mymanager;
    @Size(max = 10)
    @Column(name = "MYSIGLE")
    private String mysigle;
    @Size(max = 9)
    @Column(name = "MYYEAR")
    private String myyear;
    @Size(max = 70)
    @Column(name = "MYPOSTAL")
    private String mypostal;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MYADRESSE")
    private String myadresse;
    @Size(max = 25)
    @Column(name = "MYVILLE")
    private String myville;
    @Size(max = 32)
    @Column(name = "MYCOUNTRY")
    private String mycountry;
    @Size(max = 12)
    @Column(name = "MYPHONE")
    private String myphone;
    @Size(max = 12)
    @Column(name = "MYFAX")
    private String myfax;
    @Size(max = 35)
    @Column(name = "MYMAIL")
    private String mymail;
    @Size(max = 35)
    @Column(name = "MYSITE")
    private String mysite;
    @Lob
    @Column(name = "MYLOGO")
    private byte[] mylogo;
    @Lob
    @Column(name = "MYSIGNIN")
    private byte[] mysignin;
    @Basic(optional = false)
    @Size(max = 22)
    @Column(name = "MYSTATUT")
    private String mystatut;
    @Size(max = 25)
    @Column(name = "MYMANAGER_TITLE")
    private String mymanagerTitle;
    @Size(max = 25)
    @Column(name = "MYSTUDYMANAGER")
    private String mystudymanager;
    @Size(max = 25)
    @Column(name = "MYSTUDYTITLE")
    private String mystudytitle;

    public EcoMyinfo() {
    }

    public EcoMyinfo(String codeMyinfo) {
        this.codeMyinfo = codeMyinfo;
    }

    public EcoMyinfo(String codeMyinfo, int idmyinfo, String mystatut) {
        this.codeMyinfo = codeMyinfo;
        this.idmyinfo = idmyinfo;
        this.mystatut = mystatut;
    }

    public int getIdmyinfo() {
        return idmyinfo;
    }

    public void setIdmyinfo(int idmyinfo) {
        this.idmyinfo = idmyinfo;
    }

    public String getCodeMyinfo() {
        return codeMyinfo;
    }

    public void setCodeMyinfo(String codeMyinfo) {
        this.codeMyinfo = codeMyinfo;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMymanager() {
        return mymanager;
    }

    public void setMymanager(String mymanager) {
        this.mymanager = mymanager;
    }

    public String getMysigle() {
        return mysigle;
    }

    public void setMysigle(String mysigle) {
        this.mysigle = mysigle;
    }

    public String getMyyear() {
        return myyear;
    }

    public void setMyyear(String myyear) {
        this.myyear = myyear;
    }

    public String getMypostal() {
        return mypostal;
    }

    public void setMypostal(String mypostal) {
        this.mypostal = mypostal;
    }

    public String getMyadresse() {
        return myadresse;
    }

    public void setMyadresse(String myadresse) {
        this.myadresse = myadresse;
    }

    public String getMyville() {
        return myville;
    }

    public void setMyville(String myville) {
        this.myville = myville;
    }

    public String getMycountry() {
        return mycountry;
    }

    public void setMycountry(String mycountry) {
        this.mycountry = mycountry;
    }

    public String getMyphone() {
        return myphone;
    }

    public void setMyphone(String myphone) {
        this.myphone = myphone;
    }

    public String getMyfax() {
        return myfax;
    }

    public void setMyfax(String myfax) {
        this.myfax = myfax;
    }

    public String getMymail() {
        return mymail;
    }

    public void setMymail(String mymail) {
        this.mymail = mymail;
    }

    public String getMysite() {
        return mysite;
    }

    public void setMysite(String mysite) {
        this.mysite = mysite;
    }

    public byte[] getMylogo() {
        return mylogo;
    }

    public void setMylogo(byte[] mylogo) {
        this.mylogo = mylogo;
    }

    public byte[] getMysignin() {
        return mysignin;
    }

    public void setMysignin(byte[] mysignin) {
        this.mysignin = mysignin;
    }

    public String getMystatut() {
        return mystatut;
    }

    public void setMystatut(String mystatut) {
        this.mystatut = mystatut;
    }

    public String getMymanagerTitle() {
        return mymanagerTitle;
    }

    public void setMymanagerTitle(String mymanagerTitle) {
        this.mymanagerTitle = mymanagerTitle;
    }

    public String getMystudymanager() {
        return mystudymanager;
    }

    public void setMystudymanager(String mystudymanager) {
        this.mystudymanager = mystudymanager;
    }

    public String getMystudytitle() {
        return mystudytitle;
    }

    public void setMystudytitle(String mystudytitle) {
        this.mystudytitle = mystudytitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeMyinfo != null ? codeMyinfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcoMyinfo)) {
            return false;
        }
        EcoMyinfo other = (EcoMyinfo) object;
        if ((this.codeMyinfo == null && other.codeMyinfo != null) || (this.codeMyinfo != null && !this.codeMyinfo.equals(other.codeMyinfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ecolexpert.jpa.EcoMyinfo[ codeMyinfo=" + codeMyinfo + " ]";
    }
    
}
