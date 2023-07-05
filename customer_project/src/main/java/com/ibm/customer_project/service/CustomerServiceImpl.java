package com.ibm.customer_project.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
		System.out.println(result+" rows inserted/updated");

		return customer;
	}

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

}