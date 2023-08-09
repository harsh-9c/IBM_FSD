package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.SubTask;
import com.example.demo.entity.Task;

@Repository
public interface SubTaskRepository extends JpaRepository<SubTask, Long>{

	public List<SubTask> findByEmployeeId(Optional<Employee> emp);
	
	public SubTask findBySubTaskId(Long subtaskId);
	
	public List<SubTask> findByTaskId(Task taskId);
	
}
