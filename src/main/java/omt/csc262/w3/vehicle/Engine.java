package omt.csc262.w3.vehicle;

/**
 *
 * @author omt
 */
public class Engine {
    String make;
    String model;
    String type;
    
    Engine(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }
    
    String getDescription() {
        return String.format("Make: %s Model: %s Type: %s", make, model, type);
    }
}
