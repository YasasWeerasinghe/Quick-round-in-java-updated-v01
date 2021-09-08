package com.oop.polymorphism_interface.abstractDemo;


public class HourlyEmployee extends Employee {
    
    private double wage;
    private double hours;

    public HourlyEmployee(String fName, String lName, String sSNumber, double wage, double hours) {
        super(fName, lName, sSNumber);
        
        if (wage < 0.0) {
            throw new IllegalArgumentException("hourly wage must be >= 0.0");
        }
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("hourly wage must be >= 0.0");
        }
        this.wage = wage;
        this.hours = hours;    
    }

    public void setWage(double wage) {
        
        if (wage < 0.0) {
            throw new IllegalArgumentException("hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        
         if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("hourly wage must be >= 0.0");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }  

    @Override
    public double earnings() {
    
        // no overtime
        if (getHours() <= 40) {
            return getWage() * getHours();
        }
        else{
            return 40 * getWage() + (getHours() -40) * getWage() *1.5;
        }
    }
    
    @Override
    public String toString(){
        return  String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
               super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
    
}
