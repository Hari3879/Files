package com.ojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.DSR;
import com.ojas.repo.DsrRepo;
import com.ojas.service.DsrDao;

@Service
public class DsrServiceImpl implements DsrDao {
	@Autowired
	private DsrRepo repo;

	@Override
	public String createDsr(DSR dsr) {
		repo.save(dsr);
		return "Dsr Added Successfully";
	}

	@Override
	public List<DSR> getDsrdetails() {
		return repo.findAll();
	}
	@Override
	public String updateDsr(DSR dsr) {
repo.saveAndFlush(dsr);
		return "updated Success fully";
	}

	public String deleteDsr(long id) {
		repo.deleteById(id);
		return "Delete SuccesFully";
	}


}
