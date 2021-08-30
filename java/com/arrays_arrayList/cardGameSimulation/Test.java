package com.arrays_arrayList.cardGameSimulation;

public class Test {
    
    public static void main(String[] args) {
        DeckOfCards objDeckOfCards = new DeckOfCards();
        objDeckOfCards.shuffle(); // place Cards in random order 
        
         // print all 52 Cards in the order in which they are dealt 
        for(int i = 0; i < 52; i++){
            System.out.printf("%-19s", objDeckOfCards.dealCard());
             // output a newline after every fourth card 
            if(i % 4 == 0){
                System.out.println("");
            }
        }
    }
}
