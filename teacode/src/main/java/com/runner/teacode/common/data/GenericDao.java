package com.runner.teacode.common.data;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable> {
	
	T findOne(Serializable id);
	
	List<T> findAll();
	
	Serializable create(T entity);
	
	void update(T entity);
	
	void delete(T entity);
	
	T deleteById(Serializable entityId);

	void setClazz(Class<T> clazz);
}
