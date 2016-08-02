package com.shenghsiang.mirle.service;

import com.shenghsiang.api.model.InvDetailRequest;
import com.shenghsiang.api.model.InvDetailResponse;
import com.shenghsiang.api.model.InvHeaderRequest;
import com.shenghsiang.api.model.InvHeaderResponse;
import com.shenghsiang.api.model.InvoiceWinningListRequest;
import com.shenghsiang.api.model.InvoiceWinningListResponse;
import com.shenghsiang.api.model.LoveCodeRequest;
import com.shenghsiang.api.model.LoveCodeResponse;

public interface APIService {
	public InvoiceWinningListResponse getQryWinningList(InvoiceWinningListRequest request);
	public InvHeaderResponse getQryInvHeader(InvHeaderRequest request);
	public InvDetailResponse getQryInvDetails(InvDetailRequest request);
	public LoveCodeResponse getQryLoveCode(LoveCodeRequest request);
}
