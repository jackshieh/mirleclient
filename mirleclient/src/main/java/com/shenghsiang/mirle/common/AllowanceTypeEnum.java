package com.shenghsiang.mirle.common;

public enum AllowanceTypeEnum {
	BUYER(1), SELLER(2);
	
    private final int value;
	
    private AllowanceTypeEnum(int value) {
    	this.value = value;
    }
    
	public int getValue() {
		return this.value;
	}
}
