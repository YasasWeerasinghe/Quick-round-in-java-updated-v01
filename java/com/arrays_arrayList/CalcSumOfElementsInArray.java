package com.arrays_arrayList;

// calculate sum of elements in an array
public class CalcSumOfElementsInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {10,22,36,45,12,88,74,65};
        int sum = 0;
        
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum of array elements " + sum);
    }
}
