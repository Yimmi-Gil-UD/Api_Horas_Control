package com.ensat.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.*;
import com.ensat.services.ProjectService;
import com.ensat.entities.Tblusuario;
//import com.ensat.entities.Product;
import com.ensat.services.UserService;

@Service
public class ApplicationServices implements IApplicationServices {
	@Autowired
	UserService userService;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	ProjectService projectService;
	
    @Autowired
    public void setProductService(ProjectService projectService) {
        this.projectService = projectService;
    }
		@Override
	public List<ProjectDTO> getProject() {
		// TODO Auto-generated method stub
	    return DTOAssembler.CreateProjects(projectService.listAllProjects());
	}
	
	@Override
	public List<UserDTO> getUsers() {
		// TODO Auto-generated method stub
		return DTOAssembler.CreateUsers(userService.listAllUsers());
	}

	@Override
	public ProfileDTO getUserProfileByUserId(Long userId) {
		return DTOAssembler.CreateProfile(userService.getUserProfileByUserId(userId).get());
	}
}
