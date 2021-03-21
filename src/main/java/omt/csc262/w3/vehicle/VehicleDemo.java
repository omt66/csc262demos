
package omt.csc262.w3.vehicle;

/**
 *
 * @author omt
 */
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("--- Vehicle Demo (16 Mar 2021/Tue) ---");
        
        Engine e1 = new Engine("Honda","xyz", "Gas");
        Vehicle v1 = new Vehicle(e1);
        
        System.out.println("Vehicle info: engine: " + v1.getEngineInfo());
        
    }
}
