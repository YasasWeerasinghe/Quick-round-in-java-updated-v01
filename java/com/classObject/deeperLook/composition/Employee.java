package com.classObject.deeperLook.composition;

public class Employee {
    
    private String fName;
    private String lName;
    private Date bOD;
    private Date hireDate;
    
    public Employee(String fName, String lName, Date bOD, Date hireDate){
        
        this.fName = fName;
        this.lName = lName;
        this.bOD = bOD;
        this.hireDate = hireDate;
    }
    
    public String toString(){
        return String.format("%s, %s  Hired: %s  Birthday: %s",lName, fName, hireDate, bOD);
    }
}
