package com.shenghsiang.mirle.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jack
 */
@Entity
@Table(name = "POSCARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poscard.findAll", query = "SELECT p FROM Poscard p"),
    @NamedQuery(name = "Poscard.findByCardNo", query = "SELECT p FROM Poscard p WHERE p.cardNo = :cardNo"),
    @NamedQuery(name = "Poscard.findByCardCls", query = "SELECT p FROM Poscard p WHERE p.cardCls = :cardCls"),
    @NamedQuery(name = "Poscard.findByMthRpt", query = "SELECT p FROM Poscard p WHERE p.mthRpt = :mthRpt"),
    @NamedQuery(name = "Poscard.findByDisPer", query = "SELECT p FROM Poscard p WHERE p.disPer = :disPer"),
    @NamedQuery(name = "Poscard.findByName", query = "SELECT p FROM Poscard p WHERE p.name = :name"),
    @NamedQuery(name = "Poscard.findByTel", query = "SELECT p FROM Poscard p WHERE p.tel = :tel"),
    @NamedQuery(name = "Poscard.findByTel1", query = "SELECT p FROM Poscard p WHERE p.tel1 = :tel1"),
    @NamedQuery(name = "Poscard.findByAdr", query = "SELECT p FROM Poscard p WHERE p.adr = :adr"),
    @NamedQuery(name = "Poscard.findByBthDay", query = "SELECT p FROM Poscard p WHERE p.bthDay = :bthDay"),
    @NamedQuery(name = "Poscard.findByBthDis", query = "SELECT p FROM Poscard p WHERE p.bthDis = :bthDis"),
    @NamedQuery(name = "Poscard.findByBnDd", query = "SELECT p FROM Poscard p WHERE p.bnDd = :bnDd"),
    @NamedQuery(name = "Poscard.findByEnDd", query = "SELECT p FROM Poscard p WHERE p.enDd = :enDd"),
    @NamedQuery(name = "Poscard.findByAmtn", query = "SELECT p FROM Poscard p WHERE p.amtn = :amtn"),
    @NamedQuery(name = "Poscard.findBySumId", query = "SELECT p FROM Poscard p WHERE p.sumId = :sumId"),
    @NamedQuery(name = "Poscard.findByCardNo1", query = "SELECT p FROM Poscard p WHERE p.cardNo1 = :cardNo1"),
    @NamedQuery(name = "Poscard.findByUserId", query = "SELECT p FROM Poscard p WHERE p.userId = :userId"),
    @NamedQuery(name = "Poscard.findByGfLive", query = "SELECT p FROM Poscard p WHERE p.gfLive = :gfLive"),
    @NamedQuery(name = "Poscard.findByGfLate", query = "SELECT p FROM Poscard p WHERE p.gfLate = :gfLate"),
    @NamedQuery(name = "Poscard.findByDep", query = "SELECT p FROM Poscard p WHERE p.dep = :dep"),
    @NamedQuery(name = "Poscard.findByGxNo", query = "SELECT p FROM Poscard p WHERE p.gxNo = :gxNo"),
    @NamedQuery(name = "Poscard.findByZip", query = "SELECT p FROM Poscard p WHERE p.zip = :zip"),
    @NamedQuery(name = "Poscard.findBySexId", query = "SELECT p FROM Poscard p WHERE p.sexId = :sexId"),
    @NamedQuery(name = "Poscard.findByUsr", query = "SELECT p FROM Poscard p WHERE p.usr = :usr"),
    @NamedQuery(name = "Poscard.findByCellNo", query = "SELECT p FROM Poscard p WHERE p.cellNo = :cellNo"),
    @NamedQuery(name = "Poscard.findByEmail", query = "SELECT p FROM Poscard p WHERE p.email = :email"),
    @NamedQuery(name = "Poscard.findByEMail", query = "SELECT p FROM Poscard p WHERE p.eMail = :eMail"),
    @NamedQuery(name = "Poscard.findByOldNo", query = "SELECT p FROM Poscard p WHERE p.oldNo = :oldNo"),
    @NamedQuery(name = "Poscard.findBySysedId", query = "SELECT p FROM Poscard p WHERE p.sysedId = :sysedId"),
    @NamedQuery(name = "Poscard.findByWangwang", query = "SELECT p FROM Poscard p WHERE p.wangwang = :wangwang"),
    @NamedQuery(name = "Poscard.findByQq", query = "SELECT p FROM Poscard p WHERE p.qq = :qq"),
    @NamedQuery(name = "Poscard.findByMsn", query = "SELECT p FROM Poscard p WHERE p.msn = :msn"),
    @NamedQuery(name = "Poscard.findByShowId", query = "SELECT p FROM Poscard p WHERE p.showId = :showId"),
    @NamedQuery(name = "Poscard.findByCounId", query = "SELECT p FROM Poscard p WHERE p.counId = :counId"),
    @NamedQuery(name = "Poscard.findByJobRem", query = "SELECT p FROM Poscard p WHERE p.jobRem = :jobRem"),
    @NamedQuery(name = "Poscard.findByGwkNo", query = "SELECT p FROM Poscard p WHERE p.gwkNo = :gwkNo"),
    @NamedQuery(name = "Poscard.findByMarryDd", query = "SELECT p FROM Poscard p WHERE p.marryDd = :marryDd"),
    @NamedQuery(name = "Poscard.findByReceiveType", query = "SELECT p FROM Poscard p WHERE p.receiveType = :receiveType"),
    @NamedQuery(name = "Poscard.findByReceiveId", query = "SELECT p FROM Poscard p WHERE p.receiveId = :receiveId"),
    @NamedQuery(name = "Poscard.findByShopNo", query = "SELECT p FROM Poscard p WHERE p.shopNo = :shopNo"),
    @NamedQuery(name = "Poscard.findBySalNo", query = "SELECT p FROM Poscard p WHERE p.salNo = :salNo"),
    @NamedQuery(name = "Poscard.findByPreCard", query = "SELECT p FROM Poscard p WHERE p.preCard = :preCard")})
public class Poscard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "CARD_CLS")
    private String cardCls;
    @Column(name = "MTH_RPT")
    private String mthRpt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DIS_PER")
    private BigDecimal disPer;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "TEL1")
    private String tel1;
    @Column(name = "ADR")
    private String adr;
    @Column(name = "BTH_DAY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bthDay;
    @Column(name = "BTH_DIS")
    private BigDecimal bthDis;
    @Column(name = "BN_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bnDd;
    @Column(name = "EN_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enDd;
    @Column(name = "AMTN")
    private BigDecimal amtn;
    @Column(name = "SUM_ID")
    private String sumId;
    @Column(name = "CARD_NO1")
    private String cardNo1;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "GF_LIVE")
    private BigDecimal gfLive;
    @Column(name = "GF_LATE")
    private BigDecimal gfLate;
    @Column(name = "DEP")
    private String dep;
    @Column(name = "GX_NO")
    private String gxNo;
    @Column(name = "ZIP")
    private String zip;
    @Column(name = "SEX_ID")
    private String sexId;
    @Column(name = "USR")
    private String usr;
    @Column(name = "CELL_NO")
    private String cellNo;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "E_MAIL")
    private String eMail;
    @Lob
    @Column(name = "REM")
    private String rem;
    @Column(name = "OLD_NO")
    private String oldNo;
    @Column(name = "SYSED_ID")
    private String sysedId;
    @Lob
    @Column(name = "UP_DD")
    private byte[] upDd;
    @Column(name = "WANGWANG")
    private String wangwang;
    @Column(name = "QQ")
    private String qq;
    @Column(name = "MSN")
    private String msn;
    @Column(name = "SHOW_ID")
    private String showId;
    @Column(name = "COUN_ID")
    private Integer counId;
    @Column(name = "JOB_REM")
    private String jobRem;
    @Column(name = "GWK_NO")
    private String gwkNo;
    @Column(name = "MARRY_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date marryDd;
    @Column(name = "RECEIVE_TYPE")
    private String receiveType;
    @Column(name = "RECEIVE_ID")
    private String receiveId;
    @Column(name = "SHOP_NO")
    private String shopNo;
    @Column(name = "SAL_NO")
    private String salNo;
    @Column(name = "PRE_CARD")
    private String preCard;
    @OneToMany(mappedBy = "cardNo")
    private Collection<Cust> custCollection;

    public Poscard() {
    }

    public Poscard(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardCls() {
        return cardCls;
    }

    public void setCardCls(String cardCls) {
        this.cardCls = cardCls;
    }

    public String getMthRpt() {
        return mthRpt;
    }

    public void setMthRpt(String mthRpt) {
        this.mthRpt = mthRpt;
    }

    public BigDecimal getDisPer() {
        return disPer;
    }

    public void setDisPer(BigDecimal disPer) {
        this.disPer = disPer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public Date getBthDay() {
        return bthDay;
    }

    public void setBthDay(Date bthDay) {
        this.bthDay = bthDay;
    }

    public BigDecimal getBthDis() {
        return bthDis;
    }

    public void setBthDis(BigDecimal bthDis) {
        this.bthDis = bthDis;
    }

    public Date getBnDd() {
        return bnDd;
    }

    public void setBnDd(Date bnDd) {
        this.bnDd = bnDd;
    }

    public Date getEnDd() {
        return enDd;
    }

    public void setEnDd(Date enDd) {
        this.enDd = enDd;
    }

    public BigDecimal getAmtn() {
        return amtn;
    }

    public void setAmtn(BigDecimal amtn) {
        this.amtn = amtn;
    }

    public String getSumId() {
        return sumId;
    }

    public void setSumId(String sumId) {
        this.sumId = sumId;
    }

    public String getCardNo1() {
        return cardNo1;
    }

    public void setCardNo1(String cardNo1) {
        this.cardNo1 = cardNo1;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getGfLive() {
        return gfLive;
    }

    public void setGfLive(BigDecimal gfLive) {
        this.gfLive = gfLive;
    }

    public BigDecimal getGfLate() {
        return gfLate;
    }

    public void setGfLate(BigDecimal gfLate) {
        this.gfLate = gfLate;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getGxNo() {
        return gxNo;
    }

    public void setGxNo(String gxNo) {
        this.gxNo = gxNo;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    public String getOldNo() {
        return oldNo;
    }

    public void setOldNo(String oldNo) {
        this.oldNo = oldNo;
    }

    public String getSysedId() {
        return sysedId;
    }

    public void setSysedId(String sysedId) {
        this.sysedId = sysedId;
    }

    public byte[] getUpDd() {
        return upDd;
    }

    public void setUpDd(byte[] upDd) {
        this.upDd = upDd;
    }

    public String getWangwang() {
        return wangwang;
    }

    public void setWangwang(String wangwang) {
        this.wangwang = wangwang;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Integer getCounId() {
        return counId;
    }

    public void setCounId(Integer counId) {
        this.counId = counId;
    }

    public String getJobRem() {
        return jobRem;
    }

    public void setJobRem(String jobRem) {
        this.jobRem = jobRem;
    }

    public String getGwkNo() {
        return gwkNo;
    }

    public void setGwkNo(String gwkNo) {
        this.gwkNo = gwkNo;
    }

    public Date getMarryDd() {
        return marryDd;
    }

    public void setMarryDd(Date marryDd) {
        this.marryDd = marryDd;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getSalNo() {
        return salNo;
    }

    public void setSalNo(String salNo) {
        this.salNo = salNo;
    }

    public String getPreCard() {
        return preCard;
    }

    public void setPreCard(String preCard) {
        this.preCard = preCard;
    }

    @XmlTransient
    public Collection<Cust> getCustCollection() {
        return custCollection;
    }

    public void setCustCollection(Collection<Cust> custCollection) {
        this.custCollection = custCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardNo != null ? cardNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poscard)) {
            return false;
        }
        Poscard other = (Poscard) object;
        if ((this.cardNo == null && other.cardNo != null) || (this.cardNo != null && !this.cardNo.equals(other.cardNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.shenghsiang.entity.Poscard[ cardNo=" + cardNo + " ]";
    }
    
}
