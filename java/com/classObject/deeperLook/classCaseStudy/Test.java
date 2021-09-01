package com.classObject.deeperLook.classCaseStudy;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;

public class Test {

    public static void main(String[] args) {

        // create Time class object
        Time objTime = new Time();

        // output string representation of the time
        displayTime("After time object is created", objTime);
        System.out.println();

        //change time and output updated time
        objTime.setTime(13, 27, 6);
        displayTime("After calling setTime", objTime);
        System.out.println();

        //set invalid values
        try {
            objTime.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After call invalid values to setTime", objTime);

    }

    // display time oject in 24 and 12 hour format
    public static void displayTime(String header, Time time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, time.toUniversalString(), time.toString());
    }

}
