package com.ibm.customer_project.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import com.ibm.customer_project.factory.MyConnectionFactory;
import com.ibm.customer_project.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
private MyConnectionFactory myConnectionFactory=null;
	
	private List<Customer> customers;
	
	private Connection connection=null;
	
	{
		try {
			customers=new ArrayList<Customer>();
			myConnectionFactory=MyConnectionFactory.getMyFactory();
			connection=myConnectionFactory.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
//	1. Storing customer

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from customers");
		while(resultSet.next())
		{
			customers.add(new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
		}
		return customers;
	}
	
//	2. Inserting customer
	
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {

		PreparedStatement pStatement = connection.prepareStatement("insert into customers(customer_id,first_name,last_lase,email) values(?,?,?,?)");
		pStatement.setInt(1, customer.getId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		int result=pStatement.executeUpdate();
		System.out.println(result+" Customer created");

		return customer;
	}
	
//	3. Find customer by id

	@Override
	public Customer findCustomerById(int id) throws SQLException {
		
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from customers where customer_id=?");
		pStatement.setInt(1, id);
        ResultSet rs=pStatement.executeQuery();
        
        while(rs.next()) {
        	customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
		
		if(customers.isEmpty()) {
			return null;
		}
		else {
			return customers.get(0);
		}
        
	}
	
//	4. Find customer by first name

	@Override
	public List<Customer> findCustomerByFirstName(String firstName) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from customers where first_name=?");
		pStatement.setString(1, firstName);
        ResultSet rs=pStatement.executeQuery();
        
        List<Customer> c=new ArrayList<Customer>();
        
        while(rs.next()) {
        	c.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        
        if(c.isEmpty()) {
        	return null;
        }
        else {
        	return c;
        }
		
	}

//	5. Update customer by id
	
	@Override
	public Customer updateCustomer(int id, Customer customer) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from customers where customer_id=?");
		pStatement.setInt(1, id);
        ResultSet rs=pStatement.executeQuery();
        
        while(rs.next()) {
        	customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
		
		if(customers.isEmpty()) {
			return null;
		}
		else {
			pStatement=connection.prepareStatement("update customers set first_name=?,last_lase=?,email=?  where customer_id=?");
	        pStatement.setString(1, customer.getFirstName());
			pStatement.setString(2, customer.getLastName());
			pStatement.setString(3, customer.getEmail());
			pStatement.setInt(4, id);
			pStatement.executeUpdate();
			return customer;
			
		}
		
	}

//	6. Delete customer by id
	
	@Override
	public void deleteCustomerById(int id) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from customers where customer_id=?");
		pStatement.setInt(1, id);
        ResultSet rs=pStatement.executeQuery();
        
        while(rs.next()) {
        	customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
		
		if(customers.isEmpty()) {
			System.out.printf("customer with ID=%d does not exist ", id);
		}
		else {
			pStatement = connection.prepareStatement("delete from customers where customer_id=?");
			pStatement.setInt(1, id);
			pStatement.executeUpdate();
			System.out.printf("customer with ID=%d removed", id);
		}
		
	}
	
//	7. Delete all customers

	@Override
	public void deleteAllCustomers() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you sure to delete all customers(yes/no)?");
		String str=sc.next();
		
		if(str.equals("yes")) {
			PreparedStatement pStatement = null;
			pStatement = connection.prepareStatement("delete from customers");
			pStatement.executeUpdate();
			System.out.println("All customers removed successfully");
		}
		else {
			System.out.println("Operation aborted!");
		}		
		
	}

}