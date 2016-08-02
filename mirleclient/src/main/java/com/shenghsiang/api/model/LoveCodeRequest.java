package com.shenghsiang.api.model;

import com.shenghsiang.api.common.URI;

public class LoveCodeRequest extends APIRequest {
	private String qKey;

	public LoveCodeRequest() {
		this.action = URI.API_QRY_LOVECODE.getApiName();
	}
	
	public String getqKey() {
		return qKey;
	}

	public void setqKey(String qKey) {
		this.qKey = qKey;
	}
	
}
