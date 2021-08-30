package com.methods;

import java.util.Scanner;

public class MultParamMethod {

	public static void main(String[] args) {
		
            Scanner input = new Scanner(System.in);
            double num1,num2,num3;
            
            System.out.println("Enter values");
            num1 = input.nextDouble();
            num2 = input.nextDouble();
            num3 = input.nextDouble();
            
            double result = maxValue(num1, num2, num3);
            
            System.out.println("Max value: " + result);
            
	}
        
        public static double maxValue(double num1,double num2,double num3){
            // way 01
//            double maximumValue = num1;
//            
//            if(num2 > maximumValue){
//                maximumValue = num2;                
//            } else if(num3 > maximumValue){
//                maximumValue = num3;
//            }            
//            return maximumValue;

        // way 02
        
        return Math.max(num1, Math.max(num2, num3));
        
        }

}
