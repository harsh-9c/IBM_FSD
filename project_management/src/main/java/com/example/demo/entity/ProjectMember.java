package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="project_member")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectMember implements Serializable{
	
	@Id
	@ManyToOne(fetch=FetchType.LAZY,optional=false,targetEntity=Employee.class)
	@JoinColumn(name="employee_id")
	private Employee employeeId;
	
	@Id	
	@ManyToOne(fetch = FetchType.LAZY,optional=true,targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project projectId;
	
	@NotNull
	@Column(name = "authority", columnDefinition="boolean default 1")
	private boolean authority;
	

}
