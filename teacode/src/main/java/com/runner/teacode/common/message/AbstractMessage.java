package com.runner.teacode.common.message;

import java.io.File;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;

public abstract class AbstractMessage {
	
	private MessageCode code;
	private List<Address> from;
	private List<Address> to;
	private List<Address> cc;
	private List<Address> bcc;
	private List<Address> reply;
	private Multipart multipart;
	private String textContent;
	private Address sender;
	private String subject;
	private String charset;
	private String subtype;
	
	public AbstractMessage(MessageCode code) {
		super();
		this.code = code;
	}
	
	public MessageCode getCode() {
		return code;
	}
	public List<Address> getFrom() {
		return from;
	}
	public void setFrom(List<Address> from) {
		this.from = from;
	}
	public List<Address> getTo() {
		return to;
	}
	public void setTo(List<Address> to) {
		this.to = to;
	}
	public List<Address> getCc() {
		return cc;
	}
	public void setCc(List<Address> cc) {
		this.cc = cc;
	}
	public List<Address> getBcc() {
		return bcc;
	}
	public void setBcc(List<Address> bcc) {
		this.bcc = bcc;
	}
	public List<Address> getReply() {
		return reply;
	}
	public void setReply(List<Address> reply) {
		this.reply = reply;
	}
	public Multipart getMultipart() {
		return multipart;
	}
	public void setMultipart(Multipart multipart) {
		this.multipart = multipart;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	public Address getSender() {
		return sender;
	}
	public void setSender(String sender) throws AddressException {
		this.sender = new InternetAddress(sender);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public void addFrom(String address) throws AddressException {
		from.add(new InternetAddress(address));
	}
	public void addTo(String address) throws AddressException {
		to.add(new InternetAddress(address));
	}
	public void addBcc(String address) throws AddressException {
		bcc.add(new InternetAddress(address));
	}
	public void addCc(String address) throws AddressException {
		cc.add(new InternetAddress(address));
	}
	public void addReply(String address) throws AddressException {
		reply.add(new InternetAddress(address));
	}
	
	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public void addPart(String name, File file) throws MessagingException{
		DataSource dataSource = new FileDataSource(file);
		BodyPart body = new MimeBodyPart();
			body.setDataHandler(new DataHandler(dataSource));
			body.setFileName(name);
			multipart.addBodyPart(body);
	}
	
}
