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
    }


}
