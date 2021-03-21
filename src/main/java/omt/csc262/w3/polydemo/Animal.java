package omt.csc262.w3.polydemo;

/**
 * This is our simple animal class. It knows its location (x, y)
 * It doesn't do much!
 * It is also marked as abstract class so it cannot be instantiated!
 * @author omt
 */
public abstract class Animal {
    static final double MAXDXDY = 5;
    double x;
    double y;
    
    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract void move(double dx, double dy);
    
    final public void showLocation() {
        System.out.println("x, y -> " + x + ", " + y);
    }
}
