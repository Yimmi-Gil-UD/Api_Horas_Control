package com.ensat.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ensat.DTO.ProfileDTO;
import com.ensat.entities.Tblusuario;

@Configuration
public class EntityConfig {
	
	@Bean
	public ModelMapper getMapper() {
		PropertyMap<Tblusuario, ProfileDTO> mapper = new PropertyMap<Tblusuario, ProfileDTO>() {

			@Override
			protected void configure() {
				map().setApellidos(source.getApellidos());				
				map().setProfileTypeCode(source.getTblrol().getIdrol());
				skip().setId_Usuario(0);
			}
		
		};
		ModelMapper aux = new ModelMapper();
		aux.addMappings(mapper);
		return aux;
	}
}
