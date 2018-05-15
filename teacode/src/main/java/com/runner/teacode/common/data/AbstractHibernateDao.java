package com.runner.teacode.common.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.runner.teacode.common.pagination.Page;
import com.runner.teacode.common.pagination.Pageable;
import com.runner.teacode.common.utils.DBSessionUtils;

@Transactional(rollbackOn = {HibernateException.class})
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

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return _session.getSession().createQuery("from " + clazz.getName()).list();
	}
	
	public List<T> find(Pageable pageable, Page<T> page) {
		String hql = "from " + clazz.getName() + " order by";
		String[] sort = pageable.getSort();
		String[] dirSort = pageable.getDirSort();
 		for(int i = 0; i < sort.length; i++) {
			hql += " " + sort[i] + " " + dirSort[i];
			if(i != sort.length - 1) hql += ",";
		}
 		@SuppressWarnings("unchecked")
		Query<T> query = _session.getSession().createQuery(hql);
 		List<T> list = new ArrayList<T>();
 			list = query.list();				
 		if(list.size() < pageable.getSize()) {
 			page.setContent(list);
 			page.setCurrent(1);
 			page.setSize(list.size());
 			page.setTotal(1);
 		}else {
 	 		page.setTotal(list.size() / pageable.getSize() + list.size() % pageable.getSize());
 	 		query.setFirstResult((pageable.getPage() - 1) * 0);
 	 		query.setMaxResults(pageable.getSize());
 	 		page.setContent(query.list());
 	 		page.setCurrent(pageable.getPage());
 	 		page.setSize(pageable.getSize());
 		}
 	
		return query.list();
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
