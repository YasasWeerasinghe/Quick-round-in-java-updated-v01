package com.classObject.deeperLook.composition;

public class Test {
    
    public static void main(String[] args) {
        
        Date objBOD = new Date(7, 24, 1989);
        Date objHire = new Date(3, 12, 2006);
        Employee objEmployee = new Employee ("Kamal","Perera",objBOD,objHire);
        
        System.out.println(objEmployee);
    }
}
