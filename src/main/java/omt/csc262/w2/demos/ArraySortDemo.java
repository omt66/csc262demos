package omt.csc262.w2.demos;

import java.util.Arrays;

/**
 *
 * @author omt
 */
public class ArraySortDemo {

    public static void main(String[] args) {
        sortDemo1();
        search1();
    }
    
    static void sortDemo1() {
        System.out.println("--- Array Sort Demo1 ---");
        double[] arr = {5.6, 7.5, 1.2, 4.9, 8.1, 9.0, 6.3};
        
        System.out.println("Unsorted (original) array:");
        display(arr);
        
        // Let's sort our array now
        Arrays.sort(arr);
        
        System.out.println("Sorted array:");
        display(arr);
    }
    
    static void search1() {
        System.out.println("Search 1");
        int[] arr = {3, 5, 2, 1, 9, 4, 6, 7, 10, 8};
        int key = 7;

        // Has to be sorted before the binary search
        Arrays.sort(arr);
        
        int loc = Arrays.binarySearch(arr, key);

        if (loc >= 0) {
            System.out.println("Found key " + key + " at location " + loc);
        }
        else {
            System.out.println("Cannot found key " + key);
        }
    }

    static void display(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double val = arr[i];
            System.out.println("val = " + val);
        }
    }
}
