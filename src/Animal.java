//Super/Parent/base class
public class Animal {
    String name; //Variable of the base class Animal

    //Constructor for class Animal:
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal " + name + " created");

    }

    //Methods for class Animal:
    void eat() {
        System.out.println("Animal " + name + " is eating");
    }
    void sleep() {
        System.out.println("Animal " + name + " is sleeping");
    }
    void makeSound() {
        System.out.println("Animal " + name + " is making a sound");
    }
}
