package com.runner.teacode.common.message;

import java.util.Date;

public class ErrorMessage extends ResponseMessage implements Message {

	
	public ErrorMessage(String code, String message, Date date) {
		super(code, message, date);
		// TODO Auto-generated constructor stub
	}

}
