package com.ensat.DTO;

public class UserDTO {
	
	private int Id_Usuario;
	private String Nombres;
	private String Apellidos;
	private int Id_Cargo;
	private Long Identification;
	private String Rol;
  
	public int getId_Usuario() {
		return Id_Usuario;
	}
	public void setId_Usuario(int id_Usuario) {
		Id_Usuario = id_Usuario;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getIdCargo() {
		return Id_Cargo;
	}
	public void setIdCargo(int cargo) {
		Id_Cargo = cargo;
	}
	public int getId_Cargo() {
		return Id_Cargo;
	}
	public void setId_Cargo(int id_Cargo) {
		Id_Cargo = id_Cargo;
	}
	public Long getIdentification() {
		return Identification;
	}
	public void setIdentification(Long identification) {
		Identification = identification;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}  
}
