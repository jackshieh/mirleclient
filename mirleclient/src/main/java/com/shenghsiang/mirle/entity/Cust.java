/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jack
 */
@Entity
@Table(name = "CUST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cust.findAll", query = "SELECT c FROM Cust c"),
    @NamedQuery(name = "Cust.findByCusNo", query = "SELECT c FROM Cust c WHERE c.cusNo = :cusNo"),
    @NamedQuery(name = "Cust.findByIdx2", query = "SELECT c FROM Cust c WHERE c.idx2 = :idx2"),
    @NamedQuery(name = "Cust.findByCusAre", query = "SELECT c FROM Cust c WHERE c.cusAre = :cusAre"),
    @NamedQuery(name = "Cust.findByMasCus", query = "SELECT c FROM Cust c WHERE c.masCus = :masCus"),
    @NamedQuery(name = "Cust.findByObjId", query = "SELECT c FROM Cust c WHERE c.objId = :objId"),
    @NamedQuery(name = "Cust.findByName", query = "SELECT c FROM Cust c WHERE c.name = :name"),
    @NamedQuery(name = "Cust.findBySnm", query = "SELECT c FROM Cust c WHERE c.snm = :snm"),
    @NamedQuery(name = "Cust.findByPayDd", query = "SELECT c FROM Cust c WHERE c.payDd = :payDd"),
    @NamedQuery(name = "Cust.findByClsMth", query = "SELECT c FROM Cust c WHERE c.clsMth = :clsMth"),
    @NamedQuery(name = "Cust.findByClsDd", query = "SELECT c FROM Cust c WHERE c.clsDd = :clsDd"),
    @NamedQuery(name = "Cust.findByMmEnd", query = "SELECT c FROM Cust c WHERE c.mmEnd = :mmEnd"),
    @NamedQuery(name = "Cust.findByChkDd", query = "SELECT c FROM Cust c WHERE c.chkDd = :chkDd"),
    @NamedQuery(name = "Cust.findByUniNo", query = "SELECT c FROM Cust c WHERE c.uniNo = :uniNo"),
    @NamedQuery(name = "Cust.findByBosNm", query = "SELECT c FROM Cust c WHERE c.bosNm = :bosNm"),
    @NamedQuery(name = "Cust.findByCntJob1", query = "SELECT c FROM Cust c WHERE c.cntJob1 = :cntJob1"),
    @NamedQuery(name = "Cust.findByCntMan1", query = "SELECT c FROM Cust c WHERE c.cntMan1 = :cntMan1"),
    @NamedQuery(name = "Cust.findByCntJob2", query = "SELECT c FROM Cust c WHERE c.cntJob2 = :cntJob2"),
    @NamedQuery(name = "Cust.findByCntMan2", query = "SELECT c FROM Cust c WHERE c.cntMan2 = :cntMan2"),
    @NamedQuery(name = "Cust.findByAccMan", query = "SELECT c FROM Cust c WHERE c.accMan = :accMan"),
    @NamedQuery(name = "Cust.findBySal", query = "SELECT c FROM Cust c WHERE c.sal = :sal"),
    @NamedQuery(name = "Cust.findByTel1", query = "SELECT c FROM Cust c WHERE c.tel1 = :tel1"),
    @NamedQuery(name = "Cust.findByTel2", query = "SELECT c FROM Cust c WHERE c.tel2 = :tel2"),
    @NamedQuery(name = "Cust.findByFax", query = "SELECT c FROM Cust c WHERE c.fax = :fax"),
    @NamedQuery(name = "Cust.findByZip", query = "SELECT c FROM Cust c WHERE c.zip = :zip"),
    @NamedQuery(name = "Cust.findByLimNr", query = "SELECT c FROM Cust c WHERE c.limNr = :limNr"),
    @NamedQuery(name = "Cust.findByLimNc", query = "SELECT c FROM Cust c WHERE c.limNc = :limNc"),
    @NamedQuery(name = "Cust.findByCrdId", query = "SELECT c FROM Cust c WHERE c.crdId = :crdId"),
    @NamedQuery(name = "Cust.findByInvId", query = "SELECT c FROM Cust c WHERE c.invId = :invId"),
    @NamedQuery(name = "Cust.findById1Tax", query = "SELECT c FROM Cust c WHERE c.id1Tax = :id1Tax"),
    @NamedQuery(name = "Cust.findById2Tax", query = "SELECT c FROM Cust c WHERE c.id2Tax = :id2Tax"),
    @NamedQuery(name = "Cust.findByCls1", query = "SELECT c FROM Cust c WHERE c.cls1 = :cls1"),
    @NamedQuery(name = "Cust.findByCls2", query = "SELECT c FROM Cust c WHERE c.cls2 = :cls2"),
    @NamedQuery(name = "Cust.findByStrDd", query = "SELECT c FROM Cust c WHERE c.strDd = :strDd"),
    @NamedQuery(name = "Cust.findByEndDd", query = "SELECT c FROM Cust c WHERE c.endDd = :endDd"),
    @NamedQuery(name = "Cust.findByCur", query = "SELECT c FROM Cust c WHERE c.cur = :cur"),
    @NamedQuery(name = "Cust.findByCrdNrNc", query = "SELECT c FROM Cust c WHERE c.crdNrNc = :crdNrNc"),
    @NamedQuery(name = "Cust.findByEMail", query = "SELECT c FROM Cust c WHERE c.eMail = :eMail"),
    @NamedQuery(name = "Cust.findBySendMth", query = "SELECT c FROM Cust c WHERE c.sendMth = :sendMth"),
    @NamedQuery(name = "Cust.findBySendWh", query = "SELECT c FROM Cust c WHERE c.sendWh = :sendWh"),
    @NamedQuery(name = "Cust.findByBnkName", query = "SELECT c FROM Cust c WHERE c.bnkName = :bnkName"),
    @NamedQuery(name = "Cust.findByIdCode", query = "SELECT c FROM Cust c WHERE c.idCode = :idCode"),
    @NamedQuery(name = "Cust.findByCusLevel", query = "SELECT c FROM Cust c WHERE c.cusLevel = :cusLevel"),
    @NamedQuery(name = "Cust.findByIncCheck", query = "SELECT c FROM Cust c WHERE c.incCheck = :incCheck"),
    @NamedQuery(name = "Cust.findByLsRto", query = "SELECT c FROM Cust c WHERE c.lsRto = :lsRto"),
    @NamedQuery(name = "Cust.findByCompnet", query = "SELECT c FROM Cust c WHERE c.compnet = :compnet"),
    @NamedQuery(name = "Cust.findByCompDd", query = "SELECT c FROM Cust c WHERE c.compDd = :compDd"),
    @NamedQuery(name = "Cust.findByCapsum", query = "SELECT c FROM Cust c WHERE c.capsum = :capsum"),
    @NamedQuery(name = "Cust.findByBusisum", query = "SELECT c FROM Cust c WHERE c.busisum = :busisum"),
    @NamedQuery(name = "Cust.findBySalms", query = "SELECT c FROM Cust c WHERE c.salms = :salms"),
    @NamedQuery(name = "Cust.findByBusinote", query = "SELECT c FROM Cust c WHERE c.businote = :businote"),
    @NamedQuery(name = "Cust.findByChkCrd", query = "SELECT c FROM Cust c WHERE c.chkCrd = :chkCrd"),
    @NamedQuery(name = "Cust.findBySFlag", query = "SELECT c FROM Cust c WHERE c.sFlag = :sFlag"),
    @NamedQuery(name = "Cust.findByInitnum", query = "SELECT c FROM Cust c WHERE c.initnum = :initnum"),
    @NamedQuery(name = "Cust.findByNotify", query = "SELECT c FROM Cust c WHERE c.notify = :notify"),
    @NamedQuery(name = "Cust.findByBroker", query = "SELECT c FROM Cust c WHERE c.broker = :broker"),
    @NamedQuery(name = "Cust.findByVessel", query = "SELECT c FROM Cust c WHERE c.vessel = :vessel"),
    @NamedQuery(name = "Cust.findByLoadingPort", query = "SELECT c FROM Cust c WHERE c.loadingPort = :loadingPort"),
    @NamedQuery(name = "Cust.findByDisPort", query = "SELECT c FROM Cust c WHERE c.disPort = :disPort"),
    @NamedQuery(name = "Cust.findByManuPlace", query = "SELECT c FROM Cust c WHERE c.manuPlace = :manuPlace"),
    @NamedQuery(name = "Cust.findByEpaper", query = "SELECT c FROM Cust c WHERE c.epaper = :epaper"),
    @NamedQuery(name = "Cust.findByTranRec", query = "SELECT c FROM Cust c WHERE c.tranRec = :tranRec"),
    @NamedQuery(name = "Cust.findByPswd", query = "SELECT c FROM Cust c WHERE c.pswd = :pswd"),
    @NamedQuery(name = "Cust.findByPswdHit", query = "SELECT c FROM Cust c WHERE c.pswdHit = :pswdHit"),
    @NamedQuery(name = "Cust.findByPswdAns", query = "SELECT c FROM Cust c WHERE c.pswdAns = :pswdAns"),
    @NamedQuery(name = "Cust.findByApplyDd", query = "SELECT c FROM Cust c WHERE c.applyDd = :applyDd"),
    @NamedQuery(name = "Cust.findByBizDsc", query = "SELECT c FROM Cust c WHERE c.bizDsc = :bizDsc"),
    @NamedQuery(name = "Cust.findByCountry", query = "SELECT c FROM Cust c WHERE c.country = :country"),
    @NamedQuery(name = "Cust.findByBankNo", query = "SELECT c FROM Cust c WHERE c.bankNo = :bankNo"),
    @NamedQuery(name = "Cust.findByAccNoAr", query = "SELECT c FROM Cust c WHERE c.accNoAr = :accNoAr"),
    @NamedQuery(name = "Cust.findByAccNoAp", query = "SELECT c FROM Cust c WHERE c.accNoAp = :accNoAp"),
    @NamedQuery(name = "Cust.findByAccNoR0", query = "SELECT c FROM Cust c WHERE c.accNoR0 = :accNoR0"),
    @NamedQuery(name = "Cust.findByAccNoP0", query = "SELECT c FROM Cust c WHERE c.accNoP0 = :accNoP0"),
    @NamedQuery(name = "Cust.findBySoCrd", query = "SELECT c FROM Cust c WHERE c.soCrd = :soCrd"),
    @NamedQuery(name = "Cust.findByFpName", query = "SELECT c FROM Cust c WHERE c.fpName = :fpName"),
    @NamedQuery(name = "Cust.findByChkFax", query = "SELECT c FROM Cust c WHERE c.chkFax = :chkFax"),
    @NamedQuery(name = "Cust.findByRtoTax", query = "SELECT c FROM Cust c WHERE c.rtoTax = :rtoTax"),
    @NamedQuery(name = "Cust.findByChkCusIdx", query = "SELECT c FROM Cust c WHERE c.chkCusIdx = :chkCusIdx"),
    @NamedQuery(name = "Cust.findByCyId", query = "SELECT c FROM Cust c WHERE c.cyId = :cyId"),
    @NamedQuery(name = "Cust.findByRegistCode", query = "SELECT c FROM Cust c WHERE c.registCode = :registCode"),
    @NamedQuery(name = "Cust.findByCorpId", query = "SELECT c FROM Cust c WHERE c.corpId = :corpId"),
    @NamedQuery(name = "Cust.findByMCust", query = "SELECT c FROM Cust c WHERE c.mCust = :mCust"),
    @NamedQuery(name = "Cust.findBySalNo", query = "SELECT c FROM Cust c WHERE c.salNo = :salNo"),
    @NamedQuery(name = "Cust.findByChkDep", query = "SELECT c FROM Cust c WHERE c.chkDep = :chkDep"),
    @NamedQuery(name = "Cust.findByRtoKk", query = "SELECT c FROM Cust c WHERE c.rtoKk = :rtoKk"),
    @NamedQuery(name = "Cust.findByDep", query = "SELECT c FROM Cust c WHERE c.dep = :dep"),
    @NamedQuery(name = "Cust.findByRtoFl", query = "SELECT c FROM Cust c WHERE c.rtoFl = :rtoFl"),
    @NamedQuery(name = "Cust.findByRtoYl", query = "SELECT c FROM Cust c WHERE c.rtoYl = :rtoYl"),
    @NamedQuery(name = "Cust.findByDep1", query = "SELECT c FROM Cust c WHERE c.dep1 = :dep1"),
    @NamedQuery(name = "Cust.findByUsr", query = "SELECT c FROM Cust c WHERE c.usr = :usr"),
    @NamedQuery(name = "Cust.findByChkInclude", query = "SELECT c FROM Cust c WHERE c.chkInclude = :chkInclude"),
    @NamedQuery(name = "Cust.findByChkIrp", query = "SELECT c FROM Cust c WHERE c.chkIrp = :chkIrp"),
    @NamedQuery(name = "Cust.findByChkTrp", query = "SELECT c FROM Cust c WHERE c.chkTrp = :chkTrp"),
    @NamedQuery(name = "Cust.findByChkMan", query = "SELECT c FROM Cust c WHERE c.chkMan = :chkMan"),
    @NamedQuery(name = "Cust.findByClsDate", query = "SELECT c FROM Cust c WHERE c.clsDate = :clsDate"),
    @NamedQuery(name = "Cust.findByChkPay1", query = "SELECT c FROM Cust c WHERE c.chkPay1 = :chkPay1"),
    @NamedQuery(name = "Cust.findByPayDays", query = "SELECT c FROM Cust c WHERE c.payDays = :payDays"),
    @NamedQuery(name = "Cust.findByPayFlag", query = "SELECT c FROM Cust c WHERE c.payFlag = :payFlag"),
    @NamedQuery(name = "Cust.findByChkPay2", query = "SELECT c FROM Cust c WHERE c.chkPay2 = :chkPay2"),
    @NamedQuery(name = "Cust.findByChkPay3", query = "SELECT c FROM Cust c WHERE c.chkPay3 = :chkPay3"),
    @NamedQuery(name = "Cust.findByAmtnMaxPay", query = "SELECT c FROM Cust c WHERE c.amtnMaxPay = :amtnMaxPay"),
    @NamedQuery(name = "Cust.findByChkQk", query = "SELECT c FROM Cust c WHERE c.chkQk = :chkQk"),
    @NamedQuery(name = "Cust.findByAmtnQk", query = "SELECT c FROM Cust c WHERE c.amtnQk = :amtnQk"),
    @NamedQuery(name = "Cust.findByUsr1", query = "SELECT c FROM Cust c WHERE c.usr1 = :usr1"),
    @NamedQuery(name = "Cust.findBySysDate", query = "SELECT c FROM Cust c WHERE c.sysDate = :sysDate"),
    @NamedQuery(name = "Cust.findByRtoDiscnt", query = "SELECT c FROM Cust c WHERE c.rtoDiscnt = :rtoDiscnt"),
    @NamedQuery(name = "Cust.findByChkIrp2", query = "SELECT c FROM Cust c WHERE c.chkIrp2 = :chkIrp2"),
    @NamedQuery(name = "Cust.findByLogon", query = "SELECT c FROM Cust c WHERE c.logon = :logon"),
    @NamedQuery(name = "Cust.findByWhNo", query = "SELECT c FROM Cust c WHERE c.whNo = :whNo"),
    @NamedQuery(name = "Cust.findByStopOrder", query = "SELECT c FROM Cust c WHERE c.stopOrder = :stopOrder"),
    @NamedQuery(name = "Cust.findByRtnCtrl", query = "SELECT c FROM Cust c WHERE c.rtnCtrl = :rtnCtrl"),
    @NamedQuery(name = "Cust.findByDrpId", query = "SELECT c FROM Cust c WHERE c.drpId = :drpId"),
    @NamedQuery(name = "Cust.findByUpr4Id", query = "SELECT c FROM Cust c WHERE c.upr4Id = :upr4Id"),
    @NamedQuery(name = "Cust.findByYhWh1", query = "SELECT c FROM Cust c WHERE c.yhWh1 = :yhWh1"),
    @NamedQuery(name = "Cust.findByYhWh2", query = "SELECT c FROM Cust c WHERE c.yhWh2 = :yhWh2"),
    @NamedQuery(name = "Cust.findByAccNoIr", query = "SELECT c FROM Cust c WHERE c.accNoIr = :accNoIr"),
    @NamedQuery(name = "Cust.findByAccNoIp", query = "SELECT c FROM Cust c WHERE c.accNoIp = :accNoIp"),
    @NamedQuery(name = "Cust.findByB2cId", query = "SELECT c FROM Cust c WHERE c.b2cId = :b2cId"),
    @NamedQuery(name = "Cust.findByPrtweeksPo", query = "SELECT c FROM Cust c WHERE c.prtweeksPo = :prtweeksPo"),
    @NamedQuery(name = "Cust.findBySoweeksPo", query = "SELECT c FROM Cust c WHERE c.soweeksPo = :soweeksPo"),
    @NamedQuery(name = "Cust.findByLangId", query = "SELECT c FROM Cust c WHERE c.langId = :langId"),
    @NamedQuery(name = "Cust.findByChkDrp1", query = "SELECT c FROM Cust c WHERE c.chkDrp1 = :chkDrp1"),
    @NamedQuery(name = "Cust.findByChkDrp2", query = "SELECT c FROM Cust c WHERE c.chkDrp2 = :chkDrp2"),
    @NamedQuery(name = "Cust.findByChkDrp3", query = "SELECT c FROM Cust c WHERE c.chkDrp3 = :chkDrp3"),
    @NamedQuery(name = "Cust.findBySrvNo", query = "SELECT c FROM Cust c WHERE c.srvNo = :srvNo"),
    @NamedQuery(name = "Cust.findByCusIdx", query = "SELECT c FROM Cust c WHERE c.cusIdx = :cusIdx"),
    @NamedQuery(name = "Cust.findByXnNo", query = "SELECT c FROM Cust c WHERE c.xnNo = :xnNo"),
    @NamedQuery(name = "Cust.findByCwork", query = "SELECT c FROM Cust c WHERE c.cwork = :cwork"),
    @NamedQuery(name = "Cust.findByChkBarcode", query = "SELECT c FROM Cust c WHERE c.chkBarcode = :chkBarcode"),
    @NamedQuery(name = "Cust.findByAccNoZp", query = "SELECT c FROM Cust c WHERE c.accNoZp = :accNoZp"),
    @NamedQuery(name = "Cust.findByHmId", query = "SELECT c FROM Cust c WHERE c.hmId = :hmId"),
    @NamedQuery(name = "Cust.findByPswdPay", query = "SELECT c FROM Cust c WHERE c.pswdPay = :pswdPay"),
    @NamedQuery(name = "Cust.findByAmtnFl", query = "SELECT c FROM Cust c WHERE c.amtnFl = :amtnFl"),
    @NamedQuery(name = "Cust.findByAmtnFled", query = "SELECT c FROM Cust c WHERE c.amtnFled = :amtnFled"),
    @NamedQuery(name = "Cust.findByChkSbrto", query = "SELECT c FROM Cust c WHERE c.chkSbrto = :chkSbrto"),
    @NamedQuery(name = "Cust.findByDeproNo", query = "SELECT c FROM Cust c WHERE c.deproNo = :deproNo"),
    @NamedQuery(name = "Cust.findByRtoFqsk", query = "SELECT c FROM Cust c WHERE c.rtoFqsk = :rtoFqsk"),
    @NamedQuery(name = "Cust.findByDateflagFqsk", query = "SELECT c FROM Cust c WHERE c.dateflagFqsk = :dateflagFqsk"),
    @NamedQuery(name = "Cust.findByDateFqsk", query = "SELECT c FROM Cust c WHERE c.dateFqsk = :dateFqsk"),
    @NamedQuery(name = "Cust.findByQsFqsk", query = "SELECT c FROM Cust c WHERE c.qsFqsk = :qsFqsk"),
    @NamedQuery(name = "Cust.findByLocalId", query = "SELECT c FROM Cust c WHERE c.localId = :localId"),
    @NamedQuery(name = "Cust.findByRuleId", query = "SELECT c FROM Cust c WHERE c.ruleId = :ruleId"),
    @NamedQuery(name = "Cust.findByTel1Code", query = "SELECT c FROM Cust c WHERE c.tel1Code = :tel1Code"),
    @NamedQuery(name = "Cust.findByUniNo2", query = "SELECT c FROM Cust c WHERE c.uniNo2 = :uniNo2"),
    @NamedQuery(name = "Cust.findByFpName2", query = "SELECT c FROM Cust c WHERE c.fpName2 = :fpName2"),
    @NamedQuery(name = "Cust.findByCodeName", query = "SELECT c FROM Cust c WHERE c.codeName = :codeName"),
    @NamedQuery(name = "Cust.findByChkKd", query = "SELECT c FROM Cust c WHERE c.chkKd = :chkKd"),
    @NamedQuery(name = "Cust.findByWsCusNo", query = "SELECT c FROM Cust c WHERE c.wsCusNo = :wsCusNo"),
    @NamedQuery(name = "Cust.findByAutoCasnChk", query = "SELECT c FROM Cust c WHERE c.autoCasnChk = :autoCasnChk"),
    @NamedQuery(name = "Cust.findByNsrCode", query = "SELECT c FROM Cust c WHERE c.nsrCode = :nsrCode"),
    @NamedQuery(name = "Cust.findByNamePy", query = "SELECT c FROM Cust c WHERE c.namePy = :namePy"),
    @NamedQuery(name = "Cust.findByBizDsc1", query = "SELECT c FROM Cust c WHERE c.bizDsc1 = :bizDsc1"),
    @NamedQuery(name = "Cust.findByCusSrc", query = "SELECT c FROM Cust c WHERE c.cusSrc = :cusSrc"),
    @NamedQuery(name = "Cust.findByAccNoAr2", query = "SELECT c FROM Cust c WHERE c.accNoAr2 = :accNoAr2"),
    @NamedQuery(name = "Cust.findByAccNoAp2", query = "SELECT c FROM Cust c WHERE c.accNoAp2 = :accNoAp2"),
    @NamedQuery(name = "Cust.findByVisitLimit", query = "SELECT c FROM Cust c WHERE c.visitLimit = :visitLimit"),
    @NamedQuery(name = "Cust.findByBbDd", query = "SELECT c FROM Cust c WHERE c.bbDd = :bbDd"),
    @NamedQuery(name = "Cust.findBySoDd", query = "SELECT c FROM Cust c WHERE c.soDd = :soDd"),
    @NamedQuery(name = "Cust.findByMobId", query = "SELECT c FROM Cust c WHERE c.mobId = :mobId"),
    @NamedQuery(name = "Cust.findByTtTypeSet", query = "SELECT c FROM Cust c WHERE c.ttTypeSet = :ttTypeSet"),
    @NamedQuery(name = "Cust.findByExTrdId", query = "SELECT c FROM Cust c WHERE c.exTrdId = :exTrdId"),
    @NamedQuery(name = "Cust.findByImTrdId", query = "SELECT c FROM Cust c WHERE c.imTrdId = :imTrdId"),
    @NamedQuery(name = "Cust.findByCusNoKd", query = "SELECT c FROM Cust c WHERE c.cusNoKd = :cusNoKd"),
    @NamedQuery(name = "Cust.findByChkZhangId2", query = "SELECT c FROM Cust c WHERE c.chkZhangId2 = :chkZhangId2"),
    @NamedQuery(name = "Cust.findByPjsqWh", query = "SELECT c FROM Cust c WHERE c.pjsqWh = :pjsqWh"),
    @NamedQuery(name = "Cust.findByJdNo", query = "SELECT c FROM Cust c WHERE c.jdNo = :jdNo"),
    @NamedQuery(name = "Cust.findByFpType", query = "SELECT c FROM Cust c WHERE c.fpType = :fpType"),
    @NamedQuery(name = "Cust.findByChkCx", query = "SELECT c FROM Cust c WHERE c.chkCx = :chkCx"),
    @NamedQuery(name = "Cust.findByChkMinXf", query = "SELECT c FROM Cust c WHERE c.chkMinXf = :chkMinXf"),
    @NamedQuery(name = "Cust.findByBilMinXf", query = "SELECT c FROM Cust c WHERE c.bilMinXf = :bilMinXf"),
    @NamedQuery(name = "Cust.findByChkTypeMinxf", query = "SELECT c FROM Cust c WHERE c.chkTypeMinxf = :chkTypeMinxf"),
    @NamedQuery(name = "Cust.findByAmtnMinXf", query = "SELECT c FROM Cust c WHERE c.amtnMinXf = :amtnMinXf"),
    @NamedQuery(name = "Cust.findByRemS", query = "SELECT c FROM Cust c WHERE c.remS = :remS")})
public class Cust implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUS_NO")
    private String cusNo;
    @Column(name = "IDX2")
    private String idx2;
    @Column(name = "CUS_ARE")
    private String cusAre;
    @Column(name = "MAS_CUS")
    private String masCus;
    @Column(name = "OBJ_ID")
    private String objId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SNM")
    private String snm;
    @Lob
    @Column(name = "NM_ENG", columnDefinition = "text")
    private String nmEng;
    @Column(name = "PAY_DD")
    private Short payDd;
    @Column(name = "CLS_MTH")
    private String clsMth;
    @Column(name = "CLS_DD")
    private Short clsDd;
    @Column(name = "MM_END")
    private Short mmEnd;
    @Column(name = "CHK_DD")
    private Short chkDd;
    @Column(name = "UNI_NO")
    private String uniNo;
    @Column(name = "BOS_NM")
    private String bosNm;
    @Column(name = "CNT_JOB1")
    private String cntJob1;
    @Column(name = "CNT_MAN1")
    private String cntMan1;
    @Column(name = "CNT_JOB2")
    private String cntJob2;
    @Column(name = "CNT_MAN2")
    private String cntMan2;
    @Column(name = "ACC_MAN")
    private String accMan;
    @Column(name = "SAL")
    private String sal;
    @Column(name = "TEL1")
    private String tel1;
    @Column(name = "TEL2")
    private String tel2;
    @Column(name = "FAX")
    private String fax;
    @Lob
    @Column(name = "ADR1", columnDefinition = "text")
    private String adr1;
    @Lob
    @Column(name = "ADR2", columnDefinition = "text")
    private String adr2;
    @Lob
    @Column(name = "ADR_ENG", columnDefinition = "text")
    private String adrEng;
    @Column(name = "ZIP")
    private String zip;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIM_NR")
    private BigDecimal limNr;
    @Column(name = "LIM_NC")
    private BigDecimal limNc;
    @Column(name = "CRD_ID")
    private String crdId;
    @Column(name = "INV_ID")
    private String invId;
    @Column(name = "ID1_TAX")
    private String id1Tax;
    @Column(name = "ID2_TAX")
    private String id2Tax;
    @Column(name = "CLS1")
    private String cls1;
    @Column(name = "CLS2")
    private String cls2;
    @Column(name = "STR_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date strDd;
    @Column(name = "END_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDd;
    @Column(name = "CUR")
    private String cur;
    @Column(name = "CRD_NR_NC")
    private String crdNrNc;
    @Lob
    @Column(name = "REM", columnDefinition = "text")
    private String rem;
    @Column(name = "E_MAIL")
    private String eMail;
    @Column(name = "SEND_MTH")
    private String sendMth;
    @Column(name = "SEND_WH")
    private String sendWh;
    @Column(name = "BNK_NAME")
    private String bnkName;
    @Column(name = "ID_CODE")
    private String idCode;
    @Column(name = "CUS_LEVEL")
    private String cusLevel;
    @Column(name = "INC_CHECK")
    private String incCheck;
    @Column(name = "LS_RTO")
    private BigDecimal lsRto;
    @Column(name = "COMPNET")
    private String compnet;
    @Column(name = "COMP_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date compDd;
    @Column(name = "CAPSUM")
    private BigDecimal capsum;
    @Column(name = "BUSISUM")
    private BigDecimal busisum;
    @Column(name = "SALMS")
    private Integer salms;
    @Column(name = "BUSINOTE")
    private String businote;
    @Lob
    @Column(name = "WORKITM", columnDefinition = "text")
    private String workitm;
    /*
    @Lob
    @Column(name = "MAIN_PRD")
    private String mainPrd;
    */
    @Column(name = "CHK_CRD")
    private String chkCrd;
    @Column(name = "S_FLAG")
    private String sFlag;
    @Column(name = "INITNUM")
    private BigDecimal initnum;
    @Column(name = "NOTIFY")
    private String notify;
    @Column(name = "BROKER")
    private String broker;
    @Column(name = "VESSEL")
    private String vessel;
    @Column(name = "LOADING_PORT")
    private String loadingPort;
    @Column(name = "DIS_PORT")
    private String disPort;
    @Column(name = "MANU_PLACE")
    private String manuPlace;
    @Column(name = "EPAPER")
    private String epaper;
    @Column(name = "TRAN_REC")
    private String tranRec;
    @Column(name = "PSWD")
    private String pswd;
    @Column(name = "PSWD_HIT")
    private String pswdHit;
    @Column(name = "PSWD_ANS")
    private String pswdAns;
    @Column(name = "APPLY_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date applyDd;
    @Column(name = "BIZ_DSC")
    private String bizDsc;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "BANK_NO")
    private String bankNo;
    @Column(name = "ACC_NO_AR")
    private String accNoAr;
    @Column(name = "ACC_NO_AP")
    private String accNoAp;
    @Column(name = "ACC_NO_R0")
    private String accNoR0;
    @Column(name = "ACC_NO_P0")
    private String accNoP0;
    @Column(name = "SO_CRD")
    private String soCrd;
    @Column(name = "FP_NAME")
    private String fpName;
    @Column(name = "CHK_FAX")
    private String chkFax;
    @Column(name = "RTO_TAX")
    private BigDecimal rtoTax;
    @Column(name = "CHK_CUS_IDX")
    private String chkCusIdx;
    @Column(name = "CY_ID")
    private String cyId;
    @Column(name = "REGIST_CODE")
    private String registCode;
    @Column(name = "CORP_ID")
    private String corpId;
    @Column(name = "M_CUST")
    private String mCust;
    @Column(name = "SAL_NO")
    private String salNo;
    @Column(name = "CHK_DEP")
    private String chkDep;
    @Column(name = "RTO_KK")
    private BigDecimal rtoKk;
    @Column(name = "DEP")
    private String dep;
    @Column(name = "RTO_FL")
    private BigDecimal rtoFl;
    @Column(name = "RTO_YL")
    private BigDecimal rtoYl;
    @Column(name = "DEP1")
    private String dep1;
    @Column(name = "USR")
    private String usr;
    @Column(name = "CHK_INCLUDE")
    private String chkInclude;
    @Column(name = "CHK_IRP")
    private String chkIrp;
    @Column(name = "CHK_TRP")
    private String chkTrp;
    @Column(name = "CHK_MAN")
    private String chkMan;
    @Column(name = "CLS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clsDate;
    @Column(name = "CHK_PAY1")
    private String chkPay1;
    @Column(name = "PAY_DAYS")
    private Short payDays;
    @Column(name = "PAY_FLAG")
    private String payFlag;
    @Column(name = "CHK_PAY2")
    private String chkPay2;
    @Column(name = "CHK_PAY3")
    private String chkPay3;
    @Column(name = "AMTN_MAX_PAY")
    private BigDecimal amtnMaxPay;
    @Column(name = "CHK_QK")
    private String chkQk;
    @Column(name = "AMTN_QK")
    private BigDecimal amtnQk;
    @Column(name = "USR1")
    private String usr1;
    @Column(name = "SYS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sysDate;
    @Column(name = "RTO_DISCNT")
    private BigDecimal rtoDiscnt;
    @Column(name = "CHK_IRP2")
    private String chkIrp2;
    @Column(name = "LOGON")
    private String logon;
    @Column(name = "WH_NO")
    private String whNo;
    @Column(name = "STOP_ORDER")
    private String stopOrder;
    @Column(name = "RTN_CTRL")
    private String rtnCtrl;
    @Column(name = "DRP_ID")
    private String drpId;
    @Column(name = "UPR4_ID")
    private String upr4Id;
    @Column(name = "YH_WH1")
    private String yhWh1;
    @Column(name = "YH_WH2")
    private String yhWh2;
    @Column(name = "ACC_NO_IR")
    private String accNoIr;
    @Column(name = "ACC_NO_IP")
    private String accNoIp;
    @Column(name = "B2C_ID")
    private String b2cId;
    // @Lob
    @Column(name = "UP_DD", columnDefinition = "timestamp")
    private byte[] upDd;
    @Column(name = "PRTWEEKS_PO")
    private Short prtweeksPo;
    @Column(name = "SOWEEKS_PO")
    private Short soweeksPo;
    @Column(name = "LANG_ID")
    private String langId;
    @Column(name = "CHK_DRP1")
    private String chkDrp1;
    @Column(name = "CHK_DRP2")
    private String chkDrp2;
    @Column(name = "CHK_DRP3")
    private String chkDrp3;
    @Column(name = "SRV_NO")
    private String srvNo;
    @Column(name = "CUS_IDX")
    private String cusIdx;
    @Column(name = "XN_NO")
    private String xnNo;
    @Column(name = "CWORK")
    private Integer cwork;
    @Column(name = "CHK_BARCODE")
    private String chkBarcode;
    @Column(name = "ACC_NO_ZP")
    private String accNoZp;
    @Column(name = "HM_ID")
    private String hmId;
    @Column(name = "PSWD_PAY")
    private String pswdPay;
    @Column(name = "AMTN_FL")
    private BigDecimal amtnFl;
    @Column(name = "AMTN_FLED")
    private BigDecimal amtnFled;
    @Column(name = "CHK_SBRTO")
    private String chkSbrto;
    @Column(name = "DEPRO_NO")
    private String deproNo;
    @Column(name = "RTO_FQSK")
    private BigDecimal rtoFqsk;
    @Column(name = "DATEFLAG_FQSK")
    private String dateflagFqsk;
    @Column(name = "DATE_FQSK")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFqsk;
    @Column(name = "QS_FQSK")
    private Integer qsFqsk;
    @Column(name = "LOCAL_ID")
    private String localId;
    @Column(name = "RULE_ID")
    private Integer ruleId;
    @Column(name = "TEL1_CODE")
    private String tel1Code;
    @Column(name = "UNI_NO2")
    private String uniNo2;
    @Column(name = "FP_NAME2")
    private String fpName2;
    @Column(name = "CODE_NAME")
    private String codeName;
    @Column(name = "CHK_KD")
    private String chkKd;
    @Column(name = "WS_CUS_NO")
    private String wsCusNo;
    @Column(name = "AUTO_CASN_CHK")
    private String autoCasnChk;
    @Column(name = "NSR_CODE")
    private String nsrCode;
    @Column(name = "NAME_PY")
    private String namePy;
    @Column(name = "BIZ_DSC1")
    private String bizDsc1;
    @Column(name = "CUS_SRC")
    private String cusSrc;
    @Column(name = "ACC_NO_AR2")
    private String accNoAr2;
    @Column(name = "ACC_NO_AP2")
    private String accNoAp2;
    @Column(name = "VISIT_LIMIT")
    private Integer visitLimit;
    @Column(name = "BB_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bbDd;
    @Column(name = "SO_DD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date soDd;
    @Column(name = "MOB_ID")
    private String mobId;
    @Column(name = "TT_TYPE_SET")
    private String ttTypeSet;
    @Column(name = "EX_TRD_ID")
    private String exTrdId;
    @Column(name = "IM_TRD_ID")
    private String imTrdId;
    @Column(name = "CUS_NO_KD")
    private String cusNoKd;
    @Column(name = "CHK_ZHANG_ID2")
    private String chkZhangId2;
    @Column(name = "PJSQ_WH")
    private String pjsqWh;
    @Column(name = "JD_NO")
    private String jdNo;
    @Column(name = "FP_TYPE")
    private String fpType;
    @Column(name = "CHK_CX")
    private String chkCx;
    @Column(name = "CHK_MIN_XF")
    private String chkMinXf;
    @Column(name = "BIL_MIN_XF")
    private String bilMinXf;
    @Column(name = "CHK_TYPE_MINXF")
    private String chkTypeMinxf;
    @Column(name = "AMTN_MIN_XF")
    private BigDecimal amtnMinXf;
    @Column(name = "REM_S")
    private String remS;
    @JoinColumn(name = "CARD_NO", referencedColumnName = "CARD_NO")
    @ManyToOne
    private Poscard cardNo;

    public Cust() {
    }

    public Cust(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getIdx2() {
        return idx2;
    }

    public void setIdx2(String idx2) {
        this.idx2 = idx2;
    }

    public String getCusAre() {
        return cusAre;
    }

    public void setCusAre(String cusAre) {
        this.cusAre = cusAre;
    }

    public String getMasCus() {
        return masCus;
    }

    public void setMasCus(String masCus) {
        this.masCus = masCus;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnm() {
        return snm;
    }

    public void setSnm(String snm) {
        this.snm = snm;
    }

    public String getNmEng() {
        return nmEng;
    }

    public void setNmEng(String nmEng) {
        this.nmEng = nmEng;
    }

    public Short getPayDd() {
        return payDd;
    }

    public void setPayDd(Short payDd) {
        this.payDd = payDd;
    }

    public String getClsMth() {
        return clsMth;
    }

    public void setClsMth(String clsMth) {
        this.clsMth = clsMth;
    }

    public Short getClsDd() {
        return clsDd;
    }

    public void setClsDd(Short clsDd) {
        this.clsDd = clsDd;
    }

    public Short getMmEnd() {
        return mmEnd;
    }

    public void setMmEnd(Short mmEnd) {
        this.mmEnd = mmEnd;
    }

    public Short getChkDd() {
        return chkDd;
    }

    public void setChkDd(Short chkDd) {
        this.chkDd = chkDd;
    }

    public String getUniNo() {
        return uniNo;
    }

    public void setUniNo(String uniNo) {
        this.uniNo = uniNo;
    }

    public String getBosNm() {
        return bosNm;
    }

    public void setBosNm(String bosNm) {
        this.bosNm = bosNm;
    }

    public String getCntJob1() {
        return cntJob1;
    }

    public void setCntJob1(String cntJob1) {
        this.cntJob1 = cntJob1;
    }

    public String getCntMan1() {
        return cntMan1;
    }

    public void setCntMan1(String cntMan1) {
        this.cntMan1 = cntMan1;
    }

    public String getCntJob2() {
        return cntJob2;
    }

    public void setCntJob2(String cntJob2) {
        this.cntJob2 = cntJob2;
    }

    public String getCntMan2() {
        return cntMan2;
    }

    public void setCntMan2(String cntMan2) {
        this.cntMan2 = cntMan2;
    }

    public String getAccMan() {
        return accMan;
    }

    public void setAccMan(String accMan) {
        this.accMan = accMan;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAdr1() {
        return adr1;
    }

    public void setAdr1(String adr1) {
        this.adr1 = adr1;
    }

    public String getAdr2() {
        return adr2;
    }

    public void setAdr2(String adr2) {
        this.adr2 = adr2;
    }

    public String getAdrEng() {
        return adrEng;
    }

    public void setAdrEng(String adrEng) {
        this.adrEng = adrEng;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public BigDecimal getLimNr() {
        return limNr;
    }

    public void setLimNr(BigDecimal limNr) {
        this.limNr = limNr;
    }

    public BigDecimal getLimNc() {
        return limNc;
    }

    public void setLimNc(BigDecimal limNc) {
        this.limNc = limNc;
    }

    public String getCrdId() {
        return crdId;
    }

    public void setCrdId(String crdId) {
        this.crdId = crdId;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public String getId1Tax() {
        return id1Tax;
    }

    public void setId1Tax(String id1Tax) {
        this.id1Tax = id1Tax;
    }

    public String getId2Tax() {
        return id2Tax;
    }

    public void setId2Tax(String id2Tax) {
        this.id2Tax = id2Tax;
    }

    public String getCls1() {
        return cls1;
    }

    public void setCls1(String cls1) {
        this.cls1 = cls1;
    }

    public String getCls2() {
        return cls2;
    }

    public void setCls2(String cls2) {
        this.cls2 = cls2;
    }

    public Date getStrDd() {
        return strDd;
    }

    public void setStrDd(Date strDd) {
        this.strDd = strDd;
    }

    public Date getEndDd() {
        return endDd;
    }

    public void setEndDd(Date endDd) {
        this.endDd = endDd;
    }

    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public String getCrdNrNc() {
        return crdNrNc;
    }

    public void setCrdNrNc(String crdNrNc) {
        this.crdNrNc = crdNrNc;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSendMth() {
        return sendMth;
    }

    public void setSendMth(String sendMth) {
        this.sendMth = sendMth;
    }

    public String getSendWh() {
        return sendWh;
    }

    public void setSendWh(String sendWh) {
        this.sendWh = sendWh;
    }

    public String getBnkName() {
        return bnkName;
    }

    public void setBnkName(String bnkName) {
        this.bnkName = bnkName;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCusLevel() {
        return cusLevel;
    }

    public void setCusLevel(String cusLevel) {
        this.cusLevel = cusLevel;
    }

    public String getIncCheck() {
        return incCheck;
    }

    public void setIncCheck(String incCheck) {
        this.incCheck = incCheck;
    }

    public BigDecimal getLsRto() {
        return lsRto;
    }

    public void setLsRto(BigDecimal lsRto) {
        this.lsRto = lsRto;
    }

    public String getCompnet() {
        return compnet;
    }

    public void setCompnet(String compnet) {
        this.compnet = compnet;
    }

    public Date getCompDd() {
        return compDd;
    }

    public void setCompDd(Date compDd) {
        this.compDd = compDd;
    }

    public BigDecimal getCapsum() {
        return capsum;
    }

    public void setCapsum(BigDecimal capsum) {
        this.capsum = capsum;
    }

    public BigDecimal getBusisum() {
        return busisum;
    }

    public void setBusisum(BigDecimal busisum) {
        this.busisum = busisum;
    }

    public Integer getSalms() {
        return salms;
    }

    public void setSalms(Integer salms) {
        this.salms = salms;
    }

    public String getBusinote() {
        return businote;
    }

    public void setBusinote(String businote) {
        this.businote = businote;
    }

    public String getWorkitm() {
        return workitm;
    }

    public void setWorkitm(String workitm) {
        this.workitm = workitm;
    }
/*
    public String getMainPrd() {
        return mainPrd;
    }

    public void setMainPrd(String mainPrd) {
        this.mainPrd = mainPrd;
    }
*/
    public String getChkCrd() {
        return chkCrd;
    }

    public void setChkCrd(String chkCrd) {
        this.chkCrd = chkCrd;
    }

    public String getSFlag() {
        return sFlag;
    }

    public void setSFlag(String sFlag) {
        this.sFlag = sFlag;
    }

    public BigDecimal getInitnum() {
        return initnum;
    }

    public void setInitnum(BigDecimal initnum) {
        this.initnum = initnum;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public String getLoadingPort() {
        return loadingPort;
    }

    public void setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
    }

    public String getDisPort() {
        return disPort;
    }

    public void setDisPort(String disPort) {
        this.disPort = disPort;
    }

    public String getManuPlace() {
        return manuPlace;
    }

    public void setManuPlace(String manuPlace) {
        this.manuPlace = manuPlace;
    }

    public String getEpaper() {
        return epaper;
    }

    public void setEpaper(String epaper) {
        this.epaper = epaper;
    }

    public String getTranRec() {
        return tranRec;
    }

    public void setTranRec(String tranRec) {
        this.tranRec = tranRec;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getPswdHit() {
        return pswdHit;
    }

    public void setPswdHit(String pswdHit) {
        this.pswdHit = pswdHit;
    }

    public String getPswdAns() {
        return pswdAns;
    }

    public void setPswdAns(String pswdAns) {
        this.pswdAns = pswdAns;
    }

    public Date getApplyDd() {
        return applyDd;
    }

    public void setApplyDd(Date applyDd) {
        this.applyDd = applyDd;
    }

    public String getBizDsc() {
        return bizDsc;
    }

    public void setBizDsc(String bizDsc) {
        this.bizDsc = bizDsc;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getAccNoAr() {
        return accNoAr;
    }

    public void setAccNoAr(String accNoAr) {
        this.accNoAr = accNoAr;
    }

    public String getAccNoAp() {
        return accNoAp;
    }

    public void setAccNoAp(String accNoAp) {
        this.accNoAp = accNoAp;
    }

    public String getAccNoR0() {
        return accNoR0;
    }

    public void setAccNoR0(String accNoR0) {
        this.accNoR0 = accNoR0;
    }

    public String getAccNoP0() {
        return accNoP0;
    }

    public void setAccNoP0(String accNoP0) {
        this.accNoP0 = accNoP0;
    }

    public String getSoCrd() {
        return soCrd;
    }

    public void setSoCrd(String soCrd) {
        this.soCrd = soCrd;
    }

    public String getFpName() {
        return fpName;
    }

    public void setFpName(String fpName) {
        this.fpName = fpName;
    }

    public String getChkFax() {
        return chkFax;
    }

    public void setChkFax(String chkFax) {
        this.chkFax = chkFax;
    }

    public BigDecimal getRtoTax() {
        return rtoTax;
    }

    public void setRtoTax(BigDecimal rtoTax) {
        this.rtoTax = rtoTax;
    }

    public String getChkCusIdx() {
        return chkCusIdx;
    }

    public void setChkCusIdx(String chkCusIdx) {
        this.chkCusIdx = chkCusIdx;
    }

    public String getCyId() {
        return cyId;
    }

    public void setCyId(String cyId) {
        this.cyId = cyId;
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getMCust() {
        return mCust;
    }

    public void setMCust(String mCust) {
        this.mCust = mCust;
    }

    public String getSalNo() {
        return salNo;
    }

    public void setSalNo(String salNo) {
        this.salNo = salNo;
    }

    public String getChkDep() {
        return chkDep;
    }

    public void setChkDep(String chkDep) {
        this.chkDep = chkDep;
    }

    public BigDecimal getRtoKk() {
        return rtoKk;
    }

    public void setRtoKk(BigDecimal rtoKk) {
        this.rtoKk = rtoKk;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public BigDecimal getRtoFl() {
        return rtoFl;
    }

    public void setRtoFl(BigDecimal rtoFl) {
        this.rtoFl = rtoFl;
    }

    public BigDecimal getRtoYl() {
        return rtoYl;
    }

    public void setRtoYl(BigDecimal rtoYl) {
        this.rtoYl = rtoYl;
    }

    public String getDep1() {
        return dep1;
    }

    public void setDep1(String dep1) {
        this.dep1 = dep1;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getChkInclude() {
        return chkInclude;
    }

    public void setChkInclude(String chkInclude) {
        this.chkInclude = chkInclude;
    }

    public String getChkIrp() {
        return chkIrp;
    }

    public void setChkIrp(String chkIrp) {
        this.chkIrp = chkIrp;
    }

    public String getChkTrp() {
        return chkTrp;
    }

    public void setChkTrp(String chkTrp) {
        this.chkTrp = chkTrp;
    }

    public String getChkMan() {
        return chkMan;
    }

    public void setChkMan(String chkMan) {
        this.chkMan = chkMan;
    }

    public Date getClsDate() {
        return clsDate;
    }

    public void setClsDate(Date clsDate) {
        this.clsDate = clsDate;
    }

    public String getChkPay1() {
        return chkPay1;
    }

    public void setChkPay1(String chkPay1) {
        this.chkPay1 = chkPay1;
    }

    public Short getPayDays() {
        return payDays;
    }

    public void setPayDays(Short payDays) {
        this.payDays = payDays;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getChkPay2() {
        return chkPay2;
    }

    public void setChkPay2(String chkPay2) {
        this.chkPay2 = chkPay2;
    }

    public String getChkPay3() {
        return chkPay3;
    }

    public void setChkPay3(String chkPay3) {
        this.chkPay3 = chkPay3;
    }

    public BigDecimal getAmtnMaxPay() {
        return amtnMaxPay;
    }

    public void setAmtnMaxPay(BigDecimal amtnMaxPay) {
        this.amtnMaxPay = amtnMaxPay;
    }

    public String getChkQk() {
        return chkQk;
    }

    public void setChkQk(String chkQk) {
        this.chkQk = chkQk;
    }

    public BigDecimal getAmtnQk() {
        return amtnQk;
    }

    public void setAmtnQk(BigDecimal amtnQk) {
        this.amtnQk = amtnQk;
    }

    public String getUsr1() {
        return usr1;
    }

    public void setUsr1(String usr1) {
        this.usr1 = usr1;
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public BigDecimal getRtoDiscnt() {
        return rtoDiscnt;
    }

    public void setRtoDiscnt(BigDecimal rtoDiscnt) {
        this.rtoDiscnt = rtoDiscnt;
    }

    public String getChkIrp2() {
        return chkIrp2;
    }

    public void setChkIrp2(String chkIrp2) {
        this.chkIrp2 = chkIrp2;
    }

    public String getLogon() {
        return logon;
    }

    public void setLogon(String logon) {
        this.logon = logon;
    }

    public String getWhNo() {
        return whNo;
    }

    public void setWhNo(String whNo) {
        this.whNo = whNo;
    }

    public String getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(String stopOrder) {
        this.stopOrder = stopOrder;
    }

    public String getRtnCtrl() {
        return rtnCtrl;
    }

    public void setRtnCtrl(String rtnCtrl) {
        this.rtnCtrl = rtnCtrl;
    }

    public String getDrpId() {
        return drpId;
    }

    public void setDrpId(String drpId) {
        this.drpId = drpId;
    }

    public String getUpr4Id() {
        return upr4Id;
    }

    public void setUpr4Id(String upr4Id) {
        this.upr4Id = upr4Id;
    }

    public String getYhWh1() {
        return yhWh1;
    }

    public void setYhWh1(String yhWh1) {
        this.yhWh1 = yhWh1;
    }

    public String getYhWh2() {
        return yhWh2;
    }

    public void setYhWh2(String yhWh2) {
        this.yhWh2 = yhWh2;
    }

    public String getAccNoIr() {
        return accNoIr;
    }

    public void setAccNoIr(String accNoIr) {
        this.accNoIr = accNoIr;
    }

    public String getAccNoIp() {
        return accNoIp;
    }

    public void setAccNoIp(String accNoIp) {
        this.accNoIp = accNoIp;
    }

    public String getB2cId() {
        return b2cId;
    }

    public void setB2cId(String b2cId) {
        this.b2cId = b2cId;
    }

    public byte[] getUpDd() {
        return upDd;
    }

    public void setUpDd(byte[] upDd) {
        this.upDd = upDd;
    }

    public Short getPrtweeksPo() {
        return prtweeksPo;
    }

    public void setPrtweeksPo(Short prtweeksPo) {
        this.prtweeksPo = prtweeksPo;
    }

    public Short getSoweeksPo() {
        return soweeksPo;
    }

    public void setSoweeksPo(Short soweeksPo) {
        this.soweeksPo = soweeksPo;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getChkDrp1() {
        return chkDrp1;
    }

    public void setChkDrp1(String chkDrp1) {
        this.chkDrp1 = chkDrp1;
    }

    public String getChkDrp2() {
        return chkDrp2;
    }

    public void setChkDrp2(String chkDrp2) {
        this.chkDrp2 = chkDrp2;
    }

    public String getChkDrp3() {
        return chkDrp3;
    }

    public void setChkDrp3(String chkDrp3) {
        this.chkDrp3 = chkDrp3;
    }

    public String getSrvNo() {
        return srvNo;
    }

    public void setSrvNo(String srvNo) {
        this.srvNo = srvNo;
    }

    public String getCusIdx() {
        return cusIdx;
    }

    public void setCusIdx(String cusIdx) {
        this.cusIdx = cusIdx;
    }

    public String getXnNo() {
        return xnNo;
    }

    public void setXnNo(String xnNo) {
        this.xnNo = xnNo;
    }

    public Integer getCwork() {
        return cwork;
    }

    public void setCwork(Integer cwork) {
        this.cwork = cwork;
    }

    public String getChkBarcode() {
        return chkBarcode;
    }

    public void setChkBarcode(String chkBarcode) {
        this.chkBarcode = chkBarcode;
    }

    public String getAccNoZp() {
        return accNoZp;
    }

    public void setAccNoZp(String accNoZp) {
        this.accNoZp = accNoZp;
    }

    public String getHmId() {
        return hmId;
    }

    public void setHmId(String hmId) {
        this.hmId = hmId;
    }

    public String getPswdPay() {
        return pswdPay;
    }

    public void setPswdPay(String pswdPay) {
        this.pswdPay = pswdPay;
    }

    public BigDecimal getAmtnFl() {
        return amtnFl;
    }

    public void setAmtnFl(BigDecimal amtnFl) {
        this.amtnFl = amtnFl;
    }

    public BigDecimal getAmtnFled() {
        return amtnFled;
    }

    public void setAmtnFled(BigDecimal amtnFled) {
        this.amtnFled = amtnFled;
    }

    public String getChkSbrto() {
        return chkSbrto;
    }

    public void setChkSbrto(String chkSbrto) {
        this.chkSbrto = chkSbrto;
    }

    public String getDeproNo() {
        return deproNo;
    }

    public void setDeproNo(String deproNo) {
        this.deproNo = deproNo;
    }

    public BigDecimal getRtoFqsk() {
        return rtoFqsk;
    }

    public void setRtoFqsk(BigDecimal rtoFqsk) {
        this.rtoFqsk = rtoFqsk;
    }

    public String getDateflagFqsk() {
        return dateflagFqsk;
    }

    public void setDateflagFqsk(String dateflagFqsk) {
        this.dateflagFqsk = dateflagFqsk;
    }

    public Date getDateFqsk() {
        return dateFqsk;
    }

    public void setDateFqsk(Date dateFqsk) {
        this.dateFqsk = dateFqsk;
    }

    public Integer getQsFqsk() {
        return qsFqsk;
    }

    public void setQsFqsk(Integer qsFqsk) {
        this.qsFqsk = qsFqsk;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getTel1Code() {
        return tel1Code;
    }

    public void setTel1Code(String tel1Code) {
        this.tel1Code = tel1Code;
    }

    public String getUniNo2() {
        return uniNo2;
    }

    public void setUniNo2(String uniNo2) {
        this.uniNo2 = uniNo2;
    }

    public String getFpName2() {
        return fpName2;
    }

    public void setFpName2(String fpName2) {
        this.fpName2 = fpName2;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getChkKd() {
        return chkKd;
    }

    public void setChkKd(String chkKd) {
        this.chkKd = chkKd;
    }

    public String getWsCusNo() {
        return wsCusNo;
    }

    public void setWsCusNo(String wsCusNo) {
        this.wsCusNo = wsCusNo;
    }

    public String getAutoCasnChk() {
        return autoCasnChk;
    }

    public void setAutoCasnChk(String autoCasnChk) {
        this.autoCasnChk = autoCasnChk;
    }

    public String getNsrCode() {
        return nsrCode;
    }

    public void setNsrCode(String nsrCode) {
        this.nsrCode = nsrCode;
    }

    public String getNamePy() {
        return namePy;
    }

    public void setNamePy(String namePy) {
        this.namePy = namePy;
    }

    public String getBizDsc1() {
        return bizDsc1;
    }

    public void setBizDsc1(String bizDsc1) {
        this.bizDsc1 = bizDsc1;
    }

    public String getCusSrc() {
        return cusSrc;
    }

    public void setCusSrc(String cusSrc) {
        this.cusSrc = cusSrc;
    }

    public String getAccNoAr2() {
        return accNoAr2;
    }

    public void setAccNoAr2(String accNoAr2) {
        this.accNoAr2 = accNoAr2;
    }

    public String getAccNoAp2() {
        return accNoAp2;
    }

    public void setAccNoAp2(String accNoAp2) {
        this.accNoAp2 = accNoAp2;
    }

    public Integer getVisitLimit() {
        return visitLimit;
    }

    public void setVisitLimit(Integer visitLimit) {
        this.visitLimit = visitLimit;
    }

    public Date getBbDd() {
        return bbDd;
    }

    public void setBbDd(Date bbDd) {
        this.bbDd = bbDd;
    }

    public Date getSoDd() {
        return soDd;
    }

    public void setSoDd(Date soDd) {
        this.soDd = soDd;
    }

    public String getMobId() {
        return mobId;
    }

    public void setMobId(String mobId) {
        this.mobId = mobId;
    }

    public String getTtTypeSet() {
        return ttTypeSet;
    }

    public void setTtTypeSet(String ttTypeSet) {
        this.ttTypeSet = ttTypeSet;
    }

    public String getExTrdId() {
        return exTrdId;
    }

    public void setExTrdId(String exTrdId) {
        this.exTrdId = exTrdId;
    }

    public String getImTrdId() {
        return imTrdId;
    }

    public void setImTrdId(String imTrdId) {
        this.imTrdId = imTrdId;
    }

    public String getCusNoKd() {
        return cusNoKd;
    }

    public void setCusNoKd(String cusNoKd) {
        this.cusNoKd = cusNoKd;
    }

    public String getChkZhangId2() {
        return chkZhangId2;
    }

    public void setChkZhangId2(String chkZhangId2) {
        this.chkZhangId2 = chkZhangId2;
    }

    public String getPjsqWh() {
        return pjsqWh;
    }

    public void setPjsqWh(String pjsqWh) {
        this.pjsqWh = pjsqWh;
    }

    public String getJdNo() {
        return jdNo;
    }

    public void setJdNo(String jdNo) {
        this.jdNo = jdNo;
    }

    public String getFpType() {
        return fpType;
    }

    public void setFpType(String fpType) {
        this.fpType = fpType;
    }

    public String getChkCx() {
        return chkCx;
    }

    public void setChkCx(String chkCx) {
        this.chkCx = chkCx;
    }

    public String getChkMinXf() {
        return chkMinXf;
    }

    public void setChkMinXf(String chkMinXf) {
        this.chkMinXf = chkMinXf;
    }

    public String getBilMinXf() {
        return bilMinXf;
    }

    public void setBilMinXf(String bilMinXf) {
        this.bilMinXf = bilMinXf;
    }

    public String getChkTypeMinxf() {
        return chkTypeMinxf;
    }

    public void setChkTypeMinxf(String chkTypeMinxf) {
        this.chkTypeMinxf = chkTypeMinxf;
    }

    public BigDecimal getAmtnMinXf() {
        return amtnMinXf;
    }

    public void setAmtnMinXf(BigDecimal amtnMinXf) {
        this.amtnMinXf = amtnMinXf;
    }

    public String getRemS() {
        return remS;
    }

    public void setRemS(String remS) {
        this.remS = remS;
    }

    public Poscard getCardNo() {
        return cardNo;
    }

    public void setCardNo(Poscard cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusNo != null ? cusNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cust)) {
            return false;
        }
        Cust other = (Cust) object;
        if ((this.cusNo == null && other.cusNo != null) || (this.cusNo != null && !this.cusNo.equals(other.cusNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.shenghsiang.entity.Cust[ cusNo=" + cusNo + " ]";
    }
    
}
