package com.ojas.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ojas.entity.DSR;

@EnableJpaRepositories
public interface DsrRepo extends JpaRepository<DSR, Long> {
	@Query(value = "select * from pocs.dsr where MONTH(dsr_date) = MONTH(now())and YEAR(dsr_date) = YEAR(now())",nativeQuery = true)
	List<DSR> curentmonthdata();


	List<DSR> findByDateBetween(Date startDate, Date endDate);

	

}
