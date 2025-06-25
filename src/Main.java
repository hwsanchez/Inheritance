public class Main {
    public static void main(String[] args) {
        //Creating a Dog subclass object:
        Dog myDog = new Dog("Buddy", "German Shepherd");
        myDog.eat(); //Overridden eat method in Dog
        myDog.fetch(); //Dog-specific method
        myDog.makeSound(); //Dog-specific sound
        myDog.sleep(); // Super method: Inherited from the Father.
        System.out.println("-------------------------------");
        //Creating a Bird subclass object:
        Bird myBird = new Bird("Piolin");
        myBird.eat(); //Overridden method
        myBird.makeSound(); //Bird specific sound
        myBird.fly(); //Bird specific behavior
        myBird.sleep(); //Inherited from Superclass: Animal
        System.out.println("-------------------------------");

        //Polymorphism:
        //Since Dog (child) extends Animal (parent), you can create an Animal which is a Dog:
        //This object can do ALL that an Animal class object can do.
        //BUT it CANNOT do what only a Dog class object can do!
        Animal myDog2 = new Dog("Jenny", "Collie");
        myDog2.eat();
        myDog2.makeSound();
        myDog2.sleep();
//        myDog2.fetch(); This is not possible!
//       Only if you cast myDog2 as a Dog, then you can use the methods unique to Dog:
        ((Dog) myDog2).fetch(); //Now u can use fetch()!

    }


}
