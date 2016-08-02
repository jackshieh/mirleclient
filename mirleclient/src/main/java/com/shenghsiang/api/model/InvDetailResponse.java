package com.shenghsiang.api.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shenghsiang.common.Utils;

public class InvDetailResponse extends APIResponse implements Serializable {
	private static final long serialVersionUID = -1964201166357229425L;
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
	@JsonProperty("details")
	private List<Item> details;
	
	// private String invDateStr;
	
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
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
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
	public List<Item> getDetails() {
		return details;
	}
	public void setDetails(List<Item> details) {
		this.details = details;
	}
	public String getInvDateStr() {
		return Utils.convertDateString(invDate);
	}
	
}
