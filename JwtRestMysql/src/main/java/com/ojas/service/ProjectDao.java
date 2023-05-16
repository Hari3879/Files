package com.ojas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.entity.Projects;
@Service
public interface ProjectDao {
	public String createProjects(Projects prp);
	public List<Projects> getALL();

}
