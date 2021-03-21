package omt.csc262.w1.assignment1;

import java.util.Scanner;

/**
 *
 * @author omt
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("--- Problem4: Factorial ---");
        // partA();
        // partB();
        partC();
    }
    
    static long factorial(int n) {
        long result = 1;
        
        for (int i=1;i <= n;i++) {
            result *= i;
        }
        
        return result;
    }
    
    static void partA() {
        System.out.println("Part A");
        // n! = n*(n-1)*(n-2)...1
        // 0! = 1
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide an integer value: ");
        String answer = input.nextLine();
        int n = Integer.parseInt(answer);
        System.out.printf("%d! = %d", n, factorial(n));
        input.close();
    }
    
    static void partB() {
        System.out.println("Part B:");
        // e: 1 + 1/1! + 1/2! + 1/3! + ... 
        int term = 10;
        double e = 1;
        for (int i=1;i <= term;i++) {
            e += 1.0/factorial(i);
        }
        
        System.out.println("e is " + e);
    }
    
    static double pow(double x, int n) {
        // x^n = x*x*...*x (n times)
        double result = 1;
        for (int i=0;i < n;i++) {
            result *= x;
        }
        return result;
    }
    
    static double exp(int x)  {
        // e^x = 1 + x^1/1! + x^2/2! + x^3/3! + ...    
        int term = 20;
        double result = 1;
        for (int i=1;i <= term;i++) {
            result += pow(x, i)/factorial(i);
        }
        return result;
    }
    
    static void partC() {
        System.out.println("Part C:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide an integer value: ");
        String answer = input.nextLine();
        int x = Integer.parseInt(answer);
        double e2x = exp(x);
        System.out.println("e^x = " + e2x);
        input.close();
    }
}
