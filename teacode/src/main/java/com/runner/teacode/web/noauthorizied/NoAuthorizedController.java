package com.runner.teacode.web.noauthorizied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runner.teacode.common.message.ResponseMessage;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.dto.AccountDto;
import com.runner.teacode.web.noauthorizied.bussiness.AccountRegistration;

@RestController
@RequestMapping(value = "/no-auth")
public class NoAuthorizedController {

	@Autowired
	private AccountRegistration _accountRegistration;
	
	@PostMapping(value = "/register/account")
	public ResponseEntity<Object> post(@RequestBody AccountDto dto) {
		Account entity = dto.mapToEntity(dto);
		_accountRegistration.register(entity);
		return ResponseEntity.ok(ResponseMessage.success());
	}
}
