package com.ensat.application;

import java.util.List;

import com.ensat.DTO.*;

public interface IApplicationServices {
	List<UserDTO> getUsers();
	
	ProfileDTO getUserProfileByUserId(int userId);
}
