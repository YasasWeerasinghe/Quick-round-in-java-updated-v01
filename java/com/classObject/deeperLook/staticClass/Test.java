package com.classObject.deeperLook.staticClass;

public class Test {
    public static void main(String[] args) {
        
        System.out.printf("\nEmployees before instantiation: %d%n", 
               staticClass.getCount());
        
        // create 2 staticClass objects
        staticClass obj1 = new staticClass("John","Perera");
        staticClass obj2 = new staticClass("Kamal","Perera");
        
        System.out.println("\nEmployees after instantiation:");
        System.out.println("obj1.getCount " + obj1.getCount());
        System.out.println("obj2.getCount " + obj2.getCount());
        System.out.println("staticClass.getCount " + staticClass.getCount());
        
         System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", 
                 obj1.getFirstName(),obj1.getLastName(),
                 obj2.getFirstName(),obj2.getLastName());
         
    }
}
