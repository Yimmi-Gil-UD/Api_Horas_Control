package com.ensat.application;

import java.nio.ByteBuffer;

import com.ensat.DTO.UserDTO;
import com.ensat.entities.Tblusuario;

public class ModelAssembler {
	
	public static Tblusuario CreateUser(UserDTO usuario) {
		Tblusuario user = new Tblusuario();
		
		user.setNick(usuario.getNickName());
		//user.setClavesegura(usuario.getPassword().getBytes());

		return user;
	}
	
	public static byte[] longToBytes(long x) {
	    ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
	    buffer.putLong(x);
	    return buffer.array();
	}
	
}
