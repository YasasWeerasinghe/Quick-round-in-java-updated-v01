package com.arrays_arrayList;

//for (parameter : arrayName)   statement

public class EnhancedForWithArrays {
    
    public static void main(String[] args) {
        
        int[] arr = {10,23,21,54,78,47,51,65,89,65,12,68};
        int sum = 0;
        
        for(int num : arr){
            sum += num;            
        }
        System.out.println("sum of array elements " + sum);
    }
}
