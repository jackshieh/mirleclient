package com.shenghsiang.mirle.common;

public enum InvoiceTypeEnum {
	TRIPLICATE_INVOICE("01", "三聯式"),
	DUPLICATE_INVOICE("02", "二聯式"),
	DUPLICATE_INVOICE_FOR_CASH_REGISTER("03","二聯式收銀機"),
	SPECIAL_TAX_AMOUNT_INVOICE("04", "特種稅額"),	
	COMPUTER_INVOICE("05", "電子計算機"),
	TRIPLICATE_INVOICE_FOR_CASH_REGISTER("06","三聯式收銀機"),
	EINVOICE("07", "一般稅額計算之電子發票"),
	SPECIAL_EINVOICE("08", "特種稅額計算之電子發票");
	
	private final String id;
	private final String name;
	
	InvoiceTypeEnum(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
