package omt.csc262.w1.pet;

/**
 * This simple Pet class just maintains bare minimum information for a pet.
 * Note that this is an abstract class because it has (at least one) abstract
 * method and therefore should be marked as abstract!
 * 
 * @author omt
 */
public abstract class Pet {
    // The following attributes also known as 
    // instance variables!
    String name;
    int age;
    String gender;
   
    /**
     * This is the only constructor for the Pet class.
     *
     * @param name
     * @param age
     * @param gender
     */
    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
   }
   
   /**
    * This is the abstract method, and derived classes should implement
    * the actual behavior or else the compiler won't compile!
    */
   abstract void makeNoise();

    void sayHello() {
        System.out.println("Hi, I am " + name 
                + " and I am " + age 
                + " years old. My gender is " + gender);
    }
}
