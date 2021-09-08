package com.oop.polymorphism_interface.polymorphismBehavior;

public class Test {

    public static void main(String[] args) {

        // super class referce
        CommissionEmployee objComm = new CommissionEmployee(
                "Jhon", "Perera", "222-33-4444", 21000, 0.05);
        // sub class referce
        BaseCommissionEmployee objBaseComm = new BaseCommissionEmployee(
                "Kamal", "Perera", "444-55-6666", 10000, 0.06, 300);

        // invoke toString on superclass object using superclass variable 
        System.out.printf("%s %s:%n%n%s%n%n",
                "call commitionEmployee's toString with superclass ref",
                "to superclass object", objComm.toString());

        // invoke toString on subclass object using subclass variable 
        System.out.printf("%s %s:%n%n%s%n%n",
                "call BaseCommissionEmployee's toString with superclass ref",
                "to superclass object", objBaseComm.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee objComm2 = objBaseComm;
        System.out.printf("%s %s:%n%n%s%n%n",
                "call BaseCommissionEmployee's toString with superclass ref",
                "reference to subclass object", objComm2.toString());
    }
}
