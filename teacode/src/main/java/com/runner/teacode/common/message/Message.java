package com.runner.teacode.common.message;

import java.util.List;

import javax.mail.Address;
import javax.mail.Multipart;

public interface Message {
	
	public List<Address> getFrom();
	
	public List<Address> getTo();
	
	public List<Address> getCc();
	
	public List<Address> getBcc();
	
	public List<Address> getReply();
	
	public Multipart getMultipart();
	
	public String getTextContent();
	
	public Address getSender();
	
	public String getSubject();
	
	public String getCharset();

	public String getSubtype();
	
}
