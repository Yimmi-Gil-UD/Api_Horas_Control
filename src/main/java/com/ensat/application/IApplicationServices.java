package com.ensat.application;

import java.util.List;

import com.ensat.DTO.*;
import com.ensat.entities.Tblproyecto;

public interface IApplicationServices {
	
	UserDTO login(UserDTO user);
	
	ProfileDTO getUserProfileByUserId(Long userId);
	
	List<ListDTO> getProjectsByDescription(String description);
	
	List<ListDTO> getStagesByProjectId(Long projectId);
}
