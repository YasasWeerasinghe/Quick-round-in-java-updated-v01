package com.list.sort_reverseOrder;

 import java.util.List;
 import java.util.Arrays;
 import java.util.Collections;

public class SortReverse {
    public static void main(String[] args) {
         String[] suits = {
             "Hearts",
             "Diamonds",
             "Clubs",
             "Spades"
         };

         // Create and display a list containing the suits array elements
         List < String > list = Arrays.asList(suits); // create List
         System.out.printf("Unsorted array elements: %s%n", list);

         // sort in descending order using a comparator 
         Collections.sort(list, Collections.reverseOrder());

         System.out.printf("Sorted list elements: %s%n", list);
     }
}
