package omt.csc262.w1.pet;

/**
 *
 * @author omt
 */
public class Cat extends Pet{
    Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    void makeNoise() {
        System.out.println("Meow");
    }
    
}
