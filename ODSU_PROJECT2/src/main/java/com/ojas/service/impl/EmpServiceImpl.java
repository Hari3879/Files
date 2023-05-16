package com.ojas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Employee;
import com.ojas.repo.EmpRepositry;
import com.ojas.service.EmployeeDao;

@Service
public class EmpServiceImpl implements EmployeeDao {
	@Autowired
	private EmpRepositry repo;

	@Override
	public int createEmployee(Employee emp) {
		repo.save(emp);
		return 0;
	}

}
