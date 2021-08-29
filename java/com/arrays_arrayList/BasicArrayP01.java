package com.arrays_arrayList;

// creating and initializing an array

public class BasicArrayP01 { 
    
    public static void main(String[] args) {
        int [] arr = new int[10];
        
        System.out.println("Index " + " " + " Value");
        
        for(int i = 0; i < arr.length; i++){
            System.out.println( + i + "      " + arr[i]);
        }
    }
    
}
