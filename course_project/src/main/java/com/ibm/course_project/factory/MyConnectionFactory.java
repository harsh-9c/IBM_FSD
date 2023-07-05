package com.ibm.course_project.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class MyConnectionFactory {
	
private   Connection CONNECTION=null;
	
	private static MyConnectionFactory myConnectionFactory;
	
	private MyConnectionFactory() throws SQLException{	 
		
	}
	
	
	
	public Connection getConnection() throws SQLException{
		DriverManager.registerDriver(new Driver());
		CONNECTION=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","harsh_9c");
		return CONNECTION;
	}
	
	
	public static MyConnectionFactory getMyFactory() throws SQLException{
		try {
			if(myConnectionFactory==null){
				
				myConnectionFactory=new MyConnectionFactory();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return myConnectionFactory;
	}

}
