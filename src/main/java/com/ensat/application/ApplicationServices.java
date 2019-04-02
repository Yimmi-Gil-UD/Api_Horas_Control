package com.ensat.application;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
//import com.ensat.entities.Product;
import com.ensat.services.UserService;

@Service
public class ApplicationServices implements IApplicationServices {
	@Autowired
	UserService userService;
	
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

}
