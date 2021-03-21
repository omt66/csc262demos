package omt.csc262.w3.demos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omt
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Inheritance Demo (16 March 2021/Tue) ---");
        shapeDemo1();
    }
    
    static void shapeDemo1() {
        System.out.println("Shape Demo");
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle("Circle1", 1));
        shapes.add(new Circle("Circle2", 5));
        shapes.add(new Rectangle("Rect1", 10, 3));
        // Shape is an abstract class so it cannot be instantiated!
        // shapes.add(new Shape("SomeShape")); 
        
        for (Shape shape: shapes) {
//            System.out.println("Shape is " + shape);
            
            // System.out.println("Shape's name is " + );
            shape.describe();
        }
    }
}
