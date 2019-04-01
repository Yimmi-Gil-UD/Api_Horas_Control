package com.ensat.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.DTO.*;
//import com.ensat.entities.Product;
import com.ensat.services.UserService;

@Service
public class ApplicationServices implements IApplicationServices {

	private UserService userService;
	
    @Autowired
    public void setProductService(UserService userService) {
        this.userService = userService;
    }
	
	@Override
	public List<UserDTO> getUsers() {			
		return DTOAssembler.CreateUsers(userService.listAllUsers());
	}

}
