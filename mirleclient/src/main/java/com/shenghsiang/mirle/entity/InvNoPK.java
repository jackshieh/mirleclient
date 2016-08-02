package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the INV_NO database table.
 * 
 */
@Embeddable
public class InvNoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INV_NO", unique=true, nullable=false, length=20)
	private String invNo;

	@Column(name="BIL_ID", unique=true, nullable=false, length=2)
	private String bilId;

	@Column(name="BIL_NO", unique=true, nullable=false, length=20)
	private String bilNo;

	public InvNoPK() {
	}
	public String getInvNo() {
		return this.invNo;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	public String getBilId() {
		return this.bilId;
	}
	public void setBilId(String bilId) {
		this.bilId = bilId;
	}
	public String getBilNo() {
		return this.bilNo;
	}
	public void setBilNo(String bilNo) {
		this.bilNo = bilNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvNoPK)) {
			return false;
		}
		InvNoPK castOther = (InvNoPK)other;
		return 
			this.invNo.equals(castOther.invNo)
			&& this.bilId.equals(castOther.bilId)
			&& this.bilNo.equals(castOther.bilNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.invNo.hashCode();
		hash = hash * prime + this.bilId.hashCode();
		hash = hash * prime + this.bilNo.hashCode();
		
		return hash;
	}
}