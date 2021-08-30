
package com.arrays_arrayList.multidimensionalArrays;

public class MultidimensinalArray {
    
    public static void main(String[] args) {
        
        int[][] multiArray = {{1,2,3},{4,5,6}};
        int[][] multiArray2 = {{1,2},{3},{4,5,6}};
        
        System.out.println("Array 01 value");
        multiArrayCreate(multiArray);
        System.out.println("Array 02 value");
        multiArrayCreate(multiArray2);
    }
    
    public static void multiArrayCreate(int [][] arr){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);               
            }
            System.out.println();
        }
    }
}
