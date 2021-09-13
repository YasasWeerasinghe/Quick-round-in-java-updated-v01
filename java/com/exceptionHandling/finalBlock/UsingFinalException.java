package com.exceptionHandling.finalBlock;

public class UsingFinalException {

    public static void main(String args[]) {

        try {
            throwException();
        } catch (Exception ex) { // exception thrown by throwException
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception {

        try {  // throw an exception and immediately catch it
            System.out.println("Method throwException");
            throw new Exception(); // generate exception

        } catch (Exception ex) {  // catch exception thrown in try
            System.err.println("Exception handled in method throwException");
            throw ex; // rethrow for further processing
        } finally // executes regardless of what occurs in try...catch
        {
            System.err.println("Finally executed in throwException");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally // executes regardless of what occurs in try...catch
        {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
