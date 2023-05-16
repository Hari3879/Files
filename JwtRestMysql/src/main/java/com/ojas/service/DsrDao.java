package com.ojas.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.entity.DSR;
@Service
public interface DsrDao {
	public String createDsr(DSR dsr);
	public List<DSR> getDsrdetails();
	public String updateDsr(DSR dsr);
	public String deleteDsr(long id);
	
	
	

}
