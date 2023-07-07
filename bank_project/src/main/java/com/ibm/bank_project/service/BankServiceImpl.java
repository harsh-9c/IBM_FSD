package com.ibm.bank_project.service;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.bank_project.factory.MyHibernateFactory;
import com.ibm.bank_project.model.Account;


public class BankServiceImpl implements BankService{
	
    private SessionFactory sessionFactory;
    
    int min=1000000;
    int max=99999990;
	
	private Session session=null;
	
	{
		sessionFactory=MyHibernateFactory.getSessionFactory();
	}
	
	

	@Override
	public Account openAccount(String ownerName) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		Account acc=new Account((int)(Math.random()*(max-min+1)+min),ownerName,0);
		session.save(acc);
		session.getTransaction().commit();
		return acc;
	}



	@Override
	public List<Account> listAccounts() {
		session=sessionFactory.openSession();
		TypedQuery<Account> query=session.createQuery("FROM Account A",Account.class);
		List<Account> list=query.getResultList();
		return list;
	}



	@Override
	public double getBalance(int accountNumber) {
		session=sessionFactory.openSession();
		Account a=session.find(Account.class, accountNumber);
		if(a==null) {
			System.out.println("Invalid account number!");
			return -1;
		}
		double balance=a.getBalance();
		return balance;
		
	}



	@Override
	public void deposit(int accountNumber, double amount) {
		session=sessionFactory.openSession();
		Account a=session.find(Account.class, accountNumber);
		if(a==null) {
			System.out.println("Invalid account number!");
		}
		else {
			a.setBalance(a.getBalance()+amount);
			System.out.println("Amount deposited successfully");
		}
		
	}



	@Override
	public double withdraw(int accountNumber, double amount) {
		session=sessionFactory.openSession();
		Account a=session.find(Account.class, accountNumber);
		if(a==null) {
			System.out.println("Invalid account number!");
			return -1;
		}
		else {
			if(a.getBalance()<amount) {
				System.out.println("Insufficient balance!");
				return -2;
			}
			else {
				a.setBalance(a.getBalance()-amount);
				double remainingBalance=a.getBalance();
				System.out.println("Withdrew successfully");
				return remainingBalance;
			}
			
			
		}
	}



	@Override
	public void closeAccount(int accountNumber) {
		session=sessionFactory.openSession();
		session.getTransaction().begin();
		Account a=session.get(Account.class, accountNumber);
		session.getTransaction().begin();
		
		if(a==null) {
			System.out.println("Invalid account number!");
		}
		else {
			session.getTransaction().begin();
			session.remove(a);
			session.getTransaction().commit();
			System.out.println("Account closed successfully");
		}

	
	}

	
	
	
}
