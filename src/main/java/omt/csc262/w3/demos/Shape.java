package omt.csc262.w3.demos;

/**
 *
 * @author omt
 */
public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public abstract void describe();
}
