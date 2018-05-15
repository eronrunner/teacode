package com.runner.teacode.data.dao;

import com.runner.teacode.data.model.Account;

public interface AccountReadOnlyDao {
	
	Account findByRegisteredEmail(String email);
}
