package com.runner.teacode.web.accountmanagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.runner.teacode.data.model.Account;
import com.runner.teacode.data.model.Member;
import com.runner.teacode.service.AccountAccessionService;

@RestController
@RequestMapping(value = "/account")
//@ResponseStatus(HttpSta)
@Proxy
public class AccountManagementGetController {
	@Autowired
	private AccountAccessionService _accessionService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> getOne(@PathVariable("id") String id) {
		return ResponseEntity.ok(_accessionService.findOne(id));
	}
	
	@GetMapping(value = "/allAccounts")
	public ResponseEntity<Object> getAll(){
		return ResponseEntity.ok(_accessionService.findAll());
	}
	
}
