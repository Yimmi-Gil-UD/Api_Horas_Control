package com.ensat.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ensat.DTO.*;
import com.ensat.entities.*;
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
		
		userDTO.setNombres(usuario.getNombres());
		userDTO.setApellidos(usuario.getApellidos());

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
	
	public static List<ListDTO> CreateProjects(List<Tblproyecto> businessCollections){
		List<ListDTO> listDTO = new ArrayList<ListDTO>();
        Iterator<Tblproyecto> it = businessCollections.iterator();

        while (it.hasNext()) {
            //Product product = it.next();
        	Tblproyecto project = it.next();
            //productsDTO.add(CreateProduct(product));
        	listDTO.add(CreateProject(project));
        }
        
		return listDTO;
	}
	
	public static ListDTO CreateProject(Tblproyecto project) {
		ListDTO listDTO = new ListDTO();
		
		listDTO.setDescription(project.getNombre_proyecto());
		listDTO.setId(project.getId_proyecto());

		return listDTO;
	}
	
	public static List<ListDTO> CreateStages(Iterable<Tbletapa> bussinesCollection){
		List<ListDTO> stagesDTO = new ArrayList<ListDTO>();
        Iterator<Tbletapa> it = bussinesCollection.iterator();

        while (it.hasNext()) {
            //Product product = it.next();
        	Tbletapa stage = it.next();
            //productsDTO.add(CreateProduct(product));
        	stagesDTO.add(CreateStage(stage));
        }
        
		return stagesDTO;
	}
	
	public static ListDTO CreateStage(Tbletapa stage) {
		ListDTO stageDTO = new ListDTO();
		
		stageDTO.setId(Long.valueOf(stage.getIdetapa()));
		stageDTO.setDescription(stage.getNombreetapa());
		
		return stageDTO;
	}
	
}
