package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entity.Projects;
@Repository
public interface ProjectsRepo extends JpaRepository<Projects,Integer> {
	
	
}
