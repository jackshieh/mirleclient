package com.shenghsiang.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SocialWelfare {
	@JsonProperty("rowNum")
	private String rowNum;
	@JsonProperty("SocialWelfareBAN")
	private String BAN;
	@JsonProperty("LoveCode")
	private String loveCode;
	@JsonProperty("SocialWelfareName")
	private String name;
	@JsonProperty("SocialWelfareAbbrev")
	private String shortName;
	
	public String getRowNum() {
		return rowNum;
	}
	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}
	public String getBAN() {
		return BAN;
	}
	public void setBAN(String bAN) {
		BAN = bAN;
	}
	public String getLoveCode() {
		return loveCode;
	}
	public void setLoveCode(String loveCode) {
		this.loveCode = loveCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}
