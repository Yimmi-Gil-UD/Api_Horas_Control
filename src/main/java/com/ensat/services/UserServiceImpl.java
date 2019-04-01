package com.ensat.services;

import com.ensat.entities.Tblusuario;
//import com.ensat.entities.Product;
import com.ensat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
        
    }

    @Override
    public Iterable<Tblusuario> listAllUsers() {
        return userRepository.findAll();
    }

	@Override
	public Tblusuario getUserProfileByUserId(int userId) {
		return userRepository.findOne(userId);
	}
    
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
}
