package omt.csc262.w1.pet;

/**
 * This is a simple demo for the pets.
 * Notice the class name follows Pascal naming convention based on the 
 * Java naming conventions.
 * 
 * @author omt
 */
public class PetDemo { // PetDemo <- Pascal-case convention
    public static void main(String[] args) {
        System.out.println("--- Pet Demo (4 March 2021/Thr) ---");
        Pet pet1 = new Cat("Kitty", 3, "F");
        Pet pet2 = new Dog("Pixie", 5, "F");
        Pet pet3 = new Cat("Cat", 1, "M");
        
        pet1.makeNoise();
        pet2.makeNoise();
        pet3.makeNoise();
        
        pet1.sayHello();
        pet2.sayHello();
        pet3.sayHello();
    }
}
