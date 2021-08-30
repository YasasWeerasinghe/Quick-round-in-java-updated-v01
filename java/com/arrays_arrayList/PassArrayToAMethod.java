package com.arrays_arrayList;

public class PassArrayToAMethod {    
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println("Original values");
        
        for(int num : arr){        
            System.out.print(" " +num);            
        }
        System.out.println("\nmodified values");
        modifiedArray(arr);
        
        for(int num : arr){
            System.out.print(" " + num);
        }
        
        System.out.println("\nbefore modify " + arr[3]);
        modifiedArrayElement(arr[3]);        
        System.out.println("after modified " + arr[3]);
    }
    
    public static void modifiedArray(int [] modArray){
        
        for (int i = 0; i < modArray.length; i++) {
            modArray[i]*= 2;            
        }
    }
    
    public static void modifiedArrayElement(int element){
        
      element *=2;
      System.out.println("modified element " + element); 
    }
}
