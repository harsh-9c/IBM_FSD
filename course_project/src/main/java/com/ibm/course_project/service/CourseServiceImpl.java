package com.ibm.course_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ibm.course_project.model.Course;
import com.ibm.customer_project.factory.MyConnectionFactory.*;
import com.ibm.customer_project.model.Customer;
import com.ibm.course_project.factory.*;



public class CourseServiceImpl implements CourseService {
	
	private MyConnectionFactory myConnectionFactory=null;
	
    private List<Course> courses;
	
	private Connection connection=null;
	
	
	
	{
		try {
			courses=new ArrayList<Course>();
			myConnectionFactory=MyConnectionFactory.getMyFactory();
			connection=myConnectionFactory.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
//	1. Create course

	@Override
	public Course createCourse(Course course) throws SQLException {

		PreparedStatement pStatement = connection.prepareStatement("insert into course(course_id,course_name,instructor_name) values(?,?,?)");
		pStatement.setInt(1, course.getCourseId());
		pStatement.setString(2, course.getCourseName());
		pStatement.setString(3, course.getInstructorName());
		
		int result=pStatement.executeUpdate();
		System.out.println(result+" Course created successfully");

		return course;	
		
	}
	
	
//	2. Display all courses
	
	@Override
	public List<Course> showAllCourses() throws SQLException {
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from course");
		while(resultSet.next()) {
			courses.add(new Course(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
		}
		return courses;
	}
	
	

	
//	3. Find course by name

	@Override
	public List<Course> findCourseByName(String name) throws SQLException {
		
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from customers where course_name=?");
		pStatement.setString(1, name);
        ResultSet rs=pStatement.executeQuery();
        
        List<Course> c=new ArrayList<Course>();
        
        while(rs.next()) {
        	c.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3)));
        }
        
        if(c.isEmpty()) {
        	return null;
        }
        else {
        	return c;
        }
		
	}

//	4. Find course by id

	@Override
	public Course findCourseById(int id) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from course where course_id=?");
		pStatement.setInt(1,id);
		ResultSet rs=pStatement.executeQuery();
		
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		
		if(courses.isEmpty()) {
			return null;
		}
		else{
			return courses.get(0);
		}
			
	}
	
	
//	5. Update course by id


	@Override
	public Course updateCourseById(int id,Course course) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from course where course_id=?");
		pStatement.setInt(1,id);
		ResultSet rs=pStatement.executeQuery();
		
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		
		if(courses.isEmpty()) {
			System.out.println("No course exist with given id!");
			return null;
		}
		else {
			pStatement=connection.prepareStatement("update course set course_name=?,instructor_name=? where customer_id=?");
			pStatement.setString(1, course.getCourseName());
			pStatement.setString(2,course.getInstructorName());
			pStatement.setInt(3, id);
			pStatement.executeUpdate();
			return course;
		}
		
		
	}

	
//	6. Delete course by id

	@Override
	public void deleteCourseById(int id) throws SQLException {
		PreparedStatement pStatement=null;
		pStatement=connection.prepareStatement("select * from course where course_id=?");
		pStatement.setInt(1,id);
		ResultSet rs=pStatement.executeQuery();
		
		while(rs.next()) {
			courses.add(new Course(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		if(courses.isEmpty()) {
			System.out.println("No course exist with given id!");
		}
		else {
			pStatement=connection.prepareStatement("delete from course where course_id=?");
			pStatement.setInt(1, id);
			pStatement.executeUpdate();
			System.out.println("Course removed successfully");
		}
		
	}


	@Override
	public void deleteAllCourses() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you sure to delete all courses(yes/no)?");
		String str=sc.next();
		
		if(str.equals("yes")) {
			PreparedStatement pStatement = null;
			pStatement = connection.prepareStatement("delete from courses");
			pStatement.executeUpdate();
			System.out.println("All courses removed successfully");
		}
		else {
			System.out.println("Operation aborted!");
		}		
	}
	
//	7. Delete all courses
	
	

	
	







	
	
	

}
