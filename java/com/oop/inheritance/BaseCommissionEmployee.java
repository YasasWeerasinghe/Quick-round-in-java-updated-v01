package com.oop.inheritance;

public class BaseCommissionEmployee extends CommissionEmployee {

    private double baseSalary; // base salary per week 
    // six-argument constructor

    public BaseCommissionEmployee(String fName, String lName, String sSNumber, double grossSales, double commissionRate) {
        super(fName, lName, sSNumber, grossSales, commissionRate);
        // if baseSalary is invalid throw exception 
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //set base salary
    public void setBaseSalary(double baseSalary) {

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }

}
