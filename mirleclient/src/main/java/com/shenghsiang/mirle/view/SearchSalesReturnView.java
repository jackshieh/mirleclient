package com.shenghsiang.mirle.view;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

@ManagedBean
@ViewScoped
//@SessionScoped
public class SearchSalesReturnView extends BaseSearchSalesView implements Serializable  {
	private static final long serialVersionUID = 7533111797654820452L;
	final static Logger logger = Logger.getLogger(SearchSalesReturnView.class);

	@Override
	public void search() {
		if (beginDate == null || endDate == null)
			error("沒有輸入起始時間或截止時間。");
		else {
			salesList = salesService.findSalesReturnByDateRange(new Timestamp(
					beginDate.getTime()), new Timestamp(endDate.getTime()));
			if (salesList != null)
				enableOutput = true;
		}
	}

	@Override
	public void uploadD0401() {
		if (selectedSalesList != null) {
			logger.debug("Begin of uploading D0401");
			mirleRestfulService.postD0401(selectedSalesList);
			info("Completed uploading D0401");
			logger.debug("End of uploading D0401");			
		}
	}

	@Override
	public void uploadD0501() {
		if (selectedSalesList != null) {
			logger.debug("Begin of uploading D0501");
			mirleRestfulService.postD0501(selectedSalesList);
			info("Completed uploading D0501");
			logger.debug("End of uploading D0501");			
		}				
	}

}
