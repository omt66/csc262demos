package omt.csc262.w1.scopedemo;

/**
 *
 * @author omt
 */
public class ScopeDemo {
    public static void main(String[] args) {
        System.out.println("--- Scope Demo ---");
        demo1();
    }
 
    
    static void demo1() {
        System.out.println("Demo1");
        int i = 123;
        System.out.println("i is " + i);
        
        for (int j=0;j < 3;j++) {  
            i++;
            System.out.println("i = " + i + " j = " + j); 
        }
    }
}
