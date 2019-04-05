package com.ensat.services;

import java.util.List;

import com.ensat.entities.Tbletapa;
import com.ensat.entities.Tblproyecto;


public interface ProjectService {
	
	List<Tblproyecto> getProjectsByDescription(String description);
	
	Iterable<Tbletapa> getStagesByProjectId(Long projectId);
}
