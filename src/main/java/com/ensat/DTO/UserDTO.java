package com.ensat.DTO;


public class UserDTO {
  private int Id_Usuario;
  private String Nombres;
  private String Apellidos;
  private int Cargo;
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
public int getCargo() {
	return Cargo;
}
public void setCargo(int cargo) {
	Cargo = cargo;
}
	
}
