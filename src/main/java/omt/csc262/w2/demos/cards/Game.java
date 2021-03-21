package omt.csc262.w2.demos.cards;

/**
 *
 * @author omt
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("--- Our Card Game ---");
        game1();
    }
    
    static void game1() {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        deck.display();
    }
}
