package com.ensat.services;

import com.ensat.entities.Tblproyecto;

public interface ProjectService {
	
	Iterable<Tblproyecto> getProjectsByDescription(String description);
}
