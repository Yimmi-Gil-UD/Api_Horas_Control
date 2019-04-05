package com.ensat.services;

import java.util.Optional;

//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public interface UserService {

	Tblusuario login(Tblusuario usuario);
	
	Optional<Tblusuario> getUserProfileByUserId(Long userId);
	
}
