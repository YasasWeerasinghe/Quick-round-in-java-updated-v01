package com.chapter3;

import java.util.Scanner;

public class AcountTest {
	
	public static void main (String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		Account objAccount = new Account("AA",2.5);
		//Account objAccount1 = new Account("BB");
		
		System.out.println("Tmp Name: " + objAccount.getName() + "\nTmp Balance: " + objAccount.getBalanace());
		
		System.out.println("Deposit amout: ");
		double depositAmount = input.nextDouble();
		objAccount.Deposit(depositAmount);
		
		System.out.println("Balance: " + objAccount.getBalanace());
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		objAccount.setName(name);
		
		System.out.println("Acount name " +objAccount.getName());
		
		
	}

}
