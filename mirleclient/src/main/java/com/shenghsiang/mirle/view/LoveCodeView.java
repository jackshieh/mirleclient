package com.shenghsiang.mirle.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import com.shenghsiang.api.model.LoveCodeRequest;
import com.shenghsiang.api.model.LoveCodeResponse;
import com.shenghsiang.mirle.service.APIService;

@ManagedBean
@SessionScoped
public class LoveCodeView implements BaseView {
	final static Logger logger = Logger.getLogger(LoveCodeView.class);
	private LoveCodeRequest request = new LoveCodeRequest();
	private LoveCodeResponse response = new LoveCodeResponse();
	private boolean enableOutput = false;

	@ManagedProperty("#{apiService}")
	private APIService apiService;
	
	@Override
	public void search() {		
		if (request.getqKey() != null) {
			response = apiService.getQryLoveCode(request);
			if (request != null) enableOutput = true;
		}
	}

	public LoveCodeRequest getRequest() {
		return request;
	}

	public void setRequest(LoveCodeRequest request) {
		this.request = request;
	}

	public LoveCodeResponse getResponse() {
		return response;
	}

	public void setResponse(LoveCodeResponse response) {
		this.response = response;
	}

	public boolean isEnableOutput() {
		return enableOutput;
	}

	public APIService getApiService() {
		return apiService;
	}

	public void setApiService(APIService apiService) {
		this.apiService = apiService;
	}

}
