package com.ensat.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.ListDTO;
import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
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
	public UserDTO login(UserDTO userDTO) {			
		return DTOAssembler.CreateUser(userService.login(ModelAssembler.CreateUser(userDTO)));
	}

	@Override
	public ProfileDTO getUserProfileByUserId(Long userId) {
		return DTOAssembler.CreateProfile(userService.getUserProfileByUserId(userId).get());
	}

	@Override
	public List<ListDTO> getProjectsByDescription(String description) {
		return DTOAssembler.CreateLists(projectService.getProjectsByDescription(description));
	}


}
