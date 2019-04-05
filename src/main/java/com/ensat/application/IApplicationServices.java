package com.ensat.application;

import java.util.List;

import com.ensat.DTO.*;
import com.ensat.entities.Tblproyecto;

public interface IApplicationServices {
	List<UserDTO> getUsers();
	
	ProfileDTO getUserProfileByUserId(Long userId);
	
	List<ListDTO> getProjectsByDescription(String description);
	
	List<ListDTO> getStagesByProjectId(Long projectId);
}
