package com.runner.teacode.common.data;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.runner.teacode.common.utils.DBSessionUtils;

@Transactional
public class AbstractHibernateDao<T extends Serializable> {

	private Class<T> clazz;

	@Autowired
	private DBSessionUtils _session;

	public final void setClass(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T findOne(Serializable id) {
		return _session.getSession().get(clazz, id);
	}

	public List<T> findAll() {
		return _session.getSession().createQuery("from " + clazz.getName()).list();
	}

	public Serializable create(T entity) {
		return _session.getSession().save(entity);
	}

	public void update(T entity) {
		_session.getSession().merge(entity);
	}

	public void delete(T entity) {
		_session.getSession().delete(entity);
	}

	public T deleteById(Serializable entityId) {
		T entity = findOne(entityId);
		delete(entity);
		return entity;
	}
}
