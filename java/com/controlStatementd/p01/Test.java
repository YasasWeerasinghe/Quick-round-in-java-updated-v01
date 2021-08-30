package com.controlStatementd.p01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student objStudent = new Student("AA", 76.2);
		
		System.out.println("Name: " + objStudent.getName()+
		"\n" + "Grade: " + objStudent.getAvatage());
		
		System.out.println("While loop eg");
		
		int total = 0;
		int count = 0;
		int avarage = 0;
		
		while(count < 10) {
			
			System.out.println("Enter grade: ");
			int grade = input.nextInt();
			
			if(grade > 0) {
				if(grade <= 100) {
					if(grade > 65) {
						System.out.println("Nice");
					}
					else {
						System.out.println("Hmm");
					}					
				}
			}
			
			total += grade;
			count++;
		}
		
		avarage = total/10;
		
		System.out.println("Final gade: " + avarage);
		

	}

}
