package com.classObject.deeperLook.enum_;

public enum Book {

    //declare costants of enumTypes
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014"); 
    
    private final String title;
    private final String copyTightYear;

    private Book(String title, String copyTightYear) {
        this.title = title;
        this.copyTightYear = copyTightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyTightYear() {
        return copyTightYear;
    }
    
}
