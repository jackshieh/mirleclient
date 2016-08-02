package com.shenghsiang.mirle.view;

import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.shenghsiang.api.model.InvHeaderRequest;
import com.shenghsiang.api.model.InvHeaderResponse;
import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.service.APIService;
import com.shenghsiang.mirle.service.SearchInvoiceService;

@ManagedBean
@SessionScoped
public class InvHeaderView implements BaseView {
	final static Logger logger = Logger.getLogger(InvHeaderView.class);	
	private InvHeaderRequest request = new InvHeaderRequest();
	private InvHeaderResponse response = new InvHeaderResponse();
	private boolean enableOutput = false;

	@ManagedProperty("#{apiService}")
	private APIService apiService;

	@ManagedProperty("#{searchInvoiceService}")
	private SearchInvoiceService searchInvoiceService;
	
	public InvHeaderRequest getRequest() {
		return request;
	}

	public void setRequest(InvHeaderRequest request) {
		this.request = request;
	}

	public InvHeaderResponse getResponse() {
		return response;
	}

	public void setResponse(InvHeaderResponse response) {
		this.response = response;
	}

	public APIService getApiService() {
		return apiService;
	}

	public void setApiService(APIService apiService) {
		this.apiService = apiService;
	}

	@Override
	public void search() {
		final int MAX_INVOICE_LENGTH = 10;
		enableOutput = true;
		
		if (request.getInvNum() != null && request.getInvNum().length() == MAX_INVOICE_LENGTH) {
			// find INV_DD based on 
			InvNo invNo = searchInvoiceService.findInvByInvNo(request.getInvNum());
			logger.info(request.getInvNum());
			request.setInvNum(invNo.getId().getInvNo());
			String invDate = new SimpleDateFormat("yyyy/MM/dd").format(invNo.getInvDd());
			request.setInvDate(invDate);
			response = apiService.getQryInvHeader(request);
			if (response != null) {
				enableOutput = true;
				Utils.addMessage("qryInvHeaderViewForm:msgs", response.getMsg());
			}
		}
		
	}

	public boolean isEnableOutput() {
		return enableOutput;
	}

	public void setEnableOutput(boolean enableOutput) {
		this.enableOutput = enableOutput;
	}

	public SearchInvoiceService getSearchInvoiceService() {
		return searchInvoiceService;
	}

	public void setSearchInvoiceService(SearchInvoiceService searchInvoiceService) {
		this.searchInvoiceService = searchInvoiceService;
	}
}
