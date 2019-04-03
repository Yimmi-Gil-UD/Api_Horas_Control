package com.ensat.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensat.entities.Tblproyecto;
import com.ensat.repositories.ProjectRepository;

public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository _projectRepository;
	
	@Override
	public Iterable<Tblproyecto> getProjectsByDescription(String description) {
		return _projectRepository.findAll();
	}

}
