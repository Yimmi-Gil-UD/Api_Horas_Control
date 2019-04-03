package com.ensat.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ensat.entities.*;

@Repository
public interface ProjectRepository extends CrudRepository<Tblproyecto, Integer> {
	
	//Optional<Tblproyecto> findOne(@Param("description") String description);
}
