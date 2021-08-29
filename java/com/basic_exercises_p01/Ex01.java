package com.basic_exercises_p01;

import java.util.Scanner;

public class Ex01 {
	//ex 2.5 

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x,y,z,result;
		
		System.out.print("Enter 1st value: ");
		x = input.nextInt();
		System.out.print("Enter 2nd value: ");
		y = input.nextInt();
		System.out.print("Enter 3rd value: ");
		z = input.nextInt();
		
		result = x*y*z;
		
		System.out.print("Result " + result);
				
	}

}
