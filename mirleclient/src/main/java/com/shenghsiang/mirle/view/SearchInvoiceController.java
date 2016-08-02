package com.shenghsiang.mirle.view;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.entity.MfPss;
import com.shenghsiang.mirle.entity.MfPssPK;
import com.shenghsiang.mirle.service.SalesService;
import com.shenghsiang.mirle.service.SearchInvoiceService;

@ManagedBean
@ViewScoped
public class SearchInvoiceController implements Serializable {
	private static final long serialVersionUID = 6391375259362835835L;
	private Date beginDate;
	private Date endDate;
	private boolean enableOutput = false;
	private List<InvNo> invNoList;
	private List<InvNo> selectedInvNoList;
	private InvNo selectedInvNo;
	private MfPss selectedMfPss;

	@ManagedProperty("#{searchInvoiceService}")
	private SearchInvoiceService searchService;
	
	@ManagedProperty("#{salesService}")
	private SalesService salesService;

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void submit() {
		// String outcome = searchService.getInvoice();
		if (beginDate == null || endDate == null) addMessage("沒有輸入起始時間和截止時間。", "輸入錯誤");
		else {
			invNoList = searchService.findByDateRange(new Timestamp(beginDate.getTime()), new Timestamp(endDate.getTime()));
			if (invNoList != null) enableOutput = true;
		}
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN,
				summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void setSearchService(SearchInvoiceService searchService) {
		this.searchService = searchService;
	}

	public SearchInvoiceService getSearchService() {
		return searchService;
	}

	public boolean isEnableOutput() {
		return enableOutput;
	}

	public List<InvNo> getInvNoList() {
		return invNoList;
	}

	public void setInvNoList(List<InvNo> invNoList) {
		this.invNoList = invNoList;
	}

	public List<InvNo> getSelectedInvNoList() {
		return selectedInvNoList;
	}	

	public void setSelectedInvNoList(List<InvNo> selectedInvNoList) {
		this.selectedInvNoList = selectedInvNoList;
	}
	
	public InvNo getSelectedInvNo() {
		return selectedInvNo;
	}

	public void setSelectedInvNo(InvNo selectedInvNo) {		
		this.selectedInvNo = selectedInvNo;
		// get MfPss by InvNo.id.bilNo
		
		if (selectedInvNo != null) {
			MfPssPK id = new MfPssPK();
			id.setPsId("SA");
			id.setPsNo(selectedInvNo.getId().getBilNo());
			selectedMfPss = salesService.findMfPssByPK(id);
			// System.out.println("Size: " + selectedTfPssList.size());
			// selectedMfPss.setTfPsses(tfPssList); because TfPss is set to read-only transaction			
		} 
		
	}

	public SalesService getSalesService() {
		return salesService;
	}

	public void setSalesService(SalesService salesService) {
		this.salesService = salesService;
	}

	public MfPss getSelectedMfPss() {
		return selectedMfPss;
	}

	public void setSelectedMfPss(MfPss selectedMfPss) {
		this.selectedMfPss = selectedMfPss;
	}

}
