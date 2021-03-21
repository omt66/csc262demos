package omt.csc262.w2.demos;

/**
 *
 * @author omt
 */
public class CafeteriaDemo {
    public static void main(String[] args) {
        System.out.println("--- Cafe Survey Demo ---");
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 1, 2, 5, 5, 4, 3, 3, 4, 3, 1, 2, 13};
        int[] frequencies = new int[6]; // 0 0 0 0 0 0
        
        for (int i=0;i < responses.length;i++) {
            int response = responses[i];
            try {
                frequencies[response]++;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                 System.out.println("Opps, there is a bad entry! " + response);
                // We could have silently catch this!
                // You may want to use a logger to log this incident!
            }
        }
        
        // Now let's see the survey results :)
        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for (int rating=1;rating < frequencies.length;rating++) {
            System.out.printf("%6d%10d\n", rating, frequencies[rating]);
        }
        
    }
}
