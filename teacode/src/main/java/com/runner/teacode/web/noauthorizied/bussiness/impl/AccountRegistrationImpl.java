package com.runner.teacode.web.noauthorizied.bussiness.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.AccountAccessionService;
import com.runner.teacode.service.AccountManipulationService;
import com.runner.teacode.web.bussiness.exception.BussinessExceptionContainer.*;
import com.runner.teacode.web.noauthorizied.bussiness.AccountRegistration;

@Component
public class AccountRegistrationImpl implements AccountRegistration {
	
	@Autowired
	private AccountAccessionService _accountAccession;
	@Autowired
	private AccountManipulationService _accountCrub;
	
	public Serializable register(Account entity) {
		Account exist = _accountAccession.findOne(entity.getUsername());		
		if(exist != null) throw new AccountExistException();
		Account emailExist = _accountAccession.findByRegisteredEmail(entity.getRegisteredEmail());
		if(emailExist != null) throw new RegisteredEmailExistException();
		
		entity.setState(new Short("1"));
		entity.setType(new Short("1"));
		//send email to confirm
		
		return _accountCrub.create(entity);
	}

}
