package omt.csc262.w2.demos;

/**
 *
 * @author omt
 */
public class BarChart {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        
        System.out.println("Grade distribution");
        
        for (int i=0;i < arr.length;i++) {
            if (i == 10) {
                System.out.printf("%5d:", 100);
            }
            else {
                System.out.printf("%2d-%2d:", 10*i, 10*i + 9);
            }
            for (int j=0;j < arr[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
