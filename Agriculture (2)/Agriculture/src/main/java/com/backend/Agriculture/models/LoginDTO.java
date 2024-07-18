package com.backend.Agriculture.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
	
	private String email;
	
	private String password;
	
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password +  "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
