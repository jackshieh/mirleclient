package com.shenghsiang.mirle.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.shenghsiang.mirle.entity.Prdt;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TF_PSS database table.
 * 
 */
@Entity
@Table(name="TF_PSS")
@NamedQueries({
@NamedQuery(name="TfPss.findAll", query="SELECT t FROM TfPss t"),
@NamedQuery(name="TfPss.findByPsNo", query="SELECT t FROM TfPss t WHERE t.id.psNo = :psNo")
})
public class TfPss implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TfPssPK id;

	@Column(name="AMT", precision=22, scale=8)
	private BigDecimal amt;

	@Column(name="AMT_DIS_CNT", precision=22, scale=8)
	private BigDecimal amtDisCnt;

	@Column(name="AMT_FP", precision=22, scale=8)
	private BigDecimal amtFp;

	@Column(name="AMT_ZG_FP", precision=22, scale=8)
	private BigDecimal amtZgFp;

	@Column(name="AMTN", precision=22, scale=8)
	private BigDecimal amtn;

	@Column(name="AMTN_COM", precision=22, scale=8)
	private BigDecimal amtnCom;

	@Column(name="AMTN_EP", precision=22, scale=8)
	private BigDecimal amtnEp;

	@Column(name="AMTN_EP_IFRS", precision=22, scale=8)
	private BigDecimal amtnEpIfrs;

	@Column(name="AMTN_EP1", precision=22, scale=8)
	private BigDecimal amtnEp1;

	@Column(name="AMTN_FL", precision=22, scale=8)
	private BigDecimal amtnFl;

	@Column(name="AMTN_FT", precision=22, scale=8)
	private BigDecimal amtnFt;

	@Column(name="AMTN_IFRS", precision=22, scale=8)
	private BigDecimal amtnIfrs;

	@Column(name="AMTN_NET", precision=22, scale=8)
	private BigDecimal amtnNet;

	@Column(name="AMTN_NET_FP", precision=22, scale=8)
	private BigDecimal amtnNetFp;

	@Column(name="AMTN_NET_IFRS", precision=22, scale=8)
	private BigDecimal amtnNetIfrs;

	@Column(name="AMTN_NET_ZG_FP", precision=22, scale=8)
	private BigDecimal amtnNetZgFp;

	@Column(name="AMTN_OLD", precision=22, scale=8)
	private BigDecimal amtnOld;

	@Column(name="AMTN_RSV", precision=22, scale=8)
	private BigDecimal amtnRsv;

	@Column(name="AMTN_SALE", precision=22, scale=8)
	private BigDecimal amtnSale;

	@Column(name="AMTN_SNET", precision=22, scale=8)
	private BigDecimal amtnSnet;

	@Column(name="ATTR", length=30)
	private String attr;

	@Column(name="B_DD")
	private Timestamp bDd;

	@Column(name="BAT_NO", length=40)
	private String batNo;

	@Column(name="BL_OS_ID", length=2)
	private String blOsId;

	@Column(name="BL_OS_ITM")
	private Integer blOsItm;

	@Column(name="BL_OS_NO", length=20)
	private String blOsNo;

	@Column(name="BOX_ITM")
	private Integer boxItm;

	@Column(name="BZ_KND", length=20)
	private String bzKnd;

	@Column(name="CF_ID", length=4)
	private String cfId;

	@Column(name="CHK_RTN", length=1)
	private String chkRtn;

	@Column(name="CHK_TAX", length=1)
	private String chkTax;

	@Column(name="CK_NO", length=20)
	private String ckNo;

	@Column(name="CLS_ID", length=1)
	private String clsId;

	@Column(name="CNTT_NO", length=40)
	private String cnttNo;

	@Column(name="CODE_NO", length=10)
	private String codeNo;

	@Column(name="COMPOSE_IDNO", length=50)
	private String composeIdno;

	@Column(name="CST_SAL", precision=22, scale=8)
	private BigDecimal cstSal;

	@Column(name="CST_STD", precision=22, scale=8)
	private BigDecimal cstStd;

	@Column(name="CST_STD_IFRS", precision=22, scale=8)
	private BigDecimal cstStdIfrs;

	@Column(name="CSTN_SAL", precision=22, scale=8)
	private BigDecimal cstnSal;

	@Column(name="CSTN_SAL_IFRS", precision=22, scale=8)
	private BigDecimal cstnSalIfrs;

	@Column(name="CUS_OS_NO", length=30)
	private String cusOsNo;

	@Column(name="DEF_NO", length=100)
	private String defNo;

	@Column(name="DEP_RK", length=8)
	private String depRk;

	@Column(name="DIS_CNT", precision=22, scale=8)
	private BigDecimal disCnt;

	@Column(name="DZ_DATE")
	private Timestamp dzDate;

	@Column(name="DZ_USR", length=12)
	private String dzUsr;

	@Column(name="E_DD")
	private Timestamp eDd;

	@Column(name="EST_DD")
	private Timestamp estDd;

	@Column(name="EST_ITM")
	private Integer estItm;

	@Column(name="FH_NO", length=20)
	private String fhNo;

	@Column(name="FREE_ID", length=1)
	private String freeId;

	@Column(name="FREE_ID_DEF", length=1)
	private String freeIdDef;

	@Column(name="FW_FLAG", length=1)
	private String fwFlag;

	@Column(name="GF_NO", length=20)
	private String gfNo;

	@Column(name="ID_NO", length=38)
	private String idNo;

	@Column(name="INV_B2C", length=1)
	private String invB2c;

	@Column(name="IS_SP", length=1)
	private String isSp;

	@Column(name="ITM_POSUP")
	private Integer itmPosup;

	@Column(name="ITM_YH")
	private Integer itmYh;

	@Column(name="MAI_NO", length=60)
	private String maiNo;

	@Column(name="MATRIX_ITM")
	private Integer matrixItm;

	@Column(name="MB_NO", length=20)
	private String mbNo;

	@Column(name="MBDIS_ID", length=1)
	private String mbdisId;

	@Column(name="ME_FLAG", length=1)
	private String meFlag;

	@Column(name="MM_ID", length=2)
	private String mmId;

	@Column(name="MM_ITM")
	private Integer mmItm;

	@Column(name="MM_NO", length=20)
	private String mmNo;

	@Column(name="MO_NO", length=20)
	private String moNo;

	@Lob
	@Column(name="MTN_REM")
	private String mtnRem;

	@Column(name="NOJF_ID", length=1)
	private String nojfId;

	@Column(name="OM_ID", length=2)
	private String omId;

	@Column(name="OM_ITM")
	private Integer omItm;

	@Column(name="OM_NO", length=20)
	private String omNo;

	@Column(name="OS_ID", length=2)
	private String osId;

	@Column(name="OS_NO", length=25)
	private String osNo;

	@Column(name="OTH_ITM")
	private Integer othItm;

	@Column(name="PAK_EXC", precision=22, scale=8)
	private BigDecimal pakExc;

	@Column(name="PAK_GW", precision=22, scale=8)
	private BigDecimal pakGw;

	@Column(name="PAK_GW_N", precision=22, scale=8)
	private BigDecimal pakGwN;

	@Column(name="PAK_MEAST", precision=22, scale=8)
	private BigDecimal pakMeast;

	@Column(name="PAK_MEAST_UNIT", length=8)
	private String pakMeastUnit;

	@Column(name="PAK_NW", precision=22, scale=8)
	private BigDecimal pakNw;

	@Column(name="PAK_NW_N", precision=22, scale=8)
	private BigDecimal pakNwN;

	@Column(name="PAK_UNIT", length=20)
	private String pakUnit;

	@Column(name="PAK_WEIGHT_UNIT", length=8)
	private String pakWeightUnit;

	@Column(name="PK_NO", length=20)
	private String pkNo;

	@Column(name="PRD_MARK", length=40)
	private String prdMark;

	@Column(name="PRD_NAME", length=100)
	private String prdName;

	//@Column(name="PRD_NO", length=30)
	// private String prdNo;
	@ManyToOne
	@JoinColumn(name="PRD_NO")
	private Prdt prdt;

	@Column(name="PRD_NO_SO_RES", length=30)
	private String prdNoSoRes;

	@Column(name="PRDMO_NO", length=20)
	private String prdmoNo;

	@Column(name="PRE_ITM")
	private Integer preItm;

	@Column(name="PRICE_ID", length=4)
	private String priceId;

	@Column(name="PRM_NO", length=20)
	private String prmNo;

	@Column(name="PROMO_ID", length=2)
	private String promoId;

	@Column(name="PS_DD")
	private Timestamp psDd;

	@Column(name="PW_ITM")
	private Integer pwItm;

	@Column(name="QC_FLAG", length=2)
	private String qcFlag;

	@Column(name="QC_ITM")
	private Integer qcItm;

	@Column(name="QTY", precision=22, scale=8)
	private BigDecimal qty;

	@Column(name="QTY_ARK", precision=22, scale=8)
	private BigDecimal qtyArk;

	@Column(name="QTY_CK", precision=22, scale=8)
	private BigDecimal qtyCk;

	@Column(name="QTY_CK_UNSH", precision=22, scale=8)
	private BigDecimal qtyCkUnsh;

	@Column(name="QTY_FP", precision=22, scale=8)
	private BigDecimal qtyFp;

	@Column(name="QTY_FX", precision=22, scale=8)
	private BigDecimal qtyFx;

	@Column(name="QTY_FX_UNSH", precision=22, scale=8)
	private BigDecimal qtyFxUnsh;

	@Column(name="QTY_LOSS", precision=22, scale=8)
	private BigDecimal qtyLoss;

	@Column(name="QTY_OI", precision=22, scale=8)
	private BigDecimal qtyOi;

	@Column(name="QTY_OUT", precision=22, scale=8)
	private BigDecimal qtyOut;

	@Column(name="QTY_POS_SO", precision=22, scale=8)
	private BigDecimal qtyPosSo;

	@Column(name="QTY_PS", precision=22, scale=8)
	private BigDecimal qtyPs;

	@Column(name="QTY_RTN", precision=22, scale=8)
	private BigDecimal qtyRtn;

	@Column(name="QTY_RTN_ARK", precision=22, scale=8)
	private BigDecimal qtyRtnArk;

	@Column(name="QTY_RTN_UNSH", precision=22, scale=8)
	private BigDecimal qtyRtnUnsh;

	@Column(name="QTY_SB", precision=22, scale=8)
	private BigDecimal qtySb;

	@Column(name="QTY_SB_UNSH", precision=22, scale=8)
	private BigDecimal qtySbUnsh;

	@Column(name="QTY_SQ", precision=22, scale=8)
	private BigDecimal qtySq;

	@Column(name="QTY_SQ_UNSH", precision=22, scale=8)
	private BigDecimal qtySqUnsh;

	@Column(name="QTY_XB", precision=22, scale=8)
	private BigDecimal qtyXb;

	@Column(name="QTY_XB_UNSH", precision=22, scale=8)
	private BigDecimal qtyXbUnsh;

	@Column(name="QTY_ZQ", precision=22, scale=8)
	private BigDecimal qtyZq;

	@Column(name="QTY1", precision=22, scale=8)
	private BigDecimal qty1;

	@Column(name="QTY1_FP", precision=22, scale=8)
	private BigDecimal qty1Fp;

	@Column(name="QTY1_LOSS", precision=22, scale=8)
	private BigDecimal qty1Loss;

	@Column(name="QTYS", precision=22, scale=8)
	private BigDecimal qtys;

	@Column(name="REM", length=200)
	private String rem;

	@Column(name="REM_XP", length=200)
	private String remXp;

	@Column(name="RK_DD")
	private Timestamp rkDd;

	@Column(name="RK_NO", length=20)
	private String rkNo;

	@Column(name="RTO_EP", precision=22, scale=8)
	private BigDecimal rtoEp;

	@Column(name="SAL_NO", length=12)
	private String salNo;

	@Column(name="SAL_NO1", length=12)
	private String salNo1;

	@Column(name="SBAC_CHK", length=1)
	private String sbacChk;

	@Column(name="SEND_WH", length=12)
	private String sendWh;

	@Column(name="SH_NO_CUS", length=20)
	private String shNoCus;

	@Column(name="SL_ITM")
	private Integer slItm;

	@Column(name="SL_NO", length=20)
	private String slNo;

	@Column(name="SP_NO", length=20)
	private String spNo;

	@Column(name="SPC_NO", length=10)
	private String spcNo;

	@Column(name="SPC_NO1", length=10)
	private String spcNo1;

	@Column(name="SUP_PRD_MARK", length=40)
	private String supPrdMark;

	@Column(name="SUP_PRD_NO", length=40)
	private String supPrdNo;

	@Column(name="TASK_NO", length=30)
	private String taskNo;

	@Column(name="TAX", precision=22, scale=8)
	private BigDecimal tax;

	@Column(name="TAX_FP", precision=22, scale=8)
	private BigDecimal taxFp;

	@Column(name="TAX_IFRS", precision=22, scale=8)
	private BigDecimal taxIfrs;

	@Column(name="TAX_RTO", precision=22, scale=8)
	private BigDecimal taxRto;

	@Column(name="TAX_ZG_FP", precision=22, scale=8)
	private BigDecimal taxZgFp;

	@Column(name="TAXS", precision=22, scale=8)
	private BigDecimal taxs;

	@Column(name="TI_ITM")
	private Integer tiItm;

	@Column(name="TRD_ID", length=2)
	private String trdId;

	@Column(name="TRD_ITM")
	private Integer trdItm;

	@Column(name="TRD_NO", length=30)
	private String trdNo;

	@Column(name="TT_RNG")
	private Integer ttRng;

	@Column(name="TT_TYPE_IFRS", length=1)
	private String ttTypeIfrs;

	@Column(name="TT_YM_B")
	private Timestamp ttYmB;

	@Column(name="TT_YM_E")
	private Timestamp ttYmE;

	@Column(name="TYPE_SGT", length=2)
	private String typeSgt;

	@Column(name="UNIT", length=1)
	private String unit;

	@Column(name="[UP]", precision=22, scale=8)
	private BigDecimal up;

	@Column(name="UP_MAIN", precision=22, scale=8)
	private BigDecimal upMain;

	@Column(name="UP_MAIN_IFRS", precision=22, scale=8)
	private BigDecimal upMainIfrs;

	@Column(name="UP_OLD", precision=22, scale=8)
	private BigDecimal upOld;

	@Column(name="UP_QTY1", precision=22, scale=8)
	private BigDecimal upQty1;

	@Column(name="UP_SALE", precision=22, scale=8)
	private BigDecimal upSale;

	@Column(name="UP_SP_SW", length=1)
	private String upSpSw;

	@Column(name="UP_STD", precision=22, scale=8)
	private BigDecimal upStd;

	@Column(name="UP_STD_IFRS", precision=22, scale=8)
	private BigDecimal upStdIfrs;

	@Column(name="UT", length=8)
	private String ut;

	@Column(name="VALID_DD")
	private Timestamp validDd;

	@Column(name="WC_DD")
	private Timestamp wcDd;

	@Column(name="WH", length=12)
	private String wh;

	@Column(name="WT", precision=22, scale=8)
	private BigDecimal wt;

	@Column(name="XPM_NO", length=20)
	private String xpmNo;

	@Column(name="XPM_NO1", length=20)
	private String xpmNo1;

	@Column(name="XPPRD_ITM")
	private Integer xpprdItm;

	@Column(name="XPPRD_ITM1")
	private Integer xpprdItm1;

	@Column(name="YH_ID", length=2)
	private String yhId;

	@Column(name="YH_NO", length=20)
	private String yhNo;

	@Column(name="ZDZZ", length=1)
	private String zdzz;

	//bi-directional many-to-one association to MfPss
	@ManyToOne
	@JoinColumns({
	@JoinColumn(name="PS_ID", referencedColumnName="PS_ID", nullable=false, insertable=false, updatable=false),
	@JoinColumn(name="PS_NO", referencedColumnName="PS_NO", nullable=false, insertable=false, updatable=false)
	})
	private MfPss mfPss;

	public TfPss() {
	}

	public TfPssPK getId() {
		return this.id;
	}

	public void setId(TfPssPK id) {
		this.id = id;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAmtDisCnt() {
		return this.amtDisCnt;
	}

	public void setAmtDisCnt(BigDecimal amtDisCnt) {
		this.amtDisCnt = amtDisCnt;
	}

	public BigDecimal getAmtFp() {
		return this.amtFp;
	}

	public void setAmtFp(BigDecimal amtFp) {
		this.amtFp = amtFp;
	}

	public BigDecimal getAmtZgFp() {
		return this.amtZgFp;
	}

	public void setAmtZgFp(BigDecimal amtZgFp) {
		this.amtZgFp = amtZgFp;
	}

	public BigDecimal getAmtn() {
		return this.amtn;
	}

	public void setAmtn(BigDecimal amtn) {
		this.amtn = amtn;
	}

	public BigDecimal getAmtnCom() {
		return this.amtnCom;
	}

	public void setAmtnCom(BigDecimal amtnCom) {
		this.amtnCom = amtnCom;
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

	public BigDecimal getAmtnIfrs() {
		return this.amtnIfrs;
	}

	public void setAmtnIfrs(BigDecimal amtnIfrs) {
		this.amtnIfrs = amtnIfrs;
	}

	public BigDecimal getAmtnNet() {
		return this.amtnNet;
	}

	public void setAmtnNet(BigDecimal amtnNet) {
		this.amtnNet = amtnNet;
	}

	public BigDecimal getAmtnNetFp() {
		return this.amtnNetFp;
	}

	public void setAmtnNetFp(BigDecimal amtnNetFp) {
		this.amtnNetFp = amtnNetFp;
	}

	public BigDecimal getAmtnNetIfrs() {
		return this.amtnNetIfrs;
	}

	public void setAmtnNetIfrs(BigDecimal amtnNetIfrs) {
		this.amtnNetIfrs = amtnNetIfrs;
	}

	public BigDecimal getAmtnNetZgFp() {
		return this.amtnNetZgFp;
	}

	public void setAmtnNetZgFp(BigDecimal amtnNetZgFp) {
		this.amtnNetZgFp = amtnNetZgFp;
	}

	public BigDecimal getAmtnOld() {
		return this.amtnOld;
	}

	public void setAmtnOld(BigDecimal amtnOld) {
		this.amtnOld = amtnOld;
	}

	public BigDecimal getAmtnRsv() {
		return this.amtnRsv;
	}

	public void setAmtnRsv(BigDecimal amtnRsv) {
		this.amtnRsv = amtnRsv;
	}

	public BigDecimal getAmtnSale() {
		return this.amtnSale;
	}

	public void setAmtnSale(BigDecimal amtnSale) {
		this.amtnSale = amtnSale;
	}

	public BigDecimal getAmtnSnet() {
		return this.amtnSnet;
	}

	public void setAmtnSnet(BigDecimal amtnSnet) {
		this.amtnSnet = amtnSnet;
	}

	public String getAttr() {
		return this.attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public Timestamp getBDd() {
		return this.bDd;
	}

	public void setBDd(Timestamp bDd) {
		this.bDd = bDd;
	}

	public String getBatNo() {
		return this.batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public String getBlOsId() {
		return this.blOsId;
	}

	public void setBlOsId(String blOsId) {
		this.blOsId = blOsId;
	}

	public Integer getBlOsItm() {
		return this.blOsItm;
	}

	public void setBlOsItm(Integer blOsItm) {
		this.blOsItm = blOsItm;
	}

	public String getBlOsNo() {
		return this.blOsNo;
	}

	public void setBlOsNo(String blOsNo) {
		this.blOsNo = blOsNo;
	}

	public Integer getBoxItm() {
		return this.boxItm;
	}

	public void setBoxItm(Integer boxItm) {
		this.boxItm = boxItm;
	}

	public String getBzKnd() {
		return this.bzKnd;
	}

	public void setBzKnd(String bzKnd) {
		this.bzKnd = bzKnd;
	}

	public String getCfId() {
		return this.cfId;
	}

	public void setCfId(String cfId) {
		this.cfId = cfId;
	}

	public String getChkRtn() {
		return this.chkRtn;
	}

	public void setChkRtn(String chkRtn) {
		this.chkRtn = chkRtn;
	}

	public String getChkTax() {
		return this.chkTax;
	}

	public void setChkTax(String chkTax) {
		this.chkTax = chkTax;
	}

	public String getCkNo() {
		return this.ckNo;
	}

	public void setCkNo(String ckNo) {
		this.ckNo = ckNo;
	}

	public String getClsId() {
		return this.clsId;
	}

	public void setClsId(String clsId) {
		this.clsId = clsId;
	}

	public String getCnttNo() {
		return this.cnttNo;
	}

	public void setCnttNo(String cnttNo) {
		this.cnttNo = cnttNo;
	}

	public String getCodeNo() {
		return this.codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

	public String getComposeIdno() {
		return this.composeIdno;
	}

	public void setComposeIdno(String composeIdno) {
		this.composeIdno = composeIdno;
	}

	public BigDecimal getCstSal() {
		return this.cstSal;
	}

	public void setCstSal(BigDecimal cstSal) {
		this.cstSal = cstSal;
	}

	public BigDecimal getCstStd() {
		return this.cstStd;
	}

	public void setCstStd(BigDecimal cstStd) {
		this.cstStd = cstStd;
	}

	public BigDecimal getCstStdIfrs() {
		return this.cstStdIfrs;
	}

	public void setCstStdIfrs(BigDecimal cstStdIfrs) {
		this.cstStdIfrs = cstStdIfrs;
	}

	public BigDecimal getCstnSal() {
		return this.cstnSal;
	}

	public void setCstnSal(BigDecimal cstnSal) {
		this.cstnSal = cstnSal;
	}

	public BigDecimal getCstnSalIfrs() {
		return this.cstnSalIfrs;
	}

	public void setCstnSalIfrs(BigDecimal cstnSalIfrs) {
		this.cstnSalIfrs = cstnSalIfrs;
	}

	public String getCusOsNo() {
		return this.cusOsNo;
	}

	public void setCusOsNo(String cusOsNo) {
		this.cusOsNo = cusOsNo;
	}

	public String getDefNo() {
		return this.defNo;
	}

	public void setDefNo(String defNo) {
		this.defNo = defNo;
	}

	public String getDepRk() {
		return this.depRk;
	}

	public void setDepRk(String depRk) {
		this.depRk = depRk;
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

	public Timestamp getEDd() {
		return this.eDd;
	}

	public void setEDd(Timestamp eDd) {
		this.eDd = eDd;
	}

	public Timestamp getEstDd() {
		return this.estDd;
	}

	public void setEstDd(Timestamp estDd) {
		this.estDd = estDd;
	}

	public Integer getEstItm() {
		return this.estItm;
	}

	public void setEstItm(Integer estItm) {
		this.estItm = estItm;
	}

	public String getFhNo() {
		return this.fhNo;
	}

	public void setFhNo(String fhNo) {
		this.fhNo = fhNo;
	}

	public String getFreeId() {
		return this.freeId;
	}

	public void setFreeId(String freeId) {
		this.freeId = freeId;
	}

	public String getFreeIdDef() {
		return this.freeIdDef;
	}

	public void setFreeIdDef(String freeIdDef) {
		this.freeIdDef = freeIdDef;
	}

	public String getFwFlag() {
		return this.fwFlag;
	}

	public void setFwFlag(String fwFlag) {
		this.fwFlag = fwFlag;
	}

	public String getGfNo() {
		return this.gfNo;
	}

	public void setGfNo(String gfNo) {
		this.gfNo = gfNo;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getInvB2c() {
		return this.invB2c;
	}

	public void setInvB2c(String invB2c) {
		this.invB2c = invB2c;
	}

	public String getIsSp() {
		return this.isSp;
	}

	public void setIsSp(String isSp) {
		this.isSp = isSp;
	}

	public Integer getItmPosup() {
		return this.itmPosup;
	}

	public void setItmPosup(Integer itmPosup) {
		this.itmPosup = itmPosup;
	}

	public Integer getItmYh() {
		return this.itmYh;
	}

	public void setItmYh(Integer itmYh) {
		this.itmYh = itmYh;
	}

	public String getMaiNo() {
		return this.maiNo;
	}

	public void setMaiNo(String maiNo) {
		this.maiNo = maiNo;
	}

	public Integer getMatrixItm() {
		return this.matrixItm;
	}

	public void setMatrixItm(Integer matrixItm) {
		this.matrixItm = matrixItm;
	}

	public String getMbNo() {
		return this.mbNo;
	}

	public void setMbNo(String mbNo) {
		this.mbNo = mbNo;
	}

	public String getMbdisId() {
		return this.mbdisId;
	}

	public void setMbdisId(String mbdisId) {
		this.mbdisId = mbdisId;
	}

	public String getMeFlag() {
		return this.meFlag;
	}

	public void setMeFlag(String meFlag) {
		this.meFlag = meFlag;
	}

	public String getMmId() {
		return this.mmId;
	}

	public void setMmId(String mmId) {
		this.mmId = mmId;
	}

	public Integer getMmItm() {
		return this.mmItm;
	}

	public void setMmItm(Integer mmItm) {
		this.mmItm = mmItm;
	}

	public String getMmNo() {
		return this.mmNo;
	}

	public void setMmNo(String mmNo) {
		this.mmNo = mmNo;
	}

	public String getMoNo() {
		return this.moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getMtnRem() {
		return this.mtnRem;
	}

	public void setMtnRem(String mtnRem) {
		this.mtnRem = mtnRem;
	}

	public String getNojfId() {
		return this.nojfId;
	}

	public void setNojfId(String nojfId) {
		this.nojfId = nojfId;
	}

	public String getOmId() {
		return this.omId;
	}

	public void setOmId(String omId) {
		this.omId = omId;
	}

	public Integer getOmItm() {
		return this.omItm;
	}

	public void setOmItm(Integer omItm) {
		this.omItm = omItm;
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

	public Integer getOthItm() {
		return this.othItm;
	}

	public void setOthItm(Integer othItm) {
		this.othItm = othItm;
	}

	public BigDecimal getPakExc() {
		return this.pakExc;
	}

	public void setPakExc(BigDecimal pakExc) {
		this.pakExc = pakExc;
	}

	public BigDecimal getPakGw() {
		return this.pakGw;
	}

	public void setPakGw(BigDecimal pakGw) {
		this.pakGw = pakGw;
	}

	public BigDecimal getPakGwN() {
		return this.pakGwN;
	}

	public void setPakGwN(BigDecimal pakGwN) {
		this.pakGwN = pakGwN;
	}

	public BigDecimal getPakMeast() {
		return this.pakMeast;
	}

	public void setPakMeast(BigDecimal pakMeast) {
		this.pakMeast = pakMeast;
	}

	public String getPakMeastUnit() {
		return this.pakMeastUnit;
	}

	public void setPakMeastUnit(String pakMeastUnit) {
		this.pakMeastUnit = pakMeastUnit;
	}

	public BigDecimal getPakNw() {
		return this.pakNw;
	}

	public void setPakNw(BigDecimal pakNw) {
		this.pakNw = pakNw;
	}

	public BigDecimal getPakNwN() {
		return this.pakNwN;
	}

	public void setPakNwN(BigDecimal pakNwN) {
		this.pakNwN = pakNwN;
	}

	public String getPakUnit() {
		return this.pakUnit;
	}

	public void setPakUnit(String pakUnit) {
		this.pakUnit = pakUnit;
	}

	public String getPakWeightUnit() {
		return this.pakWeightUnit;
	}

	public void setPakWeightUnit(String pakWeightUnit) {
		this.pakWeightUnit = pakWeightUnit;
	}

	public String getPkNo() {
		return this.pkNo;
	}

	public void setPkNo(String pkNo) {
		this.pkNo = pkNo;
	}

	public String getPrdMark() {
		return this.prdMark;
	}

	public void setPrdMark(String prdMark) {
		this.prdMark = prdMark;
	}

	public String getPrdName() {
		return this.prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
/*
	public String getPrdNo() {
		return this.prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}
*/
	public String getPrdNoSoRes() {
		return this.prdNoSoRes;
	}

	public void setPrdNoSoRes(String prdNoSoRes) {
		this.prdNoSoRes = prdNoSoRes;
	}

	public String getPrdmoNo() {
		return this.prdmoNo;
	}

	public void setPrdmoNo(String prdmoNo) {
		this.prdmoNo = prdmoNo;
	}

	public Integer getPreItm() {
		return this.preItm;
	}

	public void setPreItm(Integer preItm) {
		this.preItm = preItm;
	}

	public String getPriceId() {
		return this.priceId;
	}

	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public String getPrmNo() {
		return this.prmNo;
	}

	public void setPrmNo(String prmNo) {
		this.prmNo = prmNo;
	}

	public String getPromoId() {
		return this.promoId;
	}

	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public Timestamp getPsDd() {
		return this.psDd;
	}

	public void setPsDd(Timestamp psDd) {
		this.psDd = psDd;
	}

	public Integer getPwItm() {
		return this.pwItm;
	}

	public void setPwItm(Integer pwItm) {
		this.pwItm = pwItm;
	}

	public String getQcFlag() {
		return this.qcFlag;
	}

	public void setQcFlag(String qcFlag) {
		this.qcFlag = qcFlag;
	}

	public Integer getQcItm() {
		return this.qcItm;
	}

	public void setQcItm(Integer qcItm) {
		this.qcItm = qcItm;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getQtyArk() {
		return this.qtyArk;
	}

	public void setQtyArk(BigDecimal qtyArk) {
		this.qtyArk = qtyArk;
	}

	public BigDecimal getQtyCk() {
		return this.qtyCk;
	}

	public void setQtyCk(BigDecimal qtyCk) {
		this.qtyCk = qtyCk;
	}

	public BigDecimal getQtyCkUnsh() {
		return this.qtyCkUnsh;
	}

	public void setQtyCkUnsh(BigDecimal qtyCkUnsh) {
		this.qtyCkUnsh = qtyCkUnsh;
	}

	public BigDecimal getQtyFp() {
		return this.qtyFp;
	}

	public void setQtyFp(BigDecimal qtyFp) {
		this.qtyFp = qtyFp;
	}

	public BigDecimal getQtyFx() {
		return this.qtyFx;
	}

	public void setQtyFx(BigDecimal qtyFx) {
		this.qtyFx = qtyFx;
	}

	public BigDecimal getQtyFxUnsh() {
		return this.qtyFxUnsh;
	}

	public void setQtyFxUnsh(BigDecimal qtyFxUnsh) {
		this.qtyFxUnsh = qtyFxUnsh;
	}

	public BigDecimal getQtyLoss() {
		return this.qtyLoss;
	}

	public void setQtyLoss(BigDecimal qtyLoss) {
		this.qtyLoss = qtyLoss;
	}

	public BigDecimal getQtyOi() {
		return this.qtyOi;
	}

	public void setQtyOi(BigDecimal qtyOi) {
		this.qtyOi = qtyOi;
	}

	public BigDecimal getQtyOut() {
		return this.qtyOut;
	}

	public void setQtyOut(BigDecimal qtyOut) {
		this.qtyOut = qtyOut;
	}

	public BigDecimal getQtyPosSo() {
		return this.qtyPosSo;
	}

	public void setQtyPosSo(BigDecimal qtyPosSo) {
		this.qtyPosSo = qtyPosSo;
	}

	public BigDecimal getQtyPs() {
		return this.qtyPs;
	}

	public void setQtyPs(BigDecimal qtyPs) {
		this.qtyPs = qtyPs;
	}

	public BigDecimal getQtyRtn() {
		return this.qtyRtn;
	}

	public void setQtyRtn(BigDecimal qtyRtn) {
		this.qtyRtn = qtyRtn;
	}

	public BigDecimal getQtyRtnArk() {
		return this.qtyRtnArk;
	}

	public void setQtyRtnArk(BigDecimal qtyRtnArk) {
		this.qtyRtnArk = qtyRtnArk;
	}

	public BigDecimal getQtyRtnUnsh() {
		return this.qtyRtnUnsh;
	}

	public void setQtyRtnUnsh(BigDecimal qtyRtnUnsh) {
		this.qtyRtnUnsh = qtyRtnUnsh;
	}

	public BigDecimal getQtySb() {
		return this.qtySb;
	}

	public void setQtySb(BigDecimal qtySb) {
		this.qtySb = qtySb;
	}

	public BigDecimal getQtySbUnsh() {
		return this.qtySbUnsh;
	}

	public void setQtySbUnsh(BigDecimal qtySbUnsh) {
		this.qtySbUnsh = qtySbUnsh;
	}

	public BigDecimal getQtySq() {
		return this.qtySq;
	}

	public void setQtySq(BigDecimal qtySq) {
		this.qtySq = qtySq;
	}

	public BigDecimal getQtySqUnsh() {
		return this.qtySqUnsh;
	}

	public void setQtySqUnsh(BigDecimal qtySqUnsh) {
		this.qtySqUnsh = qtySqUnsh;
	}

	public BigDecimal getQtyXb() {
		return this.qtyXb;
	}

	public void setQtyXb(BigDecimal qtyXb) {
		this.qtyXb = qtyXb;
	}

	public BigDecimal getQtyXbUnsh() {
		return this.qtyXbUnsh;
	}

	public void setQtyXbUnsh(BigDecimal qtyXbUnsh) {
		this.qtyXbUnsh = qtyXbUnsh;
	}

	public BigDecimal getQtyZq() {
		return this.qtyZq;
	}

	public void setQtyZq(BigDecimal qtyZq) {
		this.qtyZq = qtyZq;
	}

	public BigDecimal getQty1() {
		return this.qty1;
	}

	public void setQty1(BigDecimal qty1) {
		this.qty1 = qty1;
	}

	public BigDecimal getQty1Fp() {
		return this.qty1Fp;
	}

	public void setQty1Fp(BigDecimal qty1Fp) {
		this.qty1Fp = qty1Fp;
	}

	public BigDecimal getQty1Loss() {
		return this.qty1Loss;
	}

	public void setQty1Loss(BigDecimal qty1Loss) {
		this.qty1Loss = qty1Loss;
	}

	public BigDecimal getQtys() {
		return this.qtys;
	}

	public void setQtys(BigDecimal qtys) {
		this.qtys = qtys;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getRemXp() {
		return this.remXp;
	}

	public void setRemXp(String remXp) {
		this.remXp = remXp;
	}

	public Timestamp getRkDd() {
		return this.rkDd;
	}

	public void setRkDd(Timestamp rkDd) {
		this.rkDd = rkDd;
	}

	public String getRkNo() {
		return this.rkNo;
	}

	public void setRkNo(String rkNo) {
		this.rkNo = rkNo;
	}

	public BigDecimal getRtoEp() {
		return this.rtoEp;
	}

	public void setRtoEp(BigDecimal rtoEp) {
		this.rtoEp = rtoEp;
	}

	public String getSalNo() {
		return this.salNo;
	}

	public void setSalNo(String salNo) {
		this.salNo = salNo;
	}

	public String getSalNo1() {
		return this.salNo1;
	}

	public void setSalNo1(String salNo1) {
		this.salNo1 = salNo1;
	}

	public String getSbacChk() {
		return this.sbacChk;
	}

	public void setSbacChk(String sbacChk) {
		this.sbacChk = sbacChk;
	}

	public String getSendWh() {
		return this.sendWh;
	}

	public void setSendWh(String sendWh) {
		this.sendWh = sendWh;
	}

	public String getShNoCus() {
		return this.shNoCus;
	}

	public void setShNoCus(String shNoCus) {
		this.shNoCus = shNoCus;
	}

	public Integer getSlItm() {
		return this.slItm;
	}

	public void setSlItm(Integer slItm) {
		this.slItm = slItm;
	}

	public String getSlNo() {
		return this.slNo;
	}

	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}

	public String getSpNo() {
		return this.spNo;
	}

	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

	public String getSpcNo() {
		return this.spcNo;
	}

	public void setSpcNo(String spcNo) {
		this.spcNo = spcNo;
	}

	public String getSpcNo1() {
		return this.spcNo1;
	}

	public void setSpcNo1(String spcNo1) {
		this.spcNo1 = spcNo1;
	}

	public String getSupPrdMark() {
		return this.supPrdMark;
	}

	public void setSupPrdMark(String supPrdMark) {
		this.supPrdMark = supPrdMark;
	}

	public String getSupPrdNo() {
		return this.supPrdNo;
	}

	public void setSupPrdNo(String supPrdNo) {
		this.supPrdNo = supPrdNo;
	}

	public String getTaskNo() {
		return this.taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTaxFp() {
		return this.taxFp;
	}

	public void setTaxFp(BigDecimal taxFp) {
		this.taxFp = taxFp;
	}

	public BigDecimal getTaxIfrs() {
		return this.taxIfrs;
	}

	public void setTaxIfrs(BigDecimal taxIfrs) {
		this.taxIfrs = taxIfrs;
	}

	public BigDecimal getTaxRto() {
		return this.taxRto;
	}

	public void setTaxRto(BigDecimal taxRto) {
		this.taxRto = taxRto;
	}

	public BigDecimal getTaxZgFp() {
		return this.taxZgFp;
	}

	public void setTaxZgFp(BigDecimal taxZgFp) {
		this.taxZgFp = taxZgFp;
	}

	public BigDecimal getTaxs() {
		return this.taxs;
	}

	public void setTaxs(BigDecimal taxs) {
		this.taxs = taxs;
	}

	public Integer getTiItm() {
		return this.tiItm;
	}

	public void setTiItm(Integer tiItm) {
		this.tiItm = tiItm;
	}

	public String getTrdId() {
		return this.trdId;
	}

	public void setTrdId(String trdId) {
		this.trdId = trdId;
	}

	public Integer getTrdItm() {
		return this.trdItm;
	}

	public void setTrdItm(Integer trdItm) {
		this.trdItm = trdItm;
	}

	public String getTrdNo() {
		return this.trdNo;
	}

	public void setTrdNo(String trdNo) {
		this.trdNo = trdNo;
	}

	public Integer getTtRng() {
		return this.ttRng;
	}

	public void setTtRng(Integer ttRng) {
		this.ttRng = ttRng;
	}

	public String getTtTypeIfrs() {
		return this.ttTypeIfrs;
	}

	public void setTtTypeIfrs(String ttTypeIfrs) {
		this.ttTypeIfrs = ttTypeIfrs;
	}

	public Timestamp getTtYmB() {
		return this.ttYmB;
	}

	public void setTtYmB(Timestamp ttYmB) {
		this.ttYmB = ttYmB;
	}

	public Timestamp getTtYmE() {
		return this.ttYmE;
	}

	public void setTtYmE(Timestamp ttYmE) {
		this.ttYmE = ttYmE;
	}

	public String getTypeSgt() {
		return this.typeSgt;
	}

	public void setTypeSgt(String typeSgt) {
		this.typeSgt = typeSgt;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getUp() {
		return this.up;
	}

	public void setUp(BigDecimal up) {
		this.up = up;
	}

	public BigDecimal getUpMain() {
		return this.upMain;
	}

	public void setUpMain(BigDecimal upMain) {
		this.upMain = upMain;
	}

	public BigDecimal getUpMainIfrs() {
		return this.upMainIfrs;
	}

	public void setUpMainIfrs(BigDecimal upMainIfrs) {
		this.upMainIfrs = upMainIfrs;
	}

	public BigDecimal getUpOld() {
		return this.upOld;
	}

	public void setUpOld(BigDecimal upOld) {
		this.upOld = upOld;
	}

	public BigDecimal getUpQty1() {
		return this.upQty1;
	}

	public void setUpQty1(BigDecimal upQty1) {
		this.upQty1 = upQty1;
	}

	public BigDecimal getUpSale() {
		return this.upSale;
	}

	public void setUpSale(BigDecimal upSale) {
		this.upSale = upSale;
	}

	public String getUpSpSw() {
		return this.upSpSw;
	}

	public void setUpSpSw(String upSpSw) {
		this.upSpSw = upSpSw;
	}

	public BigDecimal getUpStd() {
		return this.upStd;
	}

	public void setUpStd(BigDecimal upStd) {
		this.upStd = upStd;
	}

	public BigDecimal getUpStdIfrs() {
		return this.upStdIfrs;
	}

	public void setUpStdIfrs(BigDecimal upStdIfrs) {
		this.upStdIfrs = upStdIfrs;
	}

	public String getUt() {
		return this.ut;
	}

	public void setUt(String ut) {
		this.ut = ut;
	}

	public Timestamp getValidDd() {
		return this.validDd;
	}

	public void setValidDd(Timestamp validDd) {
		this.validDd = validDd;
	}

	public Timestamp getWcDd() {
		return this.wcDd;
	}

	public void setWcDd(Timestamp wcDd) {
		this.wcDd = wcDd;
	}

	public String getWh() {
		return this.wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public BigDecimal getWt() {
		return this.wt;
	}

	public void setWt(BigDecimal wt) {
		this.wt = wt;
	}

	public String getXpmNo() {
		return this.xpmNo;
	}

	public void setXpmNo(String xpmNo) {
		this.xpmNo = xpmNo;
	}

	public String getXpmNo1() {
		return this.xpmNo1;
	}

	public void setXpmNo1(String xpmNo1) {
		this.xpmNo1 = xpmNo1;
	}

	public Integer getXpprdItm() {
		return this.xpprdItm;
	}

	public void setXpprdItm(Integer xpprdItm) {
		this.xpprdItm = xpprdItm;
	}

	public Integer getXpprdItm1() {
		return this.xpprdItm1;
	}

	public void setXpprdItm1(Integer xpprdItm1) {
		this.xpprdItm1 = xpprdItm1;
	}

	public String getYhId() {
		return this.yhId;
	}

	public void setYhId(String yhId) {
		this.yhId = yhId;
	}

	public String getYhNo() {
		return this.yhNo;
	}

	public void setYhNo(String yhNo) {
		this.yhNo = yhNo;
	}

	public String getZdzz() {
		return this.zdzz;
	}

	public void setZdzz(String zdzz) {
		this.zdzz = zdzz;
	}

	public MfPss getMfPss() {
		return this.mfPss;
	}

	public void setMfPss(MfPss mfPss) {
		this.mfPss = mfPss;
	}

	public Prdt getPrdt() {
		return prdt;
	}

	public void setPrdt(Prdt prdt) {
		this.prdt = prdt;
	}

}