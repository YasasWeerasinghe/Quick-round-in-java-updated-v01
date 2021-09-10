package com.oop.polymorphism_interface.interfaceDemo;

public abstract class Employee implements Payable{
    
    private final String fName;
    private final String lName;
    private final String socialSecurityNumber;

    public Employee(String fName, String lName, String socialSecurityNumber) {
        this.fName = fName;
        this.lName = lName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s",
                getfName(),getlName(),getSocialSecurityNumber());
    }
    
}
