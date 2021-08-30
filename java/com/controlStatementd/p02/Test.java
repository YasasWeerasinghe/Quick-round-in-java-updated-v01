package com.controlStatementd.p02;

public class Test {

	public static void main(String[] args) {
		
//		//while loop
//		
//		int total = 0;
//		int count = 0;
//		
//		while(count < 10) 
//		{
//			System.out.println("while loop count " + count);
//			count++;
//		}
//		
//		count = 0;
//		//do while
//		
//		do 
//		{
//			System.out.println("do while loop count " + count);
//			count++;
//		}
//		while(count < 10);				
//
//		// for
//		
//		for(int i = 0; i < count; i++) 
//		{
//			switch(i) 
//			{
//			case 1:
//				System.out.println("A " + i);
//				break;
//			case 5:
//				System.out.println("E " + i);
//				break;
//			case 8:
//				System.out.println("H " + i);
//				break;
//			case 9:
//				System.out.println("I " + i);
//				break;
//			default:
//				System.out.println("default text or no case statment " + i);
//			}
//		}
		
		AutoPolicy objAutoPolity = new AutoPolicy(002214,"Totota SSS", "NY");
		
		NoFaultState(objAutoPolity);
	}
	
	public static void NoFaultState(AutoPolicy policy) {
		
		System.out.println("Auto policy:\n"
				+ "Account: " + policy.getAccountNo() + "\n"
				+ "Car: " + policy.getCar() + "\n" 
				+ "State: " + (policy.isNotFaultState()? policy.getState() +" is policy": policy.getState() + " is not policy"));
		
	}

}
