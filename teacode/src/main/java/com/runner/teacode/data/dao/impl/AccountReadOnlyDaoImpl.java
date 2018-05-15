package com.runner.teacode.data.dao.impl;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.runner.teacode.common.utils.DBSessionUtils;
import com.runner.teacode.data.dao.AccountReadOnlyDao;
import com.runner.teacode.data.model.Account;

@Repository
@Transactional(readOnly = true, rollbackFor = {HibernateException.class})
public class AccountReadOnlyDaoImpl implements AccountReadOnlyDao {
	@Autowired
	private DBSessionUtils _session;
	
	@Override
	public Account findByRegisteredEmail(String email) {
		String hql = "from " + Account.class.getName() + " where registeredEmail like " + email;
		return (Account) _session.getSession().createQuery(hql).uniqueResult();
	}

}
