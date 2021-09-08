package com.oop.polymorphism_interface.abstractDemo;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Test {

    public static void main(String[] args) {

        //sub class objects
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Saman", "Perera", "111-22-3333", 400.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Kumara", "Price", "22-333-4444", 14.25, 60);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sunil", "Perera", "33-444-5555", 2000, 0.04);
        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee(
                "Namal", "Perera", "44-555-6666", 6000, 0.03, 400);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee,
                "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee,
                "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee,
                "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", baseCommissionEmployee,
                "earned", baseCommissionEmployee.earnings());

        // create four-element Employee array 
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = baseCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees 
        for (Employee currentEmployee : employees) {

            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee 
            if (currentEmployee instanceof BaseCommissionEmployee) {
                BaseCommissionEmployee employee = (BaseCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s%n", i,
                    employees[i].getClass().getName());
        }

    }

}
