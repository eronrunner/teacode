package com.runner.teacode.web.accountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.runner.teacode.common.pagination.RequestPageable;
import com.runner.teacode.service.AccountAccessionService;

@RestController
@RequestMapping(value = "/accounts")
public class AccountManagementGetController {
	@Autowired
	private AccountAccessionService _accessionService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") String id) {
		Object rs = _accessionService.findOne(id);
		return ResponseEntity.ok(rs);
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<Object> get(){
		Object rs = _accessionService.findAll();
		return ResponseEntity.ok(rs);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<Object> get(@RequestParam("page") Integer page, @RequestParam("size") Integer size, @RequestParam("dirSort") String[] dirSort, @RequestParam("sort") String[] sort) {
		Object rs = _accessionService.find(new RequestPageable(new String[0], new String[0], page, size, dirSort, sort));
		return ResponseEntity.ok(rs);
	}
	
}
