package com.shenghsiang.api.common;


public enum Parameter {
	VERSION("version"), 
	TYPE("type"), 
	INVTERM("invTerm"),
	INVNUM("invNum"), 
	ACTION("action"), 
	GENERATION("generation"), 
	INVDATE("invDate"), 
	UUID("UUID"), 
	APPID("appID"), 
	ENCRYPT("encrypt"), 
	SELLERID("sellerID"),
	RANDOMNUMBER("randomNumber"),
	QKEY("qKey"),
	CARDTYPE("cardType"),
	CARDNO("cardNo"),
	EXPTIMESTAMP("expTimeStamp"),
	TIMESTAMP("timeStamp"),
	SELLERNAME("sellerName"),
	AMOUNT("amount"),
	CARDENCRYPT("cardEncrypt"),
	STARTDATE("startDate"),
	ENDDATE("endDate"),
	ONLYWINNINGINV("onlyWinningInv"),
	NPOBAN("npoBan"),
	SERIAL("serial"),
	SIGNATURE("signature");
	
	private final String api;

	Parameter(String api) {
		this.api = api;
	}
	
	public String getApi() {
		return this.api;
	}

}
