package com.shenghsiang.mirle.service;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.entity.InvNoPK;
import com.shenghsiang.mirle.repo.InvoiceRepository;

@Service(value="searchInvoiceService")
public class SearchInvoiceService {
	@Resource
	private InvoiceRepository invoiceRepository;

	@Transactional
	public InvNo findInvNoByKey(InvNoPK key) {
		return invoiceRepository.findByPK(key);
	}
	
	@Transactional
	public Collection<InvNo> findInvoByInvDate(Timestamp invDate) {
		return invoiceRepository.findByInvoiceDate(invDate);
	}
	
	@Transactional
	public Collection<InvNo> findAll() {
		return invoiceRepository.findAll();
	}
	
	@Transactional
	public InvNo findInvByInvNo(String invNo) {
		return invoiceRepository.findByInvNo(invNo);
	}

	@Transactional
	public List<InvNo> findByDateRange(Timestamp beginDate, Timestamp endDate) {
		return invoiceRepository.findByInvoiceDateRange(beginDate, endDate);
	}
}
