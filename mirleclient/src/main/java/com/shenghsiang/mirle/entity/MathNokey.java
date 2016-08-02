package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MATH_NOKEY database table.
 * 
 */
@Entity
@Table(name="MATH_NOKEY")
@NamedQuery(name="MathNokey.findAll", query="SELECT m FROM MathNokey m")
public class MathNokey implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MathNokeyPK id;

	@Column(name="EMATH_NO", length=10)
	private String emathNo;

	@Column(name="KEY_NO", length=100)
	private String keyNo;

	public MathNokey() {
	}

	public MathNokeyPK getId() {
		return this.id;
	}

	public void setId(MathNokeyPK id) {
		this.id = id;
	}

	public String getEmathNo() {
		return this.emathNo;
	}

	public void setEmathNo(String emathNo) {
		this.emathNo = emathNo;
	}

	public String getKeyNo() {
		return this.keyNo;
	}

	public void setKeyNo(String keyNo) {
		this.keyNo = keyNo;
	}

}