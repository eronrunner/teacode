package com.runner.teacode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.runner.teacode.common.message.sender.Messenger;
import com.runner.teacode.common.message.sender.Sender;

@Configuration
public class PropertiesCongfiguration   {
	
	@Bean
	public Messenger messageSender(){
		return new Messenger();
	}
}
