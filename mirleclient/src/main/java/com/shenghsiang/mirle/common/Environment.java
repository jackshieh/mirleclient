package com.shenghsiang.mirle.common;

public enum Environment {
	QA("http://xmltest.551.com.tw", "22002748f9527b158758", "1"), PRODUCTION("http://xml.551.com.tw", "b3a0224576ff59175693", "2");
	
	private String key;
	private String url;
	private String posId;
	
	Environment(String url, String key, String posId) {
		this.url = url;
		this.key = key;
		this.posId = posId;
	}

	public String getKey() {
		return key;
	}

	public String getUrl() {
		return url;
	}

	public String getPosId() {
		return posId;
	}
}
