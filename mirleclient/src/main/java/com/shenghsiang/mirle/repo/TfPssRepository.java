package com.shenghsiang.mirle.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.shenghsiang.mirle.entity.TfPss;
import com.shenghsiang.mirle.entity.TfPssPK;

@Transactional(readOnly = true)
public interface TfPssRepository extends JpaRepository<TfPss, TfPssPK> {
	public List<TfPss> findByPsNo(@Param("psNo")String psNo);
}
