package com.ibm.course_project.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.course_project.model.Course;

public interface CourseService {
	
	public Course createCourse(Course course) throws SQLException;
	
	public List<Course> findCourseByName(String courseName) throws SQLException;
	
	public List<Course> showAllCourses() throws SQLException;
	
	public Course findCourseById(int id) throws SQLException;
	
	public Course updateCourseById(int id,Course course) throws SQLException;
	
	public void deleteCourseById(int id) throws SQLException;
	
	public void deleteAllCourses() throws SQLException;

}
