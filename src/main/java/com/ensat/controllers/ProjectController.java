package com.ensat.controllers;

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
@RequestMapping("api/v1.0/projects")
public class ProjectController {

    @Autowired
    IApplicationServices _applicationServices;
    
    @GetMapping("/getProjectsByDescription/{description}")
    public List<ListDTO> getProjectsByDescription(@PathVariable(name="description",required=true) String description){
    	return _applicationServices.getProjectsByDescription(description);
  
    }
    
    @GetMapping("/getStageByProjectId/{projectId}")
    public List<ListDTO> getStageByProjectId(@PathVariable(name="projectId",required=true) Long projectId){
    	return _applicationServices.getStagesByProjectId(projectId);
    }
    
    @GetMapping("/Confirming")
    public String xx(){
    	return "confirmando api";
    }
    
}
