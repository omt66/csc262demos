package omt.csc262.w3.exceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Assignment # 3 Demo
 * @author omt
 */
public class AnotherExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Another Exception Demo (during extra session) ---");
        demo1();
    }
    
    static void demo1() {
        System.out.println("Demo1"); 
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Choose an option to throw corresponding exception");
            System.out.println(" 1. Ex A will be thrown!");
            System.out.println(" 2. Ex B");
            System.out.println(" 3. Null pointer exception");
            System.out.println(" 4. IO exception");
            System.out.println(" 5. Quit");
            
            String answer = input.nextLine();
            int n = Integer.parseInt(answer);
            
            if (n == 1) {
                throw  new ExceptionA("Exception A is thrown...");
            }
            else if (n == 2) {
                throw  new ExceptionB("Exception A is thrown...");
            }
            else if (n == 3) {
                String name = null;
                int len = name.length();
                System.out.println("Length of the string is " + len);
            }
            else if (n == 4) {
                throw new IOException("IO Exception is thrown...");
            }
            else {
                System.out.println("Will quit the app...");
            }
        }        
        catch (ExceptionB exB) {
            System.out.println("We got exception B");
        }
        catch (ExceptionA exA) {
            System.out.println("We got exception A");
        }
        catch (NullPointerException ex) {
            System.out.println("Null pointer exception happened!");
        }
        catch (IOException ex) {
            System.out.println("IO Exception occurred!");
        }
        finally {
            input.close();
        }
    }
}
