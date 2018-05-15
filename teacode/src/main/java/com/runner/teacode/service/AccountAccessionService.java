package com.runner.teacode.service;

import java.io.Serializable;

import java.util.List;

import com.runner.teacode.common.pagination.Page;
import com.runner.teacode.common.pagination.Pageable;
import com.runner.teacode.data.model.Account;

public interface AccountAccessionService {
	
	Account findOne(Serializable id);
	
	List<Account> findAll();

	Page<Account> find(Pageable pageable);
	
	Account findByRegisteredEmail(String email);
	
}
