package com.ensat.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ensat.DTO.*;
import com.ensat.entities.Tblproyecto;
//import com.ensat.entities.Product;
import com.ensat.entities.Tblusuario;

public class DTOAssembler {
	
	public static List<UserDTO> CreateUsers(Iterable<Tblusuario> businessCollections) {
		List<UserDTO> productsDTO = new ArrayList<UserDTO>();
        Iterator<Tblusuario> it = businessCollections.iterator();

        while (it.hasNext()) {
            //Product product = it.next();
        	Tblusuario user = it.next();
            //productsDTO.add(CreateProduct(product));
        	productsDTO.add(CreateUser(user));
        }
        
        return productsDTO;
	}
	
	public static UserDTO CreateUser(Tblusuario user) {
		UserDTO userDTO = new UserDTO();
		
		if(user == null) {
			return userDTO;
		}
			
		userDTO.setUserId(user.getCodigoUsuario());
		userDTO.setNombres(user.getNombres());
		userDTO.setApellidos(user.getApellidos());
		userDTO.setEmail(user.getCorreo());
		userDTO.setIdentificacion(user.getIdentificacion().longValue());
		userDTO.setCargo(user.getCargo().getNombre());
		userDTO.setRol(user.getTblrol().getNombrerol());
		userDTO.setCargoId(user.getCargo().getId());

		return userDTO;
	}
	
	public static ProfileDTO CreateProfile(Tblusuario user) {
		ProfileDTO profileDTO = new ProfileDTO();
		
		profileDTO.setIdentificacion(user.getIdentificacion().longValue());
		profileDTO.setNombres(user.getNombres());
		profileDTO.setApellidos(user.getApellidos());
		profileDTO.setNick(user.getNick());
		profileDTO.setCorreo(user.getCorreo());
		profileDTO.setEstado(user.getEstado());
		profileDTO.setCargo(user.getCargo().getNombre());
		profileDTO.setCorreo(user.getCorreo());
		profileDTO.setidRol(user.getTblrol().getIdrol());
		profileDTO.setRol(user.getTblrol().getNombrerol());
		profileDTO.setJefeDirect("-------------------");
		profileDTO.setGerente(user.getNombregerente());
		profileDTO.setFechaIngreso(user.getFechaingreso());

		return profileDTO;
	}
	
	public static List<ListDTO> CreateLists(Iterable<Tblproyecto> businessCollections){
		List<ListDTO> listDTO = new ArrayList<ListDTO>();
        Iterator<Tblproyecto> it = businessCollections.iterator();

        while (it.hasNext()) {
            //Product product = it.next();
        	Tblproyecto project = it.next();
            //productsDTO.add(CreateProduct(product));
        	listDTO.add(CreateList(project));
        }
        
		return listDTO;
	}
	
	public static ListDTO CreateList(Tblproyecto project) {
		ListDTO listDTO = new ListDTO();
		
		listDTO.setDescription(project.getNombre_proyecto());
		listDTO.setId(project.getId_proyecto());

		return listDTO;
	}
		
	public static ResultDTO CreateResponse(boolean succes, String result) {
		ResultDTO resultDTO = new ResultDTO();
		
		resultDTO.setSuccess(succes);
		resultDTO.setResult(result);
		
		return resultDTO;
	}
}
