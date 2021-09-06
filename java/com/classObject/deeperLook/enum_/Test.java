package com.classObject.deeperLook.enum_;

import java.util.EnumSet;

public class Test {

    public static void main(String[] args) {

        System.out.println("All Books: ");

        //show all enum books
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),
                    book.getCopyTightYear());
        }

        System.out.println("\nDislplay range of enum books");

        for (Book book : EnumSet.range(Book.JHTP, Book.CSHARPHTP)) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),
                    book.getCopyTightYear());
        }
    }
}
