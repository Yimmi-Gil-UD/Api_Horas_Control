package com.ensat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ensat.entities.*;

@Repository
public interface ProjectRepository extends CrudRepository<Tblproyecto, Integer> {
	
	Iterable<Tblproyecto> findAll(@Param("description") String description);
}
