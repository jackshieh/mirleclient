package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MF_PSS database table.
 * 
 */
@Embeddable
public class MfPssPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PS_ID", unique=true, nullable=false, length=2)
	private String psId;

	@Column(name="PS_NO", unique=true, nullable=false, length=20)
	private String psNo;

	public MfPssPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MfPssPK)) {
			return false;
		}
		MfPssPK castOther = (MfPssPK)other;
		return 
			this.psId.equals(castOther.psId)
			&& this.psNo.equals(castOther.psNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.psId.hashCode();
		hash = hash * prime + this.psNo.hashCode();
		
		return hash;
	}
}