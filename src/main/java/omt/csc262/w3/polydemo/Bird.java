package omt.csc262.w3.polydemo;

/**
 *
 * @author omt
 */
public class Bird extends Animal {
    double speedFactor;
    
    public Bird(double x, double y, double speedFactor) {
        super(x, y);
        this.speedFactor = speedFactor;
    }
    
    public void setSpeedFactor(double speedFactor) {
        this.speedFactor = speedFactor;
    }
    
    /**
     * It will move by delta x & y
     * @param dx
     * @param dy 
     */
    public void move(double dx, double dy) {
        if (dx > MAXDXDY) 
            throw new IllegalArgumentException("Too big movement for dx");
        
        if (dy > MAXDXDY) 
            throw new IllegalArgumentException("Too big movement for dy");
        
        this.x += speedFactor*dx;
        this.y += speedFactor*dy;
        System.out.println("I will fly to " + x + ", " + y);
    }

//    @Override
//    public void showLocation() {
//        //super.showLocation(); 
//        System.out.println("I am a bird flying at " + x + ", " +y);
//    }
    
}
