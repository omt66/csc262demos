package omt.csc262.w3.exceptions;

import omt.csc262.w3.interfaces.Person;

/**
 *
 * @author omt
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("--- Exception Demos ---");
        demo1();
        demo2();
    }

    static void demo1() {
        System.out.println("Exception demo1");
        try {
            int x = 100;

            if (x == 100) {
                throw new RuntimeException("OOOpppsss");
            }

            int y = 0;
            int z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException ex) {
            System.out.println("Something wrong in your calculation! " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("A runtime exception is thrown! " + ex.getMessage());
        } finally {
            System.out.println("Finally is always called!!!");
        }
    }

    static void demo2() {
        try {
            System.out.println("Demo2");
            Person person = new Person("Jon Xyz", 44);
            String info = person.toString();
            System.out.println("Person info " + info);
        } catch (NullPointerException ex) {
            System.out.println("Ooo null pointer detected! " + ex.getMessage());
        }
    }
}
