package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MATH_NOKEY database table.
 * 
 */
@Embeddable
public class MathNokeyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="DEP", unique=true, nullable=false, length=8)
	private String dep;

	@Column(name="MATH_NO", unique=true, nullable=false, length=10)
	private String mathNo;

	public MathNokeyPK() {
	}
	public String getDep() {
		return this.dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getMathNo() {
		return this.mathNo;
	}
	public void setMathNo(String mathNo) {
		this.mathNo = mathNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MathNokeyPK)) {
			return false;
		}
		MathNokeyPK castOther = (MathNokeyPK)other;
		return 
			this.dep.equals(castOther.dep)
			&& this.mathNo.equals(castOther.mathNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dep.hashCode();
		hash = hash * prime + this.mathNo.hashCode();
		
		return hash;
	}
}