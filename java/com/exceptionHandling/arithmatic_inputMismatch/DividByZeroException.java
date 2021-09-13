package com.exceptionHandling.arithmatic_inputMismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividByZeroException {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        // possible division by zero
        return numerator / denominator;
    }

    public static void maain(String arg[]) {

        Scanner input = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false; // input successful; end looping 

            } catch (InputMismatchException ex) {

                System.err.printf("%nException: %s%n",
                        ex);
                input.nextLine(); // discard input so user can try again 
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException ex) {

                System.err.printf("%nException: %s%n", ex);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }

        } while (continueLoop);

    }

}
