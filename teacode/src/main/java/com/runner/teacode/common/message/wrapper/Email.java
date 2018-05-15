package com.runner.teacode.common.message.wrapper;

import javax.mail.Session;

import com.runner.teacode.common.message.EmailMessage;
import com.runner.teacode.common.message.Message;

public class Email implements Wrapper {

	private EmailMessage message;
	private Session session;
	private EmailType type;
	
	public Email(EmailMessage message, Session session, EmailType type) {
		super();
		this.message = message;
		this.session = session;
		this.type = type;
	}

	public Message getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	public Session getSession() {
		// TODO Auto-generated method stub
		return session;
	}

	public EmailType getType() {
		return type;
	}

}
