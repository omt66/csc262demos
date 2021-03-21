package omt.csc262.w3.vehicle;

/**
 *
 * @author omt
 */
public class Vehicle {
    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }
    
    public String getEngineInfo() {
        return engine.getDescription();
    }
    
}
