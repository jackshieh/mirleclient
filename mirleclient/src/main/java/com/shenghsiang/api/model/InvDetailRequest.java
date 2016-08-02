package com.shenghsiang.api.model;

import com.shenghsiang.api.common.URI;

public class InvDetailRequest extends APIRequest {
	private final String type = "Barcode";
	private final String generation = "V2";
	private String invTerm;
	private String invNum;
	private String invDate;
	private String encrypt;
	private String sellerID;
	private String randomNumber;

	public InvDetailRequest() {
		this.action = URI.API_QRY_INVDETAIL.getApiName();
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
	public String getEncrypt() {
		return encrypt;
	}
	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}
	public String getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(String randomNumber) {
		this.randomNumber = randomNumber;
	}
	public String getType() {
		return type;
	}
	public String getGeneration() {
		return generation;
	}
	public String getInvTerm() {
		return invTerm;
	}
	public void setInvTerm(String invTerm) {
		this.invTerm = invTerm;
	}
	public String getSellerID() {
		return sellerID;
	}
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}
	
}
