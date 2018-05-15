package com.runner.teacode.common.data;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Transactional(rollbackOn = {HibernateException.class})
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class GenericHibernateDao<T extends Serializable> extends AbstractHibernateDao<T> implements GenericDao<T> {

	@Override
	public final void setClazz(Class<T> clazz) {
		// TODO Auto-generated method stub
		setClass(clazz);
	}
	
}
