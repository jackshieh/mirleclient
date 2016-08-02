package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INV_ID database table.
 * 
 */
@Entity
@Table(name="INV_ID")
@NamedQuery(name="InvId.findAll", query="SELECT i FROM InvId i")
public class InvId implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvIdPK id;

	@Column(name="BuyUser", length=200)
	private String buyUser;

	@Column(name="CNT_INV")
	private short cntInv;

	@Column(name="E_SEQ_NO", length=8)
	private String eSeqNo;

	@Column(name="F_SEQ_NO", length=8)
	private String fSeqNo;

	@Column(name="ISELINV", length=1)
	private String iselinv;

	@Column(name="ISPOS", length=1)
	private String ispos;

	@Column(name="MATH_NO", length=10)
	private String mathNo;

	@Column(name="SEQ_NO", length=8)
	private String seqNo;

	@Column(name="SEQ_RULE", length=8)
	private String seqRule;

	@Column(name="TRACK_ID", length=2)
	private String trackId;

	@Column(name="UPLOAD", length=1)
	private String upload;

	@Column(name="USEDEP", length=500)
	private String usedep;

	public InvId() {
	}

	public InvIdPK getId() {
		return this.id;
	}

	public void setId(InvIdPK id) {
		this.id = id;
	}

	public String getBuyUser() {
		return this.buyUser;
	}

	public void setBuyUser(String buyUser) {
		this.buyUser = buyUser;
	}

	public short getCntInv() {
		return this.cntInv;
	}

	public void setCntInv(short cntInv) {
		this.cntInv = cntInv;
	}

	public String getESeqNo() {
		return this.eSeqNo;
	}

	public void setESeqNo(String eSeqNo) {
		this.eSeqNo = eSeqNo;
	}

	public String getFSeqNo() {
		return this.fSeqNo;
	}

	public void setFSeqNo(String fSeqNo) {
		this.fSeqNo = fSeqNo;
	}

	public String getIselinv() {
		return this.iselinv;
	}

	public void setIselinv(String iselinv) {
		this.iselinv = iselinv;
	}

	public String getIspos() {
		return this.ispos;
	}

	public void setIspos(String ispos) {
		this.ispos = ispos;
	}

	public String getMathNo() {
		return this.mathNo;
	}

	public void setMathNo(String mathNo) {
		this.mathNo = mathNo;
	}

	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public String getSeqRule() {
		return this.seqRule;
	}

	public void setSeqRule(String seqRule) {
		this.seqRule = seqRule;
	}

	public String getTrackId() {
		return this.trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getUpload() {
		return this.upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getUsedep() {
		return this.usedep;
	}

	public void setUsedep(String usedep) {
		this.usedep = usedep;
	}

}