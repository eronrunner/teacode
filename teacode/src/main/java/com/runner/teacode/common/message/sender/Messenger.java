package com.runner.teacode.common.message.sender;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import com.runner.teacode.common.message.Message;
import com.runner.teacode.common.message.wrapper.Wrapper;

public class Messenger implements Sender {
	
	private static String DEF_HOST = "localhost";
	public Messenger() {
		super();
	}
	
	static public Session getDefaultSession() {
		Properties props = new Properties();
		props.put("mail.smtp.host", DEF_HOST);
		return Session.getDefaultInstance(props);
	}
	
	public MimeMessage publish(Wrapper wrapper, Session session) throws MessagingException {
		MimeMessage published;
		if(session != null) published = new MimeMessage(session);
		else if(wrapper.getSession() != null) published = new MimeMessage(wrapper.getSession());
		else published = new MimeMessage(getDefaultSession());
		Message message = wrapper.getMessage();
		
		published.addFrom(message.getFrom().toArray(new Address[0]));
		published.addRecipients(RecipientType.TO, message.getTo().toArray(new Address[0]));
		published.addRecipients(RecipientType.CC, message.getCc().toArray(new Address[0]));
		published.addRecipients(RecipientType.BCC, message.getBcc().toArray(new Address[0]));
		published.setReplyTo(message.getReply().toArray(new Address[0]));
		published.setContent(message.getMultipart());
		published.setSubject(message.getSubject(), message.getCharset());
		published.setSender(message.getSender());
		published.setText(message.getTextContent(), message.getCharset(), message.getSubtype());
		
		return published;
	}
	
	public void send(Wrapper wrapper, Session session) throws MessagingException {
		Transport.send(publish(wrapper, session));
	}
	
}
