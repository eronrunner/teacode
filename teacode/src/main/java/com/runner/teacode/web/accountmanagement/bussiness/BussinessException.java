package com.runner.teacode.web.accountmanagement.bussiness;

import com.runner.teacode.common.message.Message;

public class BussinessException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1221493160177112293L;
	
	private Message msg;

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

}
