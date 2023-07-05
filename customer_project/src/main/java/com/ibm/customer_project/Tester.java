package com.ibm.customer_project;

import java.sql.*;

import java.io.*;
import java.util.*;

import com.ibm.customer_project.model.Customer;
import com.ibm.customer_project.service.CustomerService;
import com.ibm.customer_project.service.CustomerServiceImpl;
import com.mysql.cj.jdbc.Driver;

public class Tester {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		FileInputStream inputStream=null;
		FileOutputStream outputStream=null;
		ObjectOutputStream output=null;
		ObjectInputStream input=null;
		
		try {
//			//1. registering driver
//			DriverManager.registerDriver(new Driver());
//			
//			//2. establishing the connection
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","harsh_9c");
			
//			//3. creating statement object
//			Statement statement=connection.createStatement();
			
//			//4. storing query data into result set
//			ResultSet rs= statement.executeQuery("select * from customers");
//			
//			inputStream = new FileInputStream("data.ser");
//			outputStream = new FileOutputStream("data.ser");
//			output = new ObjectOutputStream(outputStream);
//			input=new ObjectInputStream(inputStream);
//			
//			List<Customer> list=new ArrayList<>();
//			
//			while(rs.next()){
//				Customer customer=new Customer(rs.getInt("customer_id"),rs.getString("first_name"),rs.getString("last_lase"),rs.getString("email"));
//				list.add(customer);
////				System.out.println(rs.getInt("customer_id")+","+rs.getString("first_name")+","+rs.getString("last_lase")+","+rs.getString("email"));
//			}
//			
//			output.writeObject(list);
//			Object o=input.readObject();
//			List<Customer> list1=null;
//			if(o instanceof List){
//				list1=(List<Customer>)o;
//			}
//			
//			for(Customer p:list1){
//				System.out.println(p);
//			}		
			
			
			CustomerService service=new CustomerServiceImpl();
			
			
			Scanner sc=new Scanner(System.in);
			
			int choice=0;
			
			do {
				System.out.println("1. Create customer");
				System.out.println("2. Display all customers");
				System.out.println("3. Find customer by Id");
				System.out.println("4. Find customer by first name");	
				System.out.println("5. Update customer by Id");
				System.out.println("Enter your choice: ");
						
				choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter first name: ");
					String firstName=sc.next();
					System.out.println("Enter last name: ");
					String lastName=sc.next();
					System.out.println("Enter email: ");
					String email=sc.next();
					List<Customer> l=service.getAllCustomers();
					int id=l.size()+1;
					Customer c1=service.createCustomer(new Customer(id,firstName,lastName,email));
					break;
				case 2:
					System.out.println("All customers are given below:\n");
					l=service.getAllCustomers();
					for(Customer c:l){
						System.out.println(c);
					}
					break;
				case 3:
					System.out.println("Enter customer id: ");
					int id2=sc.nextInt();
					Customer customer=service.findCustomerById(id2);
					if(customer==null) {
						System.out.println("Customer with given id does not exist!");
					}
					else {
						
						System.out.println("customer found:\n"+customer);
					}
					break;
				case 4:
					System.out.println("Enter first name: ");
					String firstName2=sc.next();
					List<Customer> l2=service.findCustomerByFirstName(firstName2);
					if(l2.isEmpty()) {
						System.out.println("Customer with given first name does not exist!");
					}
					else {	
						for(Customer c:l2) {
							System.out.println("Customers with given first name:\n"+c);
						}
					}
					break;
				case 5:
					System.out.println("Enter customer id: ");
					int id3=sc.nextInt();
					System.out.println("Enter first name: ");
					String firstName3=sc.next();
					System.out.println("Enter last name: ");
					String lastName2=sc.next();
					System.out.println("Enter email: ");
					String email2=sc.next();
					 Customer customer2=service.updateCustomer(id3, new Customer(firstName3, lastName2, email2));
					 if(customer2==null){
						System.out.println("updated unsucessfully");
					  }
					  else{
						System.out.println("Customer updated:\n"+customer2);
					  }
				case 0:
					System.out.println("Session ended");
					System.exit(1);
					break;
				default:
					System.out.println("Invalid Choice!");
					break;
				
				}
				
			} while(choice!=0);
			
			
	
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
//		finally {
//			input.close();
//			output.close();
//		}

	}

}