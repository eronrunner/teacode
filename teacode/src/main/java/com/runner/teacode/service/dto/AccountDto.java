package com.runner.teacode.service.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.runner.teacode.common.service.AbstractDto;
import com.runner.teacode.common.service.Dto;
import com.runner.teacode.data.model.Account;

public class AccountDto extends AbstractDto implements Dto {
	
	@NotNull
	@NotEmpty
	private String username;
	
	@NotNull
	@NotEmpty
	private String password;
	
	@NotNull
	@NotEmpty
	private String registeredEmail;
	
	private Short type;
	
	private Short state;
		
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegisteredEmail() {
		return registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public Account mapToEntity(Dto dto) {
		// TODO Auto-generated method stub
		return mapper.map(dto, Account.class);
	}

	public AccountDto mapToDto(Serializable entity) {
		// TODO Auto-generated method stub
		return mapper.map(entity, this.getClass());
	}
	
}
