package com.runner.teacode.web.bussiness.exception;

import java.util.Date;

import com.runner.teacode.common.message.BussinessMessageCode;
import com.runner.teacode.common.message.Message;
import com.runner.teacode.common.message.ResponseMessage;

public class BussinessExceptionContainer {
	
	static public class AccountExistException extends BussinessExceptionImpl {
		private static final long serialVersionUID = -314727799586224149L;

		public ResponseMessage message() {
			// TODO Auto-generated method stub
			setMsg(new ResponseMessage(BussinessMessageCode.ACCOUNT_EXIST, "", new Date()));
			return getMsg();
		}
	}
	
	static public class RegisteredEmailExistException extends BussinessExceptionImpl {
		private static final long serialVersionUID = -314727799586224149L;

		public ResponseMessage message() {
			// TODO Auto-generated method stub
			setMsg(new ResponseMessage(BussinessMessageCode.REGISTERED_EMAIL_EXIST, "", new Date()));
			return getMsg();
		}
	}
}
