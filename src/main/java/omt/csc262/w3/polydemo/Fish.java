package omt.csc262.w3.polydemo;

/**
 * This is our fish :) 
 * @author omt
 */
public class Fish extends Animal {
    
    public Fish(double x, double y) {
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
        System.out.println("I will swim to " + x + ", " + y);
    }
}
