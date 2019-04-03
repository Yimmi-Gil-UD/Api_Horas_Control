package com.ensat.DTO;

import java.util.Date;

import com.ensat.entities.Tblcargo;

public class ProfileDTO extends UserDTO{
	
	
	
	private int identificacion;
	private String nombres;//cargo 
	private String apellidos;//nombre gerente
	private String nick;//
	private String correo;
	private String estado;
	private long cargo;
	private int rol;
	private int jefeDirect;
	private String gerente;
	private Date fechaIngreso;
	
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
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
	public long getCargo() {
		return cargo;
	}
	public void setCargo(long cargo) {
		this.cargo = cargo;
	}
	
	//public int getRol() {
	//	return rol;
	//}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public int getJefeDirect() {
		return jefeDirect;
	}
	public void setJefeDirect(int jefeDirect) {
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
