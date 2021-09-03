package com.classObject.deeperLook.innerClass;

public class TestClass {

    public static void main(String[] args) {

        InnerClass classInner = new InnerClass(15, 30, 19);
        System.out.println(classInner.buildString());
    }
}

class InnerClass {

    private int hour;
    private int minute;
    private int second;

    // need to use "this" if constructor param name same as the instace variable name
    public InnerClass(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // use explicit and implicit "this" to call toUniversalStrin
    public String buildString() {

        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }

    /*"this" is not required here to access instance variables, 
    because method does not have local variables with same 
    names as instance variables*/
    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

}
