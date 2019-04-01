package com.ensat.controllers;


//import com.ensat.entities.Product;
import com.ensat.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ensat.application.*;
import com.ensat.DTO.*;

/**
 * Product controller.
 */
@RestController
@RequestMapping("v1.0/api")
public class UserController {

    private IApplicationServices _applicationServices;
    
    
    @Autowired
    public void setUserService(IApplicationServices _applicationServices) {
        this._applicationServices = _applicationServices;
    }
    
    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
    	return _applicationServices.getUsers();
    }
    
    @GetMapping("/getUserProfileByUserId/{userId}")
    public ProfileDTO getUserProfileByUserId(@PathVariable final int userId){
    	return _applicationServices.getUserProfileByUserId(userId);
    }
}
