package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the PRDT database table.
 * 
 */
@Entity
@Table(name="PRDT")
@NamedQuery(name="Prdt.findAll", query="SELECT p FROM Prdt p")
public class Prdt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRD_NO")
	private String prdNo;

	@Column(name="ABC")
	private String abc;

	@Column(name="ACC_NO_FC")
	private String accNoFc;

	@Column(name="ACC_NO_IN")
	private String accNoIn;

	@Column(name="ACC_NO_ORI")
	private String accNoOri;

	@Column(name="ACC_NO_OUT")
	private String accNoOut;

	@Column(name="ACC_PRO_CST")
	private String accProCst;

	@Column(name="ACC_SA_CST")
	private String accSaCst;

	@Column(name="ACC_SA_IN")
	private String accSaIn;

	@Column(name="B2C_HIDE")
	private String b2cHide;

	@Column(name="BACK_RTO")
	private BigDecimal backRto;

	@Column(name="BAR_CODE")
	private String barCode;

	@Column(name="BIL_ML")
	private String bilMl;

	@Column(name="BOM_ID")
	private String bomId;

	@Column(name="BZ_DATA")
	private String bzData;

	@Column(name="CADNAME")
	private String cadname;

	@Column(name="CAIZ")
	private String caiz;

	@Column(name="CC_NO")
	private String ccNo;

	@Column(name="CCC")
	private String ccc;

	@Column(name="CHG_DAYS")
	private Short chgDays;

	@Column(name="CHK_ADD_WC")
	private String chkAddWc;

	@Column(name="CHK_BAR")
	private String chkBar;

	@Column(name="CHK_BAT")
	private String chkBat;

	@Column(name="CHK_INSTALL")
	private String chkInstall;

	@Column(name="CHK_M2")
	private String chkM2;

	@Column(name="CHK_MAN")
	private String chkMan;

	@Column(name="CHK_ML")
	private String chkMl;

	@Column(name="CHK_MM")
	private String chkMm;

	@Column(name="CHK_MTN")
	private String chkMtn;

	@Column(name="CHK_NUM")
	private String chkNum;

	@Column(name="CHK_PC")
	private String chkPc;

	@Column(name="CHK_PRD_MARK")
	private String chkPrdMark;

	@Column(name="CHK_RTN")
	private String chkRtn;

	@Column(name="CHK_SA")
	private String chkSa;

	@Column(name="CHK_SB")
	private String chkSb;

	@Column(name="CHK_TAX")
	private String chkTax;

	@Column(name="CHK_TBWH")
	private String chkTbwh;

	@Column(name="CHK_TW")
	private String chkTw;

	@Column(name="CHK_WG")
	private String chkWg;

	@Column(name="CLS_DATE")
	// private TIMESTAMP clsDate;
	private byte[] clsDate;

	@Column(name="CODENAME")
	private String codename;

	@Column(name="CPY_SW")
	private String cpySw;

	@Column(name="CST_ADD")
	private BigDecimal cstAdd;

	@Column(name="CST_SAL")
	private BigDecimal cstSal;

	@Column(name="CST_STD")
	private BigDecimal cstStd;

	@Column(name="DEP")
	private String dep;

	@Column(name="DEPRO_NO")
	private String deproNo;

	@Column(name="DFU_UT")
	private String dfuUt;
/*
	@Column(name="DZ_DD")
	private Timestamp dzDd;
*/
	@Column(name="FORMULA")
	private String formula;

	@Column(name="FY_FLAG")
	private String fyFlag;

	@Column(name="HS_NO")
	private String hsNo;

	@Column(name="IDX1")
	private String idx1;

	@Column(name="IDX2")
	private String idx2;

	@Column(name="INV_NAME")
	private String invName;

	@Column(name="JJ_LEN")
	private BigDecimal jjLen;

	@Column(name="JJ_LEN2")
	private BigDecimal jjLen2;

	@Column(name="KND")
	private String knd;

	@Column(name="LEN_PRD")
	private BigDecimal lenPrd;

	@Column(name="LEN_PRD2")
	private BigDecimal lenPrd2;

	@Column(name="LEN_PRD3")
	private BigDecimal lenPrd3;

	@Column(name="ML_BY_MM")
	private String mlByMm;

	@Column(name="ML_UT")
	private String mlUt;

	@Column(name="MOB_ID")
	private String mobId;

	@Column(name="MOB_ID1")
	private String mobId1;

	@Column(name="MRK")
	private String mrk;

	@Column(name="MTN_LTIME")
	private Integer mtnLtime;

	@Column(name="NAME")
	private String name;

	@Column(name="NAME_ENG")
	private String nameEng;

	@Column(name="NAME_PY")
	private String namePy;

	@Column(name="NEED_DAYS")
	private BigDecimal needDays;

	@Column(name="NEED_DD")
	private Short needDd;

	@Column(name="NOT_RTN")
	private String notRtn;
/*
	@Column(name="NOUSE_DD")
	private Timestamp nouseDd;
*/
	@Column(name="OLD_CODE")
	private String oldCode;

	@Column(name="OLEFIELD")
	private String olefield;

	@Column(name="PAK_EXC")
	private BigDecimal pakExc;

	@Column(name="PAK_GW")
	private BigDecimal pakGw;

	@Column(name="PAK_MEAST")
	private BigDecimal pakMeast;

	@Column(name="PAK_MEAST_UNIT")
	private String pakMeastUnit;

	@Column(name="PAK_NW")
	private BigDecimal pakNw;

	@Column(name="PAK_UNIT")
	private String pakUnit;

	@Column(name="PAK_WEIGHT_UNIT")
	private String pakWeightUnit;

	@Lob
	@Column(name="PIC")
	private byte[] pic;

	@Column(name="PK2_QTY")
	private Double pk2Qty;

	@Column(name="PK2_UT")
	private String pk2Ut;

	@Column(name="PK3_QTY")
	private Double pk3Qty;

	@Column(name="PK3_UT")
	private String pk3Ut;

	@Column(name="PRD_LEVEL")
	private String prdLevel;

	@Column(name="PRD_NO_EXC")
	private String prdNoExc;

	@Column(name="PRD_NO_SGT")
	private String prdNoSgt;

	@Column(name="PRD_PACK")
	private String prdPack;

	@Column(name="PRD_POI")
	private Integer prdPoi;

	@Column(name="PRICEXS")
	private BigDecimal pricexs;

	@Column(name="QTY_AD_ID")
	private String qtyAdId;

	@Column(name="QTY_LOST_FIX")
	private BigDecimal qtyLostFix;

	@Column(name="QTY_LOW")
	private BigDecimal qtyLow;

	@Column(name="QTY_MAX")
	private BigDecimal qtyMax;

	@Column(name="QTY_MIN")
	private BigDecimal qtyMin;

	@Column(name="QTY_MIN1")
	private BigDecimal qtyMin1;

	@Column(name="QTY_ML_ID")
	private String qtyMlId;

	@Column(name="QUOTE_UT1")
	private String quoteUt1;

	@Column(name="QUOTE_UT2")
	private String quoteUt2;

	@Column(name="QUOTE_UT3")
	private String quoteUt3;

	@Column(name="RB_RATE")
	private BigDecimal rbRate;

	@Lob
	@Column(name="REM")
	private String rem;

	@Column(name="REM_NAME")
	private String remName;

	@Lob
	@Column(name="REM_WEB")
	private String remWeb;

	@Lob
	@Column(name="REM_WEB_M")
	private byte[] remWebM;

	@Column(name="RTO_CL")
	private BigDecimal rtoCl;

	@Column(name="RTO_EP")
	private BigDecimal rtoEp;

	@Column(name="RTO_ID")
	private String rtoId;

	@Column(name="RTO_MM")
	private BigDecimal rtoMm;

	@Column(name="RTO_PC")
	private BigDecimal rtoPc;

	@Column(name="RTO_RTN")
	private Short rtoRtn;

	@Column(name="RTO_SA")
	private BigDecimal rtoSa;

	@Column(name="RTO_TB")
	private BigDecimal rtoTb;

	@Column(name="SA_RTO")
	private BigDecimal saRto;

	@Column(name="SAL_NO")
	private String salNo;

	@Column(name="SGT_RATE")
	private BigDecimal sgtRate;

	@Lob
	@Column(name="SMALLPIC")
	private byte[] smallpic;

	@Column(name="SNM")
	private String snm;

	@Lob
	@Column(name="SPC")
	private String spc;

	@Column(name="SPC_ID")
	private Short spcId;

	@Column(name="SPC_ID1")
	private Short spcId1;

	@Column(name="SPC_PRD")
	private String spcPrd;

	@Lob
	@Column(name="SPC_PY")
	private String spcPy;

	@Column(name="SPC_TAX")
	private BigDecimal spcTax;
/*
	@Column(name="START_DD")
	private Timestamp startDd;
*/
	@Column(name="STOP_ID")
	private String stopId;

	@Column(name="STOP_PROD")
	private String stopProd;

	@Column(name="SUP1")
	private String sup1;

	@Column(name="SUP2")
	private String sup2;
/*
	@Column(name="SYS_DATE")
	private Timestamp sysDate;
*/
	@Column(name="TB_NUMIDS")
	private String tbNumids;

	@Column(name="TIME_UNIT")
	private String timeUnit;

	@Column(name="TL_ID")
	private String tlId;

	@Column(name="TPL_NO")
	private String tplNo;

	@Lob
	@Column(name="TPL_REM")
	private String tplRem;

	@Column(name="TW_ID")
	private String twId;

	@Column(name="TYPE_CST")
	private String typeCst;

	@Column(name="UBPR")
	private Integer ubpr;

	@Column(name="UNIT_SGT")
	private String unitSgt;
/*
	@Column(name="UP_DD")
	private Timestamp upDd;
*/
	@Column(name="UP_MAX")
	private BigDecimal upMax;

	@Column(name="UP_MIN")
	private BigDecimal upMin;

	@Column(name="UP_SAL")
	private BigDecimal upSal;

	@Column(name="UPR")
	private BigDecimal upr;

	@Column(name="UPR_LEVEL1")
	private BigDecimal uprLevel1;

	@Column(name="UPR_LEVEL2")
	private BigDecimal uprLevel2;

	@Column(name="UPR_LEVEL3")
	private BigDecimal uprLevel3;

	@Column(name="UPR_LEVEL4")
	private BigDecimal uprLevel4;

	@Column(name="UPR_LEVEL5")
	private BigDecimal uprLevel5;

	@Column(name="UPR_TP")
	private BigDecimal uprTp;

	@Column(name="USE_PRDMARK")
	private String usePrdmark;

	@Column(name="USR")
	private String usr;

	@Column(name="UT")
	private String ut;

	@Column(name="UT_LEN")
	private String utLen;

	@Column(name="UT_TIME")
	private BigDecimal utTime;

	@Column(name="UT_WIDTH")
	private String utWidth;

	@Column(name="UT1")
	private String ut1;

	@Column(name="VALID_DAYS")
	private Short validDays;

	@Column(name="VIRTUAL_ID")
	private String virtualId;

	@Column(name="WC_MONTH")
	private Integer wcMonth;

	@Column(name="WEB_DESCRIPTION")
	private String webDescription;

	@Column(name="WEB_KEYWORDS")
	private String webKeywords;

	@Column(name="WEB_TITLE")
	private String webTitle;

	@Column(name="WEIGHT")
	private BigDecimal weight;

	@Column(name="WH")
	private String wh;

	@Column(name="WH_LC")
	private String whLc;

	@Column(name="WH_PJSQ")
	private String whPjsq;

	@Column(name="WIDTH_PRD")
	private BigDecimal widthPrd;

	@Column(name="WTUT")
	private String wtut;

	@Column(name="XN_NO")
	private String xnNo;

	@Column(name="ZC_TYPE")
	private String zcType;

	//bi-directional many-to-one association to TfPss
	@OneToMany(mappedBy="prdt")
	private List<TfPss> tfPsses;

	public Prdt() {
	}

	public String getPrdNo() {
		return this.prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getAbc() {
		return this.abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public String getAccNoFc() {
		return this.accNoFc;
	}

	public void setAccNoFc(String accNoFc) {
		this.accNoFc = accNoFc;
	}

	public String getAccNoIn() {
		return this.accNoIn;
	}

	public void setAccNoIn(String accNoIn) {
		this.accNoIn = accNoIn;
	}

	public String getAccNoOri() {
		return this.accNoOri;
	}

	public void setAccNoOri(String accNoOri) {
		this.accNoOri = accNoOri;
	}

	public String getAccNoOut() {
		return this.accNoOut;
	}

	public void setAccNoOut(String accNoOut) {
		this.accNoOut = accNoOut;
	}

	public String getAccProCst() {
		return this.accProCst;
	}

	public void setAccProCst(String accProCst) {
		this.accProCst = accProCst;
	}

	public String getAccSaCst() {
		return this.accSaCst;
	}

	public void setAccSaCst(String accSaCst) {
		this.accSaCst = accSaCst;
	}

	public String getAccSaIn() {
		return this.accSaIn;
	}

	public void setAccSaIn(String accSaIn) {
		this.accSaIn = accSaIn;
	}

	public String getB2cHide() {
		return this.b2cHide;
	}

	public void setB2cHide(String b2cHide) {
		this.b2cHide = b2cHide;
	}

	public BigDecimal getBackRto() {
		return this.backRto;
	}

	public void setBackRto(BigDecimal backRto) {
		this.backRto = backRto;
	}

	public String getBarCode() {
		return this.barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getBilMl() {
		return this.bilMl;
	}

	public void setBilMl(String bilMl) {
		this.bilMl = bilMl;
	}

	public String getBomId() {
		return this.bomId;
	}

	public void setBomId(String bomId) {
		this.bomId = bomId;
	}

	public String getBzData() {
		return this.bzData;
	}

	public void setBzData(String bzData) {
		this.bzData = bzData;
	}

	public String getCadname() {
		return this.cadname;
	}

	public void setCadname(String cadname) {
		this.cadname = cadname;
	}

	public String getCaiz() {
		return this.caiz;
	}

	public void setCaiz(String caiz) {
		this.caiz = caiz;
	}

	public String getCcNo() {
		return this.ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public String getCcc() {
		return this.ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public Short getChgDays() {
		return this.chgDays;
	}

	public void setChgDays(Short chgDays) {
		this.chgDays = chgDays;
	}

	public String getChkAddWc() {
		return this.chkAddWc;
	}

	public void setChkAddWc(String chkAddWc) {
		this.chkAddWc = chkAddWc;
	}

	public String getChkBar() {
		return this.chkBar;
	}

	public void setChkBar(String chkBar) {
		this.chkBar = chkBar;
	}

	public String getChkBat() {
		return this.chkBat;
	}

	public void setChkBat(String chkBat) {
		this.chkBat = chkBat;
	}

	public String getChkInstall() {
		return this.chkInstall;
	}

	public void setChkInstall(String chkInstall) {
		this.chkInstall = chkInstall;
	}

	public String getChkM2() {
		return this.chkM2;
	}

	public void setChkM2(String chkM2) {
		this.chkM2 = chkM2;
	}

	public String getChkMan() {
		return this.chkMan;
	}

	public void setChkMan(String chkMan) {
		this.chkMan = chkMan;
	}

	public String getChkMl() {
		return this.chkMl;
	}

	public void setChkMl(String chkMl) {
		this.chkMl = chkMl;
	}

	public String getChkMm() {
		return this.chkMm;
	}

	public void setChkMm(String chkMm) {
		this.chkMm = chkMm;
	}

	public String getChkMtn() {
		return this.chkMtn;
	}

	public void setChkMtn(String chkMtn) {
		this.chkMtn = chkMtn;
	}

	public String getChkNum() {
		return this.chkNum;
	}

	public void setChkNum(String chkNum) {
		this.chkNum = chkNum;
	}

	public String getChkPc() {
		return this.chkPc;
	}

	public void setChkPc(String chkPc) {
		this.chkPc = chkPc;
	}

	public String getChkPrdMark() {
		return this.chkPrdMark;
	}

	public void setChkPrdMark(String chkPrdMark) {
		this.chkPrdMark = chkPrdMark;
	}

	public String getChkRtn() {
		return this.chkRtn;
	}

	public void setChkRtn(String chkRtn) {
		this.chkRtn = chkRtn;
	}

	public String getChkSa() {
		return this.chkSa;
	}

	public void setChkSa(String chkSa) {
		this.chkSa = chkSa;
	}

	public String getChkSb() {
		return this.chkSb;
	}

	public void setChkSb(String chkSb) {
		this.chkSb = chkSb;
	}

	public String getChkTax() {
		return this.chkTax;
	}

	public void setChkTax(String chkTax) {
		this.chkTax = chkTax;
	}

	public String getChkTbwh() {
		return this.chkTbwh;
	}

	public void setChkTbwh(String chkTbwh) {
		this.chkTbwh = chkTbwh;
	}

	public String getChkTw() {
		return this.chkTw;
	}

	public void setChkTw(String chkTw) {
		this.chkTw = chkTw;
	}

	public String getChkWg() {
		return this.chkWg;
	}

	public void setChkWg(String chkWg) {
		this.chkWg = chkWg;
	}
/*
	public Timestamp getClsDate() {
		return this.clsDate;
	}

	public void setClsDate(Timestamp clsDate) {
		this.clsDate = clsDate;
	}
*/
	public byte[] getClsDate() {
		return clsDate;
	}

	public void setClsDate(byte[] clsDate) {
		this.clsDate = clsDate;
	}
	
	public String getCodename() {
		return this.codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public String getCpySw() {
		return this.cpySw;
	}

	public void setCpySw(String cpySw) {
		this.cpySw = cpySw;
	}

	public BigDecimal getCstAdd() {
		return this.cstAdd;
	}

	public void setCstAdd(BigDecimal cstAdd) {
		this.cstAdd = cstAdd;
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

	public String getDep() {
		return this.dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getDeproNo() {
		return this.deproNo;
	}

	public void setDeproNo(String deproNo) {
		this.deproNo = deproNo;
	}

	public String getDfuUt() {
		return this.dfuUt;
	}

	public void setDfuUt(String dfuUt) {
		this.dfuUt = dfuUt;
	}
/*
	public Timestamp getDzDd() {
		return this.dzDd;
	}

	public void setDzDd(Timestamp dzDd) {
		this.dzDd = dzDd;
	}
*/
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFyFlag() {
		return this.fyFlag;
	}

	public void setFyFlag(String fyFlag) {
		this.fyFlag = fyFlag;
	}

	public String getHsNo() {
		return this.hsNo;
	}

	public void setHsNo(String hsNo) {
		this.hsNo = hsNo;
	}

	public String getIdx1() {
		return this.idx1;
	}

	public void setIdx1(String idx1) {
		this.idx1 = idx1;
	}

	public String getIdx2() {
		return this.idx2;
	}

	public void setIdx2(String idx2) {
		this.idx2 = idx2;
	}

	public String getInvName() {
		return this.invName;
	}

	public void setInvName(String invName) {
		this.invName = invName;
	}

	public BigDecimal getJjLen() {
		return this.jjLen;
	}

	public void setJjLen(BigDecimal jjLen) {
		this.jjLen = jjLen;
	}

	public BigDecimal getJjLen2() {
		return this.jjLen2;
	}

	public void setJjLen2(BigDecimal jjLen2) {
		this.jjLen2 = jjLen2;
	}

	public String getKnd() {
		return this.knd;
	}

	public void setKnd(String knd) {
		this.knd = knd;
	}

	public BigDecimal getLenPrd() {
		return this.lenPrd;
	}

	public void setLenPrd(BigDecimal lenPrd) {
		this.lenPrd = lenPrd;
	}

	public BigDecimal getLenPrd2() {
		return this.lenPrd2;
	}

	public void setLenPrd2(BigDecimal lenPrd2) {
		this.lenPrd2 = lenPrd2;
	}

	public BigDecimal getLenPrd3() {
		return this.lenPrd3;
	}

	public void setLenPrd3(BigDecimal lenPrd3) {
		this.lenPrd3 = lenPrd3;
	}

	public String getMlByMm() {
		return this.mlByMm;
	}

	public void setMlByMm(String mlByMm) {
		this.mlByMm = mlByMm;
	}

	public String getMlUt() {
		return this.mlUt;
	}

	public void setMlUt(String mlUt) {
		this.mlUt = mlUt;
	}

	public String getMobId() {
		return this.mobId;
	}

	public void setMobId(String mobId) {
		this.mobId = mobId;
	}

	public String getMobId1() {
		return this.mobId1;
	}

	public void setMobId1(String mobId1) {
		this.mobId1 = mobId1;
	}

	public String getMrk() {
		return this.mrk;
	}

	public void setMrk(String mrk) {
		this.mrk = mrk;
	}

	public Integer getMtnLtime() {
		return this.mtnLtime;
	}

	public void setMtnLtime(Integer mtnLtime) {
		this.mtnLtime = mtnLtime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEng() {
		return this.nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNamePy() {
		return this.namePy;
	}

	public void setNamePy(String namePy) {
		this.namePy = namePy;
	}

	public BigDecimal getNeedDays() {
		return this.needDays;
	}

	public void setNeedDays(BigDecimal needDays) {
		this.needDays = needDays;
	}

	public Short getNeedDd() {
		return this.needDd;
	}

	public void setNeedDd(Short needDd) {
		this.needDd = needDd;
	}

	public String getNotRtn() {
		return this.notRtn;
	}

	public void setNotRtn(String notRtn) {
		this.notRtn = notRtn;
	}
/*
	public Timestamp getNouseDd() {
		return this.nouseDd;
	}

	public void setNouseDd(Timestamp nouseDd) {
		this.nouseDd = nouseDd;
	}
*/
	public String getOldCode() {
		return this.oldCode;
	}

	public void setOldCode(String oldCode) {
		this.oldCode = oldCode;
	}

	public String getOlefield() {
		return this.olefield;
	}

	public void setOlefield(String olefield) {
		this.olefield = olefield;
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

	public byte[] getPic() {
		return this.pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public Double getPk2Qty() {
		return this.pk2Qty;
	}

	public void setPk2Qty(Double pk2Qty) {
		this.pk2Qty = pk2Qty;
	}

	public String getPk2Ut() {
		return this.pk2Ut;
	}

	public void setPk2Ut(String pk2Ut) {
		this.pk2Ut = pk2Ut;
	}

	public Double getPk3Qty() {
		return this.pk3Qty;
	}

	public void setPk3Qty(Double pk3Qty) {
		this.pk3Qty = pk3Qty;
	}

	public String getPk3Ut() {
		return this.pk3Ut;
	}

	public void setPk3Ut(String pk3Ut) {
		this.pk3Ut = pk3Ut;
	}

	public String getPrdLevel() {
		return this.prdLevel;
	}

	public void setPrdLevel(String prdLevel) {
		this.prdLevel = prdLevel;
	}

	public String getPrdNoExc() {
		return this.prdNoExc;
	}

	public void setPrdNoExc(String prdNoExc) {
		this.prdNoExc = prdNoExc;
	}

	public String getPrdNoSgt() {
		return this.prdNoSgt;
	}

	public void setPrdNoSgt(String prdNoSgt) {
		this.prdNoSgt = prdNoSgt;
	}

	public String getPrdPack() {
		return this.prdPack;
	}

	public void setPrdPack(String prdPack) {
		this.prdPack = prdPack;
	}

	public Integer getPrdPoi() {
		return this.prdPoi;
	}

	public void setPrdPoi(Integer prdPoi) {
		this.prdPoi = prdPoi;
	}

	public BigDecimal getPricexs() {
		return this.pricexs;
	}

	public void setPricexs(BigDecimal pricexs) {
		this.pricexs = pricexs;
	}

	public String getQtyAdId() {
		return this.qtyAdId;
	}

	public void setQtyAdId(String qtyAdId) {
		this.qtyAdId = qtyAdId;
	}

	public BigDecimal getQtyLostFix() {
		return this.qtyLostFix;
	}

	public void setQtyLostFix(BigDecimal qtyLostFix) {
		this.qtyLostFix = qtyLostFix;
	}

	public BigDecimal getQtyLow() {
		return this.qtyLow;
	}

	public void setQtyLow(BigDecimal qtyLow) {
		this.qtyLow = qtyLow;
	}

	public BigDecimal getQtyMax() {
		return this.qtyMax;
	}

	public void setQtyMax(BigDecimal qtyMax) {
		this.qtyMax = qtyMax;
	}

	public BigDecimal getQtyMin() {
		return this.qtyMin;
	}

	public void setQtyMin(BigDecimal qtyMin) {
		this.qtyMin = qtyMin;
	}

	public BigDecimal getQtyMin1() {
		return this.qtyMin1;
	}

	public void setQtyMin1(BigDecimal qtyMin1) {
		this.qtyMin1 = qtyMin1;
	}

	public String getQtyMlId() {
		return this.qtyMlId;
	}

	public void setQtyMlId(String qtyMlId) {
		this.qtyMlId = qtyMlId;
	}

	public String getQuoteUt1() {
		return this.quoteUt1;
	}

	public void setQuoteUt1(String quoteUt1) {
		this.quoteUt1 = quoteUt1;
	}

	public String getQuoteUt2() {
		return this.quoteUt2;
	}

	public void setQuoteUt2(String quoteUt2) {
		this.quoteUt2 = quoteUt2;
	}

	public String getQuoteUt3() {
		return this.quoteUt3;
	}

	public void setQuoteUt3(String quoteUt3) {
		this.quoteUt3 = quoteUt3;
	}

	public BigDecimal getRbRate() {
		return this.rbRate;
	}

	public void setRbRate(BigDecimal rbRate) {
		this.rbRate = rbRate;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getRemName() {
		return this.remName;
	}

	public void setRemName(String remName) {
		this.remName = remName;
	}

	public String getRemWeb() {
		return this.remWeb;
	}

	public void setRemWeb(String remWeb) {
		this.remWeb = remWeb;
	}

	public byte[] getRemWebM() {
		return this.remWebM;
	}

	public void setRemWebM(byte[] remWebM) {
		this.remWebM = remWebM;
	}

	public BigDecimal getRtoCl() {
		return this.rtoCl;
	}

	public void setRtoCl(BigDecimal rtoCl) {
		this.rtoCl = rtoCl;
	}

	public BigDecimal getRtoEp() {
		return this.rtoEp;
	}

	public void setRtoEp(BigDecimal rtoEp) {
		this.rtoEp = rtoEp;
	}

	public String getRtoId() {
		return this.rtoId;
	}

	public void setRtoId(String rtoId) {
		this.rtoId = rtoId;
	}

	public BigDecimal getRtoMm() {
		return this.rtoMm;
	}

	public void setRtoMm(BigDecimal rtoMm) {
		this.rtoMm = rtoMm;
	}

	public BigDecimal getRtoPc() {
		return this.rtoPc;
	}

	public void setRtoPc(BigDecimal rtoPc) {
		this.rtoPc = rtoPc;
	}

	public Short getRtoRtn() {
		return this.rtoRtn;
	}

	public void setRtoRtn(Short rtoRtn) {
		this.rtoRtn = rtoRtn;
	}

	public BigDecimal getRtoSa() {
		return this.rtoSa;
	}

	public void setRtoSa(BigDecimal rtoSa) {
		this.rtoSa = rtoSa;
	}

	public BigDecimal getRtoTb() {
		return this.rtoTb;
	}

	public void setRtoTb(BigDecimal rtoTb) {
		this.rtoTb = rtoTb;
	}

	public BigDecimal getSaRto() {
		return this.saRto;
	}

	public void setSaRto(BigDecimal saRto) {
		this.saRto = saRto;
	}

	public String getSalNo() {
		return this.salNo;
	}

	public void setSalNo(String salNo) {
		this.salNo = salNo;
	}

	public BigDecimal getSgtRate() {
		return this.sgtRate;
	}

	public void setSgtRate(BigDecimal sgtRate) {
		this.sgtRate = sgtRate;
	}

	public byte[] getSmallpic() {
		return this.smallpic;
	}

	public void setSmallpic(byte[] smallpic) {
		this.smallpic = smallpic;
	}

	public String getSnm() {
		return this.snm;
	}

	public void setSnm(String snm) {
		this.snm = snm;
	}

	public String getSpc() {
		return this.spc;
	}

	public void setSpc(String spc) {
		this.spc = spc;
	}

	public Short getSpcId() {
		return this.spcId;
	}

	public void setSpcId(Short spcId) {
		this.spcId = spcId;
	}

	public Short getSpcId1() {
		return this.spcId1;
	}

	public void setSpcId1(Short spcId1) {
		this.spcId1 = spcId1;
	}

	public String getSpcPrd() {
		return this.spcPrd;
	}

	public void setSpcPrd(String spcPrd) {
		this.spcPrd = spcPrd;
	}

	public String getSpcPy() {
		return this.spcPy;
	}

	public void setSpcPy(String spcPy) {
		this.spcPy = spcPy;
	}

	public BigDecimal getSpcTax() {
		return this.spcTax;
	}

	public void setSpcTax(BigDecimal spcTax) {
		this.spcTax = spcTax;
	}
/*
	public Timestamp getStartDd() {
		return this.startDd;
	}

	public void setStartDd(Timestamp startDd) {
		this.startDd = startDd;
	}
*/
	public String getStopId() {
		return this.stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getStopProd() {
		return this.stopProd;
	}

	public void setStopProd(String stopProd) {
		this.stopProd = stopProd;
	}

	public String getSup1() {
		return this.sup1;
	}

	public void setSup1(String sup1) {
		this.sup1 = sup1;
	}

	public String getSup2() {
		return this.sup2;
	}

	public void setSup2(String sup2) {
		this.sup2 = sup2;
	}
/*
	public Timestamp getSysDate() {
		return this.sysDate;
	}

	public void setSysDate(Timestamp sysDate) {
		this.sysDate = sysDate;
	}
*/
	public String getTbNumids() {
		return this.tbNumids;
	}

	public void setTbNumids(String tbNumids) {
		this.tbNumids = tbNumids;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getTlId() {
		return this.tlId;
	}

	public void setTlId(String tlId) {
		this.tlId = tlId;
	}

	public String getTplNo() {
		return this.tplNo;
	}

	public void setTplNo(String tplNo) {
		this.tplNo = tplNo;
	}

	public String getTplRem() {
		return this.tplRem;
	}

	public void setTplRem(String tplRem) {
		this.tplRem = tplRem;
	}

	public String getTwId() {
		return this.twId;
	}

	public void setTwId(String twId) {
		this.twId = twId;
	}

	public String getTypeCst() {
		return this.typeCst;
	}

	public void setTypeCst(String typeCst) {
		this.typeCst = typeCst;
	}

	public Integer getUbpr() {
		return this.ubpr;
	}

	public void setUbpr(Integer ubpr) {
		this.ubpr = ubpr;
	}

	public String getUnitSgt() {
		return this.unitSgt;
	}

	public void setUnitSgt(String unitSgt) {
		this.unitSgt = unitSgt;
	}
/*
	public Timestamp getUpDd() {
		return this.upDd;
	}

	public void setUpDd(Timestamp upDd) {
		this.upDd = upDd;
	}
*/
	public BigDecimal getUpMax() {
		return this.upMax;
	}

	public void setUpMax(BigDecimal upMax) {
		this.upMax = upMax;
	}

	public BigDecimal getUpMin() {
		return this.upMin;
	}

	public void setUpMin(BigDecimal upMin) {
		this.upMin = upMin;
	}

	public BigDecimal getUpSal() {
		return this.upSal;
	}

	public void setUpSal(BigDecimal upSal) {
		this.upSal = upSal;
	}

	public BigDecimal getUpr() {
		return this.upr;
	}

	public void setUpr(BigDecimal upr) {
		this.upr = upr;
	}

	public BigDecimal getUprLevel1() {
		return this.uprLevel1;
	}

	public void setUprLevel1(BigDecimal uprLevel1) {
		this.uprLevel1 = uprLevel1;
	}

	public BigDecimal getUprLevel2() {
		return this.uprLevel2;
	}

	public void setUprLevel2(BigDecimal uprLevel2) {
		this.uprLevel2 = uprLevel2;
	}

	public BigDecimal getUprLevel3() {
		return this.uprLevel3;
	}

	public void setUprLevel3(BigDecimal uprLevel3) {
		this.uprLevel3 = uprLevel3;
	}

	public BigDecimal getUprLevel4() {
		return this.uprLevel4;
	}

	public void setUprLevel4(BigDecimal uprLevel4) {
		this.uprLevel4 = uprLevel4;
	}

	public BigDecimal getUprLevel5() {
		return this.uprLevel5;
	}

	public void setUprLevel5(BigDecimal uprLevel5) {
		this.uprLevel5 = uprLevel5;
	}

	public BigDecimal getUprTp() {
		return this.uprTp;
	}

	public void setUprTp(BigDecimal uprTp) {
		this.uprTp = uprTp;
	}

	public String getUsePrdmark() {
		return this.usePrdmark;
	}

	public void setUsePrdmark(String usePrdmark) {
		this.usePrdmark = usePrdmark;
	}

	public String getUsr() {
		return this.usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getUt() {
		return this.ut;
	}

	public void setUt(String ut) {
		this.ut = ut;
	}

	public String getUtLen() {
		return this.utLen;
	}

	public void setUtLen(String utLen) {
		this.utLen = utLen;
	}

	public BigDecimal getUtTime() {
		return this.utTime;
	}

	public void setUtTime(BigDecimal utTime) {
		this.utTime = utTime;
	}

	public String getUtWidth() {
		return this.utWidth;
	}

	public void setUtWidth(String utWidth) {
		this.utWidth = utWidth;
	}

	public String getUt1() {
		return this.ut1;
	}

	public void setUt1(String ut1) {
		this.ut1 = ut1;
	}

	public Short getValidDays() {
		return this.validDays;
	}

	public void setValidDays(Short validDays) {
		this.validDays = validDays;
	}

	public String getVirtualId() {
		return this.virtualId;
	}

	public void setVirtualId(String virtualId) {
		this.virtualId = virtualId;
	}

	public Integer getWcMonth() {
		return this.wcMonth;
	}

	public void setWcMonth(Integer wcMonth) {
		this.wcMonth = wcMonth;
	}

	public String getWebDescription() {
		return this.webDescription;
	}

	public void setWebDescription(String webDescription) {
		this.webDescription = webDescription;
	}

	public String getWebKeywords() {
		return this.webKeywords;
	}

	public void setWebKeywords(String webKeywords) {
		this.webKeywords = webKeywords;
	}

	public String getWebTitle() {
		return this.webTitle;
	}

	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWh() {
		return this.wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getWhLc() {
		return this.whLc;
	}

	public void setWhLc(String whLc) {
		this.whLc = whLc;
	}

	public String getWhPjsq() {
		return this.whPjsq;
	}

	public void setWhPjsq(String whPjsq) {
		this.whPjsq = whPjsq;
	}

	public BigDecimal getWidthPrd() {
		return this.widthPrd;
	}

	public void setWidthPrd(BigDecimal widthPrd) {
		this.widthPrd = widthPrd;
	}

	public String getWtut() {
		return this.wtut;
	}

	public void setWtut(String wtut) {
		this.wtut = wtut;
	}

	public String getXnNo() {
		return this.xnNo;
	}

	public void setXnNo(String xnNo) {
		this.xnNo = xnNo;
	}

	public String getZcType() {
		return this.zcType;
	}

	public void setZcType(String zcType) {
		this.zcType = zcType;
	}

	public List<TfPss> getTfPsses() {
		return this.tfPsses;
	}

	public void setTfPsses(List<TfPss> tfPsses) {
		this.tfPsses = tfPsses;
	}

	public TfPss addTfPss(TfPss tfPss) {
		getTfPsses().add(tfPss);
		tfPss.setPrdt(this);

		return tfPss;
	}

	public TfPss removeTfPss(TfPss tfPss) {
		getTfPsses().remove(tfPss);
		tfPss.setPrdt(null);

		return tfPss;
	}

}