package com.ojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Projects;
import com.ojas.repo.ProjectsRepo;
import com.ojas.service.ProjectDao;

@Service
public class ProjectsSeriveImpl implements ProjectDao {
	@Autowired
	private ProjectsRepo repo;

	@Override
	public String createProjects(Projects prp) {
		repo.save(prp);

		return "project Added successfull";
	}

	@Override
	public List<Projects> getALL() {
		
		return repo.findAll();
	}

}
