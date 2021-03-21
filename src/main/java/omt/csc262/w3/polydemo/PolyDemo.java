package omt.csc262.w3.polydemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omt
 */
public class PolyDemo {

    public static void main(String[] args) {
        System.out.println("--- Polymorhic Demo (18 Mar 2021/Thr) ---");
        animalsDemo();
    }

    static void animalsDemo() {
        List<Animal> animals = new ArrayList<>();
        
        animals.add(new Fish(1, 2));
        animals.add(new Fish(5, 3));
        animals.add(new Frog(10, 5));
        animals.add(new Bird(4, 3, 1));
        animals.add(new Bird(2, 6, 2));
        int maxStep = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Step # " + i);
            
            // Let's apply random walk to our animals :)
            for (Animal animal : animals) {
                double dx = maxStep * (Math.random() - 0.5);
                double dy = maxStep * (Math.random() - 0.5);
                animal.move(dx, dy);
                
                // Down cast the animal if it is a Bird type
                // It is possible but not recommended!
                if (animal instanceof Bird) {
                    Bird bird = (Bird)animal;
                    bird.setSpeedFactor(1.2);
                }
            }
        }
    }
}
