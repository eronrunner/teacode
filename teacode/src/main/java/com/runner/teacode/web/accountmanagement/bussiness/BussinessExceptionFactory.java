package com.runner.teacode.web.accountmanagement.bussiness;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BussinessExceptionFactory <T extends Serializable> {
	
	private Class<T> clazz;
	
	public BussinessException create() {
		BussinessException ex = null;
		Constructor<T> con;
		try {
			con = clazz.getConstructor();
			try {
				ex = (BussinessException) con.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
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
