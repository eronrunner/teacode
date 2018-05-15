package com.runner.teacode.common.data;

import java.io.Serializable;
import java.util.List;

import com.runner.teacode.common.pagination.Page;
import com.runner.teacode.common.pagination.Pageable;

public interface GenericDao<T extends Serializable> {
	
	T findOne(Serializable id);
	
	List<T> findAll();
	
	Serializable create(T entity);
	
	void update(T entity);
	
	void delete(T entity);
	
	T deleteById(Serializable entityId);

	void setClazz(Class<T> clazz);

	List<T> find(Pageable pageable, Page<T> page);
}
