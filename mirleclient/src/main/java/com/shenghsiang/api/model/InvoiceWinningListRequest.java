package com.shenghsiang.api.model;

import com.shenghsiang.api.common.URI;


public class InvoiceWinningListRequest extends APIRequest {
	private String invTerm;

	public InvoiceWinningListRequest() {
		this.action = URI.API_QRY_WINNINGLIST.getApiName();
	}
	
	public String getInvTerm() {
		return invTerm;
	}

	public void setInvTerm(String invTerm) {
		this.invTerm = invTerm;
	}
}
