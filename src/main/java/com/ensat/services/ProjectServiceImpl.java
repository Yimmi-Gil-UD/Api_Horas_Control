package com.ensat.services;

import com.ensat.entities.Tblproyecto;
import com.ensat.repositories.ProjectRepository;
//import com.ensat.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
    private ProjectRepository projectRepository;

 


/*
    @Override
    public Producto getProductById(Integer id) {
        return userRepository.findOne(id);
    }

    public Producto ProductosaveProduct(Producto product) {
        return userRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        userRepository.delete(id);
    }

	@Override
	public Producto saveProduct(Producto product) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public Iterable<Tblproyecto> listAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
	
	

	
	
	
	
}
