package com.runner.teacode.common.security;

public class AuthRole {
	static public enum Role {
		ADMIN, USER
	}
	
	private Role role = Role.USER;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
