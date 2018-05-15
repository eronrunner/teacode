package com.runner.teacode.common.message.wrapper;

import javax.mail.Session;

import com.runner.teacode.common.message.Message;

public interface Wrapper {
	
	Message getMessage();
	
	Session getSession();
	
	EmailType getType();
}
