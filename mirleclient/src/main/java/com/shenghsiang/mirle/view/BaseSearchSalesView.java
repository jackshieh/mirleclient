package com.shenghsiang.mirle.view;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.shenghsiang.mirle.entity.MfPss;
import com.shenghsiang.mirle.service.MirleRestfulService;
import com.shenghsiang.mirle.service.SalesService;

public abstract class BaseSearchSalesView {
	protected List<MfPss> salesList;
	protected List<MfPss> selectedSalesList;
	protected MfPss selectedSales;
	protected boolean enableOutput = false;
	protected Date beginDate;
	protected Date endDate;


	@ManagedProperty("#{salesService}")
	protected SalesService salesService;
	
	@ManagedProperty("#{mirleRestfulService}")
	protected MirleRestfulService mirleRestfulService;
	
	public abstract void search();
	// 上傳折讓證明單
	public abstract void uploadD0401();
	// 上傳平台存證作廢折讓明
	public abstract void uploadD0501();

	public void info(String message) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,	"Info", message));
	}

	public void warn(String message) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,	"Warning!", message));
	}

	public void error(String message) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", message));
	}
	
	public SalesService getSalesService() {
		return salesService;
	}

	public void setSalesService(SalesService salesService) {
		this.salesService = salesService;
	}

	public List<MfPss> getSalesList() {
		return salesList;
	}

	public void setSalesList(List<MfPss> salesList) {
		this.salesList = salesList;
	}

	public boolean isEnableOutput() {
		return enableOutput;
	}

	public void setEnableOutput(boolean enableOutput) {
		this.enableOutput = enableOutput;
	}

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

	public List<MfPss> getSelectedSalesList() {
		return selectedSalesList;
	}

	public void setSelectedSalesList(List<MfPss> selectedSalesList) {
		this.selectedSalesList = selectedSalesList;
	}

	public MfPss getSelectedSales() {
		return selectedSales;
	}

	public void setSelectedSales(MfPss selectedSales) {
		this.selectedSales = selectedSales;
	}
	public MirleRestfulService getMirleRestfulService() {
		return mirleRestfulService;
	}
	public void setMirleRestfulService(MirleRestfulService mirleRestfulService) {
		this.mirleRestfulService = mirleRestfulService;
	}

}
