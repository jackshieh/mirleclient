package com.shenghsiang.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvHeaderResponse extends APIResponse implements Serializable {	
	private static final long serialVersionUID = -2678616031596088937L;
	@JsonProperty("invNum")
	private String invNum;
	@JsonProperty("invDate")
	private String invDate;
	@JsonProperty("sellerName")
	private String sellerName;
	@JsonProperty("invStatus")
	private String invStatus;
	@JsonProperty("invPeriod")
	private String invPeriod;
		
	public String getInvNum() {
		return invNum;
	}
	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}
	public String getInvDate() {
		return invDate;
	}
	public void setInvDate(String invDate) {
		this.invDate = invDate;
	}
	public String getInvStatus() {
		return invStatus;
	}
	public void setInvStatus(String invStatus) {
		this.invStatus = invStatus;
	}
	public String getInvPeriod() {
		return invPeriod;
	}
	public void setInvPeriod(String invPeriod) {
		this.invPeriod = invPeriod;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
