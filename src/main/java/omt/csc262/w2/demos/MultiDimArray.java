package omt.csc262.w2.demos;

/**
 *
 * @author omt
 */
public class MultiDimArray {
    public static void main(String[] args) {
        System.out.println("--- Multi Dim Array Demo ---");
        int[] arr1 = {1, 2, 3};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        int[][][] arr3 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        
        outputArray2d(arr2);
    }
    
    static void outputArray2d(int[][] arr) {
        for (int row=0;row < arr.length;row++) {
            for (int col=0;col < arr[row].length;col++) {
                System.out.printf("%d ", arr[row][col]);
            }
            System.out.println();
        }
    }
 
}
