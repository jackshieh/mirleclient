package com.shenghsiang.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * einvoice API response object
 */
public abstract class APIResponse {
	@JsonProperty("v")
	String v;
	@JsonProperty("code")
	String code;
	@JsonProperty("msg")
	String msg;
	
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
