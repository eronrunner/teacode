package com.runner.teacode.web.accountmanagement.bussiness;

import java.util.Date;

import com.runner.teacode.common.message.ErrorMessage;
import com.runner.teacode.common.message.Message;

public class BussinessExceptionContainer {
	
	static public class AccountExistException extends BussinessException {
		@Override
		public Message getMsg() {
			// TODO Auto-generated method stub
			setMsg(new ErrorMessage("S900", "Account exist", new Date()));
			return super.getMsg();
		}
	}
}
