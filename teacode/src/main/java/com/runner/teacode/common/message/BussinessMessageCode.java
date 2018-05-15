package com.runner.teacode.common.message;

public enum BussinessMessageCode implements MessageCode {
	
	ACCOUNT_EXIST("S900", "Account Exist")
	, REGISTERED_EMAIL_EXIST("S901", "Registered Email Exist")
	;
	
	private String code;
	private String message;
	
	private BussinessMessageCode(String sCode, String mess) {
		this.code = sCode;
		this.message = mess;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
