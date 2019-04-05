package com.ensat.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@NamedQueries({
	@NamedQuery(name="Tbletapa.findAll", query="From Tbletapa where etapainterna = :projectId")
})
public class Tbletapa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idetapa;
	
	private String nombreetapa;
	
	private Long etapainterna;
	/*
	@OneToMany(mappedBy="tbletapa")
	private List<Tblproyecto> tblproyectos;
	*/
	public Tbletapa() {
	}

	public int getIdetapa() {
		return idetapa;
	}

	public void setIdetapa(int idetapa) {
		this.idetapa = idetapa;
	}

	public String getNombreetapa() {
		return nombreetapa;
	}

	public void setNombreetapa(String nombreetapa) {
		this.nombreetapa = nombreetapa;
	}

	public Long getEtapainterna() {
		return etapainterna;
	}

	public void setEtapainterna(Long etapainterna) {
		this.etapainterna = etapainterna;
	}
}