package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the INV_NO database table.
 * 
 */
@Entity
@Table(name = "INV_NO")
@NamedQueries({
	@NamedQuery(name = "InvNo.findAll", query = "SELECT i FROM InvNo i WHERE i.invId = '39' "),
	@NamedQuery(name = "InvNo.findByPK", query = "SELECT i FROM InvNo i WHERE i.id = :pk "),
	@NamedQuery(name = "InvNo.findByInvoiceDate", query = "SELECT i FROM InvNo i WHERE i.invDd = :invoice_date"),
	@NamedQuery(name = "InvNo.findByInvoiceDateRange", query = "SELECT i FROM InvNo i WHERE  i.invId = '39' AND i.invDd BETWEEN :beginDate AND :endDate"),
	@NamedQuery(name = "InvNo.findByInvNo", query = "SELECT i FROM InvNo i WHERE i.id.invNo = :invNo and i.id.bilId = 'SA'")
})
public class InvNo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvNoPK id;

	@Column(name = "AMT", precision = 22, scale = 8)
	private BigDecimal amt;

	@Column(name = "BACK_REM", length = 20)
	private String backRem;

	@Lob
	@Column(name = "BUY_ADR")
	private String buyAdr;

	@Column(name = "BUY_ID_CODE", length = 30)
	private String buyIdCode;

	@Column(name = "BUY_KH_BANK", length = 40)
	private String buyKhBank;

	@Column(name = "BUY_TEL", length = 20)
	private String buyTel;

	@Column(name = "CANCEL_DD")
	private Timestamp cancelDd;

	@Column(name = "CANCEL_ID", length = 1)
	private String cancelId;

	@Column(name = "CARRIERID1", length = 64)
	private String carrierid1;

	@Column(name = "CARRIERID2", length = 64)
	private String carrierid2;

	@Column(name = "CHK_CODE", length = 10)
	private String chkCode;

	@Column(name = "CPY_SW", length = 1)
	private String cpySw;

	@Column(name = "DEP", length = 8)
	private String dep;

	@Column(name = "DONATE", length = 1)
	private String donate;

	@Column(name = "INV_DD")
	private Timestamp invDd;

	@Column(name = "INV_ID", length = 2)
	private String invId;

	@Column(name = "INV_NR", length = 4)
	private String invNr;

	@Column(name = "INV_TT", length = 1)
	private String invTt;

	@Column(name = "INV_TYPE", length = 1)
	private String invType;

	@Column(name = "INV_YM")
	private int invYm;

	@Column(name = "METH_ID", length = 2)
	private String methId;

	@Column(name = "MODIFY_DD")
	private Timestamp modifyDd;

	@Column(name = "NPOBAN", length = 7)
	private String npoban;

	@Column(name = "PRJ_NO", length = 60)
	private String prjNo;

	@Column(name = "PRT_DATE")
	private Timestamp prtDate;

	@Column(name = "PRT_SW", length = 1)
	private String prtSw;

	@Column(name = "PRT_USR", length = 12)
	private String prtUsr;

	@Column(name = "RAND_NO", length = 4)
	private String randNo;

	@Column(name = "REM", length = 1000)
	private String rem;

	@Lob
	@Column(name = "SAL_ADR")
	private String salAdr;

	@Column(name = "SAL_ID_CODE", length = 30)
	private String salIdCode;

	@Column(name = "SAL_KH_BANK", length = 40)
	private String salKhBank;

	@Column(name = "SAL_TEL", length = 20)
	private String salTel;

	@Column(name = "SB_SD", length = 1)
	private String sbSd;

	@Column(name = "SYS_DATE")
	private Timestamp sysDate;

	@Column(name = "TAX", precision = 22, scale = 8)
	private BigDecimal tax;

	@Column(name = "TAX_FREE_ID", length = 1)
	private String taxFreeId;

	@Column(name = "TAX_ID1", length = 1)
	private String taxId1;

	@Column(name = "TAX_ID2", length = 1)
	private String taxId2;

	@Column(name = "TITLE_BUY", length = 80)
	private String titleBuy;

	@Column(name = "TITLE_PAY", length = 80)
	private String titlePay;

	@Column(name = "TRACK_ID", length = 2)
	private String trackId;

	@Column(name = "UNI_NO_BUY", length = 20)
	private String uniNoBuy;

	@Column(name = "UNI_NO_PAY", length = 20)
	private String uniNoPay;

	@Column(name = "UPLOAD", length = 1)
	private String upload;

	@Column(name = "USR", length = 12)
	private String usr;

	// bi-directional one-to-one association to Cust
	@OneToOne
	@JoinColumn(name = "CUS_NO")
	private Cust cust;

	// bi-directional one-to-one association to MfPss
/*	
	@OneToOne
	@JoinColumns({ 
	@JoinColumn(name = "BIL_ID", referencedColumnName = "PS_ID", nullable = true, insertable = false, updatable = false),		
	@JoinColumn(name = "BIL_NO", referencedColumnName = "PS_NO", nullable = true, insertable = false, updatable = false)
	})
	private MfPss mfPss;
*/
	
	public InvNo() {
	}

	public InvNoPK getId() {
		return this.id;
	}

	public void setId(InvNoPK id) {
		this.id = id;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getBackRem() {
		return this.backRem;
	}

	public void setBackRem(String backRem) {
		this.backRem = backRem;
	}

	public String getBuyAdr() {
		return this.buyAdr;
	}

	public void setBuyAdr(String buyAdr) {
		this.buyAdr = buyAdr;
	}

	public String getBuyIdCode() {
		return this.buyIdCode;
	}

	public void setBuyIdCode(String buyIdCode) {
		this.buyIdCode = buyIdCode;
	}

	public String getBuyKhBank() {
		return this.buyKhBank;
	}

	public void setBuyKhBank(String buyKhBank) {
		this.buyKhBank = buyKhBank;
	}

	public String getBuyTel() {
		return this.buyTel;
	}

	public void setBuyTel(String buyTel) {
		this.buyTel = buyTel;
	}

	public Timestamp getCancelDd() {
		return this.cancelDd;
	}

	public void setCancelDd(Timestamp cancelDd) {
		this.cancelDd = cancelDd;
	}

	public String getCancelId() {
		return this.cancelId;
	}

	public void setCancelId(String cancelId) {
		this.cancelId = cancelId;
	}

	public String getCarrierid1() {
		return this.carrierid1;
	}

	public void setCarrierid1(String carrierid1) {
		this.carrierid1 = carrierid1;
	}

	public String getCarrierid2() {
		return this.carrierid2;
	}

	public void setCarrierid2(String carrierid2) {
		this.carrierid2 = carrierid2;
	}

	public String getChkCode() {
		return this.chkCode;
	}

	public void setChkCode(String chkCode) {
		this.chkCode = chkCode;
	}

	public String getCpySw() {
		return this.cpySw;
	}

	public void setCpySw(String cpySw) {
		this.cpySw = cpySw;
	}

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getDonate() {
		return this.donate;
	}

	public void setDonate(String donate) {
		this.donate = donate;
	}

	public Timestamp getInvDd() {
		return this.invDd;
	}

	public void setInvDd(Timestamp invDd) {
		this.invDd = invDd;
	}

	public String getInvId() {
		return this.invId;
	}

	public void setInvId(String invId) {
		this.invId = invId;
	}

	public String getInvNr() {
		return this.invNr;
	}

	public void setInvNr(String invNr) {
		this.invNr = invNr;
	}

	public String getInvTt() {
		return this.invTt;
	}

	public void setInvTt(String invTt) {
		this.invTt = invTt;
	}

	public String getInvType() {
		return this.invType;
	}

	public void setInvType(String invType) {
		this.invType = invType;
	}

	public int getInvYm() {
		return this.invYm;
	}

	public void setInvYm(int invYm) {
		this.invYm = invYm;
	}

	public String getMethId() {
		return this.methId;
	}

	public void setMethId(String methId) {
		this.methId = methId;
	}

	public Timestamp getModifyDd() {
		return this.modifyDd;
	}

	public void setModifyDd(Timestamp modifyDd) {
		this.modifyDd = modifyDd;
	}

	public String getNpoban() {
		return this.npoban;
	}

	public void setNpoban(String npoban) {
		this.npoban = npoban;
	}

	public String getPrjNo() {
		return this.prjNo;
	}

	public void setPrjNo(String prjNo) {
		this.prjNo = prjNo;
	}

	public Timestamp getPrtDate() {
		return this.prtDate;
	}

	public void setPrtDate(Timestamp prtDate) {
		this.prtDate = prtDate;
	}

	public String getPrtSw() {
		return this.prtSw;
	}

	public void setPrtSw(String prtSw) {
		this.prtSw = prtSw;
	}

	public String getPrtUsr() {
		return this.prtUsr;
	}

	public void setPrtUsr(String prtUsr) {
		this.prtUsr = prtUsr;
	}

	public String getRandNo() {
		return this.randNo;
	}

	public void setRandNo(String randNo) {
		this.randNo = randNo;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getSalAdr() {
		return this.salAdr;
	}

	public void setSalAdr(String salAdr) {
		this.salAdr = salAdr;
	}

	public String getSalIdCode() {
		return this.salIdCode;
	}

	public void setSalIdCode(String salIdCode) {
		this.salIdCode = salIdCode;
	}

	public String getSalKhBank() {
		return this.salKhBank;
	}

	public void setSalKhBank(String salKhBank) {
		this.salKhBank = salKhBank;
	}

	public String getSalTel() {
		return this.salTel;
	}

	public void setSalTel(String salTel) {
		this.salTel = salTel;
	}

	public String getSbSd() {
		return this.sbSd;
	}

	public void setSbSd(String sbSd) {
		this.sbSd = sbSd;
	}

	public Timestamp getSysDate() {
		return this.sysDate;
	}

	public void setSysDate(Timestamp sysDate) {
		this.sysDate = sysDate;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public String getTaxFreeId() {
		return this.taxFreeId;
	}

	public void setTaxFreeId(String taxFreeId) {
		this.taxFreeId = taxFreeId;
	}

	public String getTaxId1() {
		return this.taxId1;
	}

	public void setTaxId1(String taxId1) {
		this.taxId1 = taxId1;
	}

	public String getTaxId2() {
		return this.taxId2;
	}

	public void setTaxId2(String taxId2) {
		this.taxId2 = taxId2;
	}

	public String getTitleBuy() {
		return this.titleBuy;
	}

	public void setTitleBuy(String titleBuy) {
		this.titleBuy = titleBuy;
	}

	public String getTitlePay() {
		return this.titlePay;
	}

	public void setTitlePay(String titlePay) {
		this.titlePay = titlePay;
	}

	public String getTrackId() {
		return this.trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getUniNoBuy() {
		return this.uniNoBuy;
	}

	public void setUniNoBuy(String uniNoBuy) {
		this.uniNoBuy = uniNoBuy;
	}

	public String getUniNoPay() {
		return this.uniNoPay;
	}

	public void setUniNoPay(String uniNoPay) {
		this.uniNoPay = uniNoPay;
	}

	public String getUpload() {
		return this.upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getUsr() {
		return this.usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public Cust getCust() {
		return this.cust;
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}

}