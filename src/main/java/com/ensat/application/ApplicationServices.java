package com.ensat.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.ListDTO;
import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
import com.ensat.entities.Tblproyecto;
import com.ensat.services.*;

@Service
public class ApplicationServices implements IApplicationServices {
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	ModelMapper mapper;
	

	
	@Override
	public List<UserDTO> getUsers() {			
		return DTOAssembler.CreateUsers(userService.listAllUsers());
	}

	@Override
	public ProfileDTO getUserProfileByUserId(Long userId) {
		return DTOAssembler.CreateProfile(userService.getUserProfileByUserId(userId).get());
	}

	@Override
	public List<ListDTO> getProjectsByDescription(String description) {
		return DTOAssembler.CreateProjects(projectService.getProjectsByDescription(description));
	}

	@Override
	public List<ListDTO> getStagesByProjectId(Long projectId) {
		return DTOAssembler.CreateStages(projectService.getStagesByProjectId(projectId));
	}

	/*
	@Override
	public List<ListProjectDTO> getStageByProjectId(Long ProjectId) {
		
		
	//	return DTOAssembler.CreateListsProject(etapaService.getProjectsById(ProjectId));
	}
	*/

}
