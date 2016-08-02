package com.shenghsiang.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceWinningListResponse extends APIResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1209935423053377581L;
	@JsonProperty("invoYm")
	private String invoYm;
	@JsonProperty("superPrizeNo")
	private String superPrizeNo;
	@JsonProperty("spcPrizeNo")
	private String spcPrizeNo;
	@JsonProperty("spcPrizeNo2")
	private String spcPrizeNo2;
	@JsonProperty("spcPrizeNo3")
	private String spcPrizeNo3;
	@JsonProperty("firstPrizeNo1")
	private String firstPrizeNo1;
	@JsonProperty("firstPrizeNo2")
	private String firstPrizeNo2;
	@JsonProperty("firstPrizeNo3")
	private String firstPrizeNo3;
	@JsonProperty("firstPrizeNo4")
	private String firstPrizeNo4;
	@JsonProperty("firstPrizeNo5")
	private String firstPrizeNo5;
	@JsonProperty("firstPrizeNo6")
	private String firstPrizeNo6;
	@JsonProperty("firstPrizeNo7")
	private String firstPrizeNo7;
	@JsonProperty("firstPrizeNo8")
	private String firstPrizeNo8;
	@JsonProperty("firstPrizeNo9")
	private String firstPrizeNo9;
	@JsonProperty("firstPrizeNo10")
	private String firstPrizeNo10;
	@JsonProperty("sixthPrizeNo1")
	private String sixthPrizeNo1;
	@JsonProperty("sixthPrizeNo2")
	private String sixthPrizeNo2;
	@JsonProperty("sixthPrizeNo3")
	private String sixthPrizeNo3;
	@JsonProperty("superPrizeAmt")
	private String superPrizeAmt;
	@JsonProperty("spcPrizeAmt")
	private String spcPrizeAmt;
	@JsonProperty("firstPrizeAmt")
	private String firstPrizeAmt;
	@JsonProperty("secondPrizeAmt")
	private String secondPrizeAmt;
	@JsonProperty("thirdPrizeAmt")
	private String thirdPrizeAmt;
	@JsonProperty("fourthPrizeAmt")
	private String fourthPrizeAmt;
	@JsonProperty("fifthPrizeAmt")
	private String fifthPrizeAmt;
	@JsonProperty("sixthPrizeAmt")
	private String sixthPrizeAmt;
	@JsonProperty("sixthPrizeNo4")
	private String sixthPrizeNo4;
	@JsonProperty("sixthPrizeNo5")
	private String sixthPrizeNo5;
	@JsonProperty("sixthPrizeNo6")
	private String sixthPrizeNo6;
    @JsonProperty("timeStamp")
	private Timestamp timeStamp;
    @JsonProperty("updateDate")
    private String updateDate;
    
	public String getInvoYm() {
		return invoYm;
	}

	public void setInvoYm(String invoYm) {
		this.invoYm = invoYm;
	}

	public String getSuperPrizeNo() {
		return superPrizeNo;
	}

	public void setSuperPrizeNo(String superPrizeNo) {
		this.superPrizeNo = superPrizeNo;
	}

	public String getSpcPrizeNo() {
		return spcPrizeNo;
	}

	public void setSpcPrizeNo(String spcPrizeNo) {
		this.spcPrizeNo = spcPrizeNo;
	}

	public String getSpcPrizeNo2() {
		return spcPrizeNo2;
	}

	public void setSpcPrizeNo2(String spcPrizeNo2) {
		this.spcPrizeNo2 = spcPrizeNo2;
	}

	public String getSpcPrizeNo3() {
		return spcPrizeNo3;
	}

	public void setSpcPrizeNo3(String spcPrizeNo3) {
		this.spcPrizeNo3 = spcPrizeNo3;
	}

	public String getFirstPrizeNo1() {
		return firstPrizeNo1;
	}

	public void setFirstPrizeNo1(String firstPrizeNo1) {
		this.firstPrizeNo1 = firstPrizeNo1;
	}

	public String getFirstPrizeNo2() {
		return firstPrizeNo2;
	}

	public void setFirstPrizeNo2(String firstPrizeNo2) {
		this.firstPrizeNo2 = firstPrizeNo2;
	}

	public String getFirstPrizeNo3() {
		return firstPrizeNo3;
	}

	public void setFirstPrizeNo3(String firstPrizeNo3) {
		this.firstPrizeNo3 = firstPrizeNo3;
	}

	public String getFirstPrizeNo4() {
		return firstPrizeNo4;
	}

	public void setFirstPrizeNo4(String firstPrizeNo4) {
		this.firstPrizeNo4 = firstPrizeNo4;
	}

	public String getFirstPrizeNo5() {
		return firstPrizeNo5;
	}

	public void setFirstPrizeNo5(String firstPrizeNo5) {
		this.firstPrizeNo5 = firstPrizeNo5;
	}

	public String getFirstPrizeNo6() {
		return firstPrizeNo6;
	}

	public void setFirstPrizeNo6(String firstPrizeNo6) {
		this.firstPrizeNo6 = firstPrizeNo6;
	}

	public String getFirstPrizeNo7() {
		return firstPrizeNo7;
	}

	public void setFirstPrizeNo7(String firstPrizeNo7) {
		this.firstPrizeNo7 = firstPrizeNo7;
	}

	public String getFirstPrizeNo8() {
		return firstPrizeNo8;
	}

	public void setFirstPrizeNo8(String firstPrizeNo8) {
		this.firstPrizeNo8 = firstPrizeNo8;
	}

	public String getFirstPrizeNo9() {
		return firstPrizeNo9;
	}

	public void setFirstPrizeNo9(String firstPrizeNo9) {
		this.firstPrizeNo9 = firstPrizeNo9;
	}

	public String getFirstPrizeNo10() {
		return firstPrizeNo10;
	}

	public void setFirstPrizeNo10(String firstPrizeNo10) {
		this.firstPrizeNo10 = firstPrizeNo10;
	}

	public String getSixthPrizeNo1() {
		return sixthPrizeNo1;
	}

	public void setSixthPrizeNo1(String sixthPrizeNo1) {
		this.sixthPrizeNo1 = sixthPrizeNo1;
	}

	public String getSixthPrizeNo2() {
		return sixthPrizeNo2;
	}

	public void setSixthPrizeNo2(String sixthPrizeNo2) {
		this.sixthPrizeNo2 = sixthPrizeNo2;
	}

	public String getSixthPrizeNo3() {
		return sixthPrizeNo3;
	}

	public void setSixthPrizeNo3(String sixthPrizeNo3) {
		this.sixthPrizeNo3 = sixthPrizeNo3;
	}

	public String getSuperPrizeAmt() {
		return superPrizeAmt;
	}

	public void setSuperPrizeAmt(String superPrizeAmt) {
		this.superPrizeAmt = superPrizeAmt;
	}

	public String getSpcPrizeAmt() {
		return spcPrizeAmt;
	}

	public void setSpcPrizeAmt(String spcPrizeAmt) {
		this.spcPrizeAmt = spcPrizeAmt;
	}

	public String getFirstPrizeAmt() {
		return firstPrizeAmt;
	}

	public void setFirstPrizeAmt(String firstPrizeAmt) {
		this.firstPrizeAmt = firstPrizeAmt;
	}

	public String getSecondPrizeAmt() {
		return secondPrizeAmt;
	}

	public void setSecondPrizeAmt(String secondPrizeAmt) {
		this.secondPrizeAmt = secondPrizeAmt;
	}

	public String getThirdPrizeAmt() {
		return thirdPrizeAmt;
	}

	public void setThirdPrizeAmt(String thirdPrizeAmt) {
		this.thirdPrizeAmt = thirdPrizeAmt;
	}

	public String getFourthPrizeAmt() {
		return fourthPrizeAmt;
	}

	public void setFourthPrizeAmt(String fourthPrizeAmt) {
		this.fourthPrizeAmt = fourthPrizeAmt;
	}

	public String getFifthPrizeAmt() {
		return fifthPrizeAmt;
	}

	public void setFifthPrizeAmt(String fifthPrizeAmt) {
		this.fifthPrizeAmt = fifthPrizeAmt;
	}

	public String getSixthPrizeAmt() {
		return sixthPrizeAmt;
	}

	public void setSixthPrizeAmt(String sixthPrizeAmt) {
		this.sixthPrizeAmt = sixthPrizeAmt;
	}

	public String getSixthPrizeNo4() {
		return sixthPrizeNo4;
	}

	public void setSixthPrizeNo4(String sixthPrizeNo4) {
		this.sixthPrizeNo4 = sixthPrizeNo4;
	}

	public String getSixthPrizeNo5() {
		return sixthPrizeNo5;
	}

	public void setSixthPrizeNo5(String sixthPrizeNo5) {
		this.sixthPrizeNo5 = sixthPrizeNo5;
	}

	public String getSixthPrizeNo6() {
		return sixthPrizeNo6;
	}

	public void setSixthPrizeNo6(String sixthPrizeNo6) {
		this.sixthPrizeNo6 = sixthPrizeNo6;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}	

}
