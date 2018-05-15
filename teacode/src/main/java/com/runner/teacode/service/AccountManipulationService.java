package com.runner.teacode.service;

import java.io.Serializable;

import com.runner.teacode.data.model.Account;
import com.runner.teacode.web.bussiness.exception.BussinessExceptionContainer.AccountExistException;

public interface AccountManipulationService {
	
	Serializable create(Account entity) throws AccountExistException;
	
	void update(Account entity);
	
	void delete(Account entity);
	
	Account deleteById(Serializable entityId);
	
}
