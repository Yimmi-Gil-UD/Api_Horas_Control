package com.ensat.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensat.DTO.ListProjectDTO;
import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
import com.ensat.application.IApplicationServices;

/**
 * Product controller.
 */
@RestController
@RequestMapping("api/v1.0/users")
public class UserController {
	
	@Autowired
    IApplicationServices _applicationServices;
	
	
    @GetMapping("/")
    public List<UserDTO> getUser(){
    	return _applicationServices.getUsers();
    }
    
    @GetMapping("/{userId}")
    public ProfileDTO getUserProfileByUserId(@PathVariable(name="userId",required=true) Long userId){
    	return _applicationServices.getUserProfileByUserId(userId);
    }
    
    
    
    
    
    
}
