package com.ojas.entity;

import java.util.Set;

public class UserResponse {
	private String token;
	private String message;
	private Set<String> roles;
	
	public UserResponse() {
		super();
	}
	public UserResponse(String token, String message, Set<String> roles) {
		super();
		this.token = token;
		this.message = message;
		this.roles = roles;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
}
