//Child/ Sub-class Dog
//In order for Dog to be a subclass, it has to extend the parent class!
public class Dog extends Animal {

    String breed; //Subclass own attribute or variable.

    //Subclass constructor: the super constructor has to be in the first line.
    public Dog(String name, String breed){
        super(name); //This calls the Parent(Super) constructor;
        this.breed = breed;
        System.out.println("Dog, with breed:  " + breed  + " created");
    }

    //Overrriding the eat and makeSound methods of the Parent:
    @Override
    void eat() {
        System.out.println("Dog, eating...");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks: Wof, wof!!!");
    }

    //Dog's own method:
    void fetch() {
        System.out.println("My Dog," + name +  " is fetching...");
    }
}
