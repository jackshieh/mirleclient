package com.shenghsiang.mirle.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.shenghsiang.common.Utils;
import com.shenghsiang.mirle.a03.InvHeaderUploadRequest;
import com.shenghsiang.mirle.a03.response.INDEX;
import com.shenghsiang.mirle.service.MirleRestfulService;

@ManagedBean
@SessionScoped
public class CurTermInvHeaderView {
	private InvHeaderUploadRequest request = new InvHeaderUploadRequest();

	public CurTermInvHeaderView() {
		request.setTaxMonth(Utils.getCurrentInvTerm());
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
		INDEX response = mirleRestfulService.postA03(request);
		if (response != null) {
			Utils.addMessage("a3Form:msgs", response.getMESSAGE());;
		}
	}

	public MirleRestfulService getMirleRestfulService() {
		return mirleRestfulService;
	}

	public void setMirleRestfulService(MirleRestfulService mirleRestfulService) {
		this.mirleRestfulService = mirleRestfulService;
	}
}
