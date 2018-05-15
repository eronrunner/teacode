package com.runner.teacode.web.bussiness.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.runner.teacode.web.bussiness.exception.BussinessExceptionContainer.*;

@RestControllerAdvice
public class BussinessExceptionController {
	
	@ExceptionHandler(value = {AccountExistException.class})
	public ResponseEntity<Object> handleAccountExistException(AccountExistException ex, WebRequest request){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.message());
	}
}
