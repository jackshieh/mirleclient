package com.shenghsiang.mirle.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the INV_LOG database table.
 * 
 */
@Entity
@Table(name="INV_LOG")
@NamedQuery(name="InvLog.findAll", query="SELECT i FROM InvLog i")
public class InvLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable=false, length=20)
	private String id;

	@Column(name="COMP", length=20)
	private String comp;

	@Column(name="INV_NO", length=10)
	private String invNo;

	@Column(name="REM", length=4000)
	private String rem;

	@Column(name="[STATE]", length=10)
	private String state;

	@Column(name="SYS_DATE")
	private Timestamp sysDate;

	@Column(name="[TYPE]", length=20)
	private String type;

	@Column(name="XML_IN", length=4000)
	private String xmlIn;

	@Column(name="XML_OUT", length=4000)
	private String xmlOut;

	public InvLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComp() {
		return this.comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getInvNo() {
		return this.invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getSysDate() {
		return this.sysDate;
	}

	public void setSysDate(Timestamp sysDate) {
		this.sysDate = sysDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getXmlIn() {
		return this.xmlIn;
	}

	public void setXmlIn(String xmlIn) {
		this.xmlIn = xmlIn;
	}

	public String getXmlOut() {
		return this.xmlOut;
	}

	public void setXmlOut(String xmlOut) {
		this.xmlOut = xmlOut;
	}

}