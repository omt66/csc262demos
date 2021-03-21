package omt.csc262.w1.pet;

/**
 * This is our nice Dog class, doesn't do much, but
 * a dog can bark, so it is representing that behavior.
 * @author omt
 */
public class Dog extends Pet {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    void makeNoise() {
        System.out.println("Woof");
    }
    
}
