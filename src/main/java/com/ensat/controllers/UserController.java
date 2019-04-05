package com.ensat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ensat.DTO.ListProjectDTO;
import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
import com.ensat.application.IApplicationServices;

@RestController
@RequestMapping("api/v1.0/users")
@CrossOrigin
public class UserController {
	
	@Autowired
    IApplicationServices _applicationServices;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
    public UserDTO login(@RequestBody(required = true) UserDTO userDTO){
    	return _applicationServices.login(userDTO);
    }
    
	@RequestMapping(method=RequestMethod.GET, value="/{userId}")
    public ProfileDTO getUserProfileByUserId(@PathVariable(name="userId",required=true) Long userId){
    	return _applicationServices.getUserProfileByUserId(userId);
    }
}
