package com.arrays_arrayList.cardGameSimulation;

import java.security.SecureRandom;

public class DeckOfCards {
  
    private Card[] deck; //array of cards
    private int currentCard; // index of next card to be dealt(0-51)
    private static final int NUMBER_OF_CARDS = 52; //Constance of cards
    
    private static final SecureRandom randNum = new SecureRandom();
    
    public DeckOfCards(){
        
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
         // create array of Card objects
        deck = new Card[NUMBER_OF_CARDS]; 
        // populate deck with Card objects 
        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }
    
     public void shuffle(){
         // next call to method dealCard should start at deck[0] again 
         currentCard = 0;
         // for each Card, pick another random Card (0-51) and swap them 
         for(int first = 0; first < deck.length; first++){
             // select a random number between 0 and 51
             int second = randNum.nextInt(NUMBER_OF_CARDS);
             // swap current Card with randomly selected Card
             Card tmp = deck[first];
             deck[first] = deck[second];
             deck[second] = tmp;
         }
     }
     
     public Card dealCard(){
         // check whether cards remain to be deal
         if(currentCard < deck.length){
             return deck[currentCard++]; // return current card
         }
         else{
             return null; // to indicate all card were deal
         }
     }
}
