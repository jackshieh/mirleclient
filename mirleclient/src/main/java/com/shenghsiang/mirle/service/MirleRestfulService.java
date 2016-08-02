package com.shenghsiang.mirle.service;

import java.util.List;

import com.shenghsiang.mirle.a03.InvHeaderUploadRequest;
import com.shenghsiang.mirle.entity.MfPss;

public interface MirleRestfulService {
	final static String DEFAULT_BUYER_TAX_ID = "0000000000";
	public final String DEFAULT_SELLER_TAX_ID = "89953466";
	public final String DEFAULT_ALLOWANCE_DATE = "0000000000";
	public final String CANCEL_TIME = "00:00:00";
		
	public com.shenghsiang.mirle.a03.response.INDEX postA03(InvHeaderUploadRequest request);
	public com.shenghsiang.mirle.c03.response.INDEX postC03(InvHeaderUploadRequest request);
	public void postD0401(List<MfPss> salesList);	
	public void postD0501(List<MfPss> salesList);
	
}
