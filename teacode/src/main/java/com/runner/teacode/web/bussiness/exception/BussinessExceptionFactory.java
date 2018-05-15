package com.runner.teacode.web.bussiness.exception;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BussinessExceptionFactory <T extends BussinessException> {
	
	private Class<T> clazz;
	
	public BussinessExceptionFactory(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}

	public BussinessException create() {
		BussinessException ex = null;
		Constructor<T> con;
		try {
			con = clazz.getConstructor();
			try {
				try {
					ex = con.newInstance();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ex;
	}
	
	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}
}
