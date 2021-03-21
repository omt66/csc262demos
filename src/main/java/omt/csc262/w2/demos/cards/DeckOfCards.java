package omt.csc262.w2.demos.cards;

import java.security.SecureRandom;

/**
 *
 * @author omt
 */
public class DeckOfCards {
    private final SecureRandom rnd = new SecureRandom();
    private final int NUMBER_OF_CARDS = 52;
    private Card[] deck = new Card[NUMBER_OF_CARDS]; 
    
    public DeckOfCards() {
        String[] faces = {
            "A", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        for (int count=0;count < deck.length;count++) {
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }
    }
    
    public void shuffle() {
        int current = 0;
        for (int i=0;i < deck.length;i++) {
            int j = rnd.nextInt(NUMBER_OF_CARDS);
            // Let's swap the cards in this deck
            Card temp = deck[i]; // First card
            deck[i] = deck[j];
            deck[j] = temp;           
        }
    }

    public void display() {
        System.out.println("Will display the deck...");

        // Let's use the enhanced for loop
        for (Card card: deck) {
            System.out.println("Card: " + card);
        }
    }
}
