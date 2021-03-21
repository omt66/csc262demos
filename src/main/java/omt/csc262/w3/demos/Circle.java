package omt.csc262.w3.demos;

/**
 *
 * @author omt
 */
public class Circle extends Shape2D {
    double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    @Override
    public void describe() {
        System.out.println("I am a circle " + name + " with radius: " + radius);
    }
}
