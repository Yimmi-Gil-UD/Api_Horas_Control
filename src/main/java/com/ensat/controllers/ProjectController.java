package com.ensat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ensat.application.*;
import com.ensat.DTO.*;

/**
 * Product controller.
 */
@RestController
@RequestMapping("api/v1.0")
public class ProjectController {

    @Autowired
    IApplicationServices _applicationServices;
    
    @GetMapping("/getProject")
    public List<ListDTO> getProject(){
    	return _applicationServices.getProjects("hola");
    }
    
}
