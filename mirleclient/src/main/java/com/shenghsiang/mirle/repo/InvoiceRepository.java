package com.shenghsiang.mirle.repo;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.shenghsiang.mirle.entity.InvNo;
import com.shenghsiang.mirle.entity.InvNoPK;

@Transactional(readOnly = true) 
public interface InvoiceRepository extends JpaRepository<InvNo, InvNoPK> {
	public InvNo findByPK(@Param("pk")InvNoPK pk);
	public List<InvNo> findByInvoiceDate(@Param("invoice_date")Timestamp invoiceDate);
	public InvNo findByInvNo(@Param("invNo")String invNo);
	public List<InvNo> findByInvoiceDateRange(@Param("beginDate")Timestamp beginDate, @Param("endDate")Timestamp endDate);
}