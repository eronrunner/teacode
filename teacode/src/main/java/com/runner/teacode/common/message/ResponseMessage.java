package com.runner.teacode.common.message;

import java.util.Date;


public class ResponseMessage extends SystemMessage {

	public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseMessage(MessageCode code, String content, Date date) {
		super(code, content, date);
		// TODO Auto-generated constructor stub
	}
	
	static public ResponseMessage success() {
		return new ResponseMessage(ResponseMessageCode.SUCCESS, "", new Date());
	}
}
