package com.runner.teacode.web.accountmanagement.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.runner.teacode.common.message.ResponseMessage;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.service.AccountManipulationService;
import com.runner.teacode.service.dto.AccountDto;
import com.runner.teacode.web.bussiness.exception.BussinessExceptionContainer.AccountExistException;

@RestController
@RequestMapping(value = "/accounts")
public class AccountManagementCrudController {
	
	@Autowired
	private AccountManipulationService _manipulationService;
	
	@PostMapping(value = "/")
	public ResponseEntity<Object> post(@RequestBody AccountDto dto) throws AccountExistException{
		Account entity = dto.mapToEntity(dto);
		_manipulationService.create(entity);
		return ResponseEntity.ok(ResponseMessage.success());
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<Object> put(@RequestBody AccountDto dto){
		Account entity = dto.mapToEntity(dto);
		_manipulationService.update(entity);
		return ResponseEntity.ok(ResponseMessage.success());
	}
	
	@DeleteMapping(value = "/")
	public ResponseEntity<Object> delete(@RequestParam("id") String id){
		_manipulationService.deleteById(id);
		return ResponseEntity.ok(ResponseMessage.success());
	}
}
