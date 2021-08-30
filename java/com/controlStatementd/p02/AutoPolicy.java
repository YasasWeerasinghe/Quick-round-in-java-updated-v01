package com.controlStatementd.p02;

public class AutoPolicy {
	
	private int accountNo;
	private String car;
	private String state;
	
	public AutoPolicy(int accountNo, String car, String state) 
	{
		this.accountNo = accountNo;
		this.car = car;
		this.state = state;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public String getCar() {
		return car;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public boolean isNotFaultState() {
		boolean noFaultSate;
		
		switch(getState()) 
		{
		case "MA":	case "NJ": case "NY":case "PA":
			noFaultSate = true;
			break;
		default:
			noFaultSate = false;
			break;			
		}
		
	return noFaultSate;
	}


}
