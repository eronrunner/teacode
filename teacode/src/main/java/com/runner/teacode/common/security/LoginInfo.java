package com.runner.teacode.common.security;

public class LoginInfo {
	
	private String id;
	
	private String token;
	
	private String avatar;

	public LoginInfo(String id, String token, String avatar) {
		super();
		this.id = id;
		this.token = token;
		this.avatar = avatar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
