package com.runner.teacode.common.message;

import java.util.Date;

import org.springframework.http.HttpStatus;

public abstract class ResponseMessage {

	private String code;
	private String message;
	private Date date;
	
	public ResponseMessage(String code, String message, Date date) {
		super();
		this.code = code;
		this.message = message;
		this.date = date;
	}

	public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
