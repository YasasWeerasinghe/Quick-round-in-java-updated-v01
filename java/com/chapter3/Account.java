package com.chapter3;

public class Account {
	
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0)
			this.balance = balance;
	}
	
	
	public void Deposit(double depositAmount) {
		if(depositAmount > 0.0)
			balance += depositAmount;
	}
	
	public double getBalanace() {
		return balance;
	}
	
	// retrieve name from the object
	public String getName() {
		return name;
	}
	// set name to object
	public void setName(String name) {
		this.name = name;
	}
}
