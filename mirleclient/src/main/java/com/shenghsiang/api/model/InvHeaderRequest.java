package com.shenghsiang.api.model;

import com.shenghsiang.api.common.URI;

public class InvHeaderRequest extends APIRequest {
	private final String type = "QRCode";
	private final String generation = "V2";
	private String invNum;
	private String invDate;
	
	public InvHeaderRequest() {
		this.action =  URI.API_QRY_INVHEADER.getApiName();		
	}

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

	public String getType() {
		return type;
	}

	public String getGeneration() {
		return generation;
	}
}
