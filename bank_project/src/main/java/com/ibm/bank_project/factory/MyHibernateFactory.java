package com.ibm.bank_project.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.bank_project.model.Account;

public class MyHibernateFactory {
	
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class).buildSessionFactory();
		return sessionFactory;
	}
	

}
