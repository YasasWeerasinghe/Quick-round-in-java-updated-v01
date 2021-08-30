package com.methods;

public class MethodOverloading {
    
    public static void main(String[] args) {
        System.out.println("Square of intiger 7 is " + square(7));
        System.out.println("Square of double 7.6 is " + square(7.6));
    }
    
    public static int square(int value){
        System.out.println("Square with int argument " + value);
        return value * value;
    }
    
    public static double square(double value){
         System.out.println("Square with double argument " + value);
        return value * value;
    }
    
}
