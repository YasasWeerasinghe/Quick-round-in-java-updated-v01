package com.exceptionHandling.chainedExceptions;

public class ChainedExceptions {

    public static void main(String args[]) {

        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // call method2; throw exceptions back to main
    public static void method1() throws Exception {

        try {
            method2();
        } catch (Exception ex) {
            throw new Exception("Exception thrown in method1", ex);
        }
    }

    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception ex) {
            throw new Exception("Exception thrown in method2", ex);
        }
    }

    // throw Exception back to method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
