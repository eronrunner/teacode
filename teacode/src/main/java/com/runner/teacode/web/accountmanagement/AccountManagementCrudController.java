package com.runner.teacode.web.accountmanagement;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.runner.teacode.common.message.Message;
import com.runner.teacode.common.message.SuccessMessage;
import com.runner.teacode.data.dto.RegisteredAccount;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.AccountManipulationService;
import com.runner.teacode.web.accountmanagement.bussiness.BussinessExceptionContainer.AccountExistException;

@RestController
@RequestMapping(value = "/account")
public class AccountManagementCrudController {
	
	@Autowired
	private AccountManipulationService _manipulationService;
	
	@PostMapping(value = "/accounts")
	public ResponseEntity<Object> createAccount(@RequestBody RegisteredAccount entity) throws AccountExistException{
		Account newAccount = entity.map();
		_manipulationService.create(newAccount);
		return ResponseEntity.ok(SuccessMessage.create());
	}
	
	@PutMapping(value = "/accounts")
	public ResponseEntity<Object> updateAccount(@RequestBody Account entity){
		_manipulationService.update(entity);
		return ResponseEntity.ok(SuccessMessage.create());
	}
	
	@DeleteMapping(value = "/accounts")
	public ResponseEntity<Object> deleteAccount(@RequestParam("id") String id){
		_manipulationService.deleteById(id);
		return ResponseEntity.ok(SuccessMessage.create());
	}
}
