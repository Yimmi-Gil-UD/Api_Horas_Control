package com.ensat.repositories;

//import com.ensat.entities.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ensat.entities.Tblusuario;

public interface UserRepository extends CrudRepository<Tblusuario, Integer> {
	   
	@Query(value = "SELECT nombres, apellidos FROM Tblusuario u", nativeQuery = true)
		Iterable<Tblusuario> findAll();
}