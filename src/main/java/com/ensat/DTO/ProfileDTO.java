package com.ensat.DTO;

public class ProfileDTO extends UserDTO  {
	
	private int profileTypeCode;
//	private String Role;
//	private String Position;
//	private String Manager;
//	private String Leader;
//	private String Supervisor1;
//	private String Supervisor2;
//	private String NickName;
//	private String Cargo;

	public int getProfileTypeCode() {
		return profileTypeCode;
	}

	public void setProfileTypeCode(int profileTypeCode) {
		this.profileTypeCode = profileTypeCode;
	}
}
