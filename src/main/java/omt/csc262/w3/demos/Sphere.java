package omt.csc262.w3.demos;

/**
 *
 * @author omt
 */
public class Sphere extends Shape3D {
    double radius;
    
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void describe() {
        System.out.println("I am a sphere " + name + " with  radius: " + radius);
    }    
}
