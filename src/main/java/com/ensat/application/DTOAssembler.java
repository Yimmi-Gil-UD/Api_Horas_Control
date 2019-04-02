package com.ensat.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ensat.DTO.ProfileDTO;
import com.ensat.DTO.UserDTO;
//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public class DTOAssembler {
	
	public static List<UserDTO> CreateUsers(Iterable<Tblusuario> businessCollections) {
		List<UserDTO> productsDTO = new ArrayList<UserDTO>();
        Iterator<Tblusuario> it = businessCollections.iterator();

        while (it.hasNext()) {
            //Product product = it.next();
        	Tblusuario usuario = it.next();
            //productsDTO.add(CreateProduct(product));
        	productsDTO.add(CreateUser(usuario));
        }
        
        return productsDTO;
	}
	
	public static UserDTO CreateUser(Tblusuario usuario) {
		UserDTO userDTO = new UserDTO();
		
		//userDTO.setId_Usuario(usuario.getCodigo_usuario());
		userDTO.setNombres(usuario.getNombres());
		userDTO.setApellidos(usuario.getApellidos());
//		userDTO.setIdCargo(usuario.getIdCargo());
		/*
		userDTO.setDescription(product.getTypeproduct().getDescription());
		userDTO.setNombreProducto(product.getName());
		userDTO.setPrice(product.getPrice());
		userDTO.setId(product.getId());
		*/
		return userDTO;
	}
	
	public static ProfileDTO CreateProfile(Tblusuario usuario) {
		ProfileDTO profileDTO = new ProfileDTO();
		
		profileDTO.setIdentification(usuario.getCodigoUsuario());
		profileDTO.setNombres(usuario.getNombres());
		profileDTO.setApellidos(usuario.getApellidos());
		profileDTO.setNick(usuario.getNick());
		profileDTO.setCorreo(usuario.getCorreo());
		profileDTO.setEstado(usuario.getEstado());
		profileDTO.setCargo(usuario.getCargo().getNombre());
		profileDTO.setCorreo(usuario.getCorreo());
		profileDTO.setidRol(usuario.getTblrol().getIdrol());
		profileDTO.setRol(usuario.getTblrol().getNombrerol());
		profileDTO.setJefeDirect("-------------------");
		profileDTO.setGerente(usuario.getNombregerente());
		profileDTO.setFechaIngreso(usuario.getFechaingreso());

		
		return profileDTO;
	}
	
}
