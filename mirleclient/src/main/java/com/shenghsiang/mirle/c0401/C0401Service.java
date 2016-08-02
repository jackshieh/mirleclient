package com.shenghsiang.mirle.c0401;

public class C0401Service {
	Invoice getInvoice() {
		return new ObjectFactory().createInvoice();
	}
}
