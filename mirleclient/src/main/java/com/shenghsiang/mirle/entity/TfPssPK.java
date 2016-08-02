package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TF_PSS database table.
 * 
 */
@Embeddable
public class TfPssPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PS_ID")
	private String psId;

	@Column(name="PS_NO")
	private String psNo;

	@Column(name="ITM")
	private Integer itm;

	public TfPssPK() {
	}
	public String getPsId() {
		return this.psId;
	}
	public void setPsId(String psId) {
		this.psId = psId;
	}
	public String getPsNo() {
		return this.psNo;
	}
	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}
	public Integer getItm() {
		return this.itm;
	}
	public void setItm(Integer itm) {
		this.itm = itm;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TfPssPK)) {
			return false;
		}
		TfPssPK castOther = (TfPssPK)other;
		return 
			this.psId.equals(castOther.psId)
			&& this.psNo.equals(castOther.psNo)
			&& (this.itm == castOther.itm);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.psId.hashCode();
		hash = hash * prime + this.psNo.hashCode();
		hash = hash * prime + this.itm;
		
		return hash;
	}
}