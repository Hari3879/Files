package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.entity.Employee;
@Service
public interface EmployeeDao {

	public int createEmployee(Employee emp);

//	public List<Employee> getAll();
//
//	public Optional<Employee> findByUsername(String empName);
//
//	Integer saveUser(Employee emp);
//UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
