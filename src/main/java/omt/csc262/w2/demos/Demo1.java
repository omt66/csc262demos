package omt.csc262.w2.demos;

import java.security.SecureRandom;

/**
 *
 * @author omt
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("--- W2 Demos (9 March 2021/Tue) ---");
        // performDemo1();
        // mathDemo1();
        // mathDemo2();
        // mathDemo3();
        mathDemo4();
    }

    static void performDemo1() {
        System.out.println("Demo1");
        String str1 = "Hello there...";
        String key = "lo";
        int index = str1.indexOf(key);
        System.out.println("index is " + index);
        if (index > -1) {
            System.out.println("Yay, we found the key: " + key);
        } else {
            System.out.println("Nope, no key found :(");
        }
    }

    static void mathDemo1() {
        double x = -1.2345;

        System.out.println("OTMath.PI = " + OTMath.PI);
        System.out.println("OTMath.E = " + OTMath.E);

        System.out.println("x = " + x + " |x| = " + Math.abs(x));
        System.out.println("x = " + x + " |x| = " + OTMath.abs(x));

        System.out.println("ceil(" + x + ") = " + Math.ceil(x));
        System.out.println("floor(" + x + ") = " + Math.floor(x));

        x = 1.75;
        System.out.println("x = " + x + " |x| = " + Math.abs(x));
        System.out.println("ceil(" + x + ") = " + Math.ceil(x));
        System.out.println("floor(" + x + ") = " + Math.floor(x));

        System.out.println("exp(" + x + ") = " + Math.exp(x));

        System.out.println("cos(" + x + ") = " + Math.cos(x));
        System.out.println("sin(" + x + ") = " + Math.sin(x));

    }

    static void mathDemo2() {
        double x = 2;
        double y = 5;
        double z = 8;
        int k = (int) x;
        int i = 10;
        float d1 = i;

        System.out.printf("max(%f,%f) = %f\n", x, y, OTMath.max(x, y));
        System.out.printf("max(%f,%f,%f) = %f\n", x, y, z, OTMath.max(x, y, z));
    }

    static void mathDemo3() {
        // Let's play with random number generators
        // [0 - 1) <- i.e 0 is inclusive but 1 is exlusive
        int max = 5;
        for (int i = 0; i < max; i++) {
            double n = Math.random();
            System.out.println("n1 = " + n);
        }
        
        SecureRandom rnd = new SecureRandom();
        for (int i = 0; i < max; i++) {
            double n = rnd.nextDouble();
            System.out.println("n2 = " + n);
        }
        
        System.out.println("Let's simulate a dice");
        double total = 0;
        int maxRolls = 100_000;
        for (int i=0;i < maxRolls;i++) {
            int face1 = 1 + rnd.nextInt(6);
            int face2 = 1 + rnd.nextInt(6);
            int sum = face1 + face2;
//            System.out.println("face values are " 
//                    + face1 + ", "  + face2 
//                    + ", sum: " + sum);
            total += sum;
        }
        double avr = total/maxRolls;
        System.out.println("Total: " + total);
        System.out.println("Average (expected value): " + avr);
    }
    
    static void mathDemo4() {
        System.out.println("Number Freqeuncy");
        int[] nums = new int[6];
        long maxRolls = 1_000_000;
        SecureRandom rnd = new SecureRandom();
        for (long i=0;i < maxRolls;i++) {
            int face = 1 + rnd.nextInt(6);
            nums[face-1]++;
        }
        
        int nofFaces = 6;
        for (int i=0;i < nofFaces;i++) {
            System.out.println("face " + (i+1) + " = " + nums[i]);
        }
    }
}
