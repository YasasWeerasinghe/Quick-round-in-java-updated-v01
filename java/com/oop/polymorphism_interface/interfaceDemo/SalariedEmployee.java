package com.oop.polymorphism_interface.interfaceDemo;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String fName, String lName, String socialSecurityNumber) {
        super(fName, lName, socialSecurityNumber);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    // calculate earnings; implement interface Payable method that was 
    // abstract in superclass Employee 
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
    
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(),"weekly salary", getWeeklySalary());
    }

}
