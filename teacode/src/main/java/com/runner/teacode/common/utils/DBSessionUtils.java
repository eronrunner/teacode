package com.runner.teacode.common.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBSessionUtils {
	@Autowired
	private SessionFactory _sessionFactory;
	
	public Session getSession(){
		return _sessionFactory.getCurrentSession();
	};
}
