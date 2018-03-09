package com.runner.teacode.service;

import java.io.Serializable;
import java.util.List;

import com.runner.teacode.data.model.Account;

public interface AccountAccessionService {
	
	Account findOne(Serializable id);
	
	List<Account> findAll();
	
}
