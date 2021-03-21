package omt.csc262.w3.demos;

/**
 *
 * @author omt
 */
public class Cube extends Shape3D {
    double side;
    
    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public void describe() {
        System.out.println("I am a cube with  side: " + side);
    }
}
