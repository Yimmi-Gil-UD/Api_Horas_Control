package com.ensat.application;

import java.util.List;

import com.ensat.DTO.*;

public interface IApplicationServices {
	
	UserDTO login(UserDTO user);
	
	ProfileDTO getUserProfileByUserId(Long userId);
	
	List<ListDTO> getProjectsByDescription(String description);
}
