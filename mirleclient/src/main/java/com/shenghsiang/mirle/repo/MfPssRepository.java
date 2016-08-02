package com.shenghsiang.mirle.repo;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.shenghsiang.mirle.entity.MfPss;
import com.shenghsiang.mirle.entity.MfPssPK;

@Transactional(readOnly = true) 
public interface MfPssRepository extends JpaRepository<MfPss, MfPssPK> {
	public MfPss findByPK(@Param("pk")MfPssPK pk);
	public List<MfPss> findSBByDateRange(@Param("beginDate")Timestamp beginDate, @Param("endDate")Timestamp endDate);
	public List<MfPss> findSDByDateRange(@Param("beginDate")Timestamp beginDate, @Param("endDate")Timestamp endDate);
}
