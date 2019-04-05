package com.ensat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ensat.entities.*;

@Transactional
@Repository
public interface ProjectRepository extends CrudRepository<Tblproyecto, Integer>, JpaRepository<Tblproyecto, Integer>, IProjectRepositoryCustom {
	

}
