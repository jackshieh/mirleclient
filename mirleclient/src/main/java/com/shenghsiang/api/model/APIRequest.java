package com.shenghsiang.api.model;

public abstract class APIRequest {
	String version = "0.2";
	String action;
	String UUID = "9ea1a26a-aef4-4637-a514-50ee03316d1d";
	String appID = "EINV0201503081394";
	
	public String getVersion() {
		return version;
	}
	public String getUUID() {
		return UUID;
	}
	public String getAppID() {
		return appID;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	
}
