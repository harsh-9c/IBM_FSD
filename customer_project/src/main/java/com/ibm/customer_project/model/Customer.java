package com.ibm.customer_project.model;

import java.io.Serializable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Customer implements Serializable {
	
	private int id;
	private String firstName;
	private String lastName;
	private String  email;
	

	
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
