package com.ojas.entity;

public class UserResponse {
	private String token;
	private String message;

	public UserResponse() {
		super();
	}

	public UserResponse(String token, String message) {
		super();
		this.token = token;
		this.message = message;
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

	@Override
	public String toString() {
		return "UserResponse [token=" + token + ", message=" + message + "]";
	}

}
