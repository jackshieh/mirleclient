package com.shenghsiang.mirle.view;

import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.shenghsiang.api.model.InvDetailRequest;
import com.shenghsiang.api.model.InvDetailResponse;
import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.service.APIService;
import com.shenghsiang.mirle.service.SearchInvoiceService;

@ManagedBean
@SessionScoped
public class InvDetailView implements BaseView {
	final private static Logger logger = Logger.getLogger(InvDetailView.class);
	private InvDetailRequest request = new InvDetailRequest();
	private InvDetailResponse response = new InvDetailResponse();
	private boolean enableOutput = false;

	@ManagedProperty("#{apiService}")
	private APIService apiService;

	@ManagedProperty("#{searchInvoiceService}")
	private SearchInvoiceService searchInvoiceService;

	public InvDetailRequest getRequest() {
		return request;
	}

	public void setRequest(InvDetailRequest request) {
		this.request = request;
	}

	public InvDetailResponse getResponse() {
		return response;
	}

	public void setResponse(InvDetailResponse response) {
		this.response = response;
	}

	public boolean isEnableOutput() {
		return enableOutput;
	}

	public void setEnableOutput(boolean enableOutput) {
		this.enableOutput = enableOutput;
	}

	public APIService getApiService() {
		return apiService;
	}

	public void setApiService(APIService apiService) {
		this.apiService = apiService;
	}

	public SearchInvoiceService getSearchInvoiceService() {
		return searchInvoiceService;
	}

	public void setSearchInvoiceService(SearchInvoiceService searchInvoiceService) {
		this.searchInvoiceService = searchInvoiceService;
	}

	@Override
	public void search() {
		final int MAX_INVOICE_LENGTH = 10;	
		
		if (request.getInvNum() != null && request.getInvNum().length() == MAX_INVOICE_LENGTH) {
			// find INV_DD based on 
			InvNo invNo = searchInvoiceService.findInvByInvNo(request.getInvNum());
			logger.info(request.getInvNum());
			request.setInvNum(invNo.getId().getInvNo());
			request.setRandomNumber(invNo.getRandNo());
			//based on type = Barcode
			request.setInvTerm(String.valueOf(invNo.getInvYm()));
			request.setInvDate(new SimpleDateFormat("yyyy/MM/dd").format(invNo.getInvDd()));
			// the following are based on type = QRCode
			/*
			request.setSellerID(invNo.getUniNoPay());
			request.setEncrypt(invNo.getChkCode());
			*/
			response = apiService.getQryInvDetails(request);
			if (response != null) {
				enableOutput = true;
				Utils.addMessage("qryInvDetailViewForm:msgs", response.getMsg());
			}
		}		
	}

}
