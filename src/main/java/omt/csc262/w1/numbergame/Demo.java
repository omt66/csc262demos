package omt.csc262.w1.numbergame;

import java.util.Scanner;

/**
 * This is our little number game that demonstrates the power of the 
 * binary search (as a user we are dividing the search space into two
 * each time, therefore making the search space smaller and smaller as we go).
 * 
 * @author omt
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Number Game Demo ---");
        numberGame();
    }
    
    static void numberGame() {
        System.out.println("Choose a number between 1 to 1000");
        int max = 1000;        
        int n = (int)(max*Math.random() + 1);
        boolean done = false;
        Scanner input = new Scanner(System.in);
        int cntr = 0;
        
        while (!done) {
            cntr++;
            System.out.println("Plese enter your guess: ");
            String answer = input.nextLine();
            int guess = Integer.parseInt(answer);
            
            if (guess == n) {
                System.out.println("We found the secret number at " + cntr + " steps.");
                done = true;
            }
            else if (guess < n) {
                System.out.println("You guessed a smaller value, try higher!");
            }
            else {
                System.out.println("You guessed a higher value, try lower!");
            }
        }
        input.close();
        System.out.println("Thanks for playing. Bye bye now :)");
    }
}
