package com.ibm.bank_project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "account")
@Entity

public class Account {
	
	 @Id
	  @Column(name="account_number")
	  private int accountNumber;
	  @Column(name="owner_name")
	  private String ownerName;
	  @Column(name="balance")
	  private double balance;
	  
	  
	public Account(String ownerName) {
		super();
		this.ownerName = ownerName;
	}
	  
	  
	  
}

