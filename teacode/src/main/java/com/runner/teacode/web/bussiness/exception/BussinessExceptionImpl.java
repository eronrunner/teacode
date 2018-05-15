package com.runner.teacode.web.bussiness.exception;

import com.runner.teacode.common.exception.AbstractBussinessException;
import com.runner.teacode.common.message.Message;
import com.runner.teacode.common.message.ResponseMessage;

public class BussinessExceptionImpl extends AbstractBussinessException implements BussinessException {
	
	private static final long serialVersionUID = 1221493160177112293L;
	
	public ResponseMessage message(){
		return super.getMsg();
	};
}
