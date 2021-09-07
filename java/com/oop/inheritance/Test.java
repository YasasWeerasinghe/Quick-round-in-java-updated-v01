package com.oop.inheritance;

public class Test {

    public static void main(String[] args) {

        CommissionEmployee obj = new CommissionEmployee(
                "Kamal", "Perera", "013-55-7894", 20031, 0.4);

        // instantiate CommissionEmployee object
        // get commission employee data 
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", obj.getFName());
        System.out.printf("%s %s%n", "Last name is", obj.getLName());
        System.out.printf("%s %s%n", "Social security number is", obj.getSocialSNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", obj.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", obj.getCommissionRate());

        obj.setGrossSale(2000);
        obj.setCommissionRate(0.1);

        System.out.printf("%n%s:%n%n %n", "Updated employee information obtained by toString", obj);
    }

}
