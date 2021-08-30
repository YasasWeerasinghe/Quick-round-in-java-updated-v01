package com.methods;

public class ScopofDeclarations {
    
    // accessible to all methods of this class
    private static int x = 1;
    
    public static void main(String arg[]){
        // local variavle
        int x = 5;
        System.out.println("local x in main is " + x);
        
        useLocalVariable(); // has local x
        useField(); // uses class Scope's field x
        useLocalVariable(); // reinitializes local x
        useField(); // class Scope's field x retains it's value
        
        System.out.println("local x in main is " + x);
        
    }
    
    public static void useLocalVariable(){
        // initialized each time
        int x = 25;
        System.out.println("Local x in useLocalVarable " + x);
        ++x;
        System.out.println("Local x before exit the method " + x);
    }
    
    public static void useField(){
        System.out.println("x value in useField " + x);
        x *= 10;
        System.out.println("x value before exit the method " + x);
    }
    
}
