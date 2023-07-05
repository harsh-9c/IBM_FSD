package com.ibm.customer_project.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.customer_project.model.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers() throws SQLException;

	public Customer createCustomer(Customer customer) throws SQLException;
	
	public Customer findCustomerById(int id) throws SQLException;
	
	public List<Customer> findCustomerByFirstName(String firstName) throws SQLException;
	
	public Customer updateCustomer(int id,Customer customer) throws SQLException;

}