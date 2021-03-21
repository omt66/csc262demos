package omt.csc262.w2.demos;

/**
 *
 * @author omt
 */
public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("--- Array Demos from Ch 7 (11 March 2021/Thr) ---");
        // demo1();
        // demo2();
        demo3();
    }
    
    static void demo1() {
        final int ARRAY_LENGTH = 100;
        int[] arr = new int[ARRAY_LENGTH]; // We just created the array now    
        showVals(arr);
        
        for (int i=0;i < ARRAY_LENGTH;i++) {
            arr[i] = i;
        }
        showVals(arr);
    }
    
    static void demo2() {
        float[] arr;
        final int MAX = 10;
        arr = new float[MAX];
        arr[0] = 123;
        arr[1] = arr[0] + 100;
        
        System.out.println("First element is " + arr[0]);
        System.out.println("2nd element is " + arr[1]);
    }
    
    static void demo3() {
        System.out.println("Array initializer demo");
        int[] arr = {1, 2, 3, 4};
        showVals(arr);
    }
    
    static void showVals(int[] arr) {
        for (int i=0;i < arr.length;i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
