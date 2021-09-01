package com.arrays_arrayList.classArrayList;

import java.util.ArrayList;

public class ClassArrayList {
    
    public static void main(String[] args) {
            
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("red");
        arrList.add(0,"yellow"); // add value at index 0
        
        System.out.print("Show list contents with for loop: ");
        
        for (int i = 0; i < arrList.size(); i++) {
            System.out.printf(" %s", arrList.get(i));
            
            show(arrList, "%nDisplay list contents with enhnaced for statement:");
            
            arrList.add("green");
            arrList.add("yellow");
            show(arrList, "List with two new elements");
            
            arrList.remove(1);
            show(arrList, "Remove second list element (green)");
            
            // check value in the list
            System.out.printf("\red\" is %sin list%n",arrList.contains("red")?"":"not");
            
            // display number of elements in the list
            System.out.printf("Size: %s%n", arrList.size());
        }
    }
    
    public static void show(ArrayList<String> itemList, String header){
        
        System.out.printf(header);
         // show each element in itemList
        for(String item : itemList){
            System.out.printf(" %s", item);
        }
    }
}
