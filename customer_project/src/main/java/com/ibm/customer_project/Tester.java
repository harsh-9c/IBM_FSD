package com.ibm.customer_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
//			Customer c1=service.createCustomer(new Customer(2,"Sachin","Tendulkar","sachin@gmail.com"));
//			List<Customer> l=service.getAllCustomers();
//			for(Customer c:l){
//				System.out.println(c);
//			}
			
			Customer customer=service.findCustomerById(2);
			if(customer==null) {
				System.out.println("Customer with given id not exist!");
			}
			else {
				
				System.out.println("customer found: "+customer);
			}
//					
////			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
//		finally {
//			input.close();
//			output.close();
//		}

	}

}