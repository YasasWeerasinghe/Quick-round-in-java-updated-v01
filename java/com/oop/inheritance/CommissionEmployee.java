package com.oop.inheritance;

public class CommissionEmployee {

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales; // gross weekly sales      
    protected double commissionRate; // commission percentage  

    public CommissionEmployee(String fName, String lName, String sSNumber, double grossSales, double commissionRate) {

        // if grossSales is invalid throw exception 20
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        // if commissionRate is invalid throw exception 
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = sSNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFName() {
        return firstName;
    }

    public String getLName() {
        return lastName;
    }

    public String getSocialSNumber() {
        return socialSecurityNumber;
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

    public double earnings() {
        return commissionRate * grossSales;
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method 
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}
