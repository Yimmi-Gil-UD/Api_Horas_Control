package com.ensat.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ensat.entities.Tblproyecto;
import com.ensat.entities.Tblusuario;

   
public interface ProjectRepository extends CrudRepository<Tblproyecto, Integer> {
	   
	@Query(value = "SELECT * FROM tblproyecto", nativeQuery = true)
		Iterable<Tblproyecto> findAll();
}
