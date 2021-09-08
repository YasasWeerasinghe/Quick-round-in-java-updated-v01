package com.oop.polymorphism_interface.abstractDemo;

public class CommissionEmployee extends Employee {

    protected double grossSales; // gross weekly sales      
    protected double commissionRate; // commission percentage  

    public CommissionEmployee(String fName, String lName, String sSNumber, double grossSales, double commissionRate) {
        super(fName, lName, sSNumber);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        // if commissionRate is invalid throw exception 
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    public void setGrossSale(double grossSale) {
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("Gross sale mus be  >= 0.0");
        }
        this.grossSales = grossSale;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double cRate) {

        if (cRate <= 0.0 || cRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = cRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}
