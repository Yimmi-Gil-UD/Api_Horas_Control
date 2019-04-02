package com.ensat.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensat.entities.Tblusuario;
//import com.ensat.entities.Product;
import com.ensat.repositories.UserRepository;

/**
 * Product service implement.
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserRepository userRepository;

    

    @Override
    public Iterable<Tblusuario> listAllUsers() {
        return userRepository.findAll();
    }

	@Override
	public Optional<Tblusuario>  getUserProfileByUserId(Long userId) {
		
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
