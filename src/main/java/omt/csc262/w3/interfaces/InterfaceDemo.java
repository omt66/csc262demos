package omt.csc262.w3.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author omt
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Interface Demo ---");
        demo1();
    }
 
    static void demo1() {
        System.out.println("Interface Demo1");
        List<Person> persons = new ArrayList<>();
        
        persons.add(new Person("Jane Walker", 29));
        persons.add(new Person("Adam Xyz", 35));
        persons.add(new Person("Bart Simpson", 10));

        Person person1 = persons.get(0);
        Person person2 = persons.get(1);
        
        int result = person1.compareTo(person2);
        System.out.println("Comparison result = " + result);
        
        List<Person> selectedPersons = persons.stream()
                                            .filter(person -> person.age < 30)
                                            .collect(Collectors.toList());              
        
        for (Person person: selectedPersons) {
            System.out.println("Person " + person);
        }
    }
}
