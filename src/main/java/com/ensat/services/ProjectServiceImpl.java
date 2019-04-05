package com.ensat.services;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.entities.Tbletapa;
import com.ensat.entities.Tblproyecto;
import com.ensat.repositories.ProjectRepository;
import com.ensat.repositories.ProjectStageRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	ProjectRepository _projectRepository;
	
	@Autowired
	ProjectStageRepository _projectStageRepository;
	
	@Override
	public List<Tblproyecto> getProjectsByDescription(String description) {
		List<Tblproyecto> tblProyects = new java.util.ArrayList<Tblproyecto>();
		
		Query query = entityManager.createNativeQuery("SELECT P.nombre_proyecto, P.id_proyecto FROM Tblproyecto P WHERE nombre_proyecto LIKE '%' :description '%' ");
		query.setParameter("description", description);
		
		for (Object[] row : (List<Object[]>)query.getResultList()) { 
			  String name = (String) row[0];
			  Integer id = (Integer) row[1];
			  tblProyects.add(createProyecto(name, id));
			}
		
		return tblProyects;
	}
	
	public Tblproyecto createProyecto(String name, Integer id) {
		Tblproyecto proyecto = new Tblproyecto();
		
		proyecto.setId_proyecto(id.longValue());
		proyecto.setNombre_proyecto(name);
		
		return proyecto;
	}

	@Override
	public Iterable<Tbletapa> getStagesByProjectId(Long projectId) {
		return _projectStageRepository.findAll(projectId);
	}

}
