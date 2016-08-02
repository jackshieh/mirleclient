package com.shenghsiang.mirle.service;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shenghsiang.mirle.entity.MfPss;
import com.shenghsiang.mirle.entity.MfPssPK;
import com.shenghsiang.mirle.entity.TfPss;
import com.shenghsiang.mirle.repo.MfPssRepository;
import com.shenghsiang.mirle.repo.TfPssRepository;

@Service(value="salesService")
public class SalesService {
	@Resource
	private MfPssRepository mfPssRepository;
	
	@Resource
	private TfPssRepository tfPssRepository;
	
	@Transactional
	public MfPss findMfPssByPK(MfPssPK id) {
		return mfPssRepository.findByPK(id);
	}
	
	@Transactional
	public List<TfPss> findTfPssListByPsNo(String psNo) {
		return tfPssRepository.findByPsNo(psNo);
	}
	
	@Transactional
	public List<MfPss> findSalesReturnByDateRange(Timestamp beginDate, Timestamp endDate) {
		return mfPssRepository.findSBByDateRange(beginDate, endDate);
	}
	
	@Transactional
	public List<MfPss> findDiscountedSalesByDateRange(Timestamp beginDate, Timestamp endDate) {
		return mfPssRepository.findSDByDateRange(beginDate, endDate);
	}
}
