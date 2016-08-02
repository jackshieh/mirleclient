package com.shenghsiang.mirle.common;

public enum TaxTypeEnum {
	TAXABLE(1), ZERO_TAX_RATE(2), TAX_FREE(3), SPECIAL_TAX_RATE(4), MIXED(9);
	
	private final int value;
	
	TaxTypeEnum(int value) {
		this.value = value;
	}
	
	public int getVaue() {
		return value;
	}
}
