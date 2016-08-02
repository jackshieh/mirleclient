package com.shenghsiang.mirle.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.a03.InvHeaderUploadRequest;
import com.shenghsiang.mirle.service.MirleRestfulService;

@ManagedBean
@ViewScoped
public class NextTermInvHeaderView {
	final static Logger logger = Logger.getLogger(NextTermInvHeaderView.class);	
	private InvHeaderUploadRequest request = new InvHeaderUploadRequest();

	public NextTermInvHeaderView() {
		request.setTaxMonth(Utils.getNextInvTerm());
	}
	
	@ManagedProperty("#{mirleRestfulService}")
	private MirleRestfulService mirleRestfulService;
	
	public InvHeaderUploadRequest getRequest() {
		return request;
	}

	public void setRequest(InvHeaderUploadRequest request) {
		this.request = request;
	}
	
	public void upload() {
		logger.info("uploading invoice header for next term");		
		com.shenghsiang.mirle.c03.response.INDEX response = mirleRestfulService.postC03(request);
		if (response != null) {
			Utils.addMessage("c3Form:msgs", response.getMESSAGE());;
		}		
	}

	public MirleRestfulService getMirleRestfulService() {
		return mirleRestfulService;
	}

	public void setMirleRestfulService(MirleRestfulService mirleRestfulService) {
		this.mirleRestfulService = mirleRestfulService;
	}

}
