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
    public Tblusuario login(Tblusuario usuario) {
    	//, usuario.getClavesegura()
        return userRepository.findByLoginAndPassword(usuario.getNick());
    }

	@Override
	public Optional<Tblusuario>  getUserProfileByUserId(Long userId) {
		return userRepository.findOne(userId);
	}

}
