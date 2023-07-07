package com.ibm.bank_project;

import com.ibm.bank_project.service.*;
import com.ibm.bank_project.model.*;
import java.util.*;

public class App {
	
    public static void main( String[] args ) {
    	
    	BankService service=new BankServiceImpl();
    	
    	Scanner sc=new Scanner(System.in);
    	
    	
    	
    	List<Account> list=service.listAccounts();
    	for(Account a:list) {
    		System.out.println(a);
    	}
        
    	
    	int choice=0;
    	
    	do {
    		System.out.println("------Banking Application-----");
    		System.out.println("1. Open account");
    		System.out.println("2. Display all accounts");
    		System.out.println("3. Show balance");
    		System.out.println("4. Deposit amount");
    		System.out.println("5. Withdraw amount");
    		System.out.println("6. Close account");
    		System.out.println("0. End this session");
    		System.out.println("\nEnter your choice: ");
    		choice=sc.nextInt();
    		
    		switch (choice) {
    		
    		case 1:
    			System.out.println("Enter your name: ");
    			String name1=sc.next();
    			Account acc1=service.openAccount(name1);
    	    	System.out.println("Account created successfully "+acc1);
    	    	break;
    	    
    		case 2:
    			System.out.println("All accounts are given below: ");
    			List<Account> list2=service.listAccounts();
    	    	for(Account a:list2) {
    	    		System.out.println(a);
    	    	}
    	    	break;
    	    
    		case 3:
    			System.out.println("Enter your account number: ");
    			int accNo3=sc.nextInt();
    			double balance2=service.getBalance(accNo3);
    			if(balance2>=0) {
    			
    				System.out.println("Toal balance: "+service.getBalance(accNo3));
    			}
    	        break;
    	        
    		case 4:
    			System.out.println("Enter your account number: ");
    			int accNo4=sc.nextInt();
    			System.out.println("Enter amount: ");
    			int ammount4=sc.nextInt();
    			service.deposit(accNo4, ammount4);
    			break;
    		
    		case 5:
    			System.out.println("Enter your account number: ");
    			int accNo5=sc.nextInt();
    			System.out.println("Enter amount: ");
    			int ammount5=sc.nextInt();
    			service.withdraw(accNo5, ammount5);
    			break;
    			
    		case 6:
    			System.out.println("Enter your account number: ");
    			int accNo6=sc.nextInt();
    			service.closeAccount(accNo6);
    			break;
     		
    		case 0:
				System.out.println("Session ended");
				System.exit(1);
			    break;
			    		    
			default:
				System.out.println("Invalid choice!");
				break;
			
    			
    		
    		}
    		
    	} while(choice!=0);
    	
    	
    	
    	
    	
    }
}
