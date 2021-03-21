package omt.csc262.w2.demos.cards;

/**
 * This will be a modeling our game cards
 * @author omt
 */
public class Card {
    String face; // Ace, 2, 3, 4 ... 9, 10, J, Q, K
    String suit; // Heart, Diamond, Club, Spade
    
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
