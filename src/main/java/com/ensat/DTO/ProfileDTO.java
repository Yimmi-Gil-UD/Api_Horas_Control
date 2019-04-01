package com.ensat.DTO;

public class ProfileDTO extends UserDTO  {
	
	private int ProfileTypeCode;
	private String Role;
	private String Position;
	private String Manager;
	private String Leader;
	private String Supervisor1;
	private String Supervisor2;
	private String NickName;
	private String Cargo;
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	private int Enabled;
	
	public int getProfileTypeCode() {
		return ProfileTypeCode;
	}
	public void setProfileTypeCode(int profileTypeCode) {
		ProfileTypeCode = profileTypeCode;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getLeader() {
		return Leader;
	}
	public void setLeader(String leader) {
		Leader = leader;
	}
	public String getSupervisor1() {
		return Supervisor1;
	}
	public void setSupervisor1(String supervisor1) {
		Supervisor1 = supervisor1;
	}
	public String getSupervisor2() {
		return Supervisor2;
	}
	public void setSupervisor2(String supervisor2) {
		Supervisor2 = supervisor2;
	}
	public int getEnabled() {
		return Enabled;
	}
	public void setEnabled(int enabled) {
		Enabled = enabled;
	}
}
