package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the INV_ID database table.
 * 
 */
@Embeddable
public class InvIdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="YYMM", unique=true, nullable=false)
	private java.util.Date yymm;

	@Column(name="INV_ID", unique=true, nullable=false, length=2)
	private String invId;

	@Column(name="DEP", unique=true, nullable=false, length=8)
	private String dep;

	@Column(name="INV_BOOK", unique=true, nullable=false)
	private short invBook;

	public InvIdPK() {
	}
	public java.util.Date getYymm() {
		return this.yymm;
	}
	public void setYymm(java.util.Date yymm) {
		this.yymm = yymm;
	}
	public String getInvId() {
		return this.invId;
	}
	public void setInvId(String invId) {
		this.invId = invId;
	}
	public String getDep() {
		return this.dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public short getInvBook() {
		return this.invBook;
	}
	public void setInvBook(short invBook) {
		this.invBook = invBook;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvIdPK)) {
			return false;
		}
		InvIdPK castOther = (InvIdPK)other;
		return 
			this.yymm.equals(castOther.yymm)
			&& this.invId.equals(castOther.invId)
			&& this.dep.equals(castOther.dep)
			&& (this.invBook == castOther.invBook);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.yymm.hashCode();
		hash = hash * prime + this.invId.hashCode();
		hash = hash * prime + this.dep.hashCode();
		hash = hash * prime + ((int) this.invBook);
		
		return hash;
	}
}