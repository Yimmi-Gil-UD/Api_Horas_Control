package com.ensat.services;

import java.util.Optional;

//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public interface UserService {

	Iterable<Tblusuario> listAllUsers();
	
	Optional<Tblusuario> getUserProfileByUserId(Long userId);
}
