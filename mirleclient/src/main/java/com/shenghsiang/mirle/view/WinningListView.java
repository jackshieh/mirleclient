package com.shenghsiang.mirle.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.shenghsiang.api.model.InvoiceWinningListRequest;
import com.shenghsiang.api.model.InvoiceWinningListResponse;
import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.service.APIService;

@ManagedBean
@SessionScoped
public class WinningListView implements BaseView {
	private InvoiceWinningListRequest request = new InvoiceWinningListRequest();
	private InvoiceWinningListResponse response = new InvoiceWinningListResponse();	
    private boolean enableOutput = false;   
    
	@ManagedProperty("#{apiService}")
	private  APIService apiService;

	
	public InvoiceWinningListRequest getRequest() {
		return request;
	}

	public void setRequest(InvoiceWinningListRequest request) {
		this.request = request;
	}

	@Override
	public void search() {			
		if (request.getInvTerm().length() >= 0) {			
			response = apiService.getQryWinningList(request);
			if (response != null) {
				enableOutput = true;			
				Utils.addMessage("qryWinningListForm:msgs", response.getMsg());	
			}
		}		
	}

	public InvoiceWinningListResponse getResponse() {
		return response;
	}

	public void setResponse(InvoiceWinningListResponse response) {
		this.response = response;
	}

	public APIService getApiService() {
		return apiService;
	}

	public void setApiService(APIService apiService) {
		this.apiService = apiService;
	}

	public boolean isEnableOutput() {		
		return enableOutput;
	}

	public void setEnableOutput(boolean enableOutput) {
		this.enableOutput = enableOutput;
	}

}
