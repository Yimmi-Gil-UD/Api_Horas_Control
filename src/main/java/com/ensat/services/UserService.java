package com.ensat.services;

//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public interface UserService {

	Iterable<Tblusuario> listAllUsers();
	
	Tblusuario getUserProfileByUserId(int userId);
}
