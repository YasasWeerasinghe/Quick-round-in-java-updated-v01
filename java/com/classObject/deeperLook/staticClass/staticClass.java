package com.classObject.deeperLook.staticClass;

public class staticClass {

    private static int count = 0;
    private String fName;
    private String lName;

    /*initialize Employee, add 1 to static count and 
    output String indicating that constructor was called*/
    public staticClass(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

        count++;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                fName, lName, count);
    }
    
    //get fname
    public String getFirstName(){
        return fName;
    }
    //get lName
    public String getLastName(){
        return lName;
    }
    //static method to get static count
    public static  int getCount(){
        return count;
    }

}
