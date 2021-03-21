package omt.csc262.w3.polydemo;

/**
 *
 * @author omt
 */
public class Frog extends Animal {
    public Frog(double x, double y) {
        super(x, y);
    }
    
    /**
     * It will move by delta x & y
     * @param dx
     * @param dy 
     */
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        System.out.println("I will leap to " + x + ", " + y);
    }
}
