package com.arrays_arrayList.classArrays;

import java.util.Arrays;

public class ClassArrays {
    
    public static void main(String[] args) {
         
        // sort double array in asc order
        double[] doubleArray = {8.4,2.3,6.1,0.2,3.5};
        Arrays.sort(doubleArray);
        System.out.print("sorted double array:\n");
        
        for(double num : doubleArray){
            System.out.print(num );
        }
        
        // fill 10 element array with 7s
       int[] fillArray = new int[10];
       Arrays.fill(fillArray, 7);
       showArray(fillArray, "Filled int array\n");
       
       // copy array value to another array
       int[] arr = {1,2,3,4,5,6,7};
       int[] copyArr = new int[arr.length];
       System.arraycopy(arr, 0, copyArr, 0, arr.length);
       showArray(arr, "Original array\n");
       showArray(copyArr, "Copy array\n");
       
       //compare array with copyed array
       boolean b1 = Arrays.equals(arr, copyArr);
       System.out.println("\narray" + " " + "copy_array: " + (b1? "true" : "false"));
       
       //compare array with fillArray
       boolean b2 = Arrays.equals(arr, fillArray);
       System.out.println("array" + " " + "fillArray: " + (b2? "true" : "false"));
       
       //search for array value 5
       int search = Arrays.binarySearch(arr, 5);
       if(search >= 0){
        System.out.println("search for Array elemnt 5: " + search);
       } 
       else{
           System.out.println("not found element 5");
       }
       
        //search for array value 8
       int search2 = Arrays.binarySearch(arr, 8);
       if(search2 >= 0){
        System.out.println("search for Array elemnt 8: " + search);
       } 
       else{
           System.out.println("not found element 8");
       }
    }
    
    // show values in each array
    public static void showArray(int [] arr, String description){
        System.out.printf("%n%s", description);
        
        for(int num : arr){
            System.out.printf("%d" , num);
        }
    }
    
}
