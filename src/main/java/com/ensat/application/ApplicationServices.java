package com.ensat.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.*;
import com.ensat.services.ProjectService;
//import com.ensat.entities.Product;
import com.ensat.services.UserService;

@Service
public class ApplicationServices implements IApplicationServices {

	private ProjectService projectService;
	
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
		return null;
	}

	

}
