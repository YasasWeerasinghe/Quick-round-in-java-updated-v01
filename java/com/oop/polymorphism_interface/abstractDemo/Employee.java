package com.oop.polymorphism_interface.abstractDemo;

public abstract class Employee {
    
    private final String fName;
    private final String lName;
    private final String socialSecurityNumber;
    
    public Employee(String fName, String lName, String sSNumber){
        this.fName = fName;
        this.lName = lName;
        this.socialSecurityNumber = sSNumber;
    }
    
    public String getFirstName(){
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    // return String representation of Employee object 
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(),getLastName(),getSocialSecurityNumber());
       
    }
    
    public abstract double earnings();
}
 