package com.ibm.bank_project.service;

import java.util.List;

import com.ibm.bank_project.model.Account;

public interface BankService {
	
	public Account openAccount(String ownerName);
	
	public List<Account> listAccounts();
	
	public double getBalance(int accountNumber);
	
	public void deposit(int accountNumber,double amount);
	
	public double withdraw(int accountNumber,double amount);
	
	public void closeAccount(int accountNumber);

}
