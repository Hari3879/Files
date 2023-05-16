package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Employee;

@Repository
public interface EmpRepositry extends JpaRepository<Employee, Long> {

}
