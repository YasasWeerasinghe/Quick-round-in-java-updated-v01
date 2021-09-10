package com.oop.polymorphism_interface.interfaceDemo;

public class Test {

    public static void main(String[] args) {

        Payable[] objPayable = new Payable[4];

        objPayable[0] = new Invoice("01234", "Seat", 2, 325.02);
        objPayable[1] = new Invoice("65487", "Tire", 7, 658.02);
        objPayable[2] = new SalariedEmployee(600.03, "Kamal", "Perera", "111-22-3333");
        objPayable[3] = new SalariedEmployee(600.03, "Saman", "Perera", "333-44-5555");
  
        System.out.println("Invoices and Employees processed polymorphically:");
         // output currentPayable and its appropriate payment amount 
        for (Payable payable : objPayable) {
            System.out.printf("%n%s %n%s: $%,.2f%n",payable.toString(),
                    "payment due", payable.getPaymentAmount());
        }
    
    
    }
}
