package com.runner.teacode.common.message;

import java.util.Date;

public abstract class SystemMessage {

	private MessageCode code;
	private String content;
	private Date date;
	
	public SystemMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SystemMessage(MessageCode code, String content, Date date) {
		super();
		this.code = code;
		this.content = content;
		this.date = date;
	}

	public MessageCode getCode() {
		return code;
	}

	public void setCode(MessageCode code) {
		this.code = code;
	}


	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
