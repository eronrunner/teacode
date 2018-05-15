package com.runner.teacode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runner.teacode.common.message.sender.Sender;
import com.runner.teacode.common.message.wrapper.Wrapper;
import com.runner.teacode.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
	@Autowired
	private Sender _sender;
	
	@Override
	public void sendEmail(Wrapper wrapper) {
		// TODO Auto-generated method stub
		
	}

}
