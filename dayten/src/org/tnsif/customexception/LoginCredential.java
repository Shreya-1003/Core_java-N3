package org.tnsif.customexception;

import java.util.Arrays;

public class LoginCredential extends Exception{
	
	private String str;

	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
	

	

	

	
	
	
	

}
