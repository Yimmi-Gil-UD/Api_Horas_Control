package com.ensat.DTO;

import java.util.ArrayList;
import java.util.List;



public class ListProjectDTO {
	
	//private long IdProyectoEtapa;
	
	private int IdEtapa;
	private List<String> listaEtapas;
	
	
	public int getIdEtapa() {
		return IdEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		IdEtapa = idEtapa;
	}

	
	
	
	
	public  ListProjectDTO()
	{
		listaEtapas = new ArrayList<String>();
	}

	public List getListaEtapas() {
		return listaEtapas;
	}

	public void setListaEtapas(List listaEtapas) {
		this.listaEtapas = listaEtapas;
	}
	
	
	
	
	

}
