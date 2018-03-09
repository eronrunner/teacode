package com.runner.teacode.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runner.teacode.common.data.GenericDao;
import com.runner.teacode.data.TeacodeConstants;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.AccountManipulationService;
import com.runner.teacode.web.accountmanagement.bussiness.BussinessExceptionContainer.AccountExistException;

@Service
public class AccountManipulationServiceImpl implements AccountManipulationService {
	
	private GenericDao<Account> _accountDao;
		
	@Autowired
	public void set_accountDao(GenericDao<Account> daoToSet) {
		_accountDao = daoToSet;
		_accountDao.setClazz(Account.class);
	}
	
	@Override
	public Serializable create(Account entity) throws AccountExistException {
		// TODO Auto-generated method stub
		Account exist = _accountDao.findOne(entity.getUsername());
		if(exist != null) throw new AccountExistException();
		entity.setType(TeacodeConstants.DEF_ACCOUNT_TYPE);
		return _accountDao.create(entity);
	}

	@Override
	public void update(Account entity) {
		// TODO Auto-generated method stub
		_accountDao.update(entity);
	}

	@Override
	public void delete(Account entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account deleteById(Serializable entityId) {
		// TODO Auto-generated method stub
		return _accountDao.deleteById(entityId);
	}

}
