package com.runner.teacode.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runner.teacode.common.data.GenericDao;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.AccountAccessionService;

@Service
public class AccountAccessionServiceImpl implements AccountAccessionService {

	private GenericDao<Account> _accountDao;

	@Autowired
	public void set_accountDao(GenericDao<Account> daoToSet) {
		_accountDao = daoToSet;
		_accountDao.setClazz(Account.class);
	}

	@Override
	public Account findOne(Serializable id) {
		// TODO Auto-generated method stub
		return _accountDao.findOne(id);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return _accountDao.findAll();
	}
	
}
