package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the MF_PSS database table.
 * 
 */
@Entity
@Table(name="MF_PSS")
@NamedQueries({
@NamedQuery(name="MfPss.findAll", query="SELECT m FROM MfPss m"),
@NamedQuery(name="MfPss.findByPK", query="SELECT m FROM MfPss m WHERE m.id = :pk "),
@NamedQuery(name="MfPss.findSBByDateRange", query="SELECT m FROM MfPss m WHERE m.id.psId = 'SB' AND m.psDd BETWEEN :beginDate AND :endDate "),
@NamedQuery(name="MfPss.findSDByDateRange", query="SELECT m FROM MfPss m WHERE m.id.psId = 'SD' AND m.psDd BETWEEN :beginDate AND :endDate ")
})
public class MfPss implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MfPssPK id;

	@Column(name="ACC_FP_NO", length=20)
	private String accFpNo;

	@Column(name="ACT_ID", length=1)
	private String actId;

	@Lob
	@Column(name="ADR")
	private String adr;

	@Column(name="AMT", precision=22, scale=8)
	private BigDecimal amt;

	@Column(name="AMT_CLS", precision=22, scale=8)
	private BigDecimal amtCls;

	@Column(name="AMT_INV", precision=22, scale=8)
	private BigDecimal amtInv;

	@Column(name="AMT_IRP", precision=22, scale=8)
	private BigDecimal amtIrp;

	@Column(name="AMT_POI")
	private short amtPoi;

	@Column(name="AMT_RSV", precision=22, scale=8)
	private BigDecimal amtRsv;

	@Column(name="AMTN_CASH", precision=22, scale=8)
	private BigDecimal amtnCash;

	@Column(name="AMTN_CBAC", precision=22, scale=8)
	private BigDecimal amtnCbac;

	@Column(name="AMTN_DS", precision=22, scale=8)
	private BigDecimal amtnDs;

	@Column(name="AMTN_EP", precision=22, scale=8)
	private BigDecimal amtnEp;

	@Column(name="AMTN_EP_IFRS", precision=22, scale=8)
	private BigDecimal amtnEpIfrs;

	@Column(name="AMTN_EP1", precision=22, scale=8)
	private BigDecimal amtnEp1;

	@Column(name="AMTN_EP1_IFRS", precision=22, scale=8)
	private BigDecimal amtnEp1Ifrs;

	@Column(name="AMTN_FL", precision=22, scale=8)
	private BigDecimal amtnFl;

	@Column(name="AMTN_FT", precision=22, scale=8)
	private BigDecimal amtnFt;

	@Column(name="AMTN_INV", precision=22, scale=8)
	private BigDecimal amtnInv;

	@Column(name="AMTN_IRP", precision=22, scale=8)
	private BigDecimal amtnIrp;

	@Column(name="AMTN_NET_CLS", precision=22, scale=8)
	private BigDecimal amtnNetCls;

	@Column(name="AMTN_RSV", precision=22, scale=8)
	private BigDecimal amtnRsv;

	@Column(name="AMTN_SX", precision=22, scale=8)
	private BigDecimal amtnSx;

	@Column(name="ARP_DD")
	private Timestamp arpDd;

	@Column(name="ARP_NO", length=20)
	private String arpNo;

	@Column(name="AUTH_CODE", length=10)
	private String authCode;

	@Column(name="AUTH_INFO", length=200)
	private String authInfo;

	@Column(name="BAT_NO", length=40)
	private String batNo;

	@Column(name="BD_ID", length=1)
	private String bdId;

	@Column(name="BIL_COMP", length=13)
	private String bilComp;

	@Column(name="BIL_ID", length=2)
	private String bilId;

	@Column(name="BIL_MARK", length=1)
	private String bilMark;

	@Column(name="BIL_NO", length=20)
	private String bilNo;

	@Column(name="BIL_TYPE", length=2)
	private String bilType;

	@Column(name="CANCEL_ID", length=1)
	private String cancelId;

	@Column(name="CARD_CLS", length=10)
	private String cardCls;

	@Column(name="CARD_NO", length=20)
	private String cardNo;

	@Column(name="CAS_NO", length=20)
	private String casNo;

	@Column(name="CASH_ID", length=1)
	private String cashId;

	@Column(name="CB_ID", length=1)
	private String cbId;

	@Column(name="CB_ID_IFRS", length=1)
	private String cbIdIfrs;

	@Column(name="CHK_DAYS")
	private short chkDays;

	@Column(name="CHK_DD")
	private Timestamp chkDd;

	@Column(name="CHK_MAN", length=12)
	private String chkMan;

	@Column(name="CK_CLS_ID", length=1)
	private String ckClsId;

	@Column(name="CLS_DATE")
	private Timestamp clsDate;

	@Column(name="CLS_ID", length=1)
	private String clsId;

	@Column(name="CLS_REM", length=30)
	private String clsRem;

	@Column(name="CLSCK", length=1)
	private String clsck;

	@Column(name="CLSID", length=1)
	private String clsid;

	@Column(name="CLSLZ", length=1)
	private String clslz;

	@Column(name="CNT_MAN1", length=20)
	private String cntMan1;

	@Column(name="CNTT_NO", length=40)
	private String cnttNo;

	@Column(name="CONTRACT", length=80)
	private String contract;

	@Column(name="CPY_SW", length=1)
	private String cpySw;

	@Column(name="CUR_ID", length=4)
	private String curId;

	@Column(name="CUR_ID_IFRS", length=4)
	private String curIdIfrs;

	@Column(name="CUS_CARD_NO", length=20)
	private String cusCardNo;
    /*
	@Column(name="CUS_NO", length=12)
	private String cusNo;
    */
	@Column(name="CUS_NO_POS", length=50)
	private String cusNoPos;

	@Column(name="CUS_OS_NO", length=30)
	private String cusOsNo;

	@Column(name="CUST_YG", length=12)
	private String custYg;

	@Column(name="DATE_FQSK")
	private Timestamp dateFqsk;

	@Column(name="DATEFLAG_FQSK", length=1)
	private String dateflagFqsk;

	@Column(name="DEP", length=8)
	private String dep;

	@Column(name="DIS_CNT", precision=22, scale=8)
	private BigDecimal disCnt;

	@Column(name="DZ_DATE")
	private Timestamp dzDate;

	@Column(name="DZ_USR", length=12)
	private String dzUsr;

	@Column(name="EP_NO", length=20)
	private String epNo;

	@Column(name="EP_NO1", length=20)
	private String epNo1;

	@Column(name="EXC_RTO", precision=22, scale=8)
	private BigDecimal excRto;

	@Column(name="EXC_RTO_IFRS", precision=22, scale=8)
	private BigDecimal excRtoIfrs;

	@Column(name="FJ_NUM")
	// private short fjNum;
	private Integer fjNum;


	@Column(name="HAS_FX", length=1)
	private String hasFx;

	@Column(name="HG_BH", length=30)
	private String hgBh;

	@Column(name="INST_TEAM", length=50)
	private String instTeam;

	@Column(name="INT_DAYS")
	private short intDays;

	@Column(name="INV_BCODE_NO", length=15)
	private String invBcodeNo;

	@Column(name="INV_BIL_ID", length=2)
	private String invBilId;

	@Column(name="INV_BIL_NO", length=20)
	private String invBilNo;

	@Column(name="INV_DD")
	private Timestamp invDd;
/*
	@Column(name="INV_NO", length=20)
	private String invNo;
*/	
	@Column(name="INV_YM")
	// private int invYm;
	/*
	 * changed from int to Integer to prevent loading null
	 */
	private Integer invYm;

	@Column(name="IS_POS", length=1)
	private String isPos;

	@Column(name="ISFLZL", length=1)
	private String isflzl;

	@Column(name="ISSVS", length=1)
	private String issvs;

	@Column(name="JFEND_DD")
	private Timestamp jfendDd;

	@Column(name="KP_ID", length=1)
	private String kpId;

	@Column(name="LC_NO", length=30)
	private String lcNo;

	@Column(name="LOCK_DATE")
	private Timestamp lockDate;

	@Column(name="LOCK_MAN", length=12)
	private String lockMan;

	@Column(name="LZ_CLS_DD")
	private Timestamp lzClsDd;

	@Column(name="LZ_CLS_ID", length=1)
	private String lzClsId;

	@Column(name="METH_ID", length=2)
	private String methId;

	@Column(name="MM_ID", length=2)
	private String mmId;

	@Column(name="MOB_ID", length=2)
	private String mobId;

	@Column(name="MODIFY_DD")
	private Timestamp modifyDd;

	@Column(name="MODIFY_MAN", length=12)
	private String modifyMan;

	@Column(name="OM_NO", length=20)
	private String omNo;

	@Column(name="OS_ID", length=2)
	private String osId;

	@Column(name="OS_NO", length=25)
	private String osNo;

	@Column(name="PA_NO", length=20)
	private String paNo;

	@Column(name="PAY_DAYS")
	private short payDays;

	@Column(name="PAY_DD")
	private Timestamp payDd;

	@Column(name="PAY_MTH", length=1)
	private String payMth;

	@Column(name="PAY_REM", length=80)
	private String payRem;

	@Column(name="PAYCARD_NO", length=10)
	private String paycardNo;

	@Column(name="PCTOSA", length=1)
	private String pctosa;

	@Column(name="PH_NO", length=20)
	private String phNo;

	@Column(name="PK_NO", length=20)
	private String pkNo;

	@Column(name="PO_ID", length=1)
	private String poId;

	@Column(name="PO_NO", length=20)
	private String poNo;

	@Column(name="POPC_ID", length=2)
	private String popcId;

	@Column(name="POS_ID", length=2)
	private String posId;

	@Column(name="POS_NO", length=15)
	private String posNo;

	@Column(name="POS_OS_CLS", length=20)
	private String posOsCls;

	@Column(name="POS_OS_ID", length=1)
	private String posOsId;

	@Column(name="PRT_DATE")
	private Timestamp prtDate;

	@Column(name="PRT_SW", length=1)
	private String prtSw;

	@Column(name="PRT_USR", length=12)
	private String prtUsr;

	@Column(name="PS_DD")
	private Timestamp psDd;

	@Column(name="QC_SW", length=1)
	private String qcSw;

	@Column(name="QS_FQSK")
	//private int qsFqsk;
	private Integer qsFqsk;

	@Column(name="QTY", precision=22, scale=8)
	private BigDecimal qty;

	@Column(name="QTY_CASH", precision=22, scale=8)
	private BigDecimal qtyCash;

	@Column(name="QTY_CLS", precision=22, scale=8)
	private BigDecimal qtyCls;

	@Column(name="QTY_INV", precision=22, scale=8)
	private BigDecimal qtyInv;

	@Column(name="QTY1_CLS", precision=22, scale=8)
	private BigDecimal qty1Cls;

	@Lob
	@Column(name="REM")
	private String rem;

	@Column(name="RP_NO", length=20)
	private String rpNo;

	@Column(name="RSV_PER", precision=22, scale=8)
	private BigDecimal rsvPer;

	@Column(name="RTO_FQSK", precision=22, scale=8)
	private BigDecimal rtoFqsk;

	@Column(name="SAL_NO", length=12)
	private String salNo;

	@Column(name="SB_CHK", length=1)
	private String sbChk;

	@Column(name="SCAN_DATE")
	private Timestamp scanDate;

	@Column(name="SCAN_ID", length=1)
	private String scanId;

	@Column(name="SCAN_USR", length=12)
	private String scanUsr;

	@Column(name="SCUS_NO", length=20)
	private String scusNo;

	@Column(name="SEND_AREA", length=10)
	private String sendArea;

	@Column(name="SEND_MTH", length=200)
	private String sendMth;

	@Column(name="SEND_WH", length=12)
	private String sendWh;

	@Column(name="SG_ID", length=30)
	private String sgId;

	@Column(name="SG_ID1", length=1)
	private String sgId1;

	@Column(name="SGTFLAG")
	//private short sgtflag;
	private Short sgtflag;

	@Column(name="SIGN_DD")
	private Timestamp signDd;

	@Column(name="SOUTYPE")
	private Short soutype;

	@Column(name="SUB_NO", length=30)
	private String subNo;

	@Column(name="SYS_DATE")
	private Timestamp sysDate;

	@Column(name="TASK_ID")
	private Integer taskId;

	@Column(name="TAX_CLS", precision=22, scale=8)
	private BigDecimal taxCls;

	@Column(name="TAX_ID", length=1)
	private String taxId;

	@Column(name="TAX_INV", precision=22, scale=8)
	private BigDecimal taxInv;

	@Column(name="TAX_IRP", precision=22, scale=8)
	private BigDecimal taxIrp;

	@Column(name="TB_NO", length=20)
	private String tbNo;

	@Column(name="TITLE_BUY", length=50)
	private String titleBuy;

	@Column(name="TO_MJ", length=1)
	private String toMj;

	@Column(name="TO_SB", length=1)
	private String toSb;

	@Column(name="TOT_BOX", precision=22, scale=8)
	private BigDecimal totBox;

	@Column(name="TOT_QTY", precision=22, scale=8)
	private BigDecimal totQty;

	@Column(name="TRAD_MTH", length=20)
	private String tradMth;

	@Column(name="TT_TYPE_SET", length=20)
	private String ttTypeSet;

	@Column(name="TT_YM_B")
	private Timestamp ttYmB;

	@Column(name="TURN_ID", length=1)
	private String turnId;

	@Column(name="TZZG", length=1)
	private String tzzg;

	@Column(name="USR", length=12)
	private String usr;

	@Column(name="USR_AUTH", length=12)
	private String usrAuth;

	@Column(name="VOH_ID", length=2)
	private String vohId;

	@Column(name="VOH_MKNO", length=20)
	private String vohMkno;

	@Column(name="VOH_NO", length=20)
	private String vohNo;

	@Column(name="WS_CHK_PAY", length=1)
	private String wsChkPay;

	@Column(name="WS_KD_CHK", length=1)
	private String wsKdChk;

	@Column(name="WS_RCV_CHK", length=1)
	private String wsRcvChk;

	@Column(name="YD_ID", length=1)
	private String ydId;

	@Column(name="ZB_NO", length=20)
	private String zbNo;

	@Column(name="ZC_FLAG", length=1)
	private String zcFlag;

	@Column(name="ZHANG_ID", length=1)
	private String zhangId;

	//bi-directional many-to-one association to TfPss
	@OneToMany(fetch = FetchType.EAGER, mappedBy="mfPss")
	private List<TfPss> tfPsses;

	// bi-directional one-to-one association to Cust
	@OneToOne
	@JoinColumn(name = "CUS_NO")
	private Cust cust;  

	@OneToOne
	@JoinColumns({ 
	@JoinColumn(name = "INV_NO", referencedColumnName = "INV_NO", nullable= false, insertable = false, updatable = false),	
	@JoinColumn(name = "PS_ID", referencedColumnName = "BIL_ID", nullable = false, insertable = false, updatable = false),		
	@JoinColumn(name = "PS_NO", referencedColumnName = "BIL_NO", nullable = false, insertable = false, updatable = false)
	})
	private InvNo invNo;
	
	public MfPss() {
	}

	public MfPssPK getId() {
		return this.id;
	}

	public void setId(MfPssPK id) {
		this.id = id;
	}

	public String getAccFpNo() {
		return this.accFpNo;
	}

	public void setAccFpNo(String accFpNo) {
		this.accFpNo = accFpNo;
	}

	public String getActId() {
		return this.actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
	}

	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAmtCls() {
		return this.amtCls;
	}

	public void setAmtCls(BigDecimal amtCls) {
		this.amtCls = amtCls;
	}

	public BigDecimal getAmtInv() {
		return this.amtInv;
	}

	public void setAmtInv(BigDecimal amtInv) {
		this.amtInv = amtInv;
	}

	public BigDecimal getAmtIrp() {
		return this.amtIrp;
	}

	public void setAmtIrp(BigDecimal amtIrp) {
		this.amtIrp = amtIrp;
	}

	public short getAmtPoi() {
		return this.amtPoi;
	}

	public void setAmtPoi(short amtPoi) {
		this.amtPoi = amtPoi;
	}

	public BigDecimal getAmtRsv() {
		return this.amtRsv;
	}

	public void setAmtRsv(BigDecimal amtRsv) {
		this.amtRsv = amtRsv;
	}

	public BigDecimal getAmtnCash() {
		return this.amtnCash;
	}

	public void setAmtnCash(BigDecimal amtnCash) {
		this.amtnCash = amtnCash;
	}

	public BigDecimal getAmtnCbac() {
		return this.amtnCbac;
	}

	public void setAmtnCbac(BigDecimal amtnCbac) {
		this.amtnCbac = amtnCbac;
	}

	public BigDecimal getAmtnDs() {
		return this.amtnDs;
	}

	public void setAmtnDs(BigDecimal amtnDs) {
		this.amtnDs = amtnDs;
	}

	public BigDecimal getAmtnEp() {
		return this.amtnEp;
	}

	public void setAmtnEp(BigDecimal amtnEp) {
		this.amtnEp = amtnEp;
	}

	public BigDecimal getAmtnEpIfrs() {
		return this.amtnEpIfrs;
	}

	public void setAmtnEpIfrs(BigDecimal amtnEpIfrs) {
		this.amtnEpIfrs = amtnEpIfrs;
	}

	public BigDecimal getAmtnEp1() {
		return this.amtnEp1;
	}

	public void setAmtnEp1(BigDecimal amtnEp1) {
		this.amtnEp1 = amtnEp1;
	}

	public BigDecimal getAmtnEp1Ifrs() {
		return this.amtnEp1Ifrs;
	}

	public void setAmtnEp1Ifrs(BigDecimal amtnEp1Ifrs) {
		this.amtnEp1Ifrs = amtnEp1Ifrs;
	}

	public BigDecimal getAmtnFl() {
		return this.amtnFl;
	}

	public void setAmtnFl(BigDecimal amtnFl) {
		this.amtnFl = amtnFl;
	}

	public BigDecimal getAmtnFt() {
		return this.amtnFt;
	}

	public void setAmtnFt(BigDecimal amtnFt) {
		this.amtnFt = amtnFt;
	}

	public BigDecimal getAmtnInv() {
		return this.amtnInv;
	}

	public void setAmtnInv(BigDecimal amtnInv) {
		this.amtnInv = amtnInv;
	}

	public BigDecimal getAmtnIrp() {
		return this.amtnIrp;
	}

	public void setAmtnIrp(BigDecimal amtnIrp) {
		this.amtnIrp = amtnIrp;
	}

	public BigDecimal getAmtnNetCls() {
		return this.amtnNetCls;
	}

	public void setAmtnNetCls(BigDecimal amtnNetCls) {
		this.amtnNetCls = amtnNetCls;
	}

	public BigDecimal getAmtnRsv() {
		return this.amtnRsv;
	}

	public void setAmtnRsv(BigDecimal amtnRsv) {
		this.amtnRsv = amtnRsv;
	}

	public BigDecimal getAmtnSx() {
		return this.amtnSx;
	}

	public void setAmtnSx(BigDecimal amtnSx) {
		this.amtnSx = amtnSx;
	}

	public Timestamp getArpDd() {
		return this.arpDd;
	}

	public void setArpDd(Timestamp arpDd) {
		this.arpDd = arpDd;
	}

	public String getArpNo() {
		return this.arpNo;
	}

	public void setArpNo(String arpNo) {
		this.arpNo = arpNo;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthInfo() {
		return this.authInfo;
	}

	public void setAuthInfo(String authInfo) {
		this.authInfo = authInfo;
	}

	public String getBatNo() {
		return this.batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public String getBdId() {
		return this.bdId;
	}

	public void setBdId(String bdId) {
		this.bdId = bdId;
	}

	public String getBilComp() {
		return this.bilComp;
	}

	public void setBilComp(String bilComp) {
		this.bilComp = bilComp;
	}

	public String getBilId() {
		return this.bilId;
	}

	public void setBilId(String bilId) {
		this.bilId = bilId;
	}

	public String getBilMark() {
		return this.bilMark;
	}

	public void setBilMark(String bilMark) {
		this.bilMark = bilMark;
	}

	public String getBilNo() {
		return this.bilNo;
	}

	public void setBilNo(String bilNo) {
		this.bilNo = bilNo;
	}

	public String getBilType() {
		return this.bilType;
	}

	public void setBilType(String bilType) {
		this.bilType = bilType;
	}

	public String getCancelId() {
		return this.cancelId;
	}

	public void setCancelId(String cancelId) {
		this.cancelId = cancelId;
	}

	public String getCardCls() {
		return this.cardCls;
	}

	public void setCardCls(String cardCls) {
		this.cardCls = cardCls;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCasNo() {
		return this.casNo;
	}

	public void setCasNo(String casNo) {
		this.casNo = casNo;
	}

	public String getCashId() {
		return this.cashId;
	}

	public void setCashId(String cashId) {
		this.cashId = cashId;
	}

	public String getCbId() {
		return this.cbId;
	}

	public void setCbId(String cbId) {
		this.cbId = cbId;
	}

	public String getCbIdIfrs() {
		return this.cbIdIfrs;
	}

	public void setCbIdIfrs(String cbIdIfrs) {
		this.cbIdIfrs = cbIdIfrs;
	}

	public short getChkDays() {
		return this.chkDays;
	}

	public void setChkDays(short chkDays) {
		this.chkDays = chkDays;
	}

	public Timestamp getChkDd() {
		return this.chkDd;
	}

	public void setChkDd(Timestamp chkDd) {
		this.chkDd = chkDd;
	}

	public String getChkMan() {
		return this.chkMan;
	}

	public void setChkMan(String chkMan) {
		this.chkMan = chkMan;
	}

	public String getCkClsId() {
		return this.ckClsId;
	}

	public void setCkClsId(String ckClsId) {
		this.ckClsId = ckClsId;
	}

	public Timestamp getClsDate() {
		return this.clsDate;
	}

	public void setClsDate(Timestamp clsDate) {
		this.clsDate = clsDate;
	}

	public String getClsId() {
		return this.clsId;
	}

	public void setClsId(String clsId) {
		this.clsId = clsId;
	}

	public String getClsRem() {
		return this.clsRem;
	}

	public void setClsRem(String clsRem) {
		this.clsRem = clsRem;
	}

	public String getClsck() {
		return this.clsck;
	}

	public void setClsck(String clsck) {
		this.clsck = clsck;
	}

	public String getClsid() {
		return this.clsid;
	}

	public void setClsid(String clsid) {
		this.clsid = clsid;
	}

	public String getClslz() {
		return this.clslz;
	}

	public void setClslz(String clslz) {
		this.clslz = clslz;
	}

	public String getCntMan1() {
		return this.cntMan1;
	}

	public void setCntMan1(String cntMan1) {
		this.cntMan1 = cntMan1;
	}

	public String getCnttNo() {
		return this.cnttNo;
	}

	public void setCnttNo(String cnttNo) {
		this.cnttNo = cnttNo;
	}

	public String getContract() {
		return this.contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getCpySw() {
		return this.cpySw;
	}

	public void setCpySw(String cpySw) {
		this.cpySw = cpySw;
	}

	public String getCurId() {
		return this.curId;
	}

	public void setCurId(String curId) {
		this.curId = curId;
	}

	public String getCurIdIfrs() {
		return this.curIdIfrs;
	}

	public void setCurIdIfrs(String curIdIfrs) {
		this.curIdIfrs = curIdIfrs;
	}

	public String getCusCardNo() {
		return this.cusCardNo;
	}

	public void setCusCardNo(String cusCardNo) {
		this.cusCardNo = cusCardNo;
	}

	public String getCusNoPos() {
		return this.cusNoPos;
	}

	public void setCusNoPos(String cusNoPos) {
		this.cusNoPos = cusNoPos;
	}

	public String getCusOsNo() {
		return this.cusOsNo;
	}

	public void setCusOsNo(String cusOsNo) {
		this.cusOsNo = cusOsNo;
	}

	public String getCustYg() {
		return this.custYg;
	}

	public void setCustYg(String custYg) {
		this.custYg = custYg;
	}

	public Timestamp getDateFqsk() {
		return this.dateFqsk;
	}

	public void setDateFqsk(Timestamp dateFqsk) {
		this.dateFqsk = dateFqsk;
	}

	public String getDateflagFqsk() {
		return this.dateflagFqsk;
	}

	public void setDateflagFqsk(String dateflagFqsk) {
		this.dateflagFqsk = dateflagFqsk;
	}

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public BigDecimal getDisCnt() {
		return this.disCnt;
	}

	public void setDisCnt(BigDecimal disCnt) {
		this.disCnt = disCnt;
	}

	public Timestamp getDzDate() {
		return this.dzDate;
	}

	public void setDzDate(Timestamp dzDate) {
		this.dzDate = dzDate;
	}

	public String getDzUsr() {
		return this.dzUsr;
	}

	public void setDzUsr(String dzUsr) {
		this.dzUsr = dzUsr;
	}

	public String getEpNo() {
		return this.epNo;
	}

	public void setEpNo(String epNo) {
		this.epNo = epNo;
	}

	public String getEpNo1() {
		return this.epNo1;
	}

	public void setEpNo1(String epNo1) {
		this.epNo1 = epNo1;
	}

	public BigDecimal getExcRto() {
		return this.excRto;
	}

	public void setExcRto(BigDecimal excRto) {
		this.excRto = excRto;
	}

	public BigDecimal getExcRtoIfrs() {
		return this.excRtoIfrs;
	}

	public void setExcRtoIfrs(BigDecimal excRtoIfrs) {
		this.excRtoIfrs = excRtoIfrs;
	}
/*
	public short getFjNum() {
		return this.fjNum;
	}

	public void setFjNum(short fjNum) {
		this.fjNum = fjNum;
	}
*/
	public Integer getFjNum() {
		return this.fjNum;
	}

	public void setFjNum(Integer fjNum) {
		if (fjNum == null) fjNum = new Integer(0);
		this.fjNum = fjNum;
	}	
	public String getHasFx() {
		return this.hasFx;
	}

	public void setHasFx(String hasFx) {
		this.hasFx = hasFx;
	}

	public String getHgBh() {
		return this.hgBh;
	}

	public void setHgBh(String hgBh) {
		this.hgBh = hgBh;
	}

	public String getInstTeam() {
		return this.instTeam;
	}

	public void setInstTeam(String instTeam) {
		this.instTeam = instTeam;
	}

	public short getIntDays() {
		return this.intDays;
	}

	public void setIntDays(short intDays) {
		this.intDays = intDays;
	}

	public String getInvBcodeNo() {
		return this.invBcodeNo;
	}

	public void setInvBcodeNo(String invBcodeNo) {
		this.invBcodeNo = invBcodeNo;
	}

	public String getInvBilId() {
		return this.invBilId;
	}

	public void setInvBilId(String invBilId) {
		this.invBilId = invBilId;
	}

	public String getInvBilNo() {
		return this.invBilNo;
	}

	public void setInvBilNo(String invBilNo) {
		this.invBilNo = invBilNo;
	}

	public Timestamp getInvDd() {
		return this.invDd;
	}

	public void setInvDd(Timestamp invDd) {
		this.invDd = invDd;
	}
	
/*
	public int getInvYm() {
		return this.invYm;
	}

	public void setInvYm(int invYm) {
		this.invYm = invYm;
	}
*/
	public Integer getInvYm() {
		return this.invYm;
	}
	
	public void setInvYm(Integer invYm) {
		if (invYm == null) invYm = new Integer(0);
		this.invYm = invYm;
	}
	
	public String getIsPos() {
		return this.isPos;
	}

	public void setIsPos(String isPos) {
		this.isPos = isPos;
	}

	public String getIsflzl() {
		return this.isflzl;
	}

	public void setIsflzl(String isflzl) {
		this.isflzl = isflzl;
	}

	public String getIssvs() {
		return this.issvs;
	}

	public void setIssvs(String issvs) {
		this.issvs = issvs;
	}

	public Timestamp getJfendDd() {
		return this.jfendDd;
	}

	public void setJfendDd(Timestamp jfendDd) {
		this.jfendDd = jfendDd;
	}

	public String getKpId() {
		return this.kpId;
	}

	public void setKpId(String kpId) {
		this.kpId = kpId;
	}

	public String getLcNo() {
		return this.lcNo;
	}

	public void setLcNo(String lcNo) {
		this.lcNo = lcNo;
	}

	public Timestamp getLockDate() {
		return this.lockDate;
	}

	public void setLockDate(Timestamp lockDate) {
		this.lockDate = lockDate;
	}

	public String getLockMan() {
		return this.lockMan;
	}

	public void setLockMan(String lockMan) {
		this.lockMan = lockMan;
	}

	public Timestamp getLzClsDd() {
		return this.lzClsDd;
	}

	public void setLzClsDd(Timestamp lzClsDd) {
		this.lzClsDd = lzClsDd;
	}

	public String getLzClsId() {
		return this.lzClsId;
	}

	public void setLzClsId(String lzClsId) {
		this.lzClsId = lzClsId;
	}

	public String getMethId() {
		return this.methId;
	}

	public void setMethId(String methId) {
		this.methId = methId;
	}

	public String getMmId() {
		return this.mmId;
	}

	public void setMmId(String mmId) {
		this.mmId = mmId;
	}

	public String getMobId() {
		return this.mobId;
	}

	public void setMobId(String mobId) {
		this.mobId = mobId;
	}

	public Timestamp getModifyDd() {
		return this.modifyDd;
	}

	public void setModifyDd(Timestamp modifyDd) {
		this.modifyDd = modifyDd;
	}

	public String getModifyMan() {
		return this.modifyMan;
	}

	public void setModifyMan(String modifyMan) {
		this.modifyMan = modifyMan;
	}

	public String getOmNo() {
		return this.omNo;
	}

	public void setOmNo(String omNo) {
		this.omNo = omNo;
	}

	public String getOsId() {
		return this.osId;
	}

	public void setOsId(String osId) {
		this.osId = osId;
	}

	public String getOsNo() {
		return this.osNo;
	}

	public void setOsNo(String osNo) {
		this.osNo = osNo;
	}

	public String getPaNo() {
		return this.paNo;
	}

	public void setPaNo(String paNo) {
		this.paNo = paNo;
	}

	public short getPayDays() {
		return this.payDays;
	}

	public void setPayDays(short payDays) {
		this.payDays = payDays;
	}

	public Timestamp getPayDd() {
		return this.payDd;
	}

	public void setPayDd(Timestamp payDd) {
		this.payDd = payDd;
	}

	public String getPayMth() {
		return this.payMth;
	}

	public void setPayMth(String payMth) {
		this.payMth = payMth;
	}

	public String getPayRem() {
		return this.payRem;
	}

	public void setPayRem(String payRem) {
		this.payRem = payRem;
	}

	public String getPaycardNo() {
		return this.paycardNo;
	}

	public void setPaycardNo(String paycardNo) {
		this.paycardNo = paycardNo;
	}

	public String getPctosa() {
		return this.pctosa;
	}

	public void setPctosa(String pctosa) {
		this.pctosa = pctosa;
	}

	public String getPhNo() {
		return this.phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getPkNo() {
		return this.pkNo;
	}

	public void setPkNo(String pkNo) {
		this.pkNo = pkNo;
	}

	public String getPoId() {
		return this.poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
	}

	public String getPoNo() {
		return this.poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public String getPopcId() {
		return this.popcId;
	}

	public void setPopcId(String popcId) {
		this.popcId = popcId;
	}

	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getPosNo() {
		return this.posNo;
	}

	public void setPosNo(String posNo) {
		this.posNo = posNo;
	}

	public String getPosOsCls() {
		return this.posOsCls;
	}

	public void setPosOsCls(String posOsCls) {
		this.posOsCls = posOsCls;
	}

	public String getPosOsId() {
		return this.posOsId;
	}

	public void setPosOsId(String posOsId) {
		this.posOsId = posOsId;
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

	public Timestamp getPsDd() {
		return this.psDd;
	}

	public void setPsDd(Timestamp psDd) {
		this.psDd = psDd;
	}

	public String getQcSw() {
		return this.qcSw;
	}

	public void setQcSw(String qcSw) {
		this.qcSw = qcSw;
	}

	public Integer getQsFqsk() {
		return this.qsFqsk;
	}

	public void setQsFqsk(Integer qsFqsk) {
		if (qsFqsk == null) qsFqsk = new Integer(0);
		this.qsFqsk = qsFqsk;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getQtyCash() {
		return this.qtyCash;
	}

	public void setQtyCash(BigDecimal qtyCash) {
		this.qtyCash = qtyCash;
	}

	public BigDecimal getQtyCls() {
		return this.qtyCls;
	}

	public void setQtyCls(BigDecimal qtyCls) {
		this.qtyCls = qtyCls;
	}

	public BigDecimal getQtyInv() {
		return this.qtyInv;
	}

	public void setQtyInv(BigDecimal qtyInv) {
		this.qtyInv = qtyInv;
	}

	public BigDecimal getQty1Cls() {
		return this.qty1Cls;
	}

	public void setQty1Cls(BigDecimal qty1Cls) {
		this.qty1Cls = qty1Cls;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getRpNo() {
		return this.rpNo;
	}

	public void setRpNo(String rpNo) {
		this.rpNo = rpNo;
	}

	public BigDecimal getRsvPer() {
		return this.rsvPer;
	}

	public void setRsvPer(BigDecimal rsvPer) {
		this.rsvPer = rsvPer;
	}

	public BigDecimal getRtoFqsk() {
		return this.rtoFqsk;
	}

	public void setRtoFqsk(BigDecimal rtoFqsk) {
		this.rtoFqsk = rtoFqsk;
	}

	public String getSalNo() {
		return this.salNo;
	}

	public void setSalNo(String salNo) {
		this.salNo = salNo;
	}

	public String getSbChk() {
		return this.sbChk;
	}

	public void setSbChk(String sbChk) {
		this.sbChk = sbChk;
	}

	public Timestamp getScanDate() {
		return this.scanDate;
	}

	public void setScanDate(Timestamp scanDate) {
		this.scanDate = scanDate;
	}

	public String getScanId() {
		return this.scanId;
	}

	public void setScanId(String scanId) {
		this.scanId = scanId;
	}

	public String getScanUsr() {
		return this.scanUsr;
	}

	public void setScanUsr(String scanUsr) {
		this.scanUsr = scanUsr;
	}

	public String getScusNo() {
		return this.scusNo;
	}

	public void setScusNo(String scusNo) {
		this.scusNo = scusNo;
	}

	public String getSendArea() {
		return this.sendArea;
	}

	public void setSendArea(String sendArea) {
		this.sendArea = sendArea;
	}

	public String getSendMth() {
		return this.sendMth;
	}

	public void setSendMth(String sendMth) {
		this.sendMth = sendMth;
	}

	public String getSendWh() {
		return this.sendWh;
	}

	public void setSendWh(String sendWh) {
		this.sendWh = sendWh;
	}

	public String getSgId() {
		return this.sgId;
	}

	public void setSgId(String sgId) {
		this.sgId = sgId;
	}

	public String getSgId1() {
		return this.sgId1;
	}

	public void setSgId1(String sgId1) {
		this.sgId1 = sgId1;
	}

	public Short getSgtflag() {
		return this.sgtflag;
	}

	public void setSgtflag(Short sgtflag) {
		this.sgtflag = sgtflag;
	}

	public Timestamp getSignDd() {
		return this.signDd;
	}

	public void setSignDd(Timestamp signDd) {
		this.signDd = signDd;
	}

	public Short getSoutype() {
		return this.soutype;
	}

	public void setSoutype(Short soutype) {
		this.soutype = soutype;
	}

	public String getSubNo() {
		return this.subNo;
	}

	public void setSubNo(String subNo) {
		this.subNo = subNo;
	}

	public Timestamp getSysDate() {
		return this.sysDate;
	}

	public void setSysDate(Timestamp sysDate) {
		this.sysDate = sysDate;
	}

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public BigDecimal getTaxCls() {
		return this.taxCls;
	}

	public void setTaxCls(BigDecimal taxCls) {
		this.taxCls = taxCls;
	}

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public BigDecimal getTaxInv() {
		return this.taxInv;
	}

	public void setTaxInv(BigDecimal taxInv) {
		this.taxInv = taxInv;
	}

	public BigDecimal getTaxIrp() {
		return this.taxIrp;
	}

	public void setTaxIrp(BigDecimal taxIrp) {
		this.taxIrp = taxIrp;
	}

	public String getTbNo() {
		return this.tbNo;
	}

	public void setTbNo(String tbNo) {
		this.tbNo = tbNo;
	}

	public String getTitleBuy() {
		return this.titleBuy;
	}

	public void setTitleBuy(String titleBuy) {
		this.titleBuy = titleBuy;
	}

	public String getToMj() {
		return this.toMj;
	}

	public void setToMj(String toMj) {
		this.toMj = toMj;
	}

	public String getToSb() {
		return this.toSb;
	}

	public void setToSb(String toSb) {
		this.toSb = toSb;
	}

	public BigDecimal getTotBox() {
		return this.totBox;
	}

	public void setTotBox(BigDecimal totBox) {
		this.totBox = totBox;
	}

	public BigDecimal getTotQty() {
		return this.totQty;
	}

	public void setTotQty(BigDecimal totQty) {
		this.totQty = totQty;
	}

	public String getTradMth() {
		return this.tradMth;
	}

	public void setTradMth(String tradMth) {
		this.tradMth = tradMth;
	}

	public String getTtTypeSet() {
		return this.ttTypeSet;
	}

	public void setTtTypeSet(String ttTypeSet) {
		this.ttTypeSet = ttTypeSet;
	}

	public Timestamp getTtYmB() {
		return this.ttYmB;
	}

	public void setTtYmB(Timestamp ttYmB) {
		this.ttYmB = ttYmB;
	}

	public String getTurnId() {
		return this.turnId;
	}

	public void setTurnId(String turnId) {
		this.turnId = turnId;
	}

	public String getTzzg() {
		return this.tzzg;
	}

	public void setTzzg(String tzzg) {
		this.tzzg = tzzg;
	}

	public String getUsr() {
		return this.usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getUsrAuth() {
		return this.usrAuth;
	}

	public void setUsrAuth(String usrAuth) {
		this.usrAuth = usrAuth;
	}

	public String getVohId() {
		return this.vohId;
	}

	public void setVohId(String vohId) {
		this.vohId = vohId;
	}

	public String getVohMkno() {
		return this.vohMkno;
	}

	public void setVohMkno(String vohMkno) {
		this.vohMkno = vohMkno;
	}

	public String getVohNo() {
		return this.vohNo;
	}

	public void setVohNo(String vohNo) {
		this.vohNo = vohNo;
	}

	public String getWsChkPay() {
		return this.wsChkPay;
	}

	public void setWsChkPay(String wsChkPay) {
		this.wsChkPay = wsChkPay;
	}

	public String getWsKdChk() {
		return this.wsKdChk;
	}

	public void setWsKdChk(String wsKdChk) {
		this.wsKdChk = wsKdChk;
	}

	public String getWsRcvChk() {
		return this.wsRcvChk;
	}

	public void setWsRcvChk(String wsRcvChk) {
		this.wsRcvChk = wsRcvChk;
	}

	public String getYdId() {
		return this.ydId;
	}

	public void setYdId(String ydId) {
		this.ydId = ydId;
	}

	public String getZbNo() {
		return this.zbNo;
	}

	public void setZbNo(String zbNo) {
		this.zbNo = zbNo;
	}

	public String getZcFlag() {
		return this.zcFlag;
	}

	public void setZcFlag(String zcFlag) {
		this.zcFlag = zcFlag;
	}

	public String getZhangId() {
		return this.zhangId;
	}

	public void setZhangId(String zhangId) {
		this.zhangId = zhangId;
	}

	public List<TfPss> getTfPsses() {
		return this.tfPsses;
	}

	public void setTfPsses(List<TfPss> tfPsses) {
		this.tfPsses = tfPsses;
	}

	public TfPss addTfPss(TfPss tfPss) {
		getTfPsses().add(tfPss);
		tfPss.setMfPss(this);

		return tfPss;
	}

	public TfPss removeTfPss(TfPss tfPss) {
		getTfPsses().remove(tfPss);
		tfPss.setMfPss(null);

		return tfPss;
	}
/*
	public String getInvNo() {
		return invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
*/
	public Cust getCust() {
		return cust;
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}

	public InvNo getInvNo() {
		return invNo;
	}

	public void setInvNo(InvNo invNo) {
		this.invNo = invNo;
	} 

}