package omt.csc262.w3.demos;

/**
 *
 * @author omt
 */
public class Rectangle extends Shape2D {
    double width;
    double height;
    
    public Rectangle(String name, double w, double h) {
        super(name);
        width = w;
        height = h;
    }
    
    @Override
    public void describe() {
        System.out.println("I am a rectangle " + name + " with width: " + width + " and height: " + height);
    }
}
