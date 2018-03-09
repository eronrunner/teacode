package com.runner.teacode.common.message;

import java.util.Date;


public class SuccessMessage extends ResponseMessage implements Message {

	public SuccessMessage(String code, String message, Date date) {
		super(code, message, date);
		// TODO Auto-generated constructor stub
	}

	public SuccessMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	static public SuccessMessage create() {
		return new SuccessMessage(Message.SUCCESS_CODE, Message.SUCCESS_MESS, new Date());
	}
}
