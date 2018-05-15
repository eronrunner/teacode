package com.runner.teacode.common.exception;

import com.runner.teacode.common.message.Message;
import com.runner.teacode.common.message.ResponseMessage;

public abstract class AbstractBussinessException extends RuntimeException {

	private static final long serialVersionUID = 771657492098983567L;

	private ResponseMessage msg;
	
	public ResponseMessage getMsg() {
		return msg;
	}

	public void setMsg(ResponseMessage msg) {
		this.msg = msg;
	}
}
