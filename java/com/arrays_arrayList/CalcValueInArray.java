package com.arrays_arrayList;

// calculate the values to store in an array
public class CalcValueInArray {
    
    public static void main(String[] args) {
        
        final int ArrayLength = 10;
        int [] arr = new int[ArrayLength];
        
        System.out.println("Index " + "Value" + " logic");
        for(int i = 0; i < arr.length; i++){
            arr[i] = 2+2 * i;
            System.out.println(i + "    " + arr[i]);
        }
        
    }
}
