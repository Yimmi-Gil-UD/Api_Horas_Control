package com.ensat.DTO;

import java.util.Date;

public class ProfileDTO extends UserDTO  {
	
	private String nombres;//cargo 
	private String apellidos;//nombre gerente
	private String nick;//
	private String correo;
	private String estado;
	private String cargo;
	private long idrol;
	private String jefeDirect;
	private String gerente;
	private Date fechaIngreso;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getidRol() {
		return idrol;
	}
	public void setidRol(long rol) {
		this.idrol = rol;
	}
	public String getJefeDirect() {
		return jefeDirect;
	}
	public void setJefeDirect(String jefeDirect) {
		this.jefeDirect = jefeDirect;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
