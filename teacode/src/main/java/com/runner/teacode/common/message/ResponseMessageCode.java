package com.runner.teacode.common.message;

public enum ResponseMessageCode implements MessageCode {
	
	SUCCESS("S200", "Success"),
	;
	
	private String code;
	private String message;
	
	private ResponseMessageCode(String sCode, String mess){
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
