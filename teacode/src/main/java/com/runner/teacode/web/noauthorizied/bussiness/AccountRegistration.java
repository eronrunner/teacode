package com.runner.teacode.web.noauthorizied.bussiness;

import java.io.Serializable;

import com.runner.teacode.data.model.Account;

public interface AccountRegistration {

	Serializable register(Account entity);

}
