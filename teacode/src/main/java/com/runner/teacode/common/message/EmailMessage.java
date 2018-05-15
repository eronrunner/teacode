package com.runner.teacode.common.message;

import java.io.File;
import java.util.List;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.AddressException;

public class EmailMessage extends AbstractMessage implements Message {
	
	private EmailMessage(MessageCode code){
		super(code);
	}
	
	static public class EmailMessageBuilder {
		private EmailMessage message;
		
		public EmailMessageBuilder(MessageCode code){
			super();
			message = new EmailMessage(code);
		}
		
		public EmailMessage build() {
			return message;
		}
		
		public EmailMessageBuilder setFrom(List<Address> from) {
			message.setFrom(from);
			return this;
		}
		public EmailMessageBuilder setTo(List<Address> to) {
			message.setTo(to);
			return this;
		}
		public EmailMessageBuilder setCc(List<Address> cc) {
			message.setCc(cc);
			return this;
		}
		public EmailMessageBuilder setBcc(List<Address> bcc) {
			message.setBcc(bcc);
			return this;
		}
		public EmailMessageBuilder setReply(List<Address> reply) {
			message.setReply(reply);
			return this;
		}
		public EmailMessageBuilder setMultipart(Multipart multipart) {
			message.setMultipart(multipart);
			return this;
		}
		public EmailMessageBuilder setTextContent(String textContent) {
			message.setTextContent(textContent);
			return this;
		}
		public EmailMessageBuilder setSender(String sender) throws AddressException {
			message.setSender(sender);
			return this;
		}
		public EmailMessageBuilder setSubject(String subject) {
			message.setSubject(subject);
			return this;
		}
		public EmailMessageBuilder setCharset(String charset) {
			message.setCharset(charset);
			return this;
		}
		public EmailMessageBuilder addFrom(String address) throws AddressException {
			message.addFrom(address);
			return this;
		}
		public EmailMessageBuilder addTo(String address) throws AddressException {
			message.addTo(address);
			return this;
		}
		public EmailMessageBuilder addBcc(String address) throws AddressException {
			message.addBcc(address);
			return this;
		}
		public EmailMessageBuilder addCc(String address) throws AddressException {
			message.addCc(address);
			return this;
		}
		public EmailMessageBuilder addReply(String address) throws AddressException {
			message.addReply(address);
			return this;
		}
		public EmailMessageBuilder addPart(String name, File file) throws MessagingException{
			message.addPart(name, file);
			return this;
		}
		public EmailMessageBuilder setSubtype(String subtype) {
			message.setSubtype(subtype);
			return this;
		}
	}

}
