package omt.csc262.w3.interfaces;

/**
 *
 * @author omt
 */
public class Person implements Comparable<Person>{
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return age - otherPerson.age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " age: " + age;
    }
}
